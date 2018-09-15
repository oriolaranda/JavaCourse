package principal;

import java.util.Scanner;
public class Agenda {
	
	Persona[] matriu = new Persona[10];
	int j = 0;
	
	public void afegir (Persona p) {
	
		matriu[j]=p;
		j++;
	}

	public void mostra () {
		System.out.println("_____AGENDA TELEFÒNICA_____");
		System.out.println();
		for(int y=0; y<j; y++){
			System.out.println("Nom: "+ matriu[y].obtenir_nom());
			System.out.println("Cognom: "+matriu[y].obtenir_cognom());
			System.out.println("Telefon: "+matriu[y].obtenir_telefon());
			System.out.println();
		}
		
	}
	
	public void elimina () {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix el contacte per borrar:");
		String compara_nom = sc.nextLine().toLowerCase();
		String compara_nom1= compara_nom.substring(0,1).toUpperCase()+ compara_nom.substring(1,compara_nom.length());
		for (int i = 0;i<j;i++){
			if(matriu[i].obtenir_nom().equals(compara_nom1)|| matriu[i].obtenir_cognom().equals(compara_nom1)){
				matriu[i] = null;
				j--;
				a--;
				System.out.println("S'ha borrat el contacte:" + compara_nom1);
			}else{
				a++;
			}			
		}
		if(a ==j){
			System.out.println("No s'ha trobat el contacte: " + compara_nom1);
			
		}
		for (int s=0; s<j+1; s++){
			if (matriu[s]== null){
				matriu[s]=matriu[s+1];
				matriu[s+1]=null;
			}
		}
		System.out.println();
	}


}
