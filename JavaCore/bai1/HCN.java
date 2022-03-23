package bai1;

public class HCN {
	private double D, R;
	
	public HCN() {
		//hello
		
	}
	
	public HCN(double D,double R) {
		this.D = D;
		this.R = R;
	}
	
	public void setD(double D) {
		this.D = D;
	}
	
	public void setR(double R) {
		this.R = R;
	}
	
	public double getD() {
		return D;
	}
	
	public double getR() {
		return R;
	}
	
	public double Chuvi() {
		return 2 * (D + R);
	}
	
	public double Dientich() {
		return D * R;
	}
}
