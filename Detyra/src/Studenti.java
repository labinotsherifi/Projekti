
public class Studenti extends Person {
	
	String nrIndexit;
	
	public Studenti(){
		
	}
	public Studenti(String emri,String adresa,String nrIndexit){
		super(emri,adresa);
		this.nrIndexit = nrIndexit;
	}
	public String getNrIndexit(){
		return this.nrIndexit;
	}

}
