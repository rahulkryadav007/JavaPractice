package MultiThreading;

class Data {
    int number;
    boolean ready = false;

    public synchronized void produce(int num) throws InterruptedException {
        while (ready) wait(); // Wait if data is not consumed
        number = num;
        ready = true;
        notify(); // Notify consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (!ready) wait(); // Wait if data is not produced
        ready = false;
        notify(); // Notify producer
        return number;
    }
}

class Producer extends Thread {
    Data data;
    Producer(Data data) { this.data = data; }
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try { data.produce(i); } catch (InterruptedException e) {}
            System.out.println("Produced: " + i);
        }
    }
}

class Consumer extends Thread {
    Data data;
    Consumer(Data data) { this.data = data; }
    public void run() {
        for(int i = 1; i <= 5; i++) {
            try { System.out.println("Consumed: " + data.consume()); } catch (InterruptedException e) {}
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Data data = new Data();
        new Producer(data).start();
        new Consumer(data).start();
    }
}