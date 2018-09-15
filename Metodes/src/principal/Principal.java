package principal;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		Random r = new Random ();
		int parells = 0;
		int senars =0;
		int[] numero = new int[10];
		for(int i = 0; i < 10; i++){
			numero[i]= r.nextInt(10);
		}
		for(int i = 0; i < 10;i ++){
			
			if(es_positiu(numero[i])==true){
				parells ++;
			}else{
				senars ++;
			}
		}
		System.out.println("Els números parells són: "+ parells);
		System.out.println("Els números senars són: "+ senars);
			
	}
	
	public static boolean es_positiu(int num){
		if(num% 2 == 0){
			return true;
		}else{
			return false;
		}
	}
}
