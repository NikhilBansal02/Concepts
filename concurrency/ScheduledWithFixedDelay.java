package concurrency;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledWithFixedDelay {

	public static void main(String[] args) throws InterruptedException {

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		Runnable task = () -> System.out.println("Scheduling :"+System.nanoTime());
		
		ScheduledFuture<?> future =  executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
		
		TimeUnit.MILLISECONDS.sleep(2500);
		
		long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
		System.out.printf("Remaining Delay: %sms", remainingDelay);
		executor.shutdown();
	}

}
