import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


public class Principal extends JFrame implements ActionListener{
	
	Elements simbols = new Elements();
	Taulap t = new Taulap();
	String [] element = new String[61];
	String [] element2 = new String[61];
	JTextField [] buton = new JTextField[61];
	JTextField [] buto = new JTextField[61];
	JLabel [] label = new JLabel[19];
	JPanel practic = new JPanel();
	JPanel taula = new JPanel();
	JMenuBar menu = new JMenuBar();
	JMenu opcions = new JMenu("Opcions");
	JMenuItem practicar = new JMenuItem("Practicar");
	JMenuItem ajuda = new JMenuItem("Ajuda");
	
	
	public static void main(String[] args) {
		Principal frame = new Principal();
		frame.setVisible(true);
	}

	public Principal() {
		super ("TAULA PERIÒDICA 4rt ESO         Oriol Aranda & Sergi del Rio");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 550);
		setSize(1000,550);
		setJMenuBar(menu);
		menu();
		simbols.practicar(practic, label, buto, buton, element, element2);
		t.ajuda(taula, element, element2);
		setContentPane(practic);
	}
	

	public void menu(){
		practicar.addActionListener(this);
		opcions.add(practicar);
		ajuda.addActionListener(this);
		opcions.add(ajuda);
		menu.add(opcions);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==practicar){
			setContentPane(practic);
			validate();
		}
		if(e.getSource()==ajuda){
			setContentPane(taula);
			validate();
			
		}
	}
	
}
