
public class Drejtekendeshi extends Figura {
	
	private int gjatesi;
	private int gjeresi;
	
	public Drejtekendeshi(){
		
	}
	public Drejtekendeshi(int gjatesi,int gjeresi){
		this.gjatesi = gjatesi;
		this.gjeresi = gjeresi;
	}
	
	public double kalkuloSyprina(){
		return gjatesi * gjeresi;
	}

}
