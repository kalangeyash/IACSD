package tester;

import threads.NewThread;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());//Thread[main,5,main]
		//create child threads & start the same
		NewThread t1=new NewThread("one");
		NewThread t2=new NewThread("two");
		NewThread t3=new NewThread("three");
		NewThread t4=new NewThread("four");
		//how many runnable threads ?1
		t1.start();
		t2.start();
		t3.start();
		t4.start();//how many runnable threads ?5
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" exec counter # "+i);
			Thread.sleep(200);
		}
		
		System.err.println("main over...");

	}

}
