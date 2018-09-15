package principal;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Classe User
 * @author Oriol Aranda & David Pujol & Sergi Del Rio
 * @version 1.1
 * 
 **/

public class User extends JPanel implements ActionListener{
	Frame f;
	
	JLabel titol, subtitol, background;
	JLabel pregunta1, pregunta2;
	JTextField nom1, nom2;
	JButton botoentrar;
	Image fonsanimat= new ImageIcon(getClass().getResource("/resources/user/Square.gif")).getImage();
	
	
	/* *********************** *
	 * Constructor JPanel User *
	 * *********************** */
	
	public User(){
		repaint();
		initComponents();
	}
	
	
	/*Components User*/
	
	public void initComponents(){
		
		setLayout(null);
	
		titol = new JLabel();
		titol.setBounds(10,50,400,40);
		titol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		titol.setFont(new Font("Agency FB", Font.BOLD, 52));
		titol.setIcon (new ImageIcon(getClass().getResource("/resources/user/titol.png")));
		titol.setForeground(new Color(0,0,153));
		add(titol);
		
		subtitol = new JLabel();
		subtitol.setBounds(150,120,120,40);
		subtitol.setHorizontalAlignment(SwingConstants.CENTER);
		subtitol.setIcon (new ImageIcon(getClass().getResource("/resources/user/subtitol.png")));
		subtitol.setFont(new Font("Arial", Font.PLAIN, 16));
		add(subtitol);
		
		pregunta1 = new JLabel("PLAYER 1: ");
		pregunta1.setBounds(50,210,80,20);
		pregunta1.setFont(new Font("Calibri", Font.BOLD, 16));
		
		add(pregunta1);
		
		nom1 = new JTextField();
		nom1.setBounds (140,210,80,20);
		nom1.setBorder(BorderFactory.createEtchedBorder(new Color(102, 102, 102), null));
		nom1.setFont(new Font("Calibri", Font.PLAIN, 16));
		nom1.setHorizontalAlignment(SwingConstants.CENTER);
		nom1.setBackground(new Color(204,204,204));
		add(nom1);
		
		pregunta2 = new JLabel ("PLAYER 2: ");
		pregunta2.setBounds(50, 270, 80, 20);
		pregunta2.setFont(new Font("Calibri", Font.BOLD, 16));
		
		add(pregunta2);
		
		nom2 = new JTextField();
		nom2.setBounds(140, 270, 80, 20);
		nom2.setBorder(BorderFactory.createEtchedBorder(new Color(102, 102, 102), null));
		nom2.setFont(new Font("Calibri", Font.PLAIN, 16));
		nom2.setHorizontalAlignment(SwingConstants.CENTER);
		nom2.setBackground(new Color(204,204,204));
		add(nom2);
		
		botoentrar = new JButton();
		botoentrar.setBounds(290,230,60,40);
		botoentrar.addActionListener(this);
		botoentrar.setFocusable(false);
		botoentrar.setToolTipText("Jugar ja!!");
		botoentrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botoentrar.setIcon (new ImageIcon(getClass().getResource("/resources/user/Fletxa_Negra.png")));
		//botoentrar.setBackground(new Color(102, 102, 102));
		add(botoentrar);
	}
	
	
	/* Fons Panel */
	
	public void paint(Graphics g) {
        g.drawImage(fonsanimat, 0, 0, getWidth(), getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
	
	
	/* Info Principal */
	
	public void setPrincipal(Frame f){
		this.f=f;
	}
	
	
	/* Listeners */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == botoentrar){
			//comprovar noms d'usuari
			/*if(nom1.getText().equals("") && nom2.getText().equals("")){
				JOptionPane.showInternalMessageDialog(this, "Falta el nom de Player 1 i Player 2");
				
			}else if(nom1.getText().equals("")){
				JOptionPane.showInternalMessageDialog(this, "Falta el nom de Player 1");
				
			}else if(nom2.getText().equals("")){
				JOptionPane.showInternalMessageDialog(this, "Falta el nom de Player 2");
				
			}else{*/
				f.NomPlayer1= nom1.getText();
				f.NomPlayer2= nom2.getText();
				f.mostrarP1();
			//}
		}
	}

		

}
