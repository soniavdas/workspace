package hash;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class NumberEmployeeUnderManager {

	Map<String, List<String>> reverseMap;
	Map<String, Integer> result = new HashMap<String, Integer>();
	public static void main(String[] args) {
		
		Map<String, String> dataset = new HashMap<String, String>();
		dataset.put("A", "C");
		dataset.put("B", "C");
		dataset.put("C", "F");
		dataset.put("D", "E");
		dataset.put("E", "F");
		dataset.put("F", "F");
		
		NumberEmployeeUnderManager n =  new NumberEmployeeUnderManager();
		n.getResult(dataset);
		
		
	}
	
	public void getResult(Map<String, String> ds) {
		
		 reverseMap = new HashMap<String, List<String>>();
		
		for(String e : ds.keySet()) {
			String m = ds.get(e);
			if (reverseMap.containsKey(m)) {
				List<String> elist = reverseMap.get(m);
				elist.add(e);
			} else {
				List<String> elist = new ArrayList<String>();
				elist.add(e);
				reverseMap.put(m, elist);
			}
		}
		
		for(String m : reverseMap.keySet()) {
			System.out.print("Manager : " + m);
			//System.out.println(reverseMap.get(m));
			System.out.print(printCount(m));
			//System.out.println("");
			//printCount(m);
		}
		System.out.print(result);
	}
	
	int printCount(String m) {
		
		//System.out.println(m);
		if (!reverseMap.containsKey(m)) {
			result.put(m, 0);
			return 0;
		}
		if (result.containsKey(m)) {
			return result.get(m);
		}
		
		List<String> list = reverseMap.get(m);
		int count = list.size();
		for(String s : list) {
			if (s != m) {
				count += printCount(s);
			}
		}
		result.put(m, count);
		return count;
	}	
	
}
