package principal;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random r= new Random ();
		Scanner sc = new Scanner (System.in);
		int[][] numeros = new int[4][4];
		for(int i = 0; i < 4; i ++){
			for(int j = 0; j < 4; j++){
				numeros[i][j]= r.nextInt(10);
			}
		}
		mostra(numeros);
		System.out.println("Introdueix dos números:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		intercanvia (numeros, num1, num2);
		mostra(numeros);

	}
	public static void mostra(int [][] numeros){
		for(int i = 0; i < 4; i ++){
			for(int j = 0; j < 4; j++){
				System.out.print(numeros[i][j]);
			}
			System.out.println();
		}
		
	}
	public static int[][] intercanvia (int [][] numeros, int num1, int num2){
		int[] fila = new int[4];
		if(num1 > 4 && num2 > 4){
			System.out.println("T'has sortit del vector");
		}else{
			for (int y=0; y < num1; y++){
				for(int i = 0; i < num1; i ++){
					for(int j = 0; j < 4; j++){
					}
				}
			
			
		}
		}
		return numeros;
	}
}
