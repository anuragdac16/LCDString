package com.app.operative;

public class LCDString {

	public void printThirdLine(String number) {

		for (int i = 0; i < number.length(); i++) {
			char[] pattern = new char[3];

			if (number.charAt(i) == '0' || number.charAt(i) == '2' || number.charAt(i) == '6'
					|| number.charAt(i) == '8')
				pattern[0] = '|';
			else
				pattern[0] = '.';

			if (number.charAt(i) == '1' || number.charAt(i) == '4' || number.charAt(i) == '7'
					|| number.charAt(i) == '9')
				pattern[1] = '.';
			else
				pattern[1] = '_';

			if (number.charAt(i) == '2')
				pattern[2] = '.';
			else
				pattern[2] = '|';

			for (char c : pattern)
				System.out.print(c);

			System.out.print(" ");
		}
		System.out.println();
	}

	public void printSecondLine(String number) {

		for (int i = 0; i < number.length(); i++) {
			char[] pattern = new char[3];

			if (number.charAt(i) == '1' || number.charAt(i) == '2' || number.charAt(i) == '3'
					|| number.charAt(i) == '7')
				pattern[0] = '.';
			else
				pattern[0] = '|';

			if (number.charAt(i) == '0' || number.charAt(i) == '1' || number.charAt(i) == '7')
				pattern[1] = '.';
			else
				pattern[1] = '_';

			if (number.charAt(i) == '5' || number.charAt(i) == '6')
				pattern[2] = '.';
			else
				pattern[2] = '|';

			for (char c : pattern)
				System.out.print(c);

			System.out.print(" ");
		}
		System.out.println();
	}

	public void printFirstLine(String number) {
		for (int i = 0; i < number.length(); i++) {
			if (number.charAt(i) == '1' || number.charAt(i) == '4')
				System.out.print("...");
			else
				System.out.print("._.");

			System.out.print(" ");
		}
		System.out.println();
	}

}
