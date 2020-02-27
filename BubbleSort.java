package sorting;

public class BubbleSort {
	
	public static void bubbleSort(int a[]) {
		System.out.println("*****Bubble Sort**********");
		
		int n = a.length;
		int temp;
		boolean flag;
		
		for(int i=0;i<n-1;i++) {
			
			flag = true;
			
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
				   a[j+1]= temp;
				   flag = false;
				}
			}//end of inner for loop
			if(flag)//flag check if there was any swaps happen or not.if no swaps took place then array is already sorted and we can
				break;//skip executing further passes.
				
		}//end of outer loop
		
	}//end of method

}
//Best case complexity:- O(n) , when array is already sorted an only one pass happened.
//Average and worst case complexity :- O(n^2)
