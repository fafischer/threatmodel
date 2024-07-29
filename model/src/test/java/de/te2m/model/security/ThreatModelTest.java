package de.te2m.model.security;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.Name;
import de.te2m.model.security.countermeasure.Countermeasures;
import de.te2m.model.security.countermeasure.SimpleCountermeasureRepository;
import de.te2m.model.security.items.Items;
import de.te2m.model.security.items.SimpleItemsRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreatModelTest {

	@Test
	void addAsset() {

		Countermeasures cms = new SimpleCountermeasureRepository();
		Items items = new SimpleItemsRepository();
		ThreatModel tm = ThreatModel.builder()
				.countermeasures(cms)
				.items(items)
				.build();
		assertEquals(0, items.getAllAssets().size());
		tm.addAsset(new Name("Name"), new Description("Desc"));
		assertEquals(1, items.getAllAssets().size());
	}

	@Test
	void addInterface() {
		Countermeasures cms = new SimpleCountermeasureRepository();
		Items items = new SimpleItemsRepository();
		ThreatModel tm = ThreatModel.builder()
				.countermeasures(cms)
				.items(items)
				.build();
		assertEquals(0, items.getAllInterfaces().size());
		tm.addInterface(new Name("Name"), new Description("Desc"));
		assertEquals(1, items.getAllInterfaces().size());
	}

	@Test
	void addAssumption() {
		Countermeasures cms = new SimpleCountermeasureRepository();
		Items items = new SimpleItemsRepository();
		ThreatModel tm = ThreatModel.builder()
				.countermeasures(cms)
				.items(items)
				.build();
		assertEquals(0, cms.getAllAssumptions().size());
		tm.addAssumption(new Description("Desc"));
		assertEquals(1, cms.getAllAssumptions().size());
	}

	@Test
	void addMitigation() {
		Countermeasures cms = new SimpleCountermeasureRepository();
		Items items = new SimpleItemsRepository();
		ThreatModel tm = ThreatModel.builder()
				.countermeasures(cms)
				.items(items)
				.build();
		assertEquals(0, cms.getAllAssumptions().size());
		tm.addAssumption(new Description("Desc"));
		assertEquals(1, cms.getAllAssumptions().size());
	}


}