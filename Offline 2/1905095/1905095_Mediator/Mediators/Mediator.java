package Mediators;

import Clients.Client;
import Clients.Student;
import Clients.Teacher;
import Exam.Bundle;

public interface Mediator {
    void send_Recheck_Request(Student student, Bundle bundle);
    void send_Bundle(Teacher teacher, Bundle bundle);
    void send_Recheck_Result(Teacher teacher, Bundle bundle);
}
