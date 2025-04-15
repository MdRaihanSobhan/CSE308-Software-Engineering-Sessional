package Exam;

public class Script {
    private int teacher_ID;
    private int student_ID;
    private int marks;

    public Script(int teacher_ID, int student_ID, int marks) {
        this.teacher_ID = teacher_ID;
        this.student_ID = student_ID;
        this.marks = marks;
    }

    public int getTeacher_ID() {
        return teacher_ID;
    }

    public void setTeacher_ID(int teacher_ID) {
        this.teacher_ID = teacher_ID;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Script{" +
                "teacher_ID=" + teacher_ID +
                ", student_ID=" + student_ID +
                ", marks=" + marks +
                '}';
    }
}
