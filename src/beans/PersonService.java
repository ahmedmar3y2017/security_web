package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "personService")

public class PersonService {

	public List<person> createPersons() {
		List<person> list = new ArrayList<person>();
		list.add(new person(7, "ahmed mar3y", "4", "1", "mar3y"));
		list.add(new person(2, "ashraf zidan", "4", "1", "ashraf"));
		list.add(new person(2, "ahmed madkour", "4", "1", "madkor"));
		// list.add(new person(id, name, year, section, imageName));

		return list;
	}

}