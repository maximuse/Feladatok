package hu.nyirszikszi.tasks;

import java.util.Scanner;

public class Task5 {
	private int penz;
	private int[] cimletek = {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5};
	
	Scanner s = new Scanner(System.in);
	
	public Task5() {
		System.out.print("Pénzösszeg: ");
		penz = s.nextInt();
		System.out.println(felvalt());
	}
	
	public int getPenz() {
		return penz;
	}
	
	private int db(int penz, int cimlet) {
		return penz / cimlet;
	}
	
	private String felvalt() {
		String r = "bent van:\t" + getPenz() + "\n";
		
		for (int cimlet : cimletek) {
			int db = 0;
			
			db = db(penz, cimlet);
			penz -= db * cimlet;
			
			if(db != 0) {
				r += db + "\t*\t" + cimlet + "\nbent maradt:\t" + getPenz() + "\n";
			}
		}
		
		return r;
	}
}