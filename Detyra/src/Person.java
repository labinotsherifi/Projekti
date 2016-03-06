
public class Person {

	String emri;
    String adresa;
	
	public Person(){
		
	}
	public Person(String emri,String adresa){
		this.emri = emri;
		this.adresa = adresa;
	}
	
	public String getEmri(){
		return this.emri;
	}
	public String getAdresa(){
		return this.adresa;
	}
}
