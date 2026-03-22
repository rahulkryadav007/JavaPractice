package MultiThreading;

class ThreadExample extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(getName() + " prints " + i);
            try {
                Thread.sleep(250); // Pause 0.5 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadSleepJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample t1 = new ThreadExample();
        ThreadExample t2 = new ThreadExample();

        t1.start();
        t1.join(); // Wait t1 to finish before t2
        t2.start();
    }
}