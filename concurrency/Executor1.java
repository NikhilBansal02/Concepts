package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor1 {

	public static void main(String[] args) {
		
		ExecutorService executor  = Executors.newSingleThreadExecutor();
		
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Thread is :"+threadName);
		});
		try {
		    System.out.println("attempt to shutdown executor");
		    executor.shutdown();
		    executor.awaitTermination(1, TimeUnit.MICROSECONDS);
		}
		catch (InterruptedException e) {
		    System.err.println("tasks interrupted");
		}
		finally {
		    if (!executor.isTerminated()) {
		        System.err.println("cancel non-finished tasks");
		    }
		    executor.shutdownNow();
		    System.out.println("shutdown finished");
		}
	}
}
