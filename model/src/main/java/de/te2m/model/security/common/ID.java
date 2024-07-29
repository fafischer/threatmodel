package de.te2m.model.security.common;

import java.util.UUID;

import lombok.Getter;
import lombok.Value;
import org.jmolecules.ddd.annotation.ValueObject;

@ValueObject
@Value
public class ID {
	@Getter
	private String value;

	public static ID create(){
		return new ID(UUID.randomUUID().toString());
	}
}
