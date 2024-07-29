package de.te2m.model.security.tcb;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import de.te2m.model.security.items.Category;
import de.te2m.model.security.items.ItemOfConcern;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Entity;

@Entity
@Builder
public class Trusted<T extends ItemOfConcern> implements ItemOfConcern{
	@Getter
	private T item;

	@Override
	public ID getId() {
		return item.getId();
	}

	@Override
	public Name getName() {
		return item.getName();
	}

	@Override
	public Description getDescription() {
		return item.getDescription();
	}

	@Override
	public Category getCategory() {
		return item.getCategory();
	}
}
