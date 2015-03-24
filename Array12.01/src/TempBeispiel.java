
public class TempBeispiel {
	public static void main(String[] args){
		BerechneTempV2 temp1 = new BerechneTempV2();
		//System.out.println("Die Durchschnittstemperatur ist "+temp1.berechneDurchschnittTemp()+" ¡C");		
		temp1.berechneMaxTemp();
		//System.out.println("Die Temperaturen sind im Durchschnitt: "+temp1.berechneDurchschnitt()+"¡C");
		temp1.berechneMinTemp();
		temp1.berechneUnterschied();
	}

}
