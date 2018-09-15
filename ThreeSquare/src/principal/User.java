package principal;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Window;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class User extends JPanel implements ActionListener{
	private JFrame f=new JFrame();
	JLabel Titol;
	JLabel Pregunta;
	JTextField nom;
	JButton buto1;
	
	public User(Frame frame){
		f=frame;
		
		/*Propietats*/
		
		setLayout(null);
		Titol = new JLabel("Benvinguts a 3^2");
		Titol.setBounds(150,50,100,100);
		add(Titol);
		
		Pregunta = new JLabel("Usuari: ");
		Pregunta.setBounds(25,200,50,50);
		add(Pregunta);
		
		nom = new JTextField();
		nom.setBounds (70,200,100,50);
		add(nom);
		
		buto1 = new JButton();
		buto1.setVisible(true);
		buto1.setBounds(200,210,30,30);
		buto1.addActionListener(this);
		buto1.setFocusable(false);
		buto1.setIcon (new ImageIcon (Window.class.getResource("/resources/flecha_negra.png")));
		add(buto1);
	
		frame.setContentPane(this);
		frame.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Panel1 p1= new Panel1();
		if (e.getSource() == buto1){
			f.setContentPane(p1);
			validate();
			f.setVisible(true);
			
		}
	}
	
	
	
	
	
	

}
