package by.epam.hw12.remake.dao_project.dao;

import java.util.List;

import by.epam.hw12.remake.dao_project.bean.ElectricalAppliance;
import by.epam.hw12.remake.dao_project.bean.criteria.Criteria;
import by.epam.hw12.remake.dao_project.dao.exception.DAOException;

public interface ElectricalApplianceDAO {

	List<ElectricalAppliance> find(Criteria criteria) throws DAOException;

}
