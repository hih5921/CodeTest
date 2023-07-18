package Test;

import java.util.ArrayList;
import java.util.List;

public class Card {
	
	public void Solution() {
		//TestCase
		String cards1[] = {"i", "water", "drink"};
		String cards2[] = {"want", "to"};
		String goal[] = {"i", "want", "to", "drink", "water"};
		
		
		String answer ="Yes";
		
		List<String> c1 = new ArrayList<String>();
		List<String> c2 = new ArrayList<String>();

		char temp_c1='0';
		char temp_c2='0';
		
		for(String i : cards1) {
			c1.add(i);
		}
		for(String i : cards2) {
			c2.add(i);
		}
		
		List<String> cardValue = new ArrayList<String>();
		
		for(String i : goal) {
			cardValue.add(c1.contains(i)?"1"+c1.indexOf(i):"2"+c2.indexOf(i));
		}
		
		for(String i : cardValue) {
			if(i.charAt(0) == '1') {
				if(temp_c1 != i.charAt(1)) {
					answer ="No";
					break;
				}
				temp_c1++;
			}else {
				if(temp_c2 != i.charAt(1)) {
					answer ="No";
					break;
				}
				temp_c2++;
			}
		}
		System.out.println(answer);
		
	}
}
