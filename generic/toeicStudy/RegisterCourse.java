package generic.toeicStudy;

public class RegisterCourse {
	//모든 Course 를 받을 수 있다
	public void toeicGeneral(Course<?> course) {
		String desc = "일반과정 | "+ course.toString();
		System.out.println(desc);
	}	
	
	//하위타입제한 - Worker의 상위클래스만 가능하다
	public void toeicWorker(Course<? super Worker> course) {
		String desc = "직장인과정 | "+ course.toString();
		System.out.println(desc);
	}
	
	//상위타입제한 - UnivStudent를 상속받는 하위클래스만 가능하다
	public void toeicUniv(Course<? extends UnivStudent> course) {
		String desc = "대학생과정 | "+ course.toString();
		System.out.println(desc);
	}
	
	//상위타입제한 - UnivStuGraduating를 상속받는 하위클래스만 가능하다
	public void toeicUnivGraduating(Course<? extends UnivStuGraduating> course) {
		String desc = "대학생(졸업예정)과정 | "+ course.toString();
		System.out.println(desc);
	}	
}
