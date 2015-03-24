/**
 * Dieses Programm zeigt die Produkte von Operation der Vektoren
 * @author Student
 *
 */
public class Vektorrechnung { //neue Klasse mit dem Namen Vektorrechnung
	public static void main(String[] args) { //main-Methode
		Vektor vektor1 = new Vektor(1,2,3); //erste Instanz
		Vektor vektor2 = new Vektor(2,3,4); //zweite Instanz
		
		Vektor b = vektor1.Addition(vektor2); //Vektor b
		//Vektor b = new Vektor(1,2,3); //wenn Vektor b egal ist
		System.out.println(vektor1.Addition(b)); //das Programm zeigt die Addition zwischen Vektor 1 und Vektor b
		
		System.out.println(vektor1.multiplizieren(2)); //das Programm zeigt das Multiplikationsprodukt von Vektor 1 und einem Wert 2
		
		vektor1.multiplikation(2, 3, 4);
		System.out.println(vektor1.multiplikation(2,3,4)); //das Programm zeigt das Skalarprodukt von Vektor 1 und Vektor(2,3,4)
		
		System.out.println(vektor2.Addition(b)); ////das Programm zeigt die Addition zwischen Vektor 2 und Vektor b
		
		System.out.println(vektor2.multiplizieren(2)); //das Programm zeigt das Multiplikationsprodukt von Vektor 2 und einem Wert 2
		
		vektor1.multiplikation(2, 3, 4);
		System.out.println(vektor2.multiplikation(2,3,4)); //das Programm zeigt das Skalarprodukt von Vektor 2 und Vektor(2,3,4)
		
		
		
	}

}
