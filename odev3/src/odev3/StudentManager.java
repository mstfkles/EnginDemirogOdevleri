package odev3;

public class StudentManager {
	public void homeworkDone(Student student) {
		System.out.println(
				student.getUserName() + " :adl� kullan�c�" + student.getHomeworkTracking() + " :adl� �devi yapm��t�r.");
		;
	}

	public void homeworkMultiple(Student[] student) {
		System.out.println("Yap�lan �devler :");
		for (Student student2 : student) {
			System.out.println(student2.getHomeworkTracking());
		}
	}

}
