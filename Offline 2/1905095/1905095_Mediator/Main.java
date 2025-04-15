import Clients.Student;
import Clients.Teacher;
import Exam.Script;
import Mediators.Controller_Office;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {

        Controller_Office controller_office = new Controller_Office();  // mediator

        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        System.out.print("Enter number of teachers: ");
        int teacherCount = scanner.nextInt();
        System.out.print("Enter  number of students: ");
        int studentCount = scanner.nextInt();

        if(teacherCount>studentCount){
            System.out.println("The number of Student must be greater than the number of teachers");
        }

        for(int i=0; i<teacherCount; i++) {
            teacherList.add(new Teacher(controller_office, i+1));
        }

        for(int i=0; i<studentCount; i++) {
            studentList.add(new Student(controller_office, i+1));
        }

        controller_office.setTeachers(teacherList);
        controller_office.setStudents(studentList);

        List<List<Script>> scriptList = new ArrayList<>();
        List<Script> newScript;

        for(int i=0; i<teacherCount; i++) {
            newScript = new ArrayList<>();
            scriptList.add(newScript);
        }

        for(int i=0, temp=0; i<studentCount; i++) {
            if(temp >= teacherCount) {
                temp = 0;
            }

            scriptList.get(temp).add(new Script(temp+1, i+1, random.nextInt(65)+36));  // NOTICE: marks between 50 and 100
            temp++;
        }


        for(int i=0; i<teacherCount; i++) {
            System.out.println("");
            teacherList.get(i).submitBundle(scriptList.get(i));
        }

        while(true) {
            System.out.print("Enter student id for recheck: , -1 to quit");
            int id = scanner.nextInt();

            if (id == 0) {
                break;

            }
            else if (id < 1 || id > studentCount) {
                System.out.println("Id is not in range");

            }
            else {
                studentList.get(id-1).recheck_Request();
            }
        }

        return ;
    }
}