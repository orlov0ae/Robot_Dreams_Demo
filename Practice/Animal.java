package Practice;

//Створіть абстрактний клас Animal з абстрактним методом sound().
//Створіть підкласи Dog, Cat та Cow, які реалізують цей метод.
//Метод sound() повинен виводити звук, який робить кожна тварина (наприклад, "Dog barks", "Cat meows", "Cow moos").

public abstract class Animal {

    private String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    private void animalSound() {
        System.out.println();
    }

    public class Dog{

    }

}
