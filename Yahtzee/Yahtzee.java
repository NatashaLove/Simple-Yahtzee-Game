package Yahtzee;
import Dice.*;
import java.util.*;

public class Yahtzee {
	Dice d1 = new Dice();
	Dice d2 = new Dice();
	
	
	// public int getDice1 () {
		// return d1;
	// }
	// public int getDice2 () {
		// return d2;
	// }
	
	public Yahtzee() {
		//using here vars - dice1 and dice2 - in order not to use the method .roll - in the println -it will create new random numbers again- because it is called 
		int dice1 = d1.roll();
		int dice2 = d2.roll();
		
		System.out.println("\nThe dice values are " + dice1 +" and " + dice2);
		if (dice1==6 && dice2==6){
			System.out.println("\nYAHTZEE!!!");
		}
	}
	
}