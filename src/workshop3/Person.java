package workshop3;

public class Person {
	
	public Person() {}
	public Person(int id, String name, String surname) {
	
		this.id = id;
		this.name = name;
		this.surname = surname;
		
	}
	 private int id;
	 private String name;
	 private String surname;
	 
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String toString () {
		return "id: "+this.id+" name: "+this.name+" Surname: "+this.surname+" type: "+this.getClass();
	
		
	}
	 
	 

}
