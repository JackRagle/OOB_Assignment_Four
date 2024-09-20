package stringFlip;

import java.util.Scanner;

public class StringInReverse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//Creates input stream
		
		String input = "";
		//Creates String variable to store the users input
		
		while(input.toUpperCase() != "EXIT") {
			System.out.println("Welcome to the string inverter!\n\nPlease type in the string that you would like to have reversed or type in exit to end the program.\n");
			input = in.nextLine();
			//Reads the entire line of the users input
			
			if(input.toUpperCase().equals("EXIT")) {
				System.out.println("You have ended the program.");
				break;
			}
			//Checks if the user has inputed "exit"
			
			char[] sdrow = new char[input.length()];
			//Creates an array of characters to store the input string
			
			for(int i = input.length() - 1; i >= 0; i--) {
				sdrow[i] = input.charAt(i);
			}
			//Stores the string input into the array
			
			System.out.print("\nThis is the string that you entered but backwards: ");
			for(int i = sdrow.length - 1; i >= 0; i--) {
				System.out.print(sdrow[i]);
			}
			//Prints the array from the tail to the head
			
			System.out.print("\n\n");
		}
		in.close();
		//Closes the input stream
	}

}
