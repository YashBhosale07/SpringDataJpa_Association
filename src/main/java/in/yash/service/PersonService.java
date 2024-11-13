package in.yash.service;

import in.yash.model.Person;

public interface PersonService {
	public Person savePerson(Person person);
	public Person getPerson(int id);
	public String deletePerson(int id);
	public Person updatePerson(Person person);
}
