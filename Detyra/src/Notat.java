
public class Notat {

	public static void main(String[] args) {
		char nota;
		nota = 'K';
		
		switch(nota) {
		case 'A':
			System.out.println(">= 90");
			break;
		case 'B':
			System.out.println(">= 80");
			break;
		case 'C':
			System.out.println(">= 70");
			break;
		case 'D':
			System.out.println(">= 60");
			break;
		case 'E':
			System.out.println(">= 50");
			break;
		default:
			System.out.println("Invalid testscore");
		}

	}

}
