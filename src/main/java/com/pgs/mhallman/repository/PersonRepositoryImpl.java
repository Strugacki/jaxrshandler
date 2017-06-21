package com.pgs.mhallman.repository;


import com.pgs.mhallman.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PersonRepositoryImpl implements PersonRepository {

	private static final Logger LOG = LoggerFactory.getLogger(PersonRepositoryImpl.class);

	@Override
	public Person create() {
		LOG.info("PersonRepositoryImpl :: start");
		Person person = new Person();
		person.setFirstName("Domino");
		person.setLastName("Jachas");
		person.setAge(44);
		System.out.println(person.toString());
		LOG.info("PersonRepositoryImpl :: end");
		return person;
	}

}
