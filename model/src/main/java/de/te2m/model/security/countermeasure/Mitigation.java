package de.te2m.model.security.countermeasure;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Entity
@Builder
class Mitigation implements Countermeasure {
	@Getter
	@Identity
	private ID id;
	@Getter
	private Description description;
	@Override
	public Category getCategory() {
		return Category.MITIGATION;
	}
}
