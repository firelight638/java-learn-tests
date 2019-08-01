package com.io.scanner.test;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextLine()) {
			String str1 = scan.nextLine();
			System.out.println(str1);
		}
		scan.close();
	}
}

