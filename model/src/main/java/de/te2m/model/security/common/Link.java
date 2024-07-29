package de.te2m.model.security.common;

import lombok.Getter;
import lombok.Value;
import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
@Value
public class Link {
	@Getter
	private String value;
}
