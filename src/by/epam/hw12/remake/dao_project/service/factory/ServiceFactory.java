package by.epam.hw12.remake.dao_project.service.factory;

import by.epam.hw12.remake.dao_project.service.WarehouseService;
import by.epam.hw12.remake.dao_project.service.impl.WarehouseServiceImpl;

public final class ServiceFactory {

	private static final ServiceFactory instance = new ServiceFactory();

	private final WarehouseService warehouseServiceImpl = new WarehouseServiceImpl();

	private ServiceFactory() {
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

	public WarehouseService getWarehouseServiceImpl() {
		return warehouseServiceImpl;
	}

}
