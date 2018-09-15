package principal;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener {

JInternalFrame finestra;
JMenuBar mb;
JMenu menu1;
JMenuItem mi1,mi2,mi3;
public Principal() {
	setBounds(100, 100, 450, 300);
	setSize(500,500);
	finestra= new JInternalFrame();
	finestra.setVisible(false);
	
    mb=new JMenuBar();
    setJMenuBar(mb);
    menu1=new JMenu("Opciones");
    mb.add(menu1);
    mi1=new JMenuItem("Rojo");
    mi1.addActionListener(this);
    menu1.add(mi1);
    mi2=new JMenuItem("Verde");
    mi2.addActionListener(this);
    menu1.add(mi2);
    mi3=new JMenuItem("Azul");
    mi3.addActionListener(this);
    menu1.add(mi3);               
}

public void actionPerformed(ActionEvent e ) {
	Container f=this.getContentPane();
	JPanel panel= new JPanel();
	JLabel label= new JLabel("HOLA");
	panel.add(label);
	add(panel);
    if (e.getSource()==mi1) {
       finestra.setVisible(true);
    }
    if (e.getSource()==mi2) {
    	panel.setVisible(false);
    }
    if (e.getSource()==mi3) {
    	panel.setVisible(true);
    }        
}



public static void main(String[] args) {
    new Principal().setVisible(true);
    
}
  
}