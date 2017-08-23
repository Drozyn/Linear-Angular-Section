package section;

public class wciecieL {
	protected punkt punktA;
	protected punkt punktB;
	double d1;
	double d2;
	
	wciecieL(punkt punktA, punkt punktB, double d1, double d2){
		this.punktA = punktA;
		this.punktB = punktB;
		this.d1 = d1;
		this.d2 = d2;
	}
	
	punkt getWspPkt(punkt punktA, punkt punktB, double d1, double d2){
		punkt C = new punkt();
		Odl dAB = new Odl(punktA, punktB);
		double c = dAB.getOdl(punktA, punktB);
		double b = d1; //A-W
		double a = d2; //B-W
		double Ca, Cb, Cc,P, x, y;
		Ca = (-1)*(a*a)+(b*b)+(c*c);
		Cb = (a*a)-(b*b)+(c*c);
		Cc = (a*a)+(b*b)-(c*c);
		P = Math.sqrt((Ca*Cb)+(Ca*Cc)+(Cb*Cc));
		x = (punktB.getX()*Cb+punktB.getY()*P+punktA.getX()*Ca-punktA.getY()*P)/(Ca+Cb);
		y = ((-1)*punktA.getX()*P+punktA.getY()*Cb+punktB.getX()*P+punktB.getY()*Ca)/(Ca+Cb);
		C.setX(x);
		C.setY(y);
		return C;
	}
}

