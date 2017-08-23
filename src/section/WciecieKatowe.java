package section;

public class WciecieKatowe {
	protected punkt P1;
	protected punkt P2;
	double katp;
	double katl;
	
	WciecieKatowe(punkt P1, punkt P2, double katp, double katl) {
		this.P1 = P1;
		this.P2 = P2;
		this.katp = katp;
		this.katl = katl;
	}
	
	punkt getWciecie(punkt punkt11, punkt punkt22, double katp, double katl){
		punkt P3 = new punkt();
		P3.setX(((punkt11.getX()*(1/Math.tan(Math.PI * katl / 200)))+punkt11.getY()+(punkt22.getX()*(1/Math.tan(Math.PI * katp / 200)))-punkt22.getY())/((1/Math.tan(Math.PI * katp / 200))+(1/Math.tan(Math.PI * katl / 200))));;
		P3.setY(((-1*punkt11.getX())+(punkt11.getY()*(1/Math.tan(Math.PI * katl / 200)))+punkt22.getX()+(punkt22.getY()*(1/Math.tan(Math.PI * katp / 200))))/((1/Math.tan(Math.PI * katp / 200))+(1/Math.tan(Math.PI * katl / 200))));
		return P3;
	}
}