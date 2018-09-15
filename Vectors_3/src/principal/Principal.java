package principal;

import java.util.Scanner;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introdueix nombres: ");
		int num=0;
		int[] mult=new int[1000];
		mult[num]= sc.nextInt();
		while (mult[num] != 0){
			if (mult[num] % 3 == 0){
				num ++;
				mult[num] = sc.nextInt();
			}else{
				mult[num] = sc.nextInt();
			}
			
		}
		System.out.println("Aquests són els múltiples de 3:");
		for(int i=0; i < num; i ++){
			System.out.print(mult[i]+", ");
		}
	}

}
