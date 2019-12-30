package com.nhs.patient.info;

import java.util.Scanner;

public class Alternative_String_Merge {

	static String mix(String str1, String str2) {
		int i = 0, j = 0;
		String str = "";
		while (i < str1.length() && j < str2.length()) {
			str = str + str1.charAt(i++);
			str = str + str2.charAt(j++);
		}
		while (i < str1.length()) {
			str = str + str1.charAt(i++);
		}
		while (j < str2.length()) {
			str = str + str2.charAt(j++);
		}
		return str;
	}

	public static void main(String[] args) {
		Scanner sc = null;
		String str1, str2 = null;
		// String str2 = null;

		// scanner object
		sc = new Scanner(System.in);
		System.out.println("Enter ur String:");
		str1 = sc.nextLine();
		str2 = sc.nextLine();

		// call method
		String result = Alternative_String_Merge.mix(str1, str2);
		System.out.println("Final Result:" + result);

		sc.close();

	}

}
