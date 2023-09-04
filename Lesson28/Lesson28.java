package Lesson28;

public class Lesson28 {
    public static void main(String[] args) {

        Person person1 = new Person("John");
        Person person2 = new Person();
        Person person3 = new Person("John 10");

        CheckNameValidation checkNameValidation = new CheckNameValidation();
        checkNameValidation.checkNameValidation(person1);
        checkNameValidation.checkNameValidation(person2);
        checkNameValidation.checkNameValidation(person3);

    }
}
