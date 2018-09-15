package principal;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Criptosistema SOAD 
 * Classe principal (Main)
 * @author Oriol Aranda & Sergi Del Rio
 * @version 1.3
 * 
 **/

public class Principal {

	public static void main(String[] args) {
		
		try {
			javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Window w = new Window();
			w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			w.setVisible(true);
			w.setBounds(200, 200, 460, 305);
			w.setResizable(false);
			w.setTitle("SOAD");
			w.setLocationRelativeTo(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
