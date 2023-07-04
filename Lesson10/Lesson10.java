package Lesson10;

public class Lesson10 {

    public static void main(String[] args) {
        Student petro = new Student();
        petro.setName("Petro");
        petro.setSurname("Petrenko");
        petro.setAge(18);
        System.out.println(petro.getName());
        System.out.println(petro.getSurname());
        System.out.println(petro.getAge());

        Student ivan = new Student();
        ivan.setName("Ivan");
        ivan.setSurname("Checkrenyov");
        ivan.setAge(42);
        System.out.println(ivan.getName());
        System.out.println(ivan.getSurname());
        System.out.println(ivan.getAge());

        Teacher mykhailo = new Teacher();
        mykhailo.setName("Mykhailo");
        mykhailo.setSurname("Zelenenko");
        mykhailo.setAge(42);
        mykhailo.setStudent(petro.getName() + " " + petro.getSurname());
        mykhailo.setStudent2(ivan.getName() + " " + ivan.getSurname());
        System.out.println(mykhailo.getName());
        System.out.println(mykhailo.getSurname());
        System.out.println(mykhailo.getAge());
        System.out.println(mykhailo.getStudent());
        System.out.println(mykhailo.getStudent2());

    }
}
