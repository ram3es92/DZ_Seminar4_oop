package seminar4.controller;

import java.util.List;
import seminar4.model.Teacher;
import seminar4.service.TeacherService;
import seminar4.view.TeacherView;

public class TeacherController {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    public void createTeachersAndDisplay(List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            teacherService.createTeacher(teacher.getId(), teacher.getName(), teacher.getLastName(), teacher.getSubject());
        }
        displayAllTeachers();
    }

    public Teacher createTeacher(int id, String name, String lastName, String subject) {
        Teacher teacher = teacherService.createTeacher(id, name, lastName, subject);
        System.out.printf("Создан учитель: Имя: %s, Фамилия: %s, Предмет: %s%n", teacher.getName(), teacher.getLastName(), teacher.getSubject());
        return teacher;
    }

    public Teacher updateTeacher(int id, String subject) {
        Teacher teacher = teacherService.updateTeacher(id, subject);
        if (teacher != null) {
            System.out.printf("Учитель обновлен: Имя: %s, Фамилия: %s, Предмет: %s%n", teacher.getName(), teacher.getLastName(), teacher.getSubject());
        } else {
            System.out.println("Учитель с id=" + id + " не найден.");
        }
        return teacher;
    }

    public Teacher deleteTeacher(int id) {
        Teacher teacher = teacherService.deleteTeacher(id);
        if (teacher != null) {
            System.out.printf("Удален учитель: Имя: %s, Фамилия: %s, Предмет: %s%n", teacher.getName(), teacher.getLastName(), teacher.getSubject());
        } else {
            System.out.println("Учитель с id=" + id + " не найден.");
        }
        return teacher;
    }

    public void displayAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        if (teachers.isEmpty()) {
            System.out.println("Список учителей пуст.");
        } else {
            teacherView.displayTeachers(teachers);
        }
    }
}
