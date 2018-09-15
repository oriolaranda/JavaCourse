package principal;

import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero < 10){
			System.out.println("El numero es menor a 10");
		}else{
			if (numero == 10){
				System.out.println("El numero es igual a 10");
			}else{
				System.out.println("El numero es major a 10");
			}
		}

	}

}
