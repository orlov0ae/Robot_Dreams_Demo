package Lesson27.Factory;

public class BMWTobar implements Towbar{

    private String model;

    public BMWTobar(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}
