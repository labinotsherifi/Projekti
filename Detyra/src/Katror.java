
public class Katror  extends Figura{

	
	private int gjatesia;
	
	public Katror(){
		
	}
	public Katror(int gjatesia){
		this.gjatesia = gjatesia;
	}
	
	public double kalkuloSyprina(){
		return Math.pow(this.gjatesia, 2);
	}
}


