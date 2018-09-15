import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


public class Principal extends JFrame {
	Toolkit t = Toolkit.getDefaultToolkit();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int amplada_pant = screenSize.width;
	int alçada_pant = screenSize.height;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {
		super ("TAULA PERIÒDICA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(amplada_pant,alçada_pant);
		JTextField [] buto = new JTextField[75];
		JLabel [] label = new JLabel[19];
		Elements simbols = new Elements();
		JPanel panel = new JPanel();
		setContentPane(panel);
		simbols.simbols(panel, buto, label );
		simbols.comprovar(panel, buto);
		
		
		
	}

	
}
