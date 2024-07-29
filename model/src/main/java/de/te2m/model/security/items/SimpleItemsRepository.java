package de.te2m.model.security.items;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import de.te2m.model.security.common.Name;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SimpleItemsRepository implements Items {

	private Map<ID, ItemOfConcern> items = new HashMap<>();

	@Override
	public ItemOfConcern createAsset(Name name, Description description){
		ItemOfConcern ioc = Asset.builder()
				.id(ID.create())
				.name(name)
				.description(description)
				.build();
		items.put(ioc.getId(), ioc);
		return ioc;
	}

	@Override
	public ItemOfConcern createInterface(Name name, Description description){
		ItemOfConcern ioc = Interface.builder()
				.id(ID.create())
				.name(name)
				.description(description)
				.build();
		items.put(ioc.getId(), ioc);
		return ioc;
	}

	@Override
	public Optional<ItemOfConcern> getByID(ID id){
		return Optional.ofNullable(items.get(id));
	}

	@Override
	public List<ItemOfConcern> getAllAssets(){
		return items.values().stream().filter(item -> item instanceof Asset).collect(Collectors.toList());
	}

	@Override
	public List<ItemOfConcern> getAllInterfaces(){
		return items.values().stream().filter(item -> item instanceof Interface).collect(Collectors.toList());
	}

}
