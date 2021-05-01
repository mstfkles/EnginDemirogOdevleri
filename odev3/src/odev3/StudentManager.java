package odev3;

public class StudentManager {
	public void homeworkDone(Student student) {
		System.out.println(
				student.getUserName() + " :adlý kullanýcý" + student.getHomeworkTracking() + " :adlý ödevi yapmýþtýr.");
		;
	}

	public void homeworkMultiple(Student[] student) {
		System.out.println("Yapýlan ödevler :");
		for (Student student2 : student) {
			System.out.println(student2.getHomeworkTracking());
		}
	}

}
