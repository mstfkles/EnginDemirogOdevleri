package odev3;

public class InstructorManager {

	public void authotiys(Instructor instructor) {
		System.out
				.println(instructor.getUserName() + " adl� e�itmenin yetkileri " + instructor.getAuthority() + " dir.");
	}

	public void sylaabuss(Instructor instructor) {
		System.out.println(instructor.getUserName() + " adl� e�itmenin m�fredat� " + instructor.getSyllabus() + " dir.");
	}

	public void add(Instructor instructor) {
		System.out.println(
				instructor.getUserName() + " adl� e�itmen " + instructor.getHomeworks() + " adl� �devi vermi�tir.");
	}

	public void addMultiple(Instructor[] instructor) {
		for (Instructor instructor2 : instructor) {
			System.out.println(instructor2.getHomeworks());
		}
	}

}
