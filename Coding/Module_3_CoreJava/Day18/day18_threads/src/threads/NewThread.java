package threads;

public class NewThread extends Thread {
	public NewThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" started");
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println(super.getName()+" exec counter # "+i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println("Exception in Thread "+getName()+" error "+e);
		}
		System.out.println(Thread.currentThread()+" over");
	}
}
