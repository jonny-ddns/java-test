package generic.toeicStudy;

public class Test {
    public static void main(String[] args) {
    	
    	//�ڽ�����
    	Course<Person> coursePerson					= new Course<>(1, "��浿");
    	Course<Worker> courseWorker					= new Course<>(2, "���浿");
    	Course<UnivStudent> courseUniv				= new Course<>(3, "�ֱ浿");
    	Course<UnivStuGraduating> courseGraduating	= new Course<>(4, "���浿");
    	
    	RegisterCourse register = new RegisterCourse();
    	
    	//��� ���¿� ��û ����
    	register.toeicGeneral(coursePerson);
    	register.toeicGeneral(courseWorker);
    	register.toeicGeneral(courseUniv);
    	register.toeicGeneral(courseGraduating);
    	
    	//���л��� ���� ���¸� ��û����
//    	register.toeicUniv(coursePerson);	//�Ұ�
//    	register.toeicUniv(courseWorker);	//�Ұ�
    	register.toeicUniv(courseUniv);
    	register.toeicUniv(courseGraduating);
    	
    	//���л�(��������)�� ���� ���¸� ��û����
//    	register.toeicUnivGraduating(coursePerson);	//�Ұ�
//    	register.toeicUnivGraduating(courseWorker);	//�Ұ�
//    	register.toeicUnivGraduating(courseUniv);	//�Ұ�
    	register.toeicUnivGraduating(courseGraduating);
    	
    	//������ �� ����Ÿ�Ը� ����
    	register.toeicWorker(coursePerson);
//    	register.toeicWorker(courseUniv);		//�Ұ�
//    	register.toeicWorker(courseGraduating);	//�Ұ�
    	register.toeicWorker(courseWorker);
    }
}