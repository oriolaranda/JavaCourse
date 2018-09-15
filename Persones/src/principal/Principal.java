package principal;

public class Principal {

	public static void main(String[] args) {
		Persona p= new Persona();
		
		p.nom="Lionel";
		p.cognom="Messi";
		p.telefon= 9371567;
		p.mostranom();
		p.mostracognom();
		p.mostratelefon();
		System.out.println();
		p.canvia("David", "Villa", 6201367);
		p.mostra();
	}
}
