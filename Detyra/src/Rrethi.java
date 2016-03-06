
public class Rrethi extends Figura {

	
	private int rad;
	
	public Rrethi(){
		
	}
	
	public Rrethi(int rad){
		this.rad = rad;
	}
	
	public double kalkuloSyprina(){
		return Math.PI * Math.pow(this.rad, 2);
	}
}
