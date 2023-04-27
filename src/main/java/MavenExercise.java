import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter anything: ");
		String userInput = scanner.nextLine();

		if (userInput.equals("")){
			System.out.println("You entered nothing.");
		} else {
			System.out.println("You entered "+ userInput +".");
		}
		if (StringUtils.isNumeric(userInput)){
			System.out.println("Your input is a number.");
		} else {
			System.out.println("Your input is not a number.");
		}
		System.out.println("Flipped case: "+StringUtils.swapCase(userInput));
		System.out.println("Reversed: "+StringUtils.reverse(userInput));
	}
}
