package thread;

class Runner1 extends Thread{
	@Override
	public void run() {
		System.out.println("Runner1:"+ Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Runner t1 :"+i);
		}
	}
}

class Runner2 extends Thread{
	
	@Override
	public void run() {
		System.out.println("Runner2:"+ Thread.currentThread().getName());
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Runner t2 :"+i);
		}
		
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		
		Runner1 R1 = new Runner1();
		Runner2 R2 = new Runner2();
		
		R1.start();
		R2.start();
		
		try {
			R1.join();
			R2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main class finishes");

	}

}
