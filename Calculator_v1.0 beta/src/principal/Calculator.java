package principal;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class Calculator extends JFrame implements ActionListener{
	JMenuBar menu = new JMenuBar();
	JMenu Opcions = new JMenu("Opcions");
	JMenuItem Df = new JMenuItem("DF");
	JMenuItem Mcd = new JMenuItem("MCD");
	JMenuItem Mcm = new JMenuItem("MCM");
	MCD mcd = new MCD();
	MCM mcm = new MCM();
	DF df = new DF();
	
	public static void main(String[] args) {
		Calculator frame = new Calculator();
		frame.setVisible(true);
	}

	public Calculator(){
		setTitle("CALCULATOR   @oaranda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(500, 200, 375, 318);
		setContentPane(df);
		setJMenuBar(menu);
		Menu();
	}

	public void Menu(){
		Df.addActionListener(this);
		Opcions.add(Df);
		Mcm.addActionListener(this);
		Opcions.add(Mcm);
		Mcd.addActionListener(this);
		Opcions.add(Mcd);
		menu.add(Opcions);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== Df){
			this.setSize(375, 318);
			setContentPane(df);
			validate();
		}
		if(e.getSource()== Mcm){
			this.setSize(360, 280);
			setContentPane(mcm);
			validate();
		}
		if(e.getSource()== Mcd){
			this.setSize(360, 280);
			setContentPane(mcd);
			validate();
		}
	}
}
