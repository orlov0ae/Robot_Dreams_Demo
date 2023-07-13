package Lesson13;

public class Teacher extends Human {

    public Teacher(String name, String surname, int age) {
        super(name, surname, age);
    }


    @Override
    public void role() {
        System.out.println(this.name + " " + this.surname + " is a teacher");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
