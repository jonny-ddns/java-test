package generic.toeicStudy;

public class Test {
    public static void main(String[] args) {
    	
    	//코스마련
    	Course<Person> coursePerson					= new Course<>(1, "김길동");
    	Course<Worker> courseWorker					= new Course<>(2, "조길동");
    	Course<UnivStudent> courseUniv				= new Course<>(3, "최길동");
    	Course<UnivStuGraduating> courseGraduating	= new Course<>(4, "엄길동");
    	
    	RegisterCourse register = new RegisterCourse();
    	
    	//모든 강좌에 신청 가능
    	register.toeicGeneral(coursePerson);
    	register.toeicGeneral(courseWorker);
    	register.toeicGeneral(courseUniv);
    	register.toeicGeneral(courseGraduating);
    	
    	//대학생을 위한 강좌만 신청가능
//    	register.toeicUniv(coursePerson);	//불가
//    	register.toeicUniv(courseWorker);	//불가
    	register.toeicUniv(courseUniv);
    	register.toeicUniv(courseGraduating);
    	
    	//대학생(졸업예정)을 위한 강좌만 신청가능
//    	register.toeicUnivGraduating(coursePerson);	//불가
//    	register.toeicUnivGraduating(courseWorker);	//불가
//    	register.toeicUnivGraduating(courseUniv);	//불가
    	register.toeicUnivGraduating(courseGraduating);
    	
    	//직장인 및 상위타입만 가능
    	register.toeicWorker(coursePerson);
//    	register.toeicWorker(courseUniv);		//불가
//    	register.toeicWorker(courseGraduating);	//불가
    	register.toeicWorker(courseWorker);
    }
}