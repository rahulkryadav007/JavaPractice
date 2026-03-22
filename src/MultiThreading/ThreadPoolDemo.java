package MultiThreading;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for(int i=1; i<=5; i++) {
            int task = i;
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + " executes task " + task);
            });
        }
        executor.shutdown();
    }
} 
