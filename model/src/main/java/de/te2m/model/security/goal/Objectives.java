package de.te2m.model.security.goal;

import java.util.List;
import java.util.Optional;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import org.jmolecules.ddd.annotation.Repository;

@Repository
public interface Objectives {
	Objective createObjective(Name name, Description description);
	Optional<Objective> getByID(ID id);
	List<Objective> getAll();
}