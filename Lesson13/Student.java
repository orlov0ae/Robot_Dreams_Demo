package Lesson13;

public class Student extends Human{

    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }


    @Override
    public void role() {
        System.out.println(this.name + " " + this.surname + " is a student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
