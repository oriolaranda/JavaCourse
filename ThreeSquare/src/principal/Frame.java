package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * Classe Frame
 * @author Oriol Aranda & David Pujol & Sergi Del Rio
 * @version 1.0
 * 
 **/

public class Frame extends JFrame implements ActionListener {

	JMenuBar menu;
	JMenu opcions;
	JMenuItem normal;
	JMenuItem ordinador;
	JMenuItem restart;
	//User usuari = new User();
	//Panel1 p1= new Panel1();
	
	
	public Frame(){		
		
		//Propietats Frame
		
		setIconImage (new ImageIcon(getClass().getResource("/resources/flecha_negra.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,200,400,400); // (i,j,x,y)
		setResizable(false);
		setTitle("3^2");
		setLocationRelativeTo(null);
		User usuari = new User(this);
	}
	
	public void Menu(){
		
		menu =new JMenuBar();
		
		opcions = new JMenu("Opcions");
		
		normal= new JMenuItem("Normal");
		opcions.add(normal);
		normal.addActionListener(this);
		
		ordinador= new JMenuItem("Màquina");
		opcions.add(ordinador);
		ordinador.addActionListener(this);
		
		restart= new JMenuItem("Reiniciar");
		opcions.add(restart);
		restart.addActionListener(this);
		menu.add(opcions);
		
		setJMenuBar(menu);
	}





	public void actionPerformed(ActionEvent e) {
	 /*  if(e.getSource()==normal){
			setContentPane(p1);
			validate();
		}
		if(e.getSource()==ordinador){
			setContentPane(p2);
			validate();
			
		}
			
		if(e.getSource()==restart){
		setContentPane();
		validate();
		}*/
	}

}
