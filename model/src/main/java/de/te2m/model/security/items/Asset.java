package de.te2m.model.security.items;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Entity
@Builder
public class Asset implements ItemOfConcern{
	@Getter
	@Identity
	private ID id;
	@Getter
	private Name name;
	@Getter
	private Description description;

	@Override
	public Category getCategory() {
		return Category.ASSET;
	}
}
