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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(980,550);
		JTextField [] buton = new JTextField[61];
		JTextField [] buto = new JTextField[61];
		JLabel [] label = new JLabel[19];
		Elements simbols = new Elements();
		JPanel panel = new JPanel();
		setContentPane(panel);
		simbols.labels(panel, label);
		simbols.simbols(panel, buto);
		simbols.element(panel, buton);
		simbols.comprovar(panel, buto, buton);
		simbols.reset(panel, buto, buton);
		simbols.nota(panel);
		
		
	}

	
}
