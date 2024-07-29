package de.te2m.model.security.goal;

import java.util.Optional;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import de.te2m.model.security.countermeasure.Countermeasure;
import de.te2m.model.security.countermeasure.Countermeasures;
import de.te2m.model.security.countermeasure.SimpleCountermeasureRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleObjectivesRepositoryTest {

	@Test
	void createObjective() {
		Objectives items = new SimpleObjectivesRepository();
		Objective ioc = items.createObjective( new Name("name"), new Description("def"));
		assertNotNull(ioc);
		String id = ioc.getId().getValue();
		Optional<Objective> retrieved = items.getByID(new ID(id));
		assertTrue(retrieved.isPresent());
		assertEquals(1, items.getAll().size());
		items.createObjective( new Name("name2"), new Description("def2"));
		assertEquals(2, items.getAll().size());
	}

}