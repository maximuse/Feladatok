package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task12 {
	private int n;
	
	Scanner s = new Scanner(System.in);
	
	public Task12() {
		System.out.print("Szám: ");
		n = s.nextInt();
		
		System.out.println(kiir(n));
	}
	
	private String kiir(int n) {
		switch (n) {
			case 0:
				return "nulla";
			case 1:
				return "egy";
			case 2:
				return "kettő";
			case 3:
				return "három";
			case 4:
				return "négy";
			case 5:
				return "öt";
			case 6:
				return "hat";
			case 7:
				return "hét";
			case 8:
				return "nyolc";
			case 9:
				return "kilenc";
			default:
				return "Nincs ilyen egyjegyű, nem negatív szám!";
		}
	}
}