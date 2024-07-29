package de.te2m.security.threatmodel.repository.neo4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import de.te2m.model.security.common.ID;
import de.te2m.model.security.goal.Objective;
import de.te2m.model.security.items.ItemOfConcern;
import de.te2m.model.security.threat.Threat;
import de.te2m.model.security.threat.Threats;

public class ThreatRepository implements Threats {

	private Map<ID, Threat> threats = new HashMap<>();
	@Override
	public List<Threat> getAll() {
		var list = new ArrayList<Threat>();
		list.addAll(threats.values());
		return list;
	}

	@Override
	public Threat createThreat(ItemOfConcern item, Objective objective) {
		var threat = new Threat().setItem(item).setObjective(objective);
		threats.put(threat.getId(), threat);
		return threat;
	}


	@Override
	public Threat updateThreat(Threat threat) {
		threats.put(threat.getId(), threat);
		return threat;
	}

	@Override
	public Optional<Threat> getByID(ID id) {
		return Optional.ofNullable(threats.get(id));
	}
}
