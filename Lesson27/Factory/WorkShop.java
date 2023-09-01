package Lesson27.Factory;

public class WorkShop {

    public Towbar produce (String modelOfTowbar, String model) {

        switch (modelOfTowbar) {
            case "AudiTowbar": return new AudiTowbar(model);
            case "BMWTowbar": return new BMWTobar(model);
            default: return null;
        }

    }

}
