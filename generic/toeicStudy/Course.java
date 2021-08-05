package generic.toeicStudy;

public class Course<T> {
    private int level;      //코스 레벨
    private String teacher; //강사 이름

    Course(int level, String teacher){
        this.level = level;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "course : level="+ level+ ", teacher="+ teacher;
    }
}
