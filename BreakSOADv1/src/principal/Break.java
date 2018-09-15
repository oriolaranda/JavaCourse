package principal;

import java.util.Scanner;

/**
 * BreakCesar
 * Classe principal (Main)
 * @author Oriol Aranda & Sergi Del Rio
 * @version 1.0
 * 
 **/
public class Break {
	float[] freqcat = new float[26];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduir missatge xifrat: ");
		String xifrat = sc.nextLine();
		String desxifrat = desxifrar(xifrat);
		System.out.println("\n\n\n\n"+ desxifrat);
	}

	public static String desxifrar(String xifrat) {
		int llargada = 0;
		int[] lletres = new int [26];
		float[] percentatge = new float[26];
		
		for(int i=0;i<xifrat.length();i++){
			if(xifrat.charAt(i)!=32){
				llargada++;
				switch(xifrat.charAt(i)){
					case 65: lletres[0]++;
						break;
					case 66: lletres[1]++;
						break; 
					case 67: lletres[2]++;
						break;
					case 68: lletres[3]++;
						break;
					case 69: lletres[4]++;
						break;
					case 70: lletres[5]++;
						break;
					case 71: lletres[6]++;
						break;
					case 72: lletres[7]++;
						break;
					case 73: lletres[8]++;
						break;
					case 74: lletres[9]++;
						break;
					case 75: lletres[10]++;
						break;
					case 76: lletres[11]++;
						break;
					case 77: lletres[12]++;
						break;
					case 78: lletres[13]++;
						break;
					case 79: lletres[14]++;
						break;
					case 80: lletres[15]++;
						break;
					case 81: lletres[16]++;
						break;
					case 82: lletres[17]++;
						break;
					case 83: lletres[18]++;
						break;
					case 84: lletres[19]++;
						break;
					case 85: lletres[20]++;
						break;
					case 86: lletres[21]++;
						break;
					case 87: lletres[22]++;
						break;
					case 88: lletres[23]++;
						break;
					case 89: lletres[24]++;
						break;
					case 90: lletres[25]++;
						break;
				}
			}
		}
		
		for(int i=0; i<26;i++){
			percentatge[i]= (float)lletres[i]/llargada*100;
		}
			
		float maxim=0;
		int max=0;
		maxim= percentatge[0];
		for(int i=0; i<26;i++){
			if(maxim<percentatge[i]){
				maxim=percentatge[i];
				max=i;
			}
		}
		int delay =max-4;
		if(delay<0){
			delay+=25;
		}
		String text ="";
		char actual;
		for(int i=0; i<xifrat.length();i++){
			if(xifrat.charAt(i)!=32){
				actual=(char) (xifrat.charAt(i)-delay); //malament delay 
				if(actual<65){
					actual+=25;
				}
				text+= actual;
			}else{
				text+=" ";
			}
		}
		
		return text;
	}
	
	
	public void freq(){
		
		freqcat[0]= (float) 12.55;
		freqcat[1]= (float) 0;
		freqcat[2]= (float) 0;
		freqcat[3]= (float) 0;
		freqcat[4]= (float) 13.89;
		freqcat[5]= (float) 0;
		freqcat[6]= (float) 0;
		freqcat[7]= (float) 0;
		freqcat[8]= (float) 0;
		freqcat[9]= (float) 0;
		freqcat[10]= (float) 0;
		freqcat[11]= (float) 0;
		freqcat[12]= (float) 0;
		freqcat[13]= (float) 0;
		freqcat[14]= (float) 0;
		freqcat[15]= (float) 0;
		freqcat[16]= (float) 0;
		freqcat[17]= (float) 0;
		freqcat[18]= (float) 0;
		freqcat[19]= (float) 0;
		freqcat[20]= (float) 0;
		freqcat[21]= (float) 0;
		freqcat[22]= (float) 0;
		freqcat[23]= (float) 0;
		freqcat[24]= (float) 0;
		freqcat[25]= (float) 0;
	}
}
