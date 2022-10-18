package by.epam.hw12.remake.dao_project.bean.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String categoryName;

	private Map<String, Object> criteria = new HashMap<>();

	public Criteria() {

	}

	public Criteria(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Map<String, Object> getCriteria() {
		return criteria;
	}

	public void setCriteria(Map<String, Object> criteria) {
		this.criteria = criteria;
	}

	public void addCriteria(String criteriaName, Object criteriaValue) {
		criteria.put(criteriaName, criteriaValue);
	}

}
