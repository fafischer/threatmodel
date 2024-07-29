package de.te2m.model.security.countermeasure;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCountermeasureRepositoryTest {

	@Test
	void createMitigation() {
		Countermeasures items = new SimpleCountermeasureRepository();
		Countermeasure ioc = items.createMitigation( new Description("def"));
		assertNotNull(ioc);
		String id = ioc.getId().getValue();
		Optional<Countermeasure> retrieved = items.getByID(new ID(id));
		assertTrue(retrieved.isPresent());
		assertEquals(Countermeasure.Category.MITIGATION, retrieved.get().getCategory());
	}

	@Test
	void createAssumption() {
		Countermeasures items = new SimpleCountermeasureRepository();
		Countermeasure ioc = items.createAssumption( new Description("def"));
		assertNotNull(ioc);
		String id = ioc.getId().getValue();
		Optional<Countermeasure> retrieved = items.getByID(new ID(id));
		assertTrue(retrieved.isPresent());
		assertEquals(Countermeasure.Category.ASSUMPTION, retrieved.get().getCategory());
	}


	@Test
	void getAllAssumptions() {
		Countermeasures items = new SimpleCountermeasureRepository();
		Countermeasure ioc = items.createAssumption( new Description("def"));
		Countermeasure ioc2 = items.createMitigation( new Description("def2"));
		var cms = items.getAllAssumptions();
		assertNotNull(cms);
		assertEquals(1, cms.size());

	}

	@Test
	void getAllMitigations() {
		Countermeasures items = new SimpleCountermeasureRepository();
		Countermeasure ioc = items.createAssumption( new Description("def"));
		Countermeasure ioc2 = items.createMitigation( new Description("def2"));
		var cms = items.getAllMitigations();
		assertNotNull(cms);
		assertEquals(1, cms.size());
	}

	@Test
	void getAll() {
		Countermeasures items = new SimpleCountermeasureRepository();
		Countermeasure ioc = items.createAssumption( new Description("def"));
		Countermeasure ioc2 = items.createMitigation( new Description("def2"));
		var cms = items.getAll();
		assertNotNull(cms);
		assertEquals(2, cms.size());
	}
}