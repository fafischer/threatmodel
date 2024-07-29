package de.te2m.model.security.countermeasure;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;

public interface Countermeasure {
	public ID getId();

	public Description getDescription();

	default Category getCategory(){
		return Category.UNKNOWN;
	}

	public enum Category{
		UNKNOWN,
		ASSUMPTION,
		MITIGATION;
	}
}
