
public class BerechneTemp {
	int days=14;
	int index=days+1,i,j,nextIndex=2,ŸberNextIndex;
	double t,durchschnitt,temp,m,savedTemp,diff;
	double[] temperatur = new double[index];
	double[] tempspeicher = new double[1];
	boolean mehr = true, reach = false;

	int speicherIndex;

	
	public BerechneTemp(){
		temperatur = new double[] {0,12,10,9,12,15,16,15,15,15,19,15,23,21,22};
		for(index=0;index<=15;index++){
			for(i=0;i<=14;i++){
				if(i>0){
				if(i==index){
			System.out.println("Tag "+index+" Temperatur ist "+temperatur[i]);}}
			}
		}
		
	}
	
	public double berechneDurchschnittTemp(){
		for(index=0;index<=15;index++){
			for(i=0;i<14;i++){
				if(i>0){
					if(i==index){
						t = t+temperatur[i];
					}
				}
			}
		}
		durchschnitt = t/days;
		return durchschnitt;
	}
	
	public void serialEfficientTest(){
		temperatur = new double[] {0,12,14,9,12,15,15,15,15,11,8,13,13,15,12};
		for(index=0;index<15;index++){
			System.out.println(temperatur[index]);
		}
	}
	
	public void shortListArray(){
		
	}
	
	/*public double speicher(){
		BerechneTemp tempSpeicher = new BerechneTemp();
		for(speicherIndex=0;speicherIndex<=index;speicherIndex++){
			double[] tempSpeicher(speicherIndex) = savedTemp;
		}
		return savedTemp;
	}
	
	public double getSavedTemp(){
		return t;
	}
	
	public void setSavedTemp(){
		
	}*/
	
	public void berechneMaxTemp(){
		int p=1;
		double u,v;
		int countNumber = 1;
		
		for(index=1;index<14;index++){
			u = temperatur[p] - temperatur[index+1];
			System.out.println(u);
			if(u<0){
				while(u>0){
				u = temperatur[index] - temperatur[index+countNumber];
				System.out.println(temperatur[index]);
				countNumber++;
				}
			}
				/*double m = temperatur[index];
				double n = temperatur[index+1];
				if(m>n){
					System.out.println(m);
				}*/
		}
		//return m;
	}
	
