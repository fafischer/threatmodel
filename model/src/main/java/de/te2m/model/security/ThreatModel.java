package de.te2m.model.security;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.Name;
import de.te2m.model.security.countermeasure.Countermeasures;
import de.te2m.model.security.goal.Objective;
import de.te2m.model.security.goal.Objectives;
import de.te2m.model.security.items.ItemOfConcern;
import de.te2m.model.security.items.Items;
import de.te2m.model.security.tcb.TrustedComputingBase;
import de.te2m.model.security.threat.Threat;
import de.te2m.model.security.threat.Threats;
import lombok.Builder;
import org.jmolecules.ddd.annotation.AggregateRoot;

import java.util.List;

@AggregateRoot
@Builder
public class ThreatModel {

	private Items items;
	private Countermeasures countermeasures;

	private Objectives objectives;

	private Threats threats;

	public ThreatModel addAsset(Name name, Description description){
		items.createAsset(name, description);
		return this;
	}

	public ThreatModel addInterface(Name name, Description description){
		items.createInterface(name, description);
		return this;
	}

	public ThreatModel addAssumption(Description description){
		countermeasures.createAssumption(description);
		return this;
	}

	public ThreatModel addMitigation(Description description){
		countermeasures.createMitigation(description);
		return this;
	}


	public ThreatModel addObjective(Name name, Description description){
		objectives.createObjective(name, description);
		return this;
	}

	public TrustedComputingBase getTrustedComputingBase(){
		return null;
	}

	public List<Threat> getAllThreats(){
		return threats.getAll();
	}

	public ThreatModel updateThreat(Threat threat){
		threats.updateThreat(threat);
		return this;
	}

	public ThreatModel addThreat(ItemOfConcern item, Objective objective){
		threats.createThreat(item, objective);
		return this;
	}

}
