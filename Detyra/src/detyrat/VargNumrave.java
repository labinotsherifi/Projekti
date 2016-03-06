package detyrat;

public class VargNumrave {

	public static void main(String[] args) {
		
        int vargu[] = { 1, 1, 2, 1, 3, 2, 1, 3, 3, 3, 1, 2, 1, 1, 2, 2, 2, 3, 1, 1, 1};
	    int numri1 = 1;
	    int numri2 = 3;
		int numri = 2;
		
		int count = 0;
		int numruesi = 0;
		int counter = 0;
		for(int i = 0; i < vargu.length; i++){
			if(vargu[i] == numri){
				counter++;	
			}
			if(vargu[i] == numri1){
				numruesi++;
			}
			if(vargu[i] == numri2){
				count++;
			}
		} 
		System.out.println("Ne varg gjenden : " + counter + " 2-sha");
		System.out.println("Ne varg gjenden : " + numruesi + " 1-sha");
		System.out.println("Ne varg gjenden : " + count + " 3-sha");
	}

}

	


