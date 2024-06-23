package seminar4.service;

import java.util.List;
import seminar4.model.Student;
import seminar4.view.UserView;

public class StudentService implements UserView<Student> {

    public Student createStudent(int id, String name, String last) {
        return new Student(id, name, last);
    }

    @Override
    public void sendOnConsole(List<Student> students) {
        System.out.println(students);
    }
}