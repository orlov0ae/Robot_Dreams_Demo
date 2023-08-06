package Lesson21;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private String surname;
    private float averageMark;

    public Student(String surname, float averageMark) {
        this.surname = surname;
        this.averageMark = averageMark;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(float averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.averageMark, averageMark) == 0 && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, averageMark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public int compareToSurname(Student otherStudent) {
        int surnameCompare = this.surname.compareTo(otherStudent.getSurname());
        return surnameCompare;
    }

    @Override
    public int compareToAverageMark(Student otherStudent) {
        if(this.averageMark > otherStudent.getAverageMark()) {
            return 1;
        } else {
            return 0;
        }
    }
}
