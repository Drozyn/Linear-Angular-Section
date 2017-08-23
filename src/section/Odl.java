package section;

public class Odl {
	protected punkt P1;
	protected punkt P2;
	Odl(punkt P1, punkt P2){
		this.P1 = P1;
		this.P2 = P2;
	}
	double getOdl(punkt P1, punkt P2){
		double d;
		d = Math.sqrt(Math.pow(P2.getX()-P1.getX(), 2)+Math.pow(P2.getY()-P1.getY(), 2));
		return d;
	}
}
