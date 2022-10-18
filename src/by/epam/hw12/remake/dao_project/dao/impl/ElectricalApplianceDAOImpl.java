package by.epam.hw12.remake.dao_project.dao.impl;

import java.util.List;

import by.epam.hw12.remake.dao_project.bean.ElectricalAppliance;
import by.epam.hw12.remake.dao_project.bean.criteria.Criteria;
import by.epam.hw12.remake.dao_project.dao.ElectricalApplianceDAO;
import by.epam.hw12.remake.dao_project.dao.exception.DAOException;
import by.epam.hw12.remake.dao_project.dao.util.ConvertorToElectricalAppliance;
import by.epam.hw12.remake.dao_project.dao.util.ElectricalApplianceDataMatcher;
import by.epam.hw12.remake.dao_project.dao.util.ElectricalApplianceReader;

public class ElectricalApplianceDAOImpl implements ElectricalApplianceDAO {

	@Override
	public List<ElectricalAppliance> find(Criteria criteria) throws DAOException {

		List<String> linesFromDB = null;

		ElectricalApplianceReader electricalApplianceReader = ElectricalApplianceReader.getInstance();

		if (criteria.getCategoryName() != null) {
			linesFromDB = electricalApplianceReader.take(criteria.getCategoryName());
		} else {
			linesFromDB = electricalApplianceReader.take();
		}

		ElectricalApplianceDataMatcher electricalApplianceDataMatcher = new ElectricalApplianceDataMatcher(linesFromDB,
				criteria);

		List<String> matchedAppliancesLines = electricalApplianceDataMatcher.match();

		ConvertorToElectricalAppliance covertor = new ConvertorToElectricalAppliance(matchedAppliancesLines);

		List<ElectricalAppliance> electricalAppliances = covertor.convert();

		return electricalAppliances;
	}

}
