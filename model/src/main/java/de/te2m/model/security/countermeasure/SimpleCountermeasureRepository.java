package de.te2m.model.security.countermeasure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import de.te2m.model.security.common.Description;
import de.te2m.model.security.common.ID;
import org.jmolecules.ddd.annotation.Repository;

public class SimpleCountermeasureRepository implements Countermeasures {

	private Map<ID, Countermeasure> items = new HashMap<>();

	@Override
	public Countermeasure createMitigation(Description description) {
		Countermeasure countermeasure = Mitigation.builder()
				.id(ID.create())
				.description(description)
				.build();
		items.put(countermeasure.getId(), countermeasure);
		return countermeasure;
	}

	@Override
	public Countermeasure createAssumption(Description description) {
		Countermeasure countermeasure = Assumption.builder()
				.id(ID.create())
				.description(description)
				.build();
		items.put(countermeasure.getId(), countermeasure);
		return countermeasure;
	}

	@Override
	public Optional<Countermeasure> getByID(ID id) {
		return Optional.ofNullable(items.get(id));
	}

	@Override
	public List<Countermeasure> getAllAssumptions() {
		return items.values().stream().filter(item -> item instanceof Assumption).collect(Collectors.toList());
	}

	@Override
	public List<Countermeasure> getAllMitigations() {
		return items.values().stream().filter(item -> item instanceof Mitigation).collect(Collectors.toList());
	}

	@Override
	public List<Countermeasure> getAll() {
		var list = new ArrayList<Countermeasure>();
		list.addAll(items.values());
		return list;
	}


	/*
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
	public Optional<ItemOfConcern> getItemByID(ID id){
		return Optional.ofNullable(items.get(id));
	}

	@Override
	public List<ItemOfConcern> getAllAssets(){
		return items.values().stream().filter(item -> item instanceof Asset).collect(Collectors.toList());
	}
*/
}
