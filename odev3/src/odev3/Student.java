package odev3;

public class Student extends User {
	String followTheLesson;// ders takibi
	String homeworkTracking;// ödev takibi
	String absenteeismTracking;// devamsýzlýk takibi
	String exams;// sýnavlar

	public String getFollowTheLesson() {
		return followTheLesson;
	}

	public void setFollowTheLesson(String followTheLesson) {
		this.followTheLesson = followTheLesson;
	}

	public String getHomeworkTracking() {
		return homeworkTracking;
	}

	public void setHomeworkTracking(String homeworkTracking) {
		this.homeworkTracking = homeworkTracking;
	}

	public String getAbsenteeismTracking() {
		return absenteeismTracking;
	}

	public void setAbsenteeismTracking(String absenteeismTracking) {
		this.absenteeismTracking = absenteeismTracking;
	}

	public String getExams() {
		return exams;
	}

	public void setExams(String exams) {
		this.exams = exams;
	}
}
