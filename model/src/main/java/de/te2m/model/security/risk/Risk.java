package de.te2m.model.security.risk;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Builder
@Entity
public class Risk {
	@Getter
	@Identity
	private ID id;
	@Getter
	@Setter
	private Description description;
}
