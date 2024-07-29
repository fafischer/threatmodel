package de.te2m.model.security.goal;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Builder
@Entity
public class Objective {
	@Getter
	@Identity
	private ID id;
	@Getter
	private Name name;
	@Getter
	private Description description;
}
