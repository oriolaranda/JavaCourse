package principal;

import java.util.Random;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r = new Random ();
		int [] contador= new int[10];
		int [] numero= new int[100];
		for(int i = 0; i <100 ; i ++){
			numero [i]= r.nextInt(10);
			contador[numero[i]] ++;
			
		}
		for(int a = 0; a <10; a ++){
			System.out.println("numero de "+ a +" "+ contador[a]);
		}
		
		
		
			
		
		

	}

}
