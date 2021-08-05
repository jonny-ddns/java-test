package generic.toeicStudy;

public class RegisterCourse {
	//��� Course �� ���� �� �ִ�
	public void toeicGeneral(Course<?> course) {
		String desc = "�Ϲݰ��� | "+ course.toString();
		System.out.println(desc);
	}	
	
	//����Ÿ������ - Worker�� ����Ŭ������ �����ϴ�
	public void toeicWorker(Course<? super Worker> course) {
		String desc = "�����ΰ��� | "+ course.toString();
		System.out.println(desc);
	}
	
	//����Ÿ������ - UnivStudent�� ��ӹ޴� ����Ŭ������ �����ϴ�
	public void toeicUniv(Course<? extends UnivStudent> course) {
		String desc = "���л����� | "+ course.toString();
		System.out.println(desc);
	}
	
	//����Ÿ������ - UnivStuGraduating�� ��ӹ޴� ����Ŭ������ �����ϴ�
	public void toeicUnivGraduating(Course<? extends UnivStuGraduating> course) {
		String desc = "���л�(��������)���� | "+ course.toString();
		System.out.println(desc);
	}	
}
