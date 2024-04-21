package ua.hillel.kalina.lessons.lesson_031;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();

        for (int i = 0; i < 25; i++) {
            Student student = new Student();
            student.setName("Name " + i);
            student.setEmail("email" + i + "@example.com");
            studentDAO.addStudent(student);
        }


        // Добавление, удаление, изменение записей
        Student student = new Student();
        student.setName("John Doe");
        student.setEmail("john.doe@example.com");
        studentDAO.addStudent(student);

        // Получение всех записей
        List<Student> students = studentDAO.getAllStudents();
        for (Student s : students) {
            System.out.println(s.getName() + " - " + s.getEmail());
        }

        // Получение записи по ID
        Student retrievedStudent = studentDAO.getStudentById(1);
        System.out.println("Retrieved Student: " + retrievedStudent.getName());

        // Изменение записи
        retrievedStudent.setName("Jane Doe");
        studentDAO.updateStudent(retrievedStudent);

        // Удаление записи
        studentDAO.deleteStudent(1);
    }



}
