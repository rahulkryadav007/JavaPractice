package Interview;

class SumThread extends Thread{
	int sum = 0;
	
	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			sum += i;
		}
		
		System.out.println("Sum  of 1 to 10 is:" + sum);
	}
}

class SquareThread extends Thread {
	int [] numbers;
	
	  SquareThread(int[] numbers) {
	        this.numbers = numbers;
	    }

	    @Override
	    public void run() {
	        System.out.println("Squares of the array numbers:");
	        for (int num : numbers) {
	            System.out.println(num + " squared is " + (num * num));
	        }
	    }
}
public class MultipleThread {
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        SumThread t1 = new SumThread();
	        SquareThread t2 = new SquareThread(numbers);

	        // Start first thread
	        t1.start();

	        try {
	            // Wait until t1 completes
	            t1.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Start second thread after t1 finishes
	        t2.start();
	    }
}
