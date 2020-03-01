//We can have multiple main method with different types of arguments
//if no main method is present with string args[], then 
//class will compile successfully but run time error will be thrown.
package concepts;

public class MultipleMain {

	public static void main(String[] args) {
		System.out.println("Welcome to main with String arguments");
		int a[] = {1,2,3};
		main(a);

	}
	public static void main(int[] args) {
		System.out.println("Welcome to main with int arguments");
		
	}

}
