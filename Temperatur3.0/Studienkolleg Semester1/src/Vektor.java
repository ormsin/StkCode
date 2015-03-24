//import java.util.Vector;

public class Vektor { //erstellen eine neue Klasse Vektor
	double x,y,z,r,g,h,i; //drei Attribute x,y,z, die double als Datentyp haben.
	
	public Vektor(double xx, double yy, double zz) { //Konstruktor
		x = xx;
		y = yy;
		z = zz;
	}
	
	public double getX() { //getX
		return x;
	}
	
	public double getY() { //getY
		return y;
	}
	
	public double getZ() { //getZ
		return z;
	}
	
	public void setX(double xn) { //SetX
		x = xn;
	}
	
	public void setY(double yn) { //SetY
		y = yn;
	}
	
	public void setZ(double zn) { //SetZ
		z = zn;
	}
	
	@Override
	public String toString() {
		return "("+x+ ", "+y+", "+z+")";
	}
	
	public Vektor Addition(Vektor b) { //Addition zweier Vektoren
		Vektor ergebnis = new Vektor(0,0,0);
		ergebnis.setX(x+b.getX());
		ergebnis.setY(y+b.getY());
		ergebnis.setZ(z+b.getZ());
		return ergebnis;
	}
	
	public void Ausdruck() {
		System.out.println(x);
	}
	
	
	public Vektor multiplizieren(double ii) { //Multiplikation eines Vektors mit einem Skalar
		i = ii;
		Vektor ergebnis = new Vektor(x,y,z);
		ergebnis.setX(x*i);
		ergebnis.setY(y*i);
		ergebnis.setZ(z*i);
		return ergebnis;
	}
	
	public double multiplikation(double nx, double ny, double nz) { //Skalarprodukt zweier Vektoren
		double mx = x*nx;
		double my = y*ny;
		double mz = z*nz;
		double mg;
		mg = mx + my +mz;
		return mg;
	}

}
