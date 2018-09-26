package Yahtzee;
import Dice.*;

public class Yahtzee {
	Dice d1;
	Dice d2;
	
	
	// public int getDice1 () {
		// return d1;
	// }
	// public int getDice2 () {
		// return d2;
	// }
	
	public Yahtzee() {
	d1.roll();
	d2.roll();
	
	System.out.println("\nThe dice values are " + d1.roll() +" and " + d2.roll());
	if (d1.roll()==6 && d2.roll()==6){
		System.out.println("\nYAHTZEE!!!");
	}
	}
	
}