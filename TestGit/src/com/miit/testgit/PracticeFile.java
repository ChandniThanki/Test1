package com.miit.testgit;

public class PracticeFile {

	public static void main(String[] args) {
		System.out.println("Hello World");
		int row = 5;

		for (int a = 1; a<= row; a++) {
			for (int b = 1; b<= a; b++) {
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}
}
