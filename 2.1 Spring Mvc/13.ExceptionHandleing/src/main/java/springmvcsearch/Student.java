package springmvcsearch;

import java.util.Date;
import java.util.List;

public class Student {
	private long id;
    private Address address;
	private String name;
	private Date date;
	private List<String>courses;
	private String gender;
	private String type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", address=" + address + ", name=" + name + ", date=" + date + ", courses="
				+ courses + ", gender=" + gender + ", type=" + type + "]";
	}

}
