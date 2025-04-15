package Mediators;

import Clients.Client;
import Clients.Student;
import Clients.Teacher;
import Exam.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Controller_Office implements Mediator{

    private List<Student>students;
    private List<Teacher>teachers;

    public Controller_Office() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }


    @Override
    public void send_Recheck_Request(Student student, Bundle bundle) {
        System.out.println(">>Exam Controller: Recheck request received from student with ID: "+ student.getClient_ID());
        System.out.println(">>Exam Controller: Recheck request sent to teacher with id "+ bundle.scripts.get(0).getTeacher_ID());
        teachers.get(bundle.scripts.get(0).getTeacher_ID()-1).getScripts(bundle);
    }

    @Override
    public void send_Bundle(Teacher teacher, Bundle bundle) {
        System.out.println(">>Exam Controller: Exam scripts and marksheets received from teacher with id "+teacher.getClient_ID());

        for(int i=0; i<bundle.scripts.size(); i++) {
            System.out.println(">>Exam Controller: Teacher id-"+bundle.scripts.get(i).getTeacher_ID()+": "+bundle.marksheet.get(i));
        }

        System.out.println(">>Exam Controller: Mistakes found:-");

        for(int i=0; i<bundle.scripts.size(); i++) {
            if (bundle.marksheet.get(i) != bundle.scripts.get(i).getMarks()) {
                System.out.println(">>Exam Controller: Teacher id-" + bundle.scripts.get(i).getTeacher_ID() + ": " + bundle.marksheet.get(i) +
                        "(Previous marks), " + bundle.scripts.get(i).getMarks() + "(Corrected marks)");
            }
        }

        for(int i=0; i<bundle.scripts.size(); i++) {
            Bundle newBundle = new Bundle();
            newBundle.scripts = new ArrayList<>();
            newBundle.scripts.add(bundle.scripts.get(i));

            System.out.println(">>Exam Controller: Result published to Student with id "+bundle.scripts.get(i).getStudent_ID());
            students.get(bundle.scripts.get(i).getStudent_ID()-1).getScripts(newBundle);
        }
    }

    @Override
    public void send_Recheck_Result(Teacher teacher, Bundle bundle) {
        System.out.println(">>Exam Controller: Recheck response received from Teacher with id "+teacher.getClient_ID());
        System.out.println(">>Exam Controller: Final Marks after recheck: "+ bundle.scripts.get(0).getMarks());
        System.out.println(">>Exam Controller: Recheck response forwarded to Student with id "+bundle.scripts.get(0).getStudent_ID());
        students.get(bundle.scripts.get(0).getStudent_ID()-1).getScripts(bundle);
    }
}
