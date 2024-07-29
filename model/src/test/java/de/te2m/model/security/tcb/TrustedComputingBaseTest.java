package de.te2m.model.security.tcb;

import java.util.stream.Collectors;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import de.te2m.model.security.items.Category;
import de.te2m.model.security.items.SimpleItemsRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TrustedComputingBaseTest {

	@Test
	void builder() {
		SimpleItemsRepository items = new SimpleItemsRepository();
		TrustedComputingBase tcb = TrustedComputingBase.create();
		tcb.addTrustedItem(items.createAsset(new Name("Asset1"),new Description("This is an Asset")));
		tcb.addTrustedItem(items.createInterface(new Name("Interface1"),new Description("This is an Interface")));
		assertNotNull(tcb);
		assertEquals(0,tcb.getItems().stream().filter(item -> Category.UNKNOWN.equals(item.getCategory())).collect(
				Collectors.toList()).size());
	}
}