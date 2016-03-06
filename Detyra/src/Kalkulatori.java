
public class Kalkulatori implements Dettyra{
	

	double qmimet[] = {3.2, 4.4, 3.6, 5.1};

	
	public int kalkuloNumriqmimeve() {
		return qmimet.length;
	}
	public double getShuma(){
		double shuma  = 0;
		
		for(int i = 0; i < qmimet.length; i++){
			 shuma = shuma + qmimet[i];
		}
		return shuma;
		
	}

}
