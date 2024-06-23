package seminar4.controller;

import seminar4.model.Student;
import seminar4.service.StudentGroupService;

public class StudentGroupController {

    private final StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }

}
