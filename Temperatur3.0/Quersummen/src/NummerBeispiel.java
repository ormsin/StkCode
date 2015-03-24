/**
 * Dieses Programm...
 * - enthält main-Methode
 * - ruf die Methode auf, um Quersumme zu berechnen.
 * - ruf die Methode auf, um die nachzufragende Quersumme von den Werte 1 - 300 herauszufinden.
 * @author Suppawat
 *
 */
public class NummerBeispiel { //erzeugt die NummerBeispiel Klasse
		public static void main(String[] args) { //main-Methode des Programms
		Quersummen q1 = new Quersummen(1); //erzeugt neue Instanz q1
		//System.out.println(q1.berechneQuersumme(523)); //druekt von dem Wert 523 die Quersumme aus.
		//q1.check(11); //findet die Quersumme von den Werte 1 - 300 heraus, die gleich 11 ist.
		//System.out.println(q1.uniC(123456789)); //uniC test
		q1.vielfacheQS(1,2000,4);
	}

}
