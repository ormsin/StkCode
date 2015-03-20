/**
 * 
 * @author Supawat
 * Stk TU Darmstadt T378
 * 
 * Last update: Fri 20.03.15
 *
 */

public class PotenzArray { 																//Klasse hei�t PotenzArray

	int[] potenzArray;																	//ein neues Array erzeugt

	public PotenzArray(){}																//eine Methode hei�t "PotenzArray". Die Methode funktioniert als Konstruktor
		
	public void berechneZahlen(){														//eine Methode hei�t "berechneZahlen". Die Methode erzeugt ganze Arrays und bestimmt einen genauen Wert f�r jedes Array
		int i = 0;																		//eine Variable "i" wird erzeugt
		int anzahlGerade = 0;															//eine Variable "anzahlGerade" wird erzeugt
		int anzahlUngerade = 0;															//eine Variable "anzahlUngerade" wird erzeugt
		potenzArray = new int[20];														//das Array "PotenzArray" ist die Nummer der Midglieder gegeben

		while (i < 20) {																//while-Schleife, die bis i = 20 funktioniert
			potenzArray[i] = (int) Math.pow(i + 1, 2);									//bestimmt einen Wert f�r jedes Array. Der Wert = n^2, wenn n=1,2,3,...,20
			if (potenzArray[i] % 2 == 0) {												//nutzen if-Schleife, zu bestimmen, ob ein Wert von einem Array gerade ist
				anzahlGerade++;															//wenn die Zahl gerade ist, dann erhoert die Variable "anzahlGerade" um 1
			} else {																	//fuer andere Faellen (In diesem Fall ist ein Wert von einem Array ungerade)
				anzahlUngerade++;														//wenn die Zahl ungerade ist, dann erhoert die Variable "anzahlUngerade" um 1
			}
			i++;																		//jedes Mal die while-Schleife funktioniert, erhoert die Variable "i" um 1
		}
		System.out.println("Anzahl der geraden Nummern = " + anzahlGerade);				//gibt die Anzahl von geraden Zahlen aus
		System.out.println("Anzahl der ungeraden Nummern = " + anzahlUngerade);			//gibt die Anzahl von ungeraden Zahlen aus
	}

}
