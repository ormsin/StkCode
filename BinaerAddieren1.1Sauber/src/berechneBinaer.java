// Suppawat Yokubol
// Klausurwoche WS2015
// about two's complement: http://en.wikipedia.org/wiki/Two%27s_complement

public class berechneBinaer // erzeugt eine Klasse "berechneBinaer"
{

	int[] binaer1 = new int[9]; // erzeugt ein Array "binaer1", indem es 9
								// Elementen gibt
	int[] binaer2 = new int[9]; // erzeugt ein Array "binaer2", indem es 9
								// Elementen gibt
	int[] ueberlauf = new int[9]; // erzeugt ein Array "ueberlauf", indem es 9
									// Elementen gibt
	int[] ergebnis = new int[9]; // erzeugt ein Array "ergebnis", indem es 9
									// Elementen gibt
	int i = 7; // erzeugt eine Variable "i", die 7 fuer einen Wert hat

	public berechneBinaer() // Konsturktor
	{
		while (i != -1) // die while-Schleife funktionert, solange i != -1
		{
			binaer1[i] = (int) (Math.random() * 2); // setzt fuer jedes Array
													// binaer1 einen Wert von 0
													// oder 1
			binaer2[i] = (int) (Math.random() * 2); // setzt fuer jedes Array
													// binaer2 einen Wert von 0
													// oder 1
			i--; // die Variable "i" nimmt einen Wert von 1 ab
		}
	}

	public void addiereBinaer() // die Methode "addiereBinaer". Die Methode
								// berechnet fuer jedes Array ein Ergebnis. Beim
								// Berechnen braucht man 3 Arrays, naemlich
								// "binaer1" "binaer2" "ueberlauf" und das Array
								// "ergebnis", um ein Ergebnis zu speichern
	{
		int indexGoUp = 0;
		ueberlauf[indexGoUp] = 0;
		while (indexGoUp < 8)
		{
			if (indexGoUp + 1 == 9)
			{
				break;
			}
			if (ueberlauf[indexGoUp] == 0)
			{
				if (binaer1[indexGoUp] + binaer2[indexGoUp] == 2)
				{
					ergebnis[indexGoUp] = 0;
					ueberlauf[indexGoUp + 1] = 1;
				}
				if (binaer1[indexGoUp] + binaer2[indexGoUp] <= 1)
				{
					ergebnis[indexGoUp] = binaer1[indexGoUp]
							+ binaer2[indexGoUp];
					ueberlauf[indexGoUp + 1] = 0;
				}
			}
			if (ueberlauf[indexGoUp] == 1)
			{
				if (binaer1[indexGoUp] + binaer2[indexGoUp] == 2)
				{
					ergebnis[indexGoUp] = 1;
					ueberlauf[indexGoUp + 1] = 1;
				}
				if (binaer1[indexGoUp] + binaer2[indexGoUp] == 1)
				{
					ergebnis[indexGoUp] = 0;
					ueberlauf[indexGoUp + 1] = 1;
				}
				if (binaer1[indexGoUp] + binaer2[indexGoUp] == 0)
				{
					ergebnis[indexGoUp] = 1;
					ueberlauf[indexGoUp + 1] = 0;
				}
			}
			indexGoUp++;
		}
	}

	public void datenAusgeben() // die Methode gibt das ganze Prozess des
								// Addierens aus
	{
		int i = 7; // Mega wichtig, definiert die Variable "i"
		System.out.print("  ");
		while (i != -1)
		{
			System.out.print(binaer1[i]);
			i--;
		}
		// convert into Dezimal
		int indexDezimal = 0;
		int b = 0;
		while (indexDezimal < 7)
		{
			b = b + (binaer1[indexDezimal]) * (int) Math.pow(2, indexDezimal);
			indexDezimal++;
		}
		b = b - (binaer1[7]) * (int) (Math.pow(2, 7));
		System.out.print("  |   " + b);
		int dezimalA = b;
		System.out.println();
		System.out.print("+ ");
		i = 7;
		while (i != -1)
		{
			System.out.print(binaer2[i]);
			i--;
		}
		// convert into Dezimal
		indexDezimal = 0;
		b = 0;
		while (indexDezimal < 7)
		{
			b = b + (binaer2[indexDezimal]) * (int) Math.pow(2, indexDezimal);
			indexDezimal++;
		}
		b = b - (binaer2[7]) * (int) (Math.pow(2, 7));
		System.out.print("  | + " + b);
		int dezimalB = b;
		System.out.println();
		System.out.print("  ");
		i = 7;
		while (i != -1)
		{
			System.out.print(ergebnis[i]);
			i--;
		}
		// convert into Dezimal
		indexDezimal = 0;
		b = 0;
		while (indexDezimal < 7)
		{
			b = b + (ergebnis[indexDezimal]) * (int) Math.pow(2, indexDezimal);
			indexDezimal++;
		}
		if (binaer1[7] == 0 && binaer2[7] == 0) // die Addition rechnet ohne Zweierkompliment
		{
			b = b + (ergebnis[7] * (int) (Math.pow(2, 7)));
		} else // die Addition rechnet mit Zweierkompliment
		{
			b = b - (ergebnis[7]) * (int) (Math.pow(2, 7));
		}
		int dezimalErgebnis = b;
		if(dezimalA + dezimalB == dezimalErgebnis){ // legal case
			System.out.println("  |   " + b); // gibt ein Ergebnis in Dezimal aus
		} else { // illegal case, Error
			dezimalErgebnis = dezimalA + dezimalB;
			System.out.println("  |   " + "Error!");
			System.out.println("Note: A value of "+ dezimalErgebnis +" cannot be represented with an 8-bit signed binary numeral.");
			System.out.println("More Info: http://en.wikipedia.org/wiki/Two%27s_complement");
		}
	}

}
