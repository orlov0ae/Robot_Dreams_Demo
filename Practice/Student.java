package Practice;

public class Student {
//    Створити клас "Студент"
//    Створіть клас "Студент", який має такі приватні поля: ім'я, номер студентського квитка, середній бал.
//    Створіть методи доступу до цих полів (getters і setters). Додайте валідацію в методах set: ім'я не може бути пустим,
//    номер студентського квитка має містити тільки цифри, середній бал повинен бути від 1 до 100.
//    private boolean isNumeric(String str) {
//        return str.matches("\\d+");
//    }
//}
    public Student(String name, String ticketNum, float averageScore) {
        this.name = name;
        this.ticketNum = ticketNum;
        this.averageScore = averageScore;
    }

    private String name;
    private String ticketNum;
    private float averageScore;

    public void setName (String name) {
        this.name = name;
        if (name.isEmpty()) {
            System.out.println("Ім'я не можу бути пустим");
        }
    }

    public String getName (String name) {
        return this.name;
    }

//    public void setTicketNum (String ticketNum) {
//        this.ticketNum = ticketNum;
//        isNumeric(int ticketNum);
//    }

    private boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

}
