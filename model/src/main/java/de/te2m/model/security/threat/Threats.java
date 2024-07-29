package de.te2m.model.security.threat;

import java.util.List;
import java.util.Optional;

import de.te2m.model.security.common.ID;
import de.te2m.model.security.goal.Objective;
import de.te2m.model.security.items.ItemOfConcern;
import org.jmolecules.ddd.annotation.Repository;

@Repository
public interface Threats {

	List<Threat> getAll();

	Threat createThreat(ItemOfConcern item, Objective objective);

	Threat updateThreat(Threat threat);

	Optional<Threat> getByID(ID id);

}
