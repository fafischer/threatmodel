package de.te2m.security.threatmodel.repository.neo4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import de.te2m.model.security.goal.Objective;
import de.te2m.model.security.goal.Objectives;

public class ObjectivesRepository implements Objectives {

	private Map<ID, Objective> objectives = new HashMap<>();
	@Override
	public Objective createObjective(Name name, Description description) {
		var objective = Objective.builder().id(ID.create()).name(name).description(description).build();
		objectives.put(objective.getId(), objective);
		return objective;
	}

	@Override
	public Optional<Objective> getByID(ID id) {
		return Optional.ofNullable(objectives.get(id));
	}

	@Override
	public List<Objective> getAll() {
		var list = new ArrayList<Objective>();
		list.addAll(objectives.values());
		return list;
	}
}
