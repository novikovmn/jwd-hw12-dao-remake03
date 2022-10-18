package by.epam.hw12.remake.dao_project.dao.factory;

import by.epam.hw12.remake.dao_project.dao.ElectricalApplianceDAO;
import by.epam.hw12.remake.dao_project.dao.impl.ElectricalApplianceDAOImpl;

public final class DAOFactory {

	private static final DAOFactory instance = new DAOFactory();

	private final ElectricalApplianceDAO electricalApplianceDAOImpl = new ElectricalApplianceDAOImpl();

	private DAOFactory() {
	}

	public static DAOFactory getInstance() {
		return instance;
	}

	public ElectricalApplianceDAO getElectricalApplianceDAOImpl() {
		return electricalApplianceDAOImpl;
	}

}
