package hash;

import java.util.HashMap;
import java.util.HashSet;

//Check if a given array contains 
//duplicate elements within k distance from each other
public class DuplicatesWithinKElements {

	public static void main(String[] args) {
		int k = 3;
		int[] arr = {1,	2, 3, 4, 1, 2, 3, 4};
		//int[] arr = {1, 2, 3, 6, 4, 4};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d,", arr[i]);
		}
		if (check(arr, k))
		{
			System.out.println("yes");
		} 
		else {
			System.out.println("no");
		}
	}
	
	
	public static boolean check(int[] arr, int k) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if (set.contains(arr[i])) {
				return true;
			}
			set.add(arr[i]);
			
			if (i >= k) {
				set.remove(arr[i-k]);
			}
			System.out.println(i);
			System.out.println(set);
		}
		
		return false;
	}
}


