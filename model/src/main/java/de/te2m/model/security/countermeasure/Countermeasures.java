package de.te2m.model.security.countermeasure;

import java.util.List;
import java.util.Optional;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;

public interface Countermeasures {
	Countermeasure createMitigation(Description description);
	Countermeasure createAssumption(Description description);

	Optional<Countermeasure> getByID(ID id);
	List<Countermeasure> getAllAssumptions();
	List<Countermeasure> getAllMitigations();
	List<Countermeasure> getAll();
}
