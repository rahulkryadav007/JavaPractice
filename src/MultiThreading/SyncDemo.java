package MultiThreading;

class Counter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

class MyThread1 extends Thread {
    Counter counter;

    MyThread1(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for(int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class SyncDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new MyThread1(counter);
        Thread t2 = new MyThread1 (counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.count);
    }
}