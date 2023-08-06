package Lesson21;

import java.util.*;



public class Lesson21 {

    public static void main(String[] args) {

        Student johns = new Student("Johns", 4.5F);
        Student reynolds = new Student("Reynolds", 3.9F);
        Student smith = new Student("Smith", 4.9F);
        Student mcconnell = new Student("McConnell", 3.8F);

        List<Student> students = new ArrayList<>();
        students.add(johns);
        students.add(reynolds);
        students.add(smith);
        students.add(mcconnell);
        System.out.println("Оригінальний список студентів: " + students);

        Comparator<Student> comparingSurname = Comparator.comparing(Student::getSurname);
        students.sort(comparingSurname);
        System.out.println("Список відсортований за прізвищем: " + students);

        Comparator<Student> comparingAverageMark = Comparator.comparing(Student::getAverageMark);
        students.sort(comparingAverageMark);
        System.out.println("Список відсортований за середнім балом: " + students);

    }


}
