
class counter {
	int c;

	public void increment() {
		c++;
	}

	public synchronized void incrementSync() {
		c++;
	}
}

public class ThreadSafe {
	public static void main(String[] args) throws Exception {
		counter c = new counter();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					// c.increment();
					c.incrementSync();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					// c.increment();
					c.incrementSync();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(c.c); // this initial program is not thread safe just run and see it will not run for
		// inconsistnt values just remove comment from increament // 2000 times

		// we can also use atomic integer
		// string buffer is thread safe where string builder is not
		// concurrent hashmap is threadsafe
	}
}
