package de.te2m.model.security.common;

import lombok.Getter;
import lombok.Value;
import org.jmolecules.ddd.annotation.ValueObject;

import java.util.UUID;

@ValueObject
@Value
public class ID {
	@Getter
	private String value;

	public static ID create(){
		return new ID(UUID.randomUUID().toString());
	}
	public static ID from(String rawValue){
		return new ID(rawValue);
	}
}
