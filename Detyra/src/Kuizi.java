import java.util.Scanner;


public class Kuizi {

	public static void main(String[] args) {
		
		int teSakta = 0;
		int tePasakta = 0;
		int piket = 0; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cili eshte kontinenti me i madhe me sip ne bote?");
		
		String pergjigjja;
		
		pergjigjja = scanner.nextLine();
		
		if(pergjigjja.equalsIgnoreCase("Azia")){
			System.out.println("E Sakte");
			teSakta++;
			piket = piket + 10;
		}else{
			System.out.println("E pasakte");
			tePasakta++;
		}
		
		System.out.println("Cili eshte kontinenti me i varfer ne bote?");
		
		pergjigjja = scanner.nextLine();
		
		if(pergjigjja.equalsIgnoreCase("Afrika")){
			System.out.println("E sakte");
			teSakta++;
			piket += 10;
		}else{
			System.out.println("E Pasakte");
			tePasakta++;
		}
		System.out.println("Ne cilen kontinent gjenedet shteti i Brazilit?");
		
		pergjigjja = scanner.nextLine();
		
		if(pergjigjja.equalsIgnoreCase("Amerike Jugore")){
			System.out.println("E sakte");
			teSakta++;
			piket += 10;
		}else{
			System.out.println("E pasakte");
			tePasakta++;
		}
		System.out.println("Cila eshte maja me e larte e malit ne bote?");
		
		pergjigjja = scanner.nextLine();
		
		if(pergjigjja.equalsIgnoreCase("Mt Everest")){
			System.out.println("E sakte");
			teSakta++;
			piket += 10;
		}else{
			System.out.println("E pasakte");
			tePasakta++;
		}
		System.out.println("Cili eshte ishulli me i madh ne Europe?");
		
		pergjigjja = scanner.nextLine();
		
		if(pergjigjja.equalsIgnoreCase("Britania e Madhe")){
			System.out.println("E sakte");
			teSakta++;
			piket += 10;
		}else{
			System.out.println("E pasakte");
			tePasakta++;
		}
		System.out.println("Cili eshte shteti me i madh per nga numri i banoreve? ");
		
		 pergjigjja = scanner.nextLine();
		 
		 if(pergjigjja.equalsIgnoreCase("Kina")){
				System.out.println("E sakte");
				teSakta++;
				piket += 10;
			}else{
				System.out.println("E pasakte");
				tePasakta++;
		 }
		 System.out.println("Cili eshte shteti me i madh per nnga siperfaqja ne bote?");
		 
         pergjigjja = scanner.nextLine();
		 
		 if(pergjigjja.equalsIgnoreCase("Rusia")){
				System.out.println("E sakte");
				teSakta++;
				piket += 10;
			}else{
				System.out.println("E pasakte");
				tePasakta++;
			}
			System.out.println("Ne cilen pjese te Europes gjendet Norvegjia?");
			
			pergjigjja = scanner.nextLine();
			
			if(pergjigjja.equalsIgnoreCase("Ne pjesen veriore")){

				System.out.println("E sakte");
			    teSakta++;
			    piket += 10;
			}else{
				System.out.println("E pasakte");
				tePasakta++;
			}
			System.out.println("Ne cilin gadishull te Europes gjendet Spanja?");
			
			pergjigjja = scanner.nextLine();
			
			if(pergjigjja.equalsIgnoreCase("Gadishullin Pirinej")){
				System.out.println("E sakte");
				teSakta++;
				piket += 10;
			}else{
				System.out.println("E pasakte");
				tePasakta++;
			}
			System.out.println("Cila eshte gjuha zyrtare ne Brazil?");
			
            pergjigjja = scanner.nextLine();
			
			if(pergjigjja.equalsIgnoreCase("Portugalishtja")){
				System.out.println("E sakte");
				teSakta++;
				piket += 10;
			}else{
				System.out.println("E pasakte");
				tePasakta++;
			}
			
		
		System.out.println("Kuizi mbaroi!");
		System.out.println("Te sakta: " + teSakta);
		System.out.println("Te pasakta: " + tePasakta);
        System.out.println("gjithsej piket : " +piket);

        scanner.close();
	}

}
