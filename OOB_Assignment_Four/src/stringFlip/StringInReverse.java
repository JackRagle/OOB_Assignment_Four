package stringFlip;

import java.util.Scanner;

public class StringInReverse {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String input = "";
		
		while(input.toUpperCase() != "EXIT") {
			System.out.println("Welcome to the string inverter!\n\nPlease type in the string that you would like to have reversed or type in exit to end the program.\n");
			input = in.nextLine();
			if(input.toUpperCase().equals("EXIT")) {
				System.out.println("You have ended the program.");
				break;
			}
			char[] sdrow = new char[input.length()];
			for(int i = input.length() - 1; i >= 0; i--) {
				sdrow[i] = input.charAt(i);
			}
			System.out.print("\nThis is the string that you entered but backwards: ");
			for(int i = sdrow.length - 1; i >= 0; i--) {
				System.out.print(sdrow[i]);
			}
			System.out.print("\n\n");
		}
		in.close();
	}

}
