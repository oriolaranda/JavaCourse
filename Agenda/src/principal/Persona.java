package principal;

public class Persona {
	
	private String nom ;
	private String cognom;
	private String telefon;

public void afegir_nom(String nom1){
	nom= nom1;
}

public void afegir_cognom(String cognom1){
	cognom= cognom1; 
}

public void afegir_telefon(String telefon1){
	telefon= telefon1;
}

public String obtenir_nom(){
	return nom;
}
public String obtenir_cognom(){
	return cognom;
}
public String obtenir_telefon(){
	return telefon;
}

}
