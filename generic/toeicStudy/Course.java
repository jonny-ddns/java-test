package generic.toeicStudy;

public class Course<T> {
    private int level;      //�ڽ� ����
    private String teacher; //���� �̸�

    Course(int level, String teacher){
        this.level = level;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "course : level="+ level+ ", teacher="+ teacher;
    }
}
