package principal;

import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introdueix un nombre:");
		int num= sc.nextInt();
		int[] numero = new int[num];
		for ( int i = 0; i < num; i ++){
			numero[i]= sc.nextInt();
		}
		for (int i = 0; i < num; num --){
			System.out.print(numero[num-1]+ ", ");	
			
		}
		
	}

}
