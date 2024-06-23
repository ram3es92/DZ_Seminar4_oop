package seminar4;

import java.util.List;
import seminar4.controller.TeacherController;
import seminar4.model.Teacher;

public class Main {

    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();

        // Создание учителей и вывод их на консоль
        teacherController.createTeachersAndDisplay(List.of(
                new Teacher(1, "Иван", "Сидоров", "Математика"),
                new Teacher(2, "Ольга", "Петрова", "История")
        ));

        // Изменение предмета у одного из учителей
        teacherController.updateTeacher(1, "Физика");

        // Отображение всех учителей после изменения
        teacherController.displayAllTeachers();

        // Удаление одного из учителей
        teacherController.deleteTeacher(2);

        // Отображение всех учителей после удаления
        teacherController.displayAllTeachers();
    }
}