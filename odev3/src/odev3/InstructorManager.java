package odev3;

public class InstructorManager {

	public void authotiys(Instructor instructor) {
		System.out
				.println(instructor.getUserName() + " adlý eðitmenin yetkileri " + instructor.getAuthority() + " dir.");
	}

	public void sylaabuss(Instructor instructor) {
		System.out.println(instructor.getUserName() + " adlý eðitmenin müfredatý " + instructor.getSyllabus() + " dir.");
	}

	public void add(Instructor instructor) {
		System.out.println(
				instructor.getUserName() + " adlý eðitmen " + instructor.getHomeworks() + " adlý ödevi vermiþtir.");
	}

	public void addMultiple(Instructor[] instructor) {
		for (Instructor instructor2 : instructor) {
			System.out.println(instructor2.getHomeworks());
		}
	}

}
