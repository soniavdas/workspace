package hash;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDistinctElement {

	Map<Integer, Integer> ht = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		
		int[] array = {1,2,1,3,4,2,3};
		int k = 4;
		
		CountDistinctElement c = new CountDistinctElement();
		c.Count(array, k);
		
	}
	
	public void Count(int[] array, int k) {
		for(int i = 0; i < k; i++) {
			if (!ht.containsKey(array[i])) {
				ht.put(array[i], 1);
			} else {
				Integer count = ht.get(array[i]);
				ht.put(array[i], ++count);
			}
		}
		
		System.out.println(ht.keySet().size());
		
		for(int i = k; i < array.length; i++) {
			
			Integer count = ht.get(array[i - k]);
			
			if (count == 1) {
				ht.remove(array[i - k]);
			} else {
				ht.put(array[i - k], --count);
			}

			if (ht.containsKey(array[i])) {
				count = ht.get(array[i]);
				ht.put(array[i], ++count);
			} else {
				ht.put(array[i], 1);
			}
			System.out.println(ht.keySet().size());

		}
	}
	
}
