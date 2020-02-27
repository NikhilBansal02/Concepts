package sorting;

public class DriverClass {

	public static void main(String[] args) {
		int arr[] = {0,50,40,-2,30,20,10,2,-1,-5};
		
		//SelectionSort.selectionSort(arr);
		//BubbleSort.bubbleSort(arr);
		
		PrintClass.printArray(arr);
		MergeSort.mergeSort(arr);
		PrintClass.printArray(arr);
	}

}
