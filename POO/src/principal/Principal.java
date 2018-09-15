package principal;

public class Principal {


	public static void main(String[] args) {
		
	Matematiques mat = new Matematiques();
	int suma=mat.suma(8,7);
	System.out.println(suma);
	
	int resta=mat.resta(8,7);
	System.out.println(resta);
	
	int multi=mat.multiplicacio(8,7);
	System.out.println(multi);
	
	float divis=mat.divisio(8,7);
	System.out.println(divis);
	
	int quad=mat.quadrat(4);
	System.out.println(quad);
	
	int pot=mat.potencia(3,4);
	System.out.println(pot);
	
	int max=mat.major(3,4);
	System.out.println(max);
	
	int min=mat.menor(3,4);
	System.out.println(min);
	
	double[] eq2ngrau = new double[2];
	eq2ngrau = mat.equacions2(-16, 8, 5);
	System.out.println(eq2ngrau[0]+" "+eq2ngrau[1]);
	
	
	}

}
