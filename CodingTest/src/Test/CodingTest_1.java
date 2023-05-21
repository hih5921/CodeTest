package Test;

import java.util.Arrays;

public class CodingTest_1 {

	public void Solution(){
		String a = "asgaiQaBxA";
		String upper = "", lower = "";
		char temp = ' ';

//		char[] ch_arr = new char[a.length()];
//		for (int i = 0; i < a.length(); i++) {
//			ch_arr[i] = a.charAt(i);
//		}
//
//		Arrays.sort(ch_arr);
//
//		for (int i = 0; i < ch_arr.length; i++) {
//			if (ch_arr[i] >= 'a' && ch_arr[i] <= 'z') {
//				lower = ch_arr[i] + lower;
//			} else {
//				upper = ch_arr[i] + upper;
//			}
//
//		}

		for (int i = 0; i < a.length()-1; i++) {
			System.out.println(i + "회차");
			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) < a.charAt(j)) {
					temp = a.charAt(j);
					a = a.replaceFirst("" + a.charAt(j), "" + a.charAt(i));
					a = a.replaceFirst("" + a.charAt(i), "" + temp);
				}
			}
		}

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				lower = lower + a.charAt(i);
			} else {
				upper = upper + a.charAt(i);
			}
		}
		System.out.println(lower+upper);
	}

}
