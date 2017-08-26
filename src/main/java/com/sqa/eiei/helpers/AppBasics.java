/**
 * File Name: AppBasics.java<br>
 * KHIN, EI EI<br>
 * Created: Aug 19, 2017
 */
package com.sqa.eiei.helpers;

/**
 * AppBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author KHIN, EI EI
 * @version 1.0.0
 * @since 1.0
 */
import java.util.*;

import com.sqa.eiei.helpers.exceptions.*;;

public class AppBasics {

	private static Scanner scanner = new Scanner(System.in);

	public static void farewellUser(String userName) {
		System.out.println("Thank you " + userName + " for using our application.");
		System.out.println("Have a nice day");
	}

	public static String greetUserAndGetName(String appName) {
		// Greet the user using a system out call
		System.out.println("Welcome to the " + appName + " Application.");
		// Ask the user for their name and store in a local scope String
		// variable
		System.out.print("Can I get your name?");
		return scanner.nextLine();
	}

	public static void greetUserAndIntroTest(String appName, String testName) {
		// Greet the user using a system out call
		System.out.println("Welcome to the " + appName + " Application.");
		// Ask the user for their name and store in a local scope String
		// variable
		System.out.println("\\-------------------------------------------------------------------\\");
		System.out.println("You are running the following tests for " + testName);
		System.out.println("\\-------------------------------------------------------------------\\\n");
	}

	public static Boolean requestBoolean(String question) {
		String input;
		Boolean isValid = false;
		Boolean response = true;
		while (!isValid)
			System.out.print(question + " (Yes/No)");
		input = scanner.nextLine();
		if (input.trim().equalsIgnoreCase("yes")) {
			isValid = true;
			response = true;
		} else if (input.trim().equalsIgnoreCase("no")) {
			isValid = true;
			response = false;
		} else {
			System.out.println("You did not respond to the queston in the correct form");
		}
		return response;
	}

	public static byte requestByte(String question) {
		byte num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Byte.parseByte(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			}
		}
		return num;
	}

	public static char requestChar(String question) {
		System.out.println(question + "");
		return scanner.nextLine().charAt(0);
	}

	public static double requestDouble(String question) {
		double num = 0.0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + "");
			input = scanner.nextLine();
			try {
				num = Double.parseDouble(input);
				isValid = true;// num =
								// Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "].please provide only digits.");
			}
		}
		return num;
	}

	public static float requestFloat(String question) {
		float num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + "");
			input = scanner.nextLine();
			try {
				num = Float.parseFloat(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "].please provide only digits.");
			}
		}
		return num;
	}

	public static int requestInt(String question) {
		int num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "]. please provide only digits.");
			}
		}
		return num;
	}

	public static int requestInt(String question, int min, int max, String errorMessage) {
		int num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Integer.parseInt(input);
				if (num > max) {
					throw new RequestIntOverMaxException();
				} else if (num < min) {
					throw new RequestIntUnderMinException();
				}
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "].please provide only digits.");
			} catch (RequestIntOverMaxException e) {
				System.out.println("You have exceeded the max value of \" + max + \" [\" + input\r\n"
						+ " + \"]. Please provide a number within range.");
			} catch (RequestIntUnderMinException | RequestIntOverMaxException e) {
				System.out.println(errorMessage);
			}
		}
		return num;
	}

	public static long requestLong(String question) {
		long num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Long.parseLong(input);
				isValid = true;
			} catch (NumberFormatException e) {
				System.out.println("You dsid not supply a valid number [" + input + "].please provide only digits.");
			}
		}
		return num;
	}

	public static short requestShort(String question) {
		short num = 0;
		String input;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(question + " ");
			input = scanner.nextLine();
			try {
				num = Short.parseShort(input);
			} catch (NumberFormatException e) {
				System.out.println("You did not supply a valid number [" + input + "].please provide only digits.");
			}
		}
		return num;
	}

	public static String requestString(String question) {
		System.out.print(question + "");
		return scanner.nextLine();
	}
}