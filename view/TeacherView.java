package seminar4.view;

import java.util.List;
import seminar4.model.Teacher;

public class TeacherView {

    public void displayTeachers(List<Teacher> teachers) {
        System.out.println("Список учителей:");
        for (Teacher teacher : teachers) {
            System.out.printf("Имя: %s, Фамилия: %s, Предмет: %s%n", teacher.getName(), teacher.getLastName(), teacher.getSubject());
        }
    }
}