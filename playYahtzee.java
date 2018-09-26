import java.util.*;
import Dice.*;
import Yahtzee.*;

public class  playYahtzee {
	
	public static void main (String [] args) {
	
		char next='a';
		
		//print menu
		System.out.println("\nLet's play YAHTZEE!");
		
		while(next != 'x') {
				//all menu is in a separate method - described below
				next = printMenu();
				
			if(next == 'r') {
			Yahtzee game = new Yahtzee();
			}
		}
	//roll
	
	// quit
	}
	
	static char printMenu (){
	
	char next='a';
	Scanner inputDevice=new Scanner(System.in);
		
	System.out.println();
	System.out.println("\nDo you want to roll? (r)");
	System.out.println("\nDo you want to exit the game? (x)");
	System.out.println("\nWhat do you want to do: ");
			
	next = inputDevice.next().charAt(0);
	inputDevice.nextLine(); // need it right after input taking a char or int - or will occupy the next input
		
	return next;
	} 	
}