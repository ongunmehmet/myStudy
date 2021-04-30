package workshop3;

import java.util.ArrayList;

public class Database {
	private ArrayList<Person> Db= new ArrayList<Person>();
	void add(Person person) {
		Db.add(person);
	}
	
	void delete(Person person) {
		Db.remove(person);	
	}
	
	void update(Person person){
		Db.set(Db.indexOf(person), person);
	}
	public void log() {
		Db.forEach((person)-> System.out.println(person.toString()));
	}
}
