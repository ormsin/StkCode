
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
	
	public double ausdruck(){ //sandbox
		for(unterschiedIndex=0;unterschiedIndex<=12;unterschiedIndex++){
		t = unterschied[unterschiedIndex];
		}
		//System.out.println(t);
		return t;
	}
	
	
	public void berechneUnterschied(){
		double u;
		nextIndex = 1;
		for(index=0;nextIndex<=days-1;nextIndex++){
			u = temperatur[nextIndex] - temperatur[index];
			//System.out.println(temperatur[nextIndex]+" - "+temperatur[index]+" = "+u);
			if(u<0){
				u = -u;
			}
			unterschied[index] = u;
			//System.out.println(u);
			index++;
		}
		//System.out.println();
	}
	
	public void zeigtUnterschied(){
		double u;
		u = unterschied[4];
		System.out.println("I love u "+u);
	}
	
	public void berechneMinTemp(){
		double u,v;
		nextIndex = 1;
		�berNextIndex=1;
		for(index=0;nextIndex<days-1;nextIndex++){ //hier soll man while-Schlife benutzen
			u = temperatur[index] - temperatur[nextIndex];
			//System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
			if(u>0){
				//System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
				index = nextIndex;
				�berNextIndex = nextIndex +1;
				v = temperatur[index] - temperatur[�berNextIndex];
				//System.out.println(temperatur[index]+" - "+temperatur[�berNextIndex]+" = "+v);
				//System.out.println("Min ist "+temperatur[�berNextIndex]);
				//System.out.println("Min ist "+temperatur[index]+" - "+temperatur[�berNextIndex]);
			}
			
			//System.out.println("Min ist "+temperatur[index]+" - "+temperatur[�berNextIndex]);
		}
		int calculatedIndex = nextIndex + 1;
		System.out.print(calculatedIndex+" (out of "+days+") indexes has beed calculated: ");
		if(temperatur[�berNextIndex]<temperatur[index]){
			System.out.println("Min ist "+temperatur[�berNextIndex]);
		} else {
			System.out.println("Min ist "+temperatur[index]);
		}
		System.out.println();
	}
	
	
	
	
	public double berechneDurchschnitt(){ //Durchschnitt berechnen
		for(index=0;index<=13;index++){
			summeTemp = summeTemp + temperatur[index];
		}
		durchschnitt = summeTemp/days;
		return durchschnitt;
	}
	
	
	
	
	public void berechneMaxTemp(){ //maximale Temperatur untersuchungen
		double u = 1;
		
		//THE MACHINE
		while(�berNextIndex<=13){
			nextIndex = index + 1;
			nextIndex = �berNextIndex;
			�berNextIndex = nextIndex+1;
				for(index=nextIndex;�berNextIndex<=13&&temperatur[nextIndex]-temperatur[�berNextIndex]>=0;�berNextIndex++){ //the machine
					while(u>=0){
						u = temperatur[index] - temperatur[�berNextIndex];
						//System.out.println("index ist "+index);
						//System.out.println("next index ist "+�berNextIndex);
						//System.out.println(temperatur[index]+" - "+temperatur[�berNextIndex]+" = "+u);
						//System.out.println();
						mehr = false;
						break;
					}
					//System.out.println("nextIndex: "+index);
					//System.out.println("�berNextIndex: "+�berNextIndex);
					//System.out.println("Das Maximuma ist "+temperatur[index]+" liegt im index "+nextIndex);
				}
				//System.out.println("bye");
		}
				
		//Das Maximum
		if(nextIndex==1){
			System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im "+nextIndex+"st index");
		} else {
			if(nextIndex==2){
				System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im "+nextIndex+"nd index");
			} else {
				if(nextIndex==3){
					System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im "+nextIndex+"nd index");
				} else {
					System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im "+nextIndex+"th index");
				}
			}
			
			}
		//System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im "+nextIndex+"th index");
		
		//already reach the end of table??
		System.out.println("calculated "+�berNextIndex+" indexes out of "+days+" indexes");
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
						//System.out.println("index ist "+index);
						//System.out.println("next index ist "+�berNextIndex);
						//System.out.println(temperatur[index]+" - "+temperatur[�berNextIndex]+" = "+u);
						//System.out.println();
						mehr = false;
						break;
					}
					//System.out.println("nextIndex: "+index);
					//System.out.println("�berNextIndex: "+�berNextIndex);
					//System.out.println("Das Maximuma ist "+temperatur[index]+" liegt im index "+nextIndex);
				}
				//System.out.println("bye");
		}
				
		//Das Maximum
		if(nextIndex==1){
			System.out.println("Das Maximum ist "+unterschied[nextIndex]+" liegt im "+nextIndex+"st index");
		} else {
			if(nextIndex==2){
				System.out.println("Das Maximum ist "+unterschied[nextIndex]+" liegt im "+nextIndex+"nd index");
			} else {
				if(nextIndex==3){
					System.out.println("Das Maximum ist "+unterschied[nextIndex]+" liegt im "+nextIndex+"nd index");
				} else {
					System.out.println("Das Maximum ist "+unterschied[nextIndex]+" liegt im "+nextIndex+"th index");
				}
			}
			
			}
		//System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im "+nextIndex+"th index");
		
		//already reach the end of table??
		System.out.println("calculated "+�berNextIndex+" indexes out of "+days+" indexes");
		System.out.println();
	}

}
