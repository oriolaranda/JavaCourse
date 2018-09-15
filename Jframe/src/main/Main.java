package main;
import java.awt.*;

import javax.swing.*;

public class Main extends JFrame {

	
	public static void main(String[] arg) {
		JFrame frame = new JFrame("prova");
		Font fuente=new Font("16", Font.ITALIC|Font.BOLD, 16);
		GridBagConstraints posicio = new GridBagConstraints();
		frame.setLayout(new GridBagLayout());
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("HOLA");
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(label);
		JButton button = new JButton("Helloworld");
		button.setBackground(Color.gray);
		button.setForeground(Color.BLACK);
		button.setMargin(new Insets(7, 10, 7, 10));  // Mida del botó respecte el text.
		posicio.fill = GridBagConstraints.HORIZONTAL;
		posicio.weightx = 0.5;
		posicio.gridx = 1;
		posicio.gridy = 0;
		panel.add(button,posicio);
		JTextField texto = new JTextField(6);
		texto.setFont(fuente);
		
		panel.add(texto);
		
		
		
		
		JOptionPane.showMessageDialog(frame,"Hola!"); //Pestanya amb text
		// String text;
		//text= JOptionPane.showInputDialog(frame,"Hola!"); // Pestanya amb introducció de text
		
		// int edat = Integer.parseInt(text);  // Passa la variable de "String" a un altre tipus: parseInt(), parseLong(), parseDouble(), parseFloat().
		
		

	}

}
