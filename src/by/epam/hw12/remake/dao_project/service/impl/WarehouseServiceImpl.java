package by.epam.hw12.remake.dao_project.service.impl;

import java.util.List;

import by.epam.hw12.remake.dao_project.bean.ElectricalAppliance;
import by.epam.hw12.remake.dao_project.bean.criteria.Criteria;
import by.epam.hw12.remake.dao_project.dao.ElectricalApplianceDAO;
import by.epam.hw12.remake.dao_project.dao.exception.DAOException;
import by.epam.hw12.remake.dao_project.dao.factory.DAOFactory;
import by.epam.hw12.remake.dao_project.service.WarehouseService;
import by.epam.hw12.remake.dao_project.service.exception.ServiceException;

public class WarehouseServiceImpl implements WarehouseService {

	@Override
	public List<ElectricalAppliance> find(Criteria criteria) throws ServiceException {
		
		if (criteria == null) {
			throw new ServiceException("Criteria not created");
		}

		List<ElectricalAppliance> appliances = null;

		try {
			DAOFactory daoFactory = DAOFactory.getInstance();
			ElectricalApplianceDAO electricalApplianceDAOImpl = daoFactory.getElectricalApplianceDAOImpl();
			appliances = electricalApplianceDAOImpl.find(criteria);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e);
		}

		return appliances;
	}

}
