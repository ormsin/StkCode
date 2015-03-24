
public class BerechneTemp {
	int days = 14; //Anzahl der Tage
	int index = days;
	int nextIndex;
	int j,�berNextIndex;
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
		�berNextIndex=1;
		for(index=0;nextIndex<days-1;nextIndex++){ //hier soll man for-Schlife benutzen
			u = temperatur[index] - temperatur[nextIndex];
			if(u>0){
				index = nextIndex;
				�berNextIndex = nextIndex +1;
				v = temperatur[index] - temperatur[�berNextIndex];
			}	
		}
		int calculatedIndex = nextIndex + 1;
		if(temperatur[�berNextIndex]<temperatur[index]){
			System.out.println("Die Minimaltemperatur ist "+temperatur[�berNextIndex]+"�C");
		} else {
			System.out.println("Die Minimaltemperatur ist "+temperatur[index]+"�C");
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
		
		System.out.println("Durchschnittstemperatur ist "+durchschnitt+"�C");
		System.out.println();
	}
	
	
	
	
	public void berechneMaxTemp(){ //maximale Temperatur untersuchungen
		double u = 1;
		
		while(�berNextIndex<=13){
			nextIndex = index + 1;
			nextIndex = �berNextIndex;
			�berNextIndex = nextIndex+1;
				for(index=nextIndex;�berNextIndex<=13&&temperatur[nextIndex]-temperatur[�berNextIndex]>=0;�berNextIndex++){ //the machine
					while(u>=0){
						u = temperatur[index] - temperatur[�berNextIndex];
						mehr = false;
						break;
					}
				}
		}
				
		//Zeigt die Maximaltemperatur
		System.out.println("Die Maximaltemperatur ist "+temperatur[nextIndex]+"�C liegt im "+nextIndex+". Index");
		
		//�berpr�ft, ob das Programm schon am unten erreicht.
		System.out.println(�berNextIndex+" (von "+days+") Indezes werden berechnet");
		System.out.println();
	}
	
	public void berechneMaxUnterschied(){ //maximale Temperatur untersuchungen
		double u = 1;
		
		//THE MACHINE
		while(�berNextIndex<=13){
			nextIndex = index + 1;
			nextIndex = �berNextIndex;
			�berNextIndex = nextIndex+1;
				for(index=nextIndex;�berNextIndex<=13&&unterschied[nextIndex]-unterschied[�berNextIndex]>=0;�berNextIndex++){ //the machine
					while(u>=0){
						u = unterschied[index] - unterschied[�berNextIndex];
						mehr = false;
						break;
					}
				}
		}
				
		//Zeigt die maximale Temperaturunterschied
		System.out.println("Die maximale Temperaturunterschied ist "+unterschied[nextIndex]+"�C liegt im "+nextIndex+". Index");
		
		//�berpr�ft, ob das Programm schon am unten erreicht
		System.out.println(�berNextIndex+" (von "+days+") Indezes werden berechnet");
		System.out.println();
	}

}
