package workshop3;

public class main {

	public static void main(String[] args) {
		Student student1 = new Student(10,"mehmet","ongun");
		Instructor instructor1 = new Instructor(10,"mehmet","ongun");
		User user1 = new User(10,"mehmet","ongun");
		BaseManager baseManager = new BaseManager();
		baseManager.add(user1);
		baseManager.add(instructor1);
		baseManager.add(student1);
		baseManager.log();
		student1.setName("tunahan");

		baseManager.update(user1);
		baseManager.log();

		baseManager.delete(user1);
		baseManager.log();
		
		
		
		
			
	}
    
}
