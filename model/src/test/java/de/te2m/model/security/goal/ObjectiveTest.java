package de.te2m.model.security.goal;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ObjectiveTest {

	@Test
	void builder() {
		ID id = new ID("abc");
		Description description = new Description("bla");
		Name name = new Name("blubb");
		assertNotNull(id);
		Objective objective = Objective.builder().id(id).name(name).description(description).build();
		assertNotNull(objective);
	}
}