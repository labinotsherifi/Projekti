
public class tempe {

	public static void main(String[] args) {
		int temperatura = 21;
		boolean reshje = true;
		
		if(temperatura == 21 && reshje) {
			System.out.println("Moti i nxeht me reshje ");
		}else if(temperatura < 21 && reshje ) {
			System.out.println("Moti i ftoht me reshje ");	
		}else if(temperatura == 21 && !reshje) {
			System.out.println("Moti i nxeht pa reshje ");
		}else if(temperatura < 21 && !reshje) {
			System.out.println("Moti i ftoft pa reshje ");
		}

	}

}
