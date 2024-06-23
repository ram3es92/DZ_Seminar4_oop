package seminar4.controller;

import java.util.List;
import seminar4.model.Student;
import seminar4.service.StudentService;

public class StudentController {

    private final StudentService studentService = new StudentService();

    public void sendOnConsole(List<Student> students) {
        studentService.sendOnConsole(students);
    }
}