
public class ProgramTest {

	public static void main(String[] args) {
		
		Rrethi rrethi = new Rrethi(3);
		
		Katror katror = new Katror(4);
		
		Drejtekendeshi drejt = new Drejtekendeshi(3,5);
		
		System.out.println("Syprina e rrethit: " + rrethi.kalkuloSyprina());
		System.out.println("Syprina e katrorit: " + katror.kalkuloSyprina());
		System.out.println("syprina e drejtkendeshit: " + drejt.kalkuloSyprina());

	}

}
