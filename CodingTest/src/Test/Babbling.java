package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Babbling {
	public void Solution() {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		String[] baby = {"aya", "ye", "woo", "ma"};
		int answer = 0;
		
		
		for(int i=0; i<babbling.length; i++) {
			if(babbling[i].contains("ayaaya")|| babbling[i].contains("yeye") 
					|| babbling[i].contains("woowoo") || babbling[i].contains("mama"))
				continue;
			else {
//				이유는 못찾음 처음부터 빈값으로 replace시 통과 못함, 근데 아무 값이나 넣고 replace하면 통과함(????)
//				babbling[i] = babbling[i].replaceAll("aya", "");
//				babbling[i] = babbling[i].replaceAll("ye", "");
//				babbling[i] = babbling[i].replaceAll("woo", "");
//				babbling[i] = babbling[i].replaceAll("ma", "");
				
				babbling[i] = babbling[i].replaceAll("aya", "b");
				babbling[i] = babbling[i].replaceAll("ye", "b");
				babbling[i] = babbling[i].replaceAll("woo", "b");
				babbling[i] = babbling[i].replaceAll("ma", "b");
				babbling[i] = babbling[i].replaceAll("b", "");
			}
			if(babbling[i].equals(""))answer++;
			System.out.println(babbling[i]);
		}
		System.out.println(answer);
	}
	
}
