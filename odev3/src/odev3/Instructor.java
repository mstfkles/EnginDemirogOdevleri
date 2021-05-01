package odev3;

public class Instructor extends User {
	String authority;// yetkiler
	String syllabus;// müfredat
	String homeworks;

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
		this.syllabus = syllabus;
	}

	public String getHomeworks() {
		return homeworks;
	}

	public void setHomeworks(String homeworks) {
		this.homeworks = homeworks;
	}

}
