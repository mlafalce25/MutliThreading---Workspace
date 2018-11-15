
public class Sender implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " is running.");
	}
}
