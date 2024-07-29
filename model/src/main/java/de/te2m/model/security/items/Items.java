package de.te2m.model.security.items;

import java.util.List;
import java.util.Optional;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;

public interface Items {
	ItemOfConcern createAsset(Name name, Description description);

	ItemOfConcern createInterface(Name name, Description description);

	Optional<ItemOfConcern> getByID(ID id);

	List<ItemOfConcern> getAllAssets();

	List<ItemOfConcern> getAllInterfaces();
}
