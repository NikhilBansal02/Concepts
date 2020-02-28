package sorting;

public class InsertionSort {
	
	public static void insertionSort(int a[]) {
		
		System.out.println("********Selection Sort*************");
		
		int n = a.length;
		int value = 0;
		int hole = 0;
		
		for(int i = 1; i<n;i++) {
			
			value = a[i];
			hole  = i;
			
			while(hole > 0 && a[hole-1] > value) {
				a[hole] = a[hole-1];
				hole--;
			}
			a[hole] = value;
			
		}
	}
}

//Worst and Average Case Complexity :- O(n^2)
//Best Case :- O(n) when array is sorted.