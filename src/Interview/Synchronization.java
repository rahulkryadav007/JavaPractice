package Interview;

class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

public class Synchronization {
    public static void main(String[] args) {

        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++)
                c.increment();
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++)
                c.increment();
        });

        t1.start();
        t2.start();
    }
}
