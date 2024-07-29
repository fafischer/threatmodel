package de.te2m.model.security.items;

import java.util.Optional;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemsTest {

	@Test
	public void createAssetTest(){
		SimpleItemsRepository items= new SimpleItemsRepository();
		ItemOfConcern ioc = items.createAsset(new Name("abc"), new Description("def"));
		assertNotNull(ioc);
		String id = ioc.getId().getValue();
		Optional<ItemOfConcern> retrieved = items.getByID(new ID(id));
		assertTrue(retrieved.isPresent());
		assertEquals(Category.ASSET, retrieved.get().getCategory());
	}

	@Test
	public void createInterfaceTest(){
		SimpleItemsRepository items= new SimpleItemsRepository();
		var ioc = items.createInterface(new Name("abc"), new Description("def"));
		assertNotNull(ioc);
		var id = ioc.getId().getValue();
		var retrieved = items.getByID(new ID(id));
		assertTrue(retrieved.isPresent());
		assertEquals(Category.INTERFACE, retrieved.get().getCategory());
	}

	@Test
	public void getAllAssetsTest(){
		SimpleItemsRepository items= new SimpleItemsRepository();
		items.createInterface(new Name("abc"), new Description("def"));
		items.createAsset(new Name("abc2"), new Description("def2"));
		var iocs = items.getAllAssets();
		assertNotNull(iocs);
		assertEquals(1, iocs.size());
	}

	@Test
	public void getAllInterfacesTest(){
		SimpleItemsRepository items= new SimpleItemsRepository();
		items.createInterface(new Name("abc"), new Description("def"));
		items.createAsset(new Name("abc2"), new Description("def2"));
		var iocs = items.getAllInterfaces();
		assertNotNull(iocs);
		assertEquals(1, iocs.size());
	}
}