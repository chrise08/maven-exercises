import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManipulation {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter something: ");
		String userInput = scanner.nextLine();
		if (StringUtils.isNumeric(userInput)) {
			System.out.println("What you entered is a number.");
		} else {
			System.out.println("What you entered is not a number.");
		}
	}
}
