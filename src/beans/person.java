package beans;

import javax.faces.bean.ManagedBean;

public class person {

	public int id;
	public String name;
	public String year;
	public String section;

	public String ImageName;

	public person(int id, String name, String year, String section, String imageName) {
		super();
		this.id = id;
		this.name = name;
		this.year = year;
		this.section = section;
		ImageName = imageName;
	}

	public String getImageName() {
		return ImageName;
	}

	public void setImageName(String imageName) {
		ImageName = imageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

}
