package array;

public class isArraySubset {

	public static void main(String[] args) {
		
		int[] arr = { 8, 1, 4, 9, 0, 3,5, 2, 7, 6};
		
		int[] sub = { 3, 7, 0};
		
		qsort(arr, 0, arr.length - 1);
		printArray(arr);
		
		System.out.println("issibset:" + isSubset(arr, sub));
	
	}
	
	public static boolean isSubset(int[] arr, int[] sub) {
	
		for(int i = 0; i < sub.length; i++) {
			
			if (binary_search(arr, sub[i], 0, arr.length - 1) == -1) {
				return false;
			}
		}
		return true;
	}
	
	public static int binary_search(int[] a, int k, int left, int right) {
		
		if (left > right) return -1;
		
		int mid = (left+ right)/2;
		
		if (k == a[mid]) {
			return mid;
		} else if (k < a[mid]) {
			return binary_search(a, k, left, mid - 1);
		} else {
			return binary_search(a, k, mid + 1, right);
		}
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void qsort(int[] a, int left, int right) 
	{
		
		int i, j, tmp;
		
		if (left > right) return;
		
		
		int mid = (right + left)/2;
		System.out.println("mid:" + mid);
		int pivot = a[mid];
		
		i = left; j = right;
		
		while(i <= j) {
			while(a[i] < pivot) i++;
			while(a[j] > pivot) j--;
		
			if (i <= j) {
				tmp = a[j];
				a[j] = a[i];
				a[i] = tmp;
				i++; j--;
			}
		
		}
	
		
		System.out.printf("l : %d, %d\n", left, j);
		System.out.printf("r  : %d, %d\n", i, right);
		
		qsort(a, left, j);
		qsort(a, i, right);
	}
	
	public static void swap(int a, int b) {
		
		
	}
}


