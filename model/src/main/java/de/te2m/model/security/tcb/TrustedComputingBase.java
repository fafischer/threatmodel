package de.te2m.model.security.tcb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import de.te2m.model.security.items.ItemOfConcern;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Entity
public class TrustedComputingBase {

	private TrustedComputingBase(){
		id = ID.create();
		items = new HashSet<>();
	}

	@Identity
	private ID id;
	
	private Set<Trusted> items;

	public TrustedComputingBase addTrustedItem(ItemOfConcern ioc){
		items.add(new Trusted<>(ioc));
		return this;
	}
	
	public static TrustedComputingBase create(){
		return new TrustedComputingBase();
	}

	public Set<Trusted> getItems() {
		return items;
	}
}
