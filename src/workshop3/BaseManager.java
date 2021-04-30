package workshop3;

public class BaseManager {
	 private Database Db= new Database();
			
	void add(Person person) {
		 Db.add(person);
		 
		 }
	
	 void delete(Person person) {
		 Db.delete(person);
	 }
	 
	 void update(Person person) {
		 Db.update(person);
	 }
	public void log() {
		Db.log();
	}
}
