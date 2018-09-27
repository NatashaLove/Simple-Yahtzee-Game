package Dice;
import java.util.*;

public class Dice {
	
	public Dice () {
		roll ();
		
	}// deafault constructor
	
	public int roll (){
		Random random = new Random();
		int aNumber = random.nextInt(6)+1;
		return aNumber;
	}

}