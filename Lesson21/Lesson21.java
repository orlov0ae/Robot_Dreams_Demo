package Lesson21;

import java.util.*;



public class Lesson21 {

    public static void main(String[] args) {

        Student johns = new Student("Johns", 4.5F);
        Student reynolds = new Student("Reynolds", 3.9F);
        Student smith = new Student("Smith", 4.9F);
        Student mcconnell = new Student("McConnell", 3.8F);

        List<Student> students = new ArrayList<>(Arrays.asList(
                johns,
                reynolds,
                smith,
                mcconnell
        ));
        System.out.println("Оригінальний список студентів: " + students);

        Comparator<Student> comparingSurname = (student1, student2) -> student1.getSurname().compareTo(student2.getSurname());
        students.sort(comparingSurname);
        System.out.println("Список відсортований за прізвищем: " + students);

        Comparator<Student> comparingAverageMark = (student1, student2) -> Float.compare(student1.getAverageMark(), student2.getAverageMark());
        students.sort(comparingAverageMark);
        System.out.println("Список відсортований за середнім балом: " + students);

    }


}
