package de.te2m.model.security.items;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;

public interface ItemOfConcern {
	public ID getId();
	public Name getName();

	public Description getDescription();

	default Category getCategory(){
		return Category.UNKNOWN;
	}
}
