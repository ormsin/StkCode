
public class BerechneTemp {
	int days = 14; //Anzahl der Tage
	int index = days;
	int nextIndex;
	int j,čberNextIndex;
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
		čberNextIndex=1;
		for(index=0;nextIndex<days-1;nextIndex++){ //hier soll man while-Schlife benutzen
			u = temperatur[index] - temperatur[nextIndex];
			//System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
			if(u>0){
				//System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
				index = nextIndex;
				čberNextIndex = nextIndex +1;
				v = temperatur[index] - temperatur[čberNextIndex];
				//System.out.println(temperatur[index]+" - "+temperatur[čberNextIndex]+" = "+v);
				//System.out.println("Min ist "+temperatur[čberNextIndex]);
				//System.out.println("Min ist "+temperatur[index]+" - "+temperatur[čberNextIndex]);
			}
			
			//System.out.println("Min ist "+temperatur[index]+" - "+temperatur[čberNextIndex]);
		}
		int calculatedIndex = nextIndex + 1;
		System.out.print(calculatedIndex+" (out of "+days+") indexes has beed calculated: ");
		if(temperatur[čberNextIndex]<temperatur[index]){
			System.out.println("Min ist "+temperatur[čberNextIndex]);
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
		while(čberNextIndex<=13){
			nextIndex = index + 1;
			nextIndex = čberNextIndex;
			čberNextIndex = nextIndex+1;
				for(index=nextIndex;čberNextIndex<=13&&temperatur[nextIndex]-temperatur[čberNextIndex]>=0;čberNextIndex++){ //the machine
					while(u>=0){
						u = temperatur[index] - temperatur[čberNextIndex];
						//System.out.println("index ist "+index);
						//System.out.println("next index ist "+čberNextIndex);
						//System.out.println(temperatur[index]+" - "+temperatur[čberNextIndex]+" = "+u);
						//System.out.println();
						mehr = false;
						break;
					}
					//System.out.println("nextIndex: "+index);
					//System.out.println("čberNextIndex: "+čberNextIndex);
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
		System.out.println("calculated "+čberNextIndex+" indexes out of "+days+" indexes");
		System.out.println();
	}
	
	public void berechneMaxUnterschied(){ //maximale Temperatur untersuchungen
		double u = 1;
		
		//THE MACHINE
		while(čberNextIndex<=13){
			nextIndex = index + 1;
			nextIndex = čberNextIndex;
			čberNextIndex = nextIndex+1;
				for(index=nextIndex;čberNextIndex<=13&&unterschied[nextIndex]-unterschied[čberNextIndex]>=0;čberNextIndex++){ //the machine
					while(u>=0){
						u = unterschied[index] - unterschied[čberNextIndex];
						//System.out.println("index ist "+index);
						//System.out.println("next index ist "+čberNextIndex);
						//System.out.println(temperatur[index]+" - "+temperatur[čberNextIndex]+" = "+u);
						//System.out.println();
						mehr = false;
						break;
					}
					//System.out.println("nextIndex: "+index);
					//System.out.println("čberNextIndex: "+čberNextIndex);
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
		System.out.println("calculated "+čberNextIndex+" indexes out of "+days+" indexes");
		System.out.println();
	}

}
