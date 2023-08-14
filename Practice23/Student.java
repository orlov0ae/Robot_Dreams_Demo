package Practice23;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String surname;
    private List<Double> marks;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Double> getMarks() {
        return marks;
    }

    public void setMarks(List<Double> marks) {
        this.marks = marks;
    }



}

//Завдання 1: Вибір студентів за середнім балом
//        Завдання:
//        Необхідно вибрати зі списку студентів тих,
//        хто має середній бал вище певного порогу,
//        відсортувати їх за прізвищем і повернути перші 5 студентів у вигляді списку імен.