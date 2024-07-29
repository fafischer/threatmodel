package de.te2m.model.security.countermeasure;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;

import java.util.List;
import java.util.Optional;

public interface Countermeasures {
	Countermeasure createMitigation(Description description);
	Countermeasure createAssumption(Description description);

	Optional<Countermeasure> getByID(ID id);
	List<Countermeasure> getAllAssumptions();
	List<Countermeasure> getAllMitigations();
	List<Countermeasure> getAll();
}
