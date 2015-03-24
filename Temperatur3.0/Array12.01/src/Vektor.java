
public class Vektor {
	double[] vektor;
	double a,b,c,x,y,z;
	int m,n;
	
	public void Vektor(){
		/*vektor[0]=x;
		vektor[1]=y;
		vektor[2]=z;*/
		vektor = new double[3];
	}
	
	public void konstruktor2(double[] vektor1) {
		vektor = vektor1;
	}
	
	public double getter(int i) {
		vektor[i] = i;
		return i;
	}
	
	public double setter(int i, double k) {
		vektor[i] = k;
		return k;
	}
	
	public Vektor hilfsvektor() {
		//vektor[m]=b;
		Vektor vektorX = new Vektor();
		return vektorX;
	}
	
	@Override
	public String toString(){
		return "("+vektor[0]+", "+vektor[1]+", "+vektor[2]+")";
	}
	
	public Vektor vektorAddition(double [] vektorAdd){
		vektorAdd + vektorAdd = hilfsvektor();//ruf mal hilfsvektor
		return;
	}
	
	public double analog() {
		return;
	}
	
	public double skalarproduktBerechne() {
		return;
	}
	
	
	

}
