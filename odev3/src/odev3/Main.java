package odev3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setUserName("Mustafa");
		student1.setPassword("12345");

		Student student2 = new Student();
		student2.setId(2);
		student2.setUserName("Engin");
		student2.setPassword("67890");

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setUserName("Deniz");
		instructor.setAuthority("Ders Ekleme -Ders Silme-Öðrenci Kontrol");
		instructor.setSyllabus("Java Eðitim");
		instructor.setHomeworks("Java Kamp 1 Ödevi");

		Instructor instructor2 = new Instructor();
		instructor2.setId(2);
		instructor2.setUserName("Olgun");
		instructor2.setAuthority("Ders Ekleme -Ders Silme-Öðrenci Kontrol");
		instructor2.setSyllabus("C# Eðitim");
		instructor2.setHomeworks("C# Kamp 1 Ödevi");

		UserManager userManager = new UserManager();
		User[] users = { student1, student2 };
		userManager.addMultiple(users);
		System.out.println("\n");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.authotiys(instructor);
		instructorManager.sylaabuss(instructor);
		System.out.println("\n");
		instructorManager.authotiys(instructor2);
		instructorManager.add(instructor2);
		instructorManager.sylaabuss(instructor2);
		
	}

}
