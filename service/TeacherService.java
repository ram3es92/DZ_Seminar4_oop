package seminar4.service;

import seminar4.model.Teacher;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherService {

    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public Teacher createTeacher(int id, String name, String lastName, String subject) {
        Teacher teacher = new Teacher(id, name, lastName, subject);
        teachers.add(teacher);
        return teacher;
    }

    public Teacher updateTeacher(int id, String subject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                teacher.setSubject(subject);
                return teacher;
            }
        }
        return null; // В случае, если учитель с таким id не найден
    }

    public Teacher deleteTeacher(int id) {
        Iterator<Teacher> iterator = teachers.iterator();
        while (iterator.hasNext()) {
            Teacher teacher = iterator.next();
            if (teacher.getId() == id) {
                iterator.remove();
                return teacher;
            }
        }
        return null; // В случае, если учитель с таким id не найден
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}