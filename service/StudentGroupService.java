package seminar4.service;

import seminar4.model.Student;
import seminar4.model.StudentGroup;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    private final StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student) {
        studentGroup.students.add(student);
    }

    public List<Student> sort() {
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }
}
