package hu.nyirszikszi;

import hu.nyirszikszi.tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
		String[] a = {
				"Kilépés",
				"Jelenítse meg a konzolon a \"Holnap \"jo\" leszek!\" üzenetet!",
				"Kérje be a konzolról a felhasználó nevét, majd írja ki a következő jókívánságot: \"Kedves X! Sikeres Java programozást!\"",
				"Kérje be egy téglalap alapú hasáb három élének hosszúságát, majd írja ki a felszínét és térfogatát!",
				"Kérje be egy gömb sugarát, majd írja ki a gömb felszínét és térfogatát!",
				"Kérjen be egy pénzösszeget, majd írja ki, hogy milyen címletekben lehet minimális számú pénzzel kifizetni úgy, hogy 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5 címletek állnak rendelkezésre!",
				"Kérje be a főnöke fizetését, aztán a sajátját. Hasonlítsa össze a két fizetés: írjon ki egy-egy megjegyzést, ha a főnöke fizetése nagyobb, ha a sajátja nagyobb, illetve ha egyenlő!",
				"Kérjen be egy egész óra értéket. Ha a szám nem 0 és 24 óra között van, akkor adjon hibaüzenetet, egyébként köszönjön el a program a napszaknak megfelelően! 4-9: Jó reggelt!, 10-17: Jó napot!, 18-21: Jó estét!, 22-3: Jó éjszakát!",
				"Kérjük be, hogy a héten mennyi kalóriát fogyasztottunk az egyes napokon. Írjuk ki az összes kalóriafogyasztásunkat, valamint a napi átlagot!",
				"Kérjen be egy egész számot, és állapítsa meg, hány 0 jegy szerepel benne!",
				"Kérje be egy telek oldalait méterben! Írja ki a telek területét négyszögölben (1 négyszögöl=3,6m2)! Ha a telek 100 négyszögölnél kisebb, akkor írja ki, hogy túl kicsi!",
				"Kérjen be egy évszámot! Ha a beütött szám negatív, adjon hibajelzést, ha nem, állapítsa meg, hogy az évszám osztható-e 17-tel, vagy nem!",
				"Kérjen be egy egyjegyű, nem negatív számot! Írja ki a szám szöveges formáját (egy, kettő, stb.)!",
				"Kérjen be egy számot, majd írja ki addig a számig az összes prímszámot!",
				"Kérjünk be karaktereket * végjelig. Írjuk ki, hány nagybetűt, kisbetűt, számjegyet ill. egyéb karaktert ütöttünk be!",
				"Készítsen pénzbedobó automatát. Először kérje be a bedobandó összeget. Az automata csak 5, 10, 20, 50, 100, 200 Ft-os érmét fogadjon el. Az automata tájékoztasson, hogy mennyi pénzt kell még bedobnunk, ill. túlfizetés esetén közölje a visszajáró összeget.",
				"Írja meg a következő eljárást: Egy adott szélességű és magasságú tömör téglalapot rajzol a konzolra a megadott karakterekkel!",
				"Készítsen egy Másodfokú osztályt, melynek adatai a másodfokú polinom együtthatói: a, b, c. A konstruktor paramétereken keresztül inicializálja az adatokat. A getD() metódus adja vissza a diszkriminánst, a getValósMegoldásokSzáma() a gyökök számát, getX1(), getX2() pedig a két gyököt.",
				"Írjuk ki a tökéletes számokat (osztóinak összege – kivéve magát a számot – megegyezik a számmal, pl. 6) N-ig a képernyőre!"
		};
        
        do {
			System.out.print("\n\n\n");
			/*System.out.print("\033[H\033[2J");
			System.out.flush();*/
        	
        	for (int i = 0; i < a.length; i++) {
				System.out.println(i + "\t" + a[i]);
			}
        	
        	System.out.print("\n\nFeladat száma: ");
        	n = s.nextInt();
        	
        	try {
				System.out.println(a[n] + "\n");
		
				switch (n) {
					case 1:
						Task1 t1 = new Task1();
						pressEnter();
						break;
					case 2:
						Task2 t2 = new Task2();
						pressEnter();
						break;
					case 3:
						Task3 t3 = new Task3();
						pressEnter();
						break;
					case 4:
						Task4 t4 = new Task4();
						pressEnter();
						break;
					case 5:
						Task5 t5 = new Task5();
						pressEnter();
						break;
					case 6:
						Task6 t6 = new Task6();
						pressEnter();
						break;
					case 7:
						Task7 t7 = new Task7();
						pressEnter();
						break;
					case 8:
						Task8 t8 = new Task8();
						pressEnter();
						break;
					case 9:
						Task9 t9 = new Task9();
						pressEnter();
						break;
					case 10:
						Task10 t10 = new Task10();
						pressEnter();
						break;
					case 11:
						Task11 t11 = new Task11();
						pressEnter();
						break;
					case 12:
						Task12 t12 = new Task12();
						pressEnter();
						break;
					case 13:
						Task13 t13 = new Task13();
						pressEnter();
						break;
					case 14:
						Task14 t14 = new Task14();
						pressEnter();
						break;
					case 15:
						Task15 t15 = new Task15();
						pressEnter();
						break;
					case 16:
						Task16 t16 = new Task16();
						pressEnter();
						break;
					case 17:
						Task17 t17 = new Task17();
						pressEnter();
						break;
					case 18:
						Task18 t18 = new Task18();
						pressEnter();
						break;
				}
			}
        	catch (Exception e) {
				//System.out.println(e);
				System.out.println("Nincs ilyen számú feladat!");
				pressEnter();
			}
		}
		while (n != 0);
    }
	
	public static void pressEnter(){
		System.out.print("\nNyomj Enter-t a folytatáshoz!");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
	}
}