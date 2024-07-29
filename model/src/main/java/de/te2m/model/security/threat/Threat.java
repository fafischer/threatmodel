package de.te2m.model.security.threat;

import java.util.List;
import java.util.Map;
import java.util.Set;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.goal.Objective;
import de.te2m.model.security.items.ItemOfConcern;
import de.te2m.model.security.requirement.Requirement;
import de.te2m.model.security.risk.Risk;
import org.jmolecules.ddd.annotation.Entity;
import org.jmolecules.ddd.annotation.Identity;

@Entity
public class Threat {

	public Threat(){
		this(ID.create());
	}

	public Threat(ID externalID){
		id = externalID;
	}

	@Identity
	private ID id;

	private Description description;

	private ItemOfConcern item;

	private Objective objective;

	private Map<ID, Risk> risks;

	private Map<ID,Requirement> requirements;



	public ID getId() {
		return id;
	}

	public Description getDescription() {
		return description;
	}

	public Threat setDescription(Description description) {
		this.description = description;
		return this;
	}

	public ItemOfConcern getItem() {
		return item;
	}

	public Threat setItem(ItemOfConcern item) {
		this.item = item;
		return this;
	}

	public Objective getObjective() {
		return objective;
	}

	public Threat setObjective(Objective objective) {
		this.objective = objective;
		return this;
	}

	public Threat putRisk(Risk risk){
		this.risks.put(risk.getId(), risk);
		return this;
	}

	public Threat removeRisk(Risk risk){
		this.risks.remove(risk.getId());
		return this;
	}

	public Threat putRequirement(Requirement requirement){
		this.requirements.put(requirement.getId(), requirement);
		return this;
	}

	public Threat removeRequirement(Requirement requirement){
		this.requirements.remove(requirement.getId());
		return this;
	}
}
