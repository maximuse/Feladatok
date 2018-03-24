package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task14 {
	Scanner s = new Scanner(System.in);
	private char c;
	private int u,
				l,
				i;
	
	public Task14() {
		u = 0;
		l = 0;
		i = 0;
		
		do {
			System.out.print("Karakter: ");
			c = s.next().charAt(0);
			
			if(Character.isUpperCase(c)) {
				u++;
			}
			else if(Character.isLowerCase(c)) {
				l++;
			}
			else if(c == (int)c) {
				i++;
			}
		}
		while (c != '*');
		
		System.out.println("Nagybetű:\t" + u + "\nKisbetű:\t" + l + "\nSzám:\t" + (i-1));
	}
}