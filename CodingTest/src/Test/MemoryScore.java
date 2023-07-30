package Test;

import java.util.HashMap;
import java.util.Map;

public class MemoryScore {
	
	
	public void Solution() {
		
		String name[] = {"may", "kein", "kain", "radi"};
		int yearning[] = {5, 10, 1, 3};
		String photo[][] = 
			{{"may", "kein", "kain", "radi"}
			 ,{"may", "kein", "brin", "deny"}
			 ,{"kon", "kain", "may", "coni"}
			};
		int answer[] = new int[photo.length];
		
		
		Map<String, Integer> ms = new HashMap<String, Integer>();
		int idx = 0;
		for(int i=0; i<name.length;i++) {
			ms.put( name[i], yearning[i]);
		}
		
		for(String[] arr : photo) {
			for(String str : arr) {
				if(ms.containsKey(str)) {
					answer[idx] += ms.get(str);
				}
			}
			idx++;
		}
		
		for(int i : answer) {
			System.out.println(i);
		}
	}
	
	
	
	
}
