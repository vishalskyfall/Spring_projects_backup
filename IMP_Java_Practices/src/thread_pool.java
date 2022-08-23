public class thread_pool implements Runnable {
	private String name;

	public thread_pool(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		/*
		 * for(int i=0;i<10;i++) {
		 * System.out.println("Thread : "+Thread.currentThread().getName()+" Value: "+i)
		 * ; }
		 */
		System.out.println("Start "+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End "+name);
	}
}

