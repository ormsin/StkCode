/**
 * Was macht dieses Programm?
 * Dieses Programm...
 * - erzeugt einen Konstruktor für main-Methode
 * - berechnet von den Werte die Quersummen
 * @author Suppawat T378
 *
 */
public class Quersummen { //erzeugt eine Quersummen Klasse
	int x,a,b,c,d,n,m,i,j,k,z; //Variabeln, die in der Klasse genutzt werden
	
	public Quersummen(int xx) { //die Methode Quersummen, ein Konstruktor, um q zu erzeugen
		x = xx;
	}
	
	public int berechneQuersumme(int xx){ //diese Methode berechnet die Quersumme von einem Wert, int als Datentyp
		x = xx; //Wert x, z.B 321
		a = x%10; //berechnet erste Ziffer von einem Wert. Man bekommt einen Wert 1 von 321
		b = ((x%100)-a); //berechnet zweite Ziffer von einem Wert. Man bekommet 20 von 321
		c = ((x%1000)-b-a); //berechnet dritte Ziffer von einem Wert. Man bekommt 300 von 321
		d = a + (b/10) + (c/100); //berechnet die Quersumme. z.B. d = 1 + (20/10) + (300/100) = 6
		return d; //gibt Rueckgabe als die Quersumme zurueck
	}
	
	public int uniC(int xx) { //universal Quersummen calculator
		int t=0;
		x = xx;
		while(x!=0) {
			t = t+(x%10);
			x = x/10;
		}
		return t;
	}
	
	public void check(int quersumme) { //diese Methode untersucht, ob welche von den Zahlen 1 - 300 die gegebene Quersumme hat.
		for(n=1;n<=300;n++){ //zaehlt von 1 bis 300
			Quersummen q2 = new Quersummen(n); //erzeugt neue Instanz, um die Quersumme spaeter zu rechnen
			
			if (q2.berechneQuersumme(n)==quersumme) { //ueberprueft, ob die Quersumme von einer beliebigen Zahl gleich die gegebene Quersumme ist.
				System.out.println(n); //druckt einen Wert aus, der gleich die gegebene Quersumme ist.
			}
		}
	}
	
	public void vielfacheQS(int ii,int jj, int kk) {
		i = ii; //Anfangswert des Intervals
		j = jj; //Endwert des Intervals
		k = kk; //Quersumme
		
		Quersummen q3 = new Quersummen(m); //Die neue Instanz q3 werden gebraucht, um spaeter zu berechnen
		
		for(m=i;m<=j;m++){ //if-Schleife, zaehlt von Anfangswert "i" bis Endwert "j"
			if (q3.uniC(m)==k) { //wenn Quersummen vom Wert m gleich k ist, denn zeigt den Wert
				System.out.println(m+" (Quersumme = "+k+")");
			}
			
			z = q3.uniC(m)/4;
			
			if (z!=1) { //wenn Quersummen vom Wert m vielfach von k ist, denn zeigt den Wert
				n = q3.uniC(m)%k;
				if (n==0) {
					System.out.println(m+" (Quersumme = "+k+"*"+z+")");
				}
			}	
		}
	}
}
