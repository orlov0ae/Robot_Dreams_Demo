package Lesson28;

@ClassToValidate
public class Person {

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @CheckName
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
