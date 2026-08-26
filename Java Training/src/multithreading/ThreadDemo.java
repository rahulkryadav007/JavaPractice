package multithreading;
class MyTask extends Thread { public void run(){for(int i=1;i<=5;i++)System.out.println("Thread: "+i);} }
public class ThreadDemo { public static void main(String[] args) throws Exception {Thread t=new MyTask();t.start();t.join();System.out.println("Main thread finished");} }
