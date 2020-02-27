package sorting;

public class MergeSort {

		public static void mergeSort(int a[]) {
			
			int n = a.length;
			
			if(n<2)  //break condition for recursion
				return;
			
			int mid = n/2;
			int left[] = new int[mid];
			int right[] = new int[n-mid];
			
			for(int i = 0;i<=mid-1;i++) 
				left[i] = a[i];
			
			for(int i = mid;i<=n-1;i++) 
				right[i-mid] = a[i];
			
			mergeSort(left);
			mergeSort(right);
			Merge(left,right,a);
			
		}
		public static void Merge(int left[], int right[], int a[]) {
			
			int l = left.length;
			int r = right.length;
			
			int i = 0,j =0, k = 0; // 'i' is pointer to left sub-list, 'j' is pointer to right sub-list, 'k' keeps tracks on main array
			
			while(i<l && j<r) {
				if(left[i]<=right[j]) {
					a[k] = left[i];
					i++;
				}
				else {
					a[k] = right[j];
					j++;
				}
				k++;
			}
			
			while(i<l) {//check if there are any left over elements in left sub-list and if yes, then add them in main array
				a[k] = left[i];
				i++;
				k++;
			}
			while(j<r) {//check if there are any left over elements in right sub-list and if yes, then add them in main array
				a[k] = right[j];
				j++;
				k++;
			}
			
			
		}
}

//Worst case complexity is O(nlogn)
