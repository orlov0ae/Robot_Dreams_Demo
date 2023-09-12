package Lesson30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Lesson30 {

    public static void main(String[] args) {

        System.out.println("________________________");
        System.out.println("Thread with random numbers");
        Thread thread1 = new Thread(() -> {
            int randomNumber = 0;
            while (true) {
                randomNumber = random();
                if(randomNumber == 5) {
                    break;
                } else {
                    System.out.println("Random number: " + randomNumber);
                }
            }
            System.out.println("Random number is 5. Thread is stopped");
        });

        thread1.start();

        System.out.println("________________________");
        System.out.println("ThreadPool with callable");

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Callable<Integer>> callables= new ArrayList<>();


        for (int i = 1; i<=10; i++) {
            callables.add(new Lesson30Callable());
        }

        try {
            List<Future<Integer>> futures = executorService.invokeAll(callables);

            for (int i = 0; i < 10; i++) {
                Future<Integer> future = futures.get(i);
                System.out.println("Callable " + Thread.currentThread().getName() + " random number: " + future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }

    }

    private static int random () {
        Random random = new Random();
        int randomInt = random.nextInt(10);
        return randomInt;
    }

}
