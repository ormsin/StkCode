/**
 * 
 * @author Supawat
 * Stk TU Darmstadt T378
 * 
 * Last update: Fri 21.03.15
 *
 */

public class PotenzArray { 																//Klasse heißt PotenzArray

	int[] potenzArray;																	//ein neues Array erzeugt

	public PotenzArray(){}																//eine Methode heißt "PotenzArray". Die Methode funktioniert als Konstruktor
		
	public void berechneZahlen(){														//eine Methode heisst "berechneZahlen". Die Methode erzeugt ganze Arrays und bestimmt einen genauen Wert für jedes Array
		int i = 0;																		//eine Variable "i" wird erzeugt
		int anzahlGerade = 0;															//eine Variable "anzahlGerade" wird erzeugt
		int anzahlUngerade = 0;															//eine Variable "anzahlUngerade" wird erzeugt
		int anzahlArrays = 20;
		potenzArray = new int[anzahlArrays];											//das Array "PotenzArray" ist die Nummer der Midglieder gegeben
		
		while (i < anzahlArrays) {														//while-Schleife, die bis i = 20 funktioniert
			potenzArray[i] = (int) Math.pow(i + 1, 2);									//bestimmt einen Wert für jedes Array. Der Wert = n^2, wenn n=1,2,3,...,20
			if (potenzArray[i] % 2 == 0) {												//nutzen if-Schleife, zu bestimmen, ob ein Wert von einem Array gerade ist
				anzahlGerade++;															//wenn die Zahl gerade ist, dann erhoert die Variable "anzahlGerade" um 1
			} else {																	//fuer andere Faellen (In diesem Fall ist ein Wert von einem Array ungerade)
				anzahlUngerade++;														//wenn die Zahl ungerade ist, dann erhoert die Variable "anzahlUngerade" um 1
			}
			i++;																		//jedes Mal die while-Schleife funktioniert, erhoert die Variable "i" um 1
		}
		
		System.out.println("Anzahl der geraden Nummern = " + anzahlGerade);				//gibt die Anzahl von geraden Zahlen aus
		System.out.print("Gerade Nummer: ");											//gibt die gerade Zahlen aus
		
		i=0;
		int ueberPruefer = 0;															//erzeugt eine Variable heisst "ueberPruefer", die gleich 0 ist
		while(i < anzahlArrays){														//die while-Schleife funktioniert solange die Variable i < Anzahl von Arrays ist
			potenzArray[i] = (int) Math.pow(i + 1, 2);									//bestimmt einen Wert für jedes Array. Der Wert = n^2, wenn n=1,2,3,...,20
			if(potenzArray[i] % 2 == 0){												//ueberprueft, ob die Zahlen gerade ist
				ueberPruefer++;															//erhoert die Variable "ueberPruefer" um 1
				System.out.print(potenzArray[i]+" ");									//wenn die Zahl gerade ist, dann gibt die Zahl aus
			}
			i++;																		//erhoert die Variable i um 1
		}
		if(ueberPruefer == 0){															//ueberprueft, ob es keine gerade Zahl gibt
			System.out.println("Es gibt keine gerade Zahl");							//wenn es keine gerade Zahl gibt, dann zeigt den Satz
			System.out.println();														//gibt leere Zeile aus
		}
		if(i == 20){																	//erzeugt leere Zeile
			System.out.println();
			System.out.println();
		}
		
		System.out.println("Anzahl der ungeraden Nummern = " + anzahlUngerade);			//gibt die Anzahl von ungeraden Zahlen aus
		System.out.print("Ungerade Nummer: ");											//gibt die ungerade Zahlen aus
		
		i = 0;																			//setzt die Variable i um 0
		ueberPruefer = 0;																//setzt die Variable "ueberPruefer" um 0
		while(i < anzahlArrays){														//die while-Schleife funktioniert solange die Variable i < Anzahl von Arrays ist
			potenzArray[i] = (int) Math.pow(i + 1, 2);									//bestimmt einen Wert für jedes Array. Der Wert = n^2, wenn n=1,2,3,...,20
			if(potenzArray[i]%2!=0){													//ueberprueft, ob die Zahl ungerade ist
				System.out.print(potenzArray[i]+" ");									//wenn die Zahl ungerade ist, dann gibt die Zahl aus
				ueberPruefer++;															//erhoert die Variable "ueberPruefer" um 1
			}
			i++;																		//erhoert die Variable i um 1
		}
		if(ueberPruefer == 0){															//ueberprueft, ob es keine ungerade Zahl gibt
			System.out.println("Es gibt keine ungerade Zahl");							//wenn es keine ungerade Zahl gibt, dann zeigt den Satz
			System.out.println();														//erzeugt leere Zeile
		}
	}

}
