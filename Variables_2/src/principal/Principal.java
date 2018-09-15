package principal;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		int numero1 = 43;
		int numero2 = 11;
		int numero3 = 34;
		
		if (numero1 > numero2 && numero1 > numero3){
			System.out.println("El numero mes gran es " + numero1);

	}else{
		if (numero2 > numero1 && numero2 > numero3){
			System.out.println("El numero mes gran es " + numero2);
		}else{
			if (numero3 > numero1 && numero3 > numero2){
				System.out.println("El numero mes gran es " + numero3);
			}
		}
	}

}}
