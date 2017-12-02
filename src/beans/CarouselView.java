package beans;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class CarouselView implements Serializable {

	private List<person> Persons;
	// @ManagedProperty(value = "#{person}")
	private person person;
	@ManagedProperty(value = "#{personService}")
	private PersonService personService;

	@PostConstruct
	public void init() {
		System.out.println("Done");
		Persons = personService.createPersons();
		System.out.println("Done");


	}

	public person getPerson() {
		return person;
	}

	public void setPerson(person person) {
		this.person = person;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public List<person> getPersons() {
		return Persons;
	}

	public void setPersons(List<person> persons) {
		Persons = persons;
	}

}
