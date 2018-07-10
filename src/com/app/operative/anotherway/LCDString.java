package com.app.operative.anotherway;

public class LCDString {

	public String printFirstLine(String number) {
		String firstLine = "";
		for (int i = 0; i < number.length(); i++) {

			switch (number.charAt(i)) {
			case '1':
				firstLine = firstLine + "... ";
				break;
			case '4':
				firstLine = firstLine + "... ";
				break;

			default:
				firstLine = firstLine + "._. ";
				break;
			}
		}
		return firstLine;
	}

	public String printSecondLine(String number) {

		String secondRow = "";

		for (int i = 0; i < number.length(); i++) {
			switch (number.charAt(i)) {
			case '1':
				secondRow = secondRow.concat("..| ");
				break;
			case '2':
				secondRow = secondRow.concat("._| ");
				break;
			case '3':
				secondRow = secondRow.concat("._| ");
				break;
			case '4':
				secondRow = secondRow.concat("|_| ");
				break;
			case '5':
				secondRow = secondRow.concat("|_. ");
				break;
			case '6':
				secondRow = secondRow.concat("|_. ");
				break;
			case '7':
				secondRow = secondRow.concat("..| ");
				break;
			case '8':
				secondRow = secondRow.concat("|_| ");
				break;
			case '9':
				secondRow = secondRow.concat("|_| ");
				break;
			case '0':
				secondRow = secondRow.concat("|.| ");
				break;
			default:
				break;
			}

		}

		return secondRow;
	}

	public String printThirdLine(String number) {
		String thirdRow = "";
		for (int i = 0; i < number.length(); i++) {

			switch (number.charAt(i)) {
			case '1':
				thirdRow = thirdRow.concat("..| ");
				break;
			case '2':
				thirdRow = thirdRow.concat("|_. ");
				break;
			case '3':
				thirdRow = thirdRow.concat("._| ");
				break;
			case '4':
				thirdRow = thirdRow.concat("..| ");
				break;
			case '5':
				thirdRow = thirdRow.concat("._| ");
				break;
			case '6':
				thirdRow = thirdRow.concat("|_| ");
				break;
			case '7':
				thirdRow = thirdRow.concat("..| ");
				break;
			case '8':
				thirdRow = thirdRow.concat("|_| ");
				break;
			case '9':
				thirdRow = thirdRow.concat("..| ");
				break;
			case '0':
				thirdRow = thirdRow.concat("|_| ");
				break;
			default:
				break;
			}

		}
		return thirdRow;
	}

}
