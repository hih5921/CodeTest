package Main;

import Test.CodingTest_1;
import Test.DartGame;
import Test.FailureRate;
import Test.Phonketmon;
import Test.SearchPrimeNum;

public class MainClass {
	public static void main(String[] args) {
		Phonketmon phonketmon = new Phonketmon();
		SearchPrimeNum Spn = new SearchPrimeNum();
		FailureRate failRate = new FailureRate();
		DartGame dartGame = new DartGame();
		Test.Card card = new Test.Card();
		card.Solution();
	}
}
