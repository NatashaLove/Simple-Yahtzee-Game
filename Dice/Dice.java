import java.util.*;
package Dice;

public class Dice {
	
	public Dice () {
		roll ();
		
	}// deafault constructor
	
	public int roll (){
		Random random = new Random();
		int aNumber = random.nextInt(6)-1;
		return aNumber;
	}

}