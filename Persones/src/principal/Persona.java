package principal;

public class Persona {
	String nom;
	String cognom;
	int telefon;

	public void mostranom(){
		System.out.println("Nom: "+ nom);

	}
	
	public void mostracognom(){
		System.out.println("Cognom: "+ cognom);
			

	}
	
	public void mostratelefon(){
		System.out.println("Telèfon: "+ telefon);
			

	}
	public void canvia(String nom, String cognom, int telefon){
		this.nom=nom;
		this.cognom=cognom;
		this.telefon=telefon;
		
	}

	public void mostra(){
		System.out.println("Nom: "+nom);
		System.out.println("Cognom: "+cognom);
		System.out.println("Telèfon: "+telefon);
	}


}
