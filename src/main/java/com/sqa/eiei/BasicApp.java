package com.sqa.eiei;

public class BasicApp {

	public static void main(String[] args) {
		String username = AppBasics.greetUserAndGetName("Default App Exmple");
		checkAgainst10();
		checkCurMonth();
		checkGradeValue();
		AppBasics.farewellUser(username);
	}

	private static void checkAgainst10() {
		// TODO Auto-generated method stub
	}

	private static void checkCurMonth() {
		System.out.println("Application does a generic activity.");
		// char letter = AppBasics.requestChar("What is today's Letter?");
		// System.out.println("Response: " + letter);
		boolean isHappy = AppBasics.requestBoolean("Are you in a happy mood right now?");
		System.out.println("Response: " + isHappy);
		int curSeason = AppBasics.requestInt("What numeric season is it?");
		switch (curSeason) {
		case 1:
			System.out.println("It is Winter.");
			break;
		case 2:
			System.out.println("It is Spring.");
			break;
		case 3:
			System.out.println("It is Summer.");
			break;
		case 4:
			System.out.println("It is Fall.");
			break;
		default:
			System.out.println("Invalid Season.");
			break;
		}
	}

	private static void checkGradeValue() {
		// TODO Auto-generated method stub
	}
}
