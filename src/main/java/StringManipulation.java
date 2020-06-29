import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter something: ");
		String userInput = scanner.nextLine();
		
		// determines if input is number or not
//		if (StringUtils.isNumeric(userInput)) {
//			System.out.println("What you entered is a number.");
//		} else {
//			System.out.println("What you entered is not a number.");
//		}
		
		// flips case of the string
//		System.out.println(StringUtils.swapCase(userInput));
		
		// flips the string
		System.out.println(StringUtils.reverse(userInput));
	}
}
