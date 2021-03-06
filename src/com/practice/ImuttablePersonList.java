package com.practice;

import java.util.List;

public class ImuttablePersonList {
	
	private final List<CreatingImmutablePerson> persons;
	

	public ImuttablePersonList(List<CreatingImmutablePerson> persons) {
		super();
		this.persons = persons;
	}

	public List<CreatingImmutablePerson> getPersons() {
		return persons;
	}

	
}
