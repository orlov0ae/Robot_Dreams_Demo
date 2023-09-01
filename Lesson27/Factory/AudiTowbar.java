package Lesson27.Factory;

public class AudiTowbar implements Towbar{

    private String model;

    public AudiTowbar(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
