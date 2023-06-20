package Main;

import Test.CodingTest_1;
import Test.FailureRate;
import Test.Phonketmon;
import Test.SearchPrimeNum;

public class MainClass {
	public static void main(String[] args) {
		Phonketmon phonketmon = new Phonketmon();
		SearchPrimeNum Spn = new SearchPrimeNum();
		FailureRate failRate = new FailureRate();
		failRate.Solution();
	}
}