	public void berechneMaxTempX1(){
		while(ŸberNextIndex!=index){
		double u=1;
		
		for(index=1;temperatur[index]-temperatur[nextIndex]>=0;nextIndex++){
			while(u>=0){
			u = temperatur[index] - temperatur[nextIndex];
			System.out.println("index ist "+index);
			System.out.println("next index ist "+nextIndex);
			System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
			//System.out.println(u);
			System.out.println();
			mehr =false;
			break;
			}
			System.out.println(index);
			System.out.println(nextIndex);
		}
		//the yeah
		System.out.println();
		ŸberNextIndex = nextIndex+1;
		System.out.println(nextIndex);
		System.out.println(ŸberNextIndex);
		System.out.println(temperatur[5]-temperatur[6]);
		System.out.println();
		
		if(temperatur[nextIndex]-temperatur[ŸberNextIndex]<0){
			nextIndex = nextIndex + 1;
			ŸberNextIndex = nextIndex+1;
		}

		for(nextIndex=nextIndex;temperatur[nextIndex]-temperatur[ŸberNextIndex]>=0;ŸberNextIndex++){
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println("index ist "+nextIndex);
				System.out.println("next index ist "+ŸberNextIndex);
				System.out.println(temperatur[nextIndex]+" - "+temperatur[ŸberNextIndex]+" = "+u);
				//System.out.println(u);
				System.out.println();
				mehr =false;
				break;
				}
				System.out.println(nextIndex);
				System.out.println(ŸberNextIndex);
		}
		//the yeah
		
		//Der Meister
		System.out.println("Der Meister ist "+temperatur[ŸberNextIndex]);
		
		
		/*
		for(index=nextIndex;ŸberNextIndex<=14-nextIndex;ŸberNextIndex++){
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println(nextIndex);
				System.out.println(temperatur[ŸberNextIndex]);
				System.out.println(u);
				System.out.println();
				mehr =false;
				break;
				}
		}*/
		}
		
	}
	
	public void berechneMaxTempX2i(){
		double u=1;
		
		for(index=1;temperatur[index]-temperatur[nextIndex]>=0;nextIndex++){
			while(u>=0){
			u = temperatur[index] - temperatur[nextIndex];
			System.out.println("index ist "+index);
			System.out.println("next index ist "+nextIndex);
			System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
			//System.out.println(u);
			System.out.println();
			mehr =false;
			break;
			}
			System.out.println(index);
			System.out.println(nextIndex);
		}
		//the yeah
		System.out.println();
		ŸberNextIndex = nextIndex+1;
		System.out.println(nextIndex);
		System.out.println(ŸberNextIndex);
		System.out.println(temperatur[5]-temperatur[6]);
		System.out.println();
		
		if(temperatur[nextIndex]-temperatur[nextIndex+1]<0){
			nextIndex = nextIndex + 1;
		}

		for(nextIndex=nextIndex;temperatur[nextIndex]-temperatur[ŸberNextIndex]>=0;ŸberNextIndex++){
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println("index ist "+nextIndex);
				System.out.println("next index ist "+ŸberNextIndex);
				System.out.println(temperatur[nextIndex]+" - "+temperatur[ŸberNextIndex]+" = "+u);
				//System.out.println(u);
				System.out.println();
				mehr =false;
				break;
				}
				System.out.println(nextIndex);
				System.out.println(ŸberNextIndex);
		}
		//the yeah
		
		//Der Meister
		System.out.println("Der Meister ist "+temperatur[ŸberNextIndex]);
		
		
		/*
		for(index=nextIndex;ŸberNextIndex<=14-nextIndex;ŸberNextIndex++){
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println(nextIndex);
				System.out.println(temperatur[ŸberNextIndex]);
				System.out.println(u);
				System.out.println();
				mehr =false;
				break;
				}
		}*/
		
	}
	
	//////////////////////////////////////////////////////////////////////////// THE FINAL MAX METHOD /////////////////////////////////////////////////////////////////
	
	public void berechneMaxTempX2(){
		double u=1;
		
		for(index=1;temperatur[index]-temperatur[nextIndex]>=0;nextIndex++){ //first machine, first run
			
			while(u>=0){
			u = temperatur[index] - temperatur[nextIndex];
			System.out.println("index ist "+index);
			System.out.println("next index ist "+nextIndex);
			System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
			//System.out.println(u);
			System.out.println();
			mehr =false;
			break;
			}
			
			System.out.println("run at element "+index);
			System.out.println("reach at "+nextIndex);
		} //end of the first machine
		/*
		//the yeah begins
		System.out.println();
		ŸberNextIndex = nextIndex+1;
		System.out.println(nextIndex);
		System.out.println(ŸberNextIndex);
		System.out.println(temperatur[5]-temperatur[6]);
		System.out.println();
		
		if(temperatur[nextIndex]-temperatur[ŸberNextIndex]<0){
			nextIndex = nextIndex + 1;
			ŸberNextIndex = nextIndex+1;
		}

		for(nextIndex=nextIndex;temperatur[nextIndex]-temperatur[ŸberNextIndex]>=0;ŸberNextIndex++){
			
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println("index ist "+nextIndex);
				System.out.println("next index ist "+ŸberNextIndex);
				System.out.println(temperatur[nextIndex]+" - "+temperatur[ŸberNextIndex]+" = "+u);
				//System.out.println(u);
				System.out.println();
				mehr =false;
				break;
			}
				System.out.println(nextIndex);
				System.out.println(ŸberNextIndex);
		}
		
		//Der Meister
		System.out.println("Der Meister ist "+temperatur[ŸberNextIndex]);
		//the yeah end
		
		System.out.println(nextIndex);
		System.out.println(ŸberNextIndex);
		System.out.println("i love you");
		System.out.println();*/
		
		//the yeah begins, to be THE MACHINE
		while(nextIndex<=14){
			
		nextIndex = ŸberNextIndex;
		ŸberNextIndex = nextIndex+1;
		System.out.println("next index ist "+nextIndex);
		System.out.println("nach dem index ist "+ŸberNextIndex);
		System.out.println();
				
		if(temperatur[nextIndex]-temperatur[ŸberNextIndex]<0){
			nextIndex = nextIndex + 1;
			ŸberNextIndex = nextIndex+1;
		}

		for(nextIndex=nextIndex;temperatur[nextIndex]-temperatur[ŸberNextIndex]>=0;ŸberNextIndex++){ //the machine
					
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println("index ist "+nextIndex);
				System.out.println("next index ist "+ŸberNextIndex);
				System.out.println(temperatur[nextIndex]+" - "+temperatur[ŸberNextIndex]+" = "+u);
				//System.out.println(u);
				System.out.println();
				mehr = false;
				break;
			}
			System.out.println("nextIndex: "+nextIndex);
			System.out.println("ŸberNextIndex: "+ŸberNextIndex);
			System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im index "+nextIndex);
		}
		
		}//the yeah end (THE MACHINE)
				
		//Das Maximum
		System.out.println();
		System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im index "+nextIndex);
		
		//already reach the end of table??
		//System.out.println("last considered index is "+ŸberNextIndex+" out of "+days+" indexes");
		
	}
	
	//////////////////////////////////////////////////////////////////////////// END OF THE FINAL MAX METHOD /////////////////////////////////////////////////////////////////
		
	public void berechneMaxTempX2temp(){
		double u=1;
		
		for(index=1;temperatur[index]-temperatur[nextIndex]>=0;nextIndex++){ //first machine, first run
			
			while(u>=0){
			u = temperatur[index] - temperatur[nextIndex];
			System.out.println("index ist "+index);
			System.out.println("next index ist "+nextIndex);
			System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
			//System.out.println(u);
			System.out.println();
			mehr =false;
			break;
			}
			
			System.out.println("run at element "+index);
			System.out.println("reach at "+nextIndex);
		} //end of the first machine
		
		//the yeah begins
		System.out.println();
		ŸberNextIndex = nextIndex+1;
		System.out.println(nextIndex);
		System.out.println(ŸberNextIndex);
		System.out.println(temperatur[5]-temperatur[6]);
		System.out.println();
		
		if(temperatur[nextIndex]-temperatur[ŸberNextIndex]<0){
			nextIndex = nextIndex + 1;
			ŸberNextIndex = nextIndex+1;
		}

		for(nextIndex=nextIndex;temperatur[nextIndex]-temperatur[ŸberNextIndex]>=0;ŸberNextIndex++){
			
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println("index ist "+nextIndex);
				System.out.println("next index ist "+ŸberNextIndex);
				System.out.println(temperatur[nextIndex]+" - "+temperatur[ŸberNextIndex]+" = "+u);
				//System.out.println(u);
				System.out.println();
				mehr =false;
				break;
			}
				System.out.println(nextIndex);
				System.out.println(ŸberNextIndex);
		}
		
		//Der Meister
		System.out.println("Der Meister ist "+temperatur[ŸberNextIndex]);
		//the yeah end
		
		System.out.println(nextIndex);
		System.out.println(ŸberNextIndex);
		System.out.println("i love you");
		System.out.println();
		
		//the yeah begins, to be THE MACHINE
		nextIndex = ŸberNextIndex;
		ŸberNextIndex = nextIndex+1;
		System.out.println("next index ist "+nextIndex);
		System.out.println("nach dem index ist "+ŸberNextIndex);
		System.out.println();
				
		if(temperatur[nextIndex]-temperatur[ŸberNextIndex]<0){
			nextIndex = nextIndex + 1;
			ŸberNextIndex = nextIndex+1;
		}

		for(nextIndex=nextIndex;temperatur[nextIndex]-temperatur[ŸberNextIndex]>=0;ŸberNextIndex++){ //the machine
					
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println("index ist "+nextIndex);
				System.out.println("next index ist "+ŸberNextIndex);
				System.out.println(temperatur[nextIndex]+" - "+temperatur[ŸberNextIndex]+" = "+u);
				//System.out.println(u);
				System.out.println();
				mehr =false;
				break;
			}
			System.out.println("nextIndex: "+nextIndex);
			System.out.println("ŸberNextIndex: "+ŸberNextIndex);
			ŸberNextIndex = ŸberNextIndex + 1;
			System.out.println("ŸberNextIndex: "+ŸberNextIndex);			
		}//the yeah end (THE MACHINE)
				
		//Das Maximum
		System.out.println();
		System.out.println("Das Maximum ist "+temperatur[nextIndex]+" liegt im index "+nextIndex);
		
		//already reach the end of table??
		//System.out.println("last considered index is "+ŸberNextIndex+" out of "+days+" indexes");
		
	}
	
	public void berechneMaxTempXf(){
		double u=1;
		
		for(index=1;temperatur[index]-temperatur[nextIndex]>=0;nextIndex++){
			while(u>=0){
			u = temperatur[index] - temperatur[nextIndex];
			System.out.println("index ist "+index);
			System.out.println("next index ist "+nextIndex);
			System.out.println(temperatur[index]+" - "+temperatur[nextIndex]+" = "+u);
			//System.out.println(u);
			System.out.println();
			mehr =false;
			break;
			}
			System.out.println(index);
			System.out.println(nextIndex);
		}
		
		System.out.println(nextIndex);
		/*
		for(index=nextIndex;ŸberNextIndex<=14-nextIndex;ŸberNextIndex++){
			while(u>=0){
				u = temperatur[nextIndex] - temperatur[ŸberNextIndex];
				System.out.println(nextIndex);
				System.out.println(temperatur[ŸberNextIndex]);
				System.out.println(u);
				System.out.println();
				mehr =false;
				break;
				}
		}*/
		
	}
	
	
	
	
	public void berechneMaxTempX1i(){
		double u;
		for(index=1;index<=15;index++){
			u = temperatur[index] - temperatur[index+1];
			System.out.println(u);
		}
	}
	
	public void berechneMaxTemp2(){
		int p=1;
		double u,v;
		int countNumber = 1;
		
		//u = temperatur[p] - temperatur[index+1];
		//temperatur[index+1] = temperatur[j];

		for(index=1;index<14;index++){
			u = temperatur[p] - temperatur[index+1];
			System.out.println(u);
			if(u<0){
				//v = temperatur[index+1] - temperatur[index+countNumber];
				System.out.println(temperatur[index+1]);
				temperatur[index+1] = temperatur[j];
				System.out.println(temperatur[j]);
				//System.out.println(index+1);
				//System.out.println(index);
				//index = j;
				//System.out.println(j);
			}
				/*double m = temperatur[index];
				double n = temperatur[index+1];
				if(m>n){
					System.out.println(m);
				}*/
		}
		//return m;
	}
	
	public void berechneMaxTemp3(){
		double u,v;
		
		//u = temperatur[p] - temperatur[index+1];
		//temperatur[index+1] = temperatur[j];

		for(index=1;index<14;index++){
			u = temperatur[1] - temperatur[index+1];
			//System.out.println(u);
			if(u<0){
				mehr = true;
				//System.out.println(temperatur[index+1]);
				//System.out.println(index);
				break;
			}
			System.out.println("la");
		}
		System.out.println("end section 1");
		//index = index + 1;
		//System.out.println(index);
		
		//while(temperatur[index]<temperatur[14]){
		//if index!=14 (days) then continue
		
		
			System.out.println(index);
			for(index=index+1;index<14;index++){
				u = temperatur[index] - temperatur[index+1];
				if(u<0){
					mehr = true;
					System.out.println("Differenz ist "+u);
					System.out.println("vorherige Nummer ist "+temperatur[index]);
					System.out.println(temperatur[index+1]);
					System.out.println("Die liegt im Ziffer "+index);
					break;
				}
				
				System.out.println("ba");
			}
				
		while(index!=days){
		System.out.println(index);
		for(index=index+1;index<14;index++){
			u = temperatur[index] - temperatur[index+1];
			if(u<0){
				mehr = true;
				System.out.println("Differenz ist "+u);
				System.out.println("vorherige Nummer ist "+temperatur[index]);
				System.out.println(temperatur[index+1]);
				System.out.println("Die liegt im Ziffer "+index);
				break;
			}
			
			System.out.println("ba");
		}
		}
		
		
		
		System.out.println("end section 2");
		//return m;
	}
	
	public void berechneMaxTemp4(){
		double u,v;
		
		int punktM = days/3;
		int punktN = (2*days)/3;

		for(index=1;index<=punktN;index++){
			u = temperatur[1] - temperatur[index+1];
			//System.out.println(u);
			if(u<0){
				mehr = true;
				System.out.println("Differenz ist "+u);
				System.out.println("vorherige Nummer ist "+temperatur[index]);
				System.out.println(temperatur[index+1]);
				System.out.println("Die liegt im Ziffer "+index);
				break;
			}
			System.out.println("la");
		}
		
		System.out.println();
		
		while(index!=days){
			System.out.println(index);
			for(index=index+1;index<=punktN;index++){
				u = temperatur[index] - temperatur[index+3];
				if(u<0){
					if(temperatur[index]>temperatur[index+3]){
					mehr = true;
					System.out.println("Differenz ist "+u);
					System.out.println("vorherige Nummer ist "+temperatur[index]);
					System.out.println(temperatur[index+1]);
					System.out.println("Die liegt im Ziffer "+index);
					break;}
				}
				
				System.out.println("ba");
			}
			}
		
		System.out.println("Temperatur von Section 1: "+temperatur[index]);
		System.out.println("end section 1");
		System.out.println();
		//index = index + 1;
		//System.out.println(index);
	
		for(index=days;index>=punktM;index--){
			u = temperatur[index] - temperatur[index-1];
			if(u<0){
				mehr = true;
				System.out.println("Differenz ist "+u);
				System.out.println("vorherige Nummer ist "+temperatur[index]);
				System.out.println(temperatur[index-1]);
				System.out.println("Die liegt im Ziffer "+index);
				break;
			}
			
			//System.out.println("ba");
		}
		
		System.out.println();
		
		while(index!=1){
			System.out.println(index);
			for(index=index-1;index>=punktM;index--){
				u = temperatur[index] - temperatur[index-1];
				if(u<0){
					mehr = true;
					System.out.println("Differenz ist "+u);
					System.out.println("vorherige Nummer ist "+temperatur[index]);
					System.out.println(temperatur[index-1]);
					System.out.println("Die liegt im Ziffer "+index);
					break;
				}
				
				//System.out.println("ba");
			}
			}
		System.out.println("Temperatur von Section 2: "+temperatur[index]);
		System.out.println("end section 2");
		//return m;
	}

}
