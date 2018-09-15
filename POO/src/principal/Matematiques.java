package principal;

public class Matematiques {
	
	
	public int suma (int num_1, int num_2){
		int suma= num_1+num_2;
		return suma;
	}
	
	public int resta (int num_1, int num_2){
		int resta= num_1-num_2;
		return resta;
	}
	
	public int multiplicacio (int num_1, int num_2){
		int mult= num_1*num_2;
		return mult;
	}
	
	public float divisio (float num_1, float num_2){
		float divi= num_1 / num_2;
		return divi;
	}
	
	public int quadrat (int num_1){
		int quadr= num_1*num_1;
		return quadr;
	}
	
	public int potencia (int num_1, int num_2){
		int poten = num_1;
		for(int i=1; i < num_2; i ++){
			poten=poten*num_1;
		}
		return poten;
	}
	
	public int major (int num_1, int num_2){
		if (num_1>num_2){
			int max= num_1;
			return max;
		}else{
			int max= num_2;
			return max;
		}
	}
		
	public int menor (int num_1, int num_2){
		if (num_1<num_2){
				int min= num_1;
				return min;
		}else{
				int min= num_2;
				return min;
		}
			
	}
	
	public double[] equacions2 (int a, int b, int c){
		double[] eq2ngrau= new double[2];
		eq2ngrau[0] = (-b + Math.sqrt((b*b)-4*a*c))/2*a;
		eq2ngrau[1] = (-b - Math.sqrt((b*b)-4*a*c))/2*a;
		return eq2ngrau;
	}
	
	
	
}
