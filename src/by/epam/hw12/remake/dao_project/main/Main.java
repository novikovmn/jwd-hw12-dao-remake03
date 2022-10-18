package by.epam.hw12.remake.dao_project.main;

import by.epam.hw12.remake.dao_project.bean.Laptop;
import by.epam.hw12.remake.dao_project.bean.criteria.Criteria;
import by.epam.hw12.remake.dao_project.bean.criteria.SearchCriteria;
import by.epam.hw12.remake.dao_project.service.exception.ServiceException;
import by.epam.hw12.remake.dao_project.service.impl.WarehouseServiceImpl;
import by.epam.hw12.remake.dao_project.view.ConsoleOutput;

public class Main {

	public static void main(String[] args) throws ServiceException {

		// создаем БД для техники (пишем в файл)
		ApplianceDBCreator.writeItemsToFile();

		// для печати результатов
		ConsoleOutput output = new ConsoleOutput();
		
		// сервис
		WarehouseServiceImpl finder = new WarehouseServiceImpl();
		
		// показать всё
//		Criteria allCategoriesCriteria = new Criteria();		
//		output.printAppliances(finder.find(allCategoriesCriteria));
		
		// найти ноут на линуксе
		Criteria laptopCriteria = new Criteria(Laptop.class.getSimpleName());
		laptopCriteria.addCriteria(SearchCriteria.Laptop.OS.name(), "Linux");
		output.printAppliances(finder.find(laptopCriteria));


	}

}
