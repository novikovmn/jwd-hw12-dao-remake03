package by.epam.hw12.remake.dao_project.service;

import java.util.List;

import by.epam.hw12.remake.dao_project.bean.ElectricalAppliance;
import by.epam.hw12.remake.dao_project.bean.criteria.Criteria;
import by.epam.hw12.remake.dao_project.service.exception.ServiceException;

public interface WarehouseService {
	
	List<ElectricalAppliance> find(Criteria criteria) throws ServiceException;

}
