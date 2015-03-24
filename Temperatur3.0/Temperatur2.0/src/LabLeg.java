
public class LabLeg {
	int x,y;
	int[] xSpeicher = new int[1];
	
	public LabLeg(){
		
	}
		
	public void runX(){
		for(x=1;x<=14;x++){
			System.out.println(x);
			if(x==14){
				xSpeicher[0] = x;
				System.out.println("I love you "+xSpeicher[0]);
			}
		}
	}

}
