package com.app.operative;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		com.app.operative.anotherway.LCDString lcdString = new com.app.operative.anotherway.LCDString();
		System.out.println("Enter Number To Print");
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();

		
		System.out.println(lcdString.printFirstLine(num));
		System.out.println(lcdString.printSecondLine(num));
		System.out.println(lcdString.printThirdLine(num));
		
		scan.close();
	}

}
