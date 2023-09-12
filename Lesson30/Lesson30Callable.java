package Lesson30;

import java.util.Random;
import java.util.concurrent.Callable;

public class Lesson30Callable implements Callable {

    @Override
    public Object call() throws Exception {
        Random random = new Random();
        int number = random.nextInt(50);
        return number;
    }
}
