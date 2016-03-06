package detyrat;

public class Person {

		final int VITI = 2016;
		private String emri;
		private String mbiemri;
		private int vitiLindjes;
		
		public Person(){
			
		}
		
		public Person(String emri,String mbiemri,int vitiLindjes){
			this.emri = emri;
			this.mbiemri = mbiemri;
			this.vitiLindjes = vitiLindjes;
		}
		public String getEmri(){
			return this.emri;
		}
		public String getMbiemri(){
			return mbiemri;
		}
		public int getVitiLindjes(){
			return this.vitiLindjes;
		}
		
		public int getMosha(){
			return VITI - vitiLindjes;
		}

	}

	

