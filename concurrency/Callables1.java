package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Callables1 {

	public static void main(String[] args) {
		
		Callable<Integer> task = () -> {
			
			try {
				TimeUnit.SECONDS.sleep(2);
				return 123;
				
			}catch(InterruptedException e) {
				throw new IllegalStateException("task interrupted", e);
			}
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> future  = executor.submit(task);
		
		System.out.println("Future is Done: " +future.isDone());
		try {
			//System.out.println("Value is : "+future.get(1, TimeUnit.SECONDS));
			System.out.println("Value is : "+future.get());
			System.out.println("Future is Done: " +future.isDone());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Inside TimeUnit Exception");
			e.printStackTrace();
		}finally {
			System.out.println("Inside Finally!!!");
			executor.shutdown();
		}
	}

}
