package sorting;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		System.out.println("*****Selection Sort**********");
		int length = arr.length;
		int min_index = 0;
		int temp = 0;
		boolean index_changed =false;
		
		for(int i=0; i<length-1;i++) {
			min_index = i;
			index_changed =false;
			
			for(int j =i+1;j<length;j++)
				if(arr[j] <arr[min_index]) {
					min_index = j;
					index_changed = true;
				}
					
			if(index_changed) {
				temp = arr[min_index];
				arr[min_index] = arr[i];
				arr[i] = temp;
			}
		}//end of for loop
	}//end of method

}
