package principal;

import javax.swing.JPanel;
import javax.swing.UIManager;

/**
 * Joc 3^2 
 * Classe principal
 * @author Oriol Aranda & David Pujol & Sergi Del Rio
 * @version 1.0
 * 
 **/

public class Principal {

	public static void main(String[] args) {
		
		try {
			javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Frame F =new Frame();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
}

