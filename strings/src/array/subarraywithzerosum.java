package array;

public class subarraywithzerosum {
	public static void main(String[] args) {
		
		int[] array = {6,3,-1,-3,4,-2,2,4,6,-12,-7};
		subarraywithzerosum c = new subarraywithzerosum();
		c.subarray(array);
		
	}
	
	public void subarray(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			
			for(int j=i+1; j < arr.length; j++) {
				sum += arr[j];
				
				if (sum == 0) {
					System.out.printf("subarray:%d %d\n", i, j);
				}
			}
		}
	}
}
