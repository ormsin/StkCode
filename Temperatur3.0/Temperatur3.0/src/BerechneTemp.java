
public class BerechneTemp {
	int days = 14; //Anzahl der Tage
	int index = days;
	int nextIndex;
	int j,überNextIndex;
	int varTemp;
	double summeTemp=0;
	double durchschnitt;
	double t,temp,m,savedTemp,diff;
	double[] temperatur = new double[index];
	double[] unterschied = new double[index];
	boolean mehr = true, reach = false;
	int unterschiedIndex;
	double[] anArray = new double[1];
	
	public BerechneTemp(){
		temperatur = new double[] {12,10,9,12,15,16,55,15,15,19,15,23,21,25};
	}
	
	
	public void berechneUnterschied(){
		double u;
		nextIndex = 1;
		for(index=0;nextIndex<=days-1;nextIndex++){
			u = temperatur[nextIndex] - temperatur[index];
			if(u<0){
				u = -u;
			}
			unterschied[index] = u;
			index++;
		}
	}
	
	public void berechneMinTemp(){
		double u,v;
		nextIndex = 1;
		überNextIndex=1;
		for(index=0;nextIndex<days-1;nextIndex++){ //hier soll man for-Schlife benutzen
			u = temperatur[index] - temperatur[nextIndex];
			if(u>0){
				index = nextIndex;
				überNextIndex = nextIndex +1;
				v = temperatur[index] - temperatur[überNextIndex];
			}	
		}
		int calculatedIndex = nextIndex + 1;
		if(temperatur[überNextIndex]<temperatur[index]){
			System.out.println("Die Minimaltemperatur ist "+temperatur[überNextIndex]+"°C");
		} else {
			System.out.println("Die Minimaltemperatur ist "+temperatur[index]+"°C");
		}
		System.out.println(calculatedIndex+" (von "+days+") Indizes werden berechnet");
		System.out.println();
	}
	
	
	
	
	public void berechneDurchschnitt(){ //Durchschnitt berechnen
		double ersteStelle;
		
		for(index=0;index<=13;index++){
			summeTemp = summeTemp + temperatur[index];
		}
		durchschnitt = summeTemp/days;
		
		//Auf- und abrunden
		durchschnitt = durchschnitt*Math.pow(10, 3);
		durchschnitt = durchschnitt - durchschnitt%1;
		ersteStelle = durchschnitt%10;
		if(ersteStelle>=5){
			durchschnitt = durchschnitt + 1;
		}
		durchschnitt = durchschnitt - ersteStelle;
		durchschnitt = durchschnitt/Math.pow(10,3);
		//fertig auf- und abrunden
		
		System.out.println("Durchschnittstemperatur ist "+durchschnitt+"°C");
		System.out.println();
	}
	
	
	
	
	public void berechneMaxTemp(){ //maximale Temperatur untersuchungen
		double u = 1;
		
		while(überNextIndex<=13){
			nextIndex = index + 1;
			nextIndex = überNextIndex;
			überNextIndex = nextIndex+1;
				for(index=nextIndex;überNextIndex<=13&&temperatur[nextIndex]-temperatur[überNextIndex]>=0;überNextIndex++){ //the machine
					while(u>=0){
						u = temperatur[index] - temperatur[überNextIndex];
						mehr = false;
						break;
					}
				}
		}
				
		//Zeigt die Maximaltemperatur
		System.out.println("Die Maximaltemperatur ist "+temperatur[nextIndex]+"°C liegt im "+nextIndex+". Index");
		
		//Überprüft, ob das Programm schon am unten erreicht.
		System.out.println(überNextIndex+" (von "+days+") Indezes werden berechnet");
		System.out.println();
	}
	
	public void berechneMaxUnterschied(){ //maximale Temperatur untersuchungen
		double u = 1;
		
		//THE MACHINE
		while(überNextIndex<=13){
			nextIndex = index + 1;
			nextIndex = überNextIndex;
			überNextIndex = nextIndex+1;
				for(index=nextIndex;überNextIndex<=13&&unterschied[nextIndex]-unterschied[überNextIndex]>=0;überNextIndex++){ //the machine
					while(u>=0){
						u = unterschied[index] - unterschied[überNextIndex];
						mehr = false;
						break;
					}
				}
		}
				
		//Zeigt die maximale Temperaturunterschied
		System.out.println("Die maximale Temperaturunterschied ist "+unterschied[nextIndex]+"°C liegt im "+nextIndex+". Index");
		
		//Überprüft, ob das Programm schon am unten erreicht
		System.out.println(überNextIndex+" (von "+days+") Indezes werden berechnet");
		System.out.println();
	}

}
