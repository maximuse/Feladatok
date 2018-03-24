package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task2 {
	private String n;
	
	Scanner s = new Scanner(System.in);
	
	public Task2() {
		System.out.print("Név: ");
		n = s.next();
		
		System.out.println("Kedves " + n + "! Sikeres Java programozást!");
	}
}