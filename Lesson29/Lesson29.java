package Lesson29;

public class Lesson29 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for(int i=1; i<=10; i++){
                System.out.println("Thread #1. First thread iteration #" + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int j=1; j<=10; j++){
                System.out.println("Thread #2. Second thread iteration #" + j);
            }
        });

//        thread1.start();
//        thread2.start();

        runThreads(thread1, thread2);

    }

    private static void runThreads(Thread ... threads) {
        for(Thread thread : threads) {
            thread.start();
        }
    }

}
