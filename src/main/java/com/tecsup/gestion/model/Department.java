package com.tecsup.gestion.model;

public class Department {
	int department_id;
	String name;
	String description;
	String city;
	
	public Department(int department_id, String name, String description, String city) {
		super();
		this.department_id = department_id;
		this.name = name;
		this.description = description;
		this.city = city;
	}
	
	public Department() {
		super();
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Department [ID=" + department_id+ ", name=" + name+ ", description=" + description + ", city="
			+ city + "]";
	
	}
}
