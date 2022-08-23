import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunDemo {
	public static void main(String[] args) {
		thread_pool t = new thread_pool("Vishal");
		Thread th = new Thread(t);
		th.start();

		// pool
		ExecutorService es = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable rn = new thread_pool("Vishal"+i);
			es.execute(rn);
		}
		es.shutdown();
		while (!es.isTerminated()) {
		}
		System.out.println("All done");
	}
}