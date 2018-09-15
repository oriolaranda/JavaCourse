package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import org.omg.CORBA.ExceptionList;

/**
 * Classe Frame
 * @author Oriol Aranda & David Pujol & Sergi Del Rio
 * @version 1.1
 * 
 **/

public class Frame extends JFrame implements ActionListener {
	User usuari;
	Panel1 p1;
	Panel2 p2;
	
	String NomPlayer1;
	String NomPlayer2;
	JMenuBar menu;
	JMenu opcions, modejoc;
	JMenuItem normal;
	JMenuItem ordinador;
	JMenuItem inici;
	
	
	/* ************************ *
	 * Constructor JFrame Frame *
	 * ************************ */
	
	public Frame(){	
		initComponents();
		loadMenu();
	}
	
	
	/* Propietats Frame */
	
	public void initComponents(){
		
		setIconImage (new ImageIcon(getClass().getResource("/resources/frame/Icon.png")).getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,200,420,400); // (i,j,x,y)
		setResizable(false);
		setTitle("                                                    3^2");
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	
	/* Menu */
	
	public void loadMenu(){
		menu =new JMenuBar();
		menu.setVisible(true);
		
		//Opcions
		opcions = new JMenu("Opcions");
		
		inici= new JMenuItem("Inici");
		inici.addActionListener(this);
		inici.setIcon(new ImageIcon(getClass().getResource("/resources/frame/inici.png")));
		opcions.add(inici);
		menu.add(opcions);
		
		
		//Mode Joc
		modejoc= new JMenu("Mode Joc");
		
		normal= new JMenuItem("1 vs 1");
		normal.addActionListener(this);
		normal.setIcon(new ImageIcon(getClass().getResource("/resources/frame/normal.png")));
		modejoc.add(normal);
		
		ordinador= new JMenuItem("1 vs CPU");
		ordinador.addActionListener(this);
		ordinador.setIcon(new ImageIcon(getClass().getResource("/resources/frame/ordinador.png")));
		modejoc.add(ordinador);
		menu.add(modejoc);
		
		
		setJMenuBar(menu);
	}
	
	
	
	/* ****** *
	 * PANELS *
	 * ****** */
	
	
	/* Mostrar User*/
	
	public void mostrarUsuari(){
		menu.setVisible(false);
		setContentPane(usuari);
		validate();
		setVisible(true);
	}
	
	
	/* Mostrar Panel1 */
	
	public void mostrarP1(){
		p1.player1.setText(NomPlayer1);
		p1.player2.setText(NomPlayer2);
			
		menu.setVisible(true);
		setContentPane(p1);
		validate();
		setVisible(true);
		
	}
	
	/* Mostrar Panel2 */
	public void mostrarP2(){
		menu.setVisible(true);
		setContentPane(p2);
		validate();
		setVisible(true);
	}

	
	
	/* Info de Principal */
	
	public void setPrincipal(User usuari,Panel1 p1, Panel2 p2){
		this.usuari=usuari;
		this.p1=p1;
		this.p2 = p2;
	}
	
	
	/* Listeners */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==normal){
			mostrarP1();
		}
		if(e.getSource()==ordinador){
			mostrarP2();
		}
			
		if(e.getSource()==inici){
			mostrarUsuari();
			usuari.nom1.setText(null);
			usuari.nom2.setText(null);
			
		}
	}

}
