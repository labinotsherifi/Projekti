
public class Programi {

	public static void main(String[] args) {
		
		Studenti[] studentat = new Studenti[4];
		
		Studenti studenti = new Studenti("Murat", "Prishtine", "12");
		studentat[0]  = studenti;
		
		Studenti studenti1 = new Studenti("Alper","Gjilan","22");
		studentat[1] = studenti1;
		
		Studenti studenti2  = new Studenti("Gokhan","Gjakove","15");
		studentat[2] = studenti2;
		
		Studenti studenti3  = new Studenti("Strefi", "Ferizaj","10");
		studentat[3] = studenti3;
		
		for(int i = 0; i < studentat.length; i++){
			
			Studenti student = studentat[i];
			
			System.out.println("emri:" + student.getEmri());
			System.out.println("Adresa:" + student.getAdresa());
			System.out.println("Nr indexit: "+ student.getNrIndexit());
		}   
		
		
		
	
		
		

	}

}
