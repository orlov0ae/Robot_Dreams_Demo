package Lesson13;

public class Lesson13 {

    public static void main(String[] args) {

        Human teacher = new Teacher("Ivan", "Ivahnenko", 36);
        Human student = new Student("Petro", "Petrychenko", 17);

        System.out.println(teacher.getName());
        System.out.println(teacher.getSurname());
        System.out.println(teacher.toString());
        teacher.role();
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.toString());
        student.role();


    }

}
