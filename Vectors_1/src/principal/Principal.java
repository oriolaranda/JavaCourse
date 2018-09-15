package principal;

import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int[] numero= new int[3];
		System.out.println("Introdueix numeros:");
		
		for(int i= 0; i < 3; i ++){
			numero[i]= sc.nextInt();
		
		}
		System.out.println(numero[0]+","+(numero[0]+ numero[1])+","+(numero[0]+ numero[1]+ numero[2]));
	}

}
