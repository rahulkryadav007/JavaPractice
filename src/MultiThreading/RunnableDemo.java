package MultiThreading;

class MyRunnable implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running");
	}
}

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 =  new Thread(new MyRunnable());
		Thread t2 =  new Thread(new MyRunnable());
		
		t1.start();
		t2.start();

	}

}
