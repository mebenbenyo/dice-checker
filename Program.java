import java.util.Scanner;

/*
 * Name: Sewuese Ayu
 * Description: A program to check the fairness of an 8-sided dice when rolled 
 * in a game. It ensures that no player has an unfair advantage or disadvantage.
 */


/**
 * The Program class launches the fairness checking program for an 8-sided dice game.
 * It provides a menu system for the user to interact with the DiceChecker class.
 * This class contains the main method.
 * @author sewue
 *
 */
public class Program {

	/**
	 *  The entry point for the program. 
	 * Creates a menu system and delegates actions to the DiceChecker class  
	 *  based on user input.
	 * @param args The command-line arguments passed to the program. 
	 */
	public static void main(String[] args) {
		DiceChecker diceChecker = new DiceChecker();
		String textInput;
		int numberInput;
		final int ENTER_VALUES = 1;
		final int DISPLAY_REPORT = 2;
		final int RESET_VALUES = 3;
		final int EXIT_PROGRAM = 4;
		
	//initializes option to a values of 0
		int option = 0;		
		
		
do {
	//Displays menu options 
	System.out.println("1 Enter Dice Roll Values");
	System.out.println("2 Display Report"); 
	System.out.println("3 Reset Dice Roll Data");
	System.out.println("4 Exit Program");
	
	//prompts the user to select one of the options
	System.out.println("Select option: ");
	
	//gets user option and uses switch to delegate actions to diceChecker as needed
	switch (option = User.inputInteger())
	{
	case 1: 
		option = ENTER_VALUES;
		diceChecker.enterData();
		break;
	case 2: 
		option = DISPLAY_REPORT;
		diceChecker.printReport();
		break;
	case 3: 
		option = RESET_VALUES;
		diceChecker.resetData();
		break;
	case 4: 
		option = EXIT_PROGRAM ;
		break;
	default: 
		option = 0;
		break;
			
	}  
	/*loop continues the program if the options are not 4. 
	 * Program exits if input is 4.
	 */
}while(option != 4); 
	System.out.println("Program by Sewuese Ayu");
	System.out.println("Program exits");
	}
	
}
