package Practice_14;

import java.util.Objects;

public class Student {

    String name;
    int gradePointAverage;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return gradePointAverage == student.gradePointAverage && Objects.equals(name, student.name);
    }


}
