package java_basics;

public class thread implements Runnable {
	//extends Thread
	private int thnumber;

	public thread(int thnumber) {
		this.thnumber= thnumber;
	}
	int i = 0;

	@Override
	public void run() {
		for (; i < 5; i++) {
			System.out.println(i +" "+thnumber);
			if(thnumber==1) {
				throw new RuntimeException();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		thread t = new thread(0);
		thread t2 = new thread(1);
		Thread tt = new Thread(t);
		tt.start();
		try {
			tt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * t.start(); t2.start();
		 *///start for concurrent run will run one at a time 
	}
}
