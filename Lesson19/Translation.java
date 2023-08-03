package Lesson19;

public class Translation {

    private String english;
    private String Deutsch;
    private String polish;

    public Translation(String english, String deutsch, String polish) {
        this.english = english;
        Deutsch = deutsch;
        this.polish = polish;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getDeutsch() {
        return Deutsch;
    }

    public void setDeutsch(String deutsch) {
        Deutsch = deutsch;
    }

    public String getPolish() {
        return polish;
    }

    public void setPolish(String polish) {
        this.polish = polish;
    }

    @Override
    public String toString() {
        return "Translation{" +
                "english='" + english + '\'' +
                ", Deutsch='" + Deutsch + '\'' +
                ", polish='" + polish + '\'' +
                '}';
    }
}
