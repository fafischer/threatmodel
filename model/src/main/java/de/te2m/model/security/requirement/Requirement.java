package de.te2m.model.security.requirement;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Link;
import lombok.Builder;
import lombok.Getter;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Builder
@Entity
public class Requirement {
	@Getter
	@Identity
	private ID id;
	@Getter
	private Description description;
	@Getter
	private Link externalLink;
}
