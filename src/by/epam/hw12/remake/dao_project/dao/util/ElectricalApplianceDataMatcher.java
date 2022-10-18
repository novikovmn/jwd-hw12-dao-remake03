package by.epam.hw12.remake.dao_project.dao.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import by.epam.hw12.remake.dao_project.bean.criteria.Criteria;

import java.util.Set;

public class ElectricalApplianceDataMatcher {

	private List<String> linesFromDB;
	private Criteria property;

	public ElectricalApplianceDataMatcher(List<String> linesFromDB, Criteria property) {
		this.linesFromDB = linesFromDB;
		this.property = property;
	}

	public List<String> match() {
		List<String> matchedApppliancesLines = new ArrayList<>();

		List<String> patterns = fetchFindPattern();

		for (String line : linesFromDB) {
			if (checkIfAllPatternsMatch(line, patterns)) { 
				matchedApppliancesLines.add(line);
			}
		}
 
		return matchedApppliancesLines;
	}

	private boolean checkIfAllPatternsMatch(String line, List<String> patterns) {

		for (String pattern : patterns) {
			if (!line.contains(pattern)) {
				return false;
			}
		}

		return true;
	}

	private List<String> fetchFindPattern() {
		List<String> patterns = new ArrayList<>();

		Map<String, Object> properties = property.getCriteria();

		// множество пар "key, value"
		Set<Entry<String, Object>> entrySet = properties.entrySet();

		// получили паттерны поиска вида "key=value"
		for (Entry<String, Object> entry : entrySet) {
			patterns.add(entry.getKey() + "=" + entry.getValue());

		}

		return patterns;
	}

}
