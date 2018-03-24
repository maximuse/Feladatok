package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task16 {
	private char c;
	private int w,
				h;
	
	Scanner s = new Scanner(System.in);
	
	public Task16() {
		System.out.print("Karakter:\t");
		c = s.next().charAt(0);
		
		System.out.print("Szélesség:\t");
		w = s.nextInt();
		
		System.out.print("Magasság:\t");
		h = s.nextInt();
		
		System.out.println();
		
		rajzol();
	}
	
	private void rajzol() {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}