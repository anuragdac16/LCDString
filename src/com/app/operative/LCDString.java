package com.app.operative;

public class LCDString {

	public String printFirstLine(String number) {
		String firstLine = "";
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == '1' || number.charAt(i) == '4')
				firstLine = firstLine + "... ";
			else
				firstLine = firstLine + "._. ";
		}
		return firstLine;
	}

	public String printSecondLine(String number) {

		String secondRow = "";

		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == '1' || number.charAt(i) == '2' || number.charAt(i) == '3'
					|| number.charAt(i) == '7')
				secondRow = secondRow.concat(".");
			else
				secondRow = secondRow.concat("|");

			if (number.charAt(i) == '0' || number.charAt(i) == '1' || number.charAt(i) == '7')
				secondRow = secondRow.concat(".");
			else
				secondRow = secondRow.concat("_");

			if (number.charAt(i) == '5' || number.charAt(i) == '6')
				secondRow = secondRow.concat(".");
			else
				secondRow = secondRow.concat("|");

			secondRow = secondRow.concat(" ");
		}
		return secondRow;
	}

	public String printThirdLine(String number) {
		String thirdRow ="";
		for (int i = 0; i < number.length(); i++) {

			if (number.charAt(i) == '0' || number.charAt(i) == '2' || number.charAt(i) == '6'
					|| number.charAt(i) == '8')
			thirdRow= thirdRow.concat("|");
			else
				thirdRow= thirdRow.concat(".");

			if (number.charAt(i) == '1' || number.charAt(i) == '4' || number.charAt(i) == '7'
					|| number.charAt(i) == '9')
				thirdRow= thirdRow.concat(".");
			else
				thirdRow= thirdRow.concat("_");

			if (number.charAt(i) == '2')
				thirdRow= thirdRow.concat(".");
			else
				thirdRow= thirdRow.concat("|");

			thirdRow = thirdRow.concat(" ");
			
		}
		return thirdRow;
	}

}
