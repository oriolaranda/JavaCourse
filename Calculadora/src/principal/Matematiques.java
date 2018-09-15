package principal;

import java.util.Scanner;

public class Matematiques {
	Scanner sc=new Scanner (System.in);

	public static void neteja(Matematiques mat){
		int salts=25;
		for(int i = 0; i < salts; i++){ 
			System.out.println(); 
		} 
	}
//SUMES
	protected void suma(){
		System.out.println("Introdueix dos nombres:");
		System.out.print("1r: ");
		float num1= sc.nextFloat();
		System.out.print("2n: ");
		float num2= sc.nextFloat();
		if (num1==(int) num1 && num2== (int) num2){
			int suma=(int) (num1+num2);
			System.out.println((int)num1+" + "+(int)num2+" = "+suma);
		}else{
			float suma1=num1+num2;
			System.out.println(num1 +" + "+ num2 +" = "+suma1);
		}
		
	}
	protected void suma_cientifica(){
		System.out.println("Introdueix dos nombres:");
		System.out.print("1r: ");
		double num1;
		num1= sc.nextDouble();
		System.out.print("2n: ");
		double num2= sc.nextDouble();
		if (num1==(long) num1 && num2== (long) num2){
			long suma=(long) (num1+num2);
			System.out.println("RESULTAT:");
			System.out.println((long)num1+" + "+(long)num2+" = "+suma);
		}else{
			double suma1=num1+num2;
			System.out.println(num1 +" + "+ num2 +" = "+suma1);
		}
	}
	
//RESTES
	protected void resta(){
		System.out.println("Introdueix dos nombres:");
		System.out.print("1r: ");
		float num1;
		num1= sc.nextFloat();
		System.out.print("2n: ");
		float num2= sc.nextFloat();
		float resta=num1-num2;
		System.out.println(num1+" - "+num2+" = "+resta);
	}
	
	protected void resta_cientifica(){
		System.out.println("Introdueix dos nombres:");
		System.out.print("1r: ");
		double num1;
		num1= sc.nextDouble();
		System.out.print("2n: ");
		double num2= sc.nextDouble();
		double resta=num1-num2;
		System.out.println(num1+" - "+num2+" = "+resta);
	}
	

//MULTIPLICACIONS
	protected void multiplicacio(){
		System.out.println("Introdueix dos nombres:");
		System.out.print("1r: ");
		double num1= sc.nextDouble();
		System.out.print("2n: ");
		double num2= sc.nextDouble();
		if (num1==(long) num1 && num2== (long) num2){
			long mult_1=(long) (num1*num2);
			System.out.println((long)num1+" * "+(long)num2+" = "+mult_1);
		}else{
			double mult=num1*num2;
			System.out.println(num1 +" * "+ num2 +" = "+mult);
		}
		
	}
	
//DIVISIÓ
	
	protected void divisio(){
		System.out.println("Introdueix dos nombres:");
		System.out.print("1r: ");
		double num1= sc.nextDouble();
		System.out.print("2n: ");
		double num2= sc.nextDouble();
		double divi=num1/num2;
		System.out.println(num1 +" / "+ num2 +" = "+divi);
		
	}
	
//FUNCIONS	
	public void funcions(){
		double pi=Math.PI;
		System.out.println(pi);
	}
	
//ARREL QUADRADA	
	public void arrelquadrada (){
		System.out.println("Introdueix un nombre:");
		System.out.print("1r: ");
		double num1= sc.nextDouble();
		double quadr=Math.sqrt(num1);
		if (num1== (long) num1){
			System.out.println("  ___");
			System.out.println("\\/"+ (long)num1+" = "+quadr);
		}else{
		System.out.println("  ___");
		System.out.println("\\/"+ num1+" = "+quadr);
		}
	}
	
//POTÈNCIA
	public void potencia (){
		
		System.out.println("Introdueix la base i l'exponent:");
		System.out.print("Base: ");
		float num1= sc.nextFloat();
		System.out.print("Exponent: ");
		int num2= sc.nextInt();
		
		if (num1== (int) num1){
			long poten1 = (long) Math.pow(num1,num2);
			System.out.println(((int)num1) +" ^ "+ num2 +" = "+ poten1);
		}else{
			double poten = Math.pow(num1,num2);
			System.out.println(num1 +" ^ "+ num2 +" = "+ poten);
		}
	}
	
//EQUACIÓ 2º	
	public void equacions2(){
		System.out.println("Introdueix 3 nombres(ax2/bx/c:");
		System.out.print("1r (ax2): ");
		float a= sc.nextFloat();
		System.out.print("2n (bx): ");
		int b= sc.nextInt();
		System.out.print("3r (c): ");
		int c= sc.nextInt();
		double[] eq2ngrau= new double[2];
		eq2ngrau[0] = (-b + Math.sqrt((b*b)-4*a*c))/2*a;
		eq2ngrau[1] = (-b - Math.sqrt((b*b)-4*a*c))/2*a;
		System.out.println(eq2ngrau[0]+" i "+ eq2ngrau[1]);
	}

	
	public void descomposicio_factorial(){
		System.out.println("Introdueix 1 nombre:");
		int num= sc.nextInt();
		int ans= 2;
		while(ans < num){
			if(num % ans == 0){
				System.out.println(num + " | " + ans);
				num= num/ans;
				ans=2;
			}else{
				for(int a=2; a<=num; a++){
					if(num % a == 0){
						System.out.println(num + " | " + a);
						num= num/a;
						ans=2;
						a=2;
					}
				}
			}
		}
		System.out.println("1" + " | ");	
			
		
	
	}
	
	
}
