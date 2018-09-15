package principal;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Principal {

	//Perdó per les faltes però vaig ràpid xD
	public static void main(String[] args) {
		Font fontsimbol = new Font("Símbol", Font.BOLD, 16); // Font de la lletra per les capses (JTextField) dels simbols
		Font fontelement = new Font("Element", Font.BOLD, 12); //Font de lletra per les jtextfield del nom d'element
		JFrame frame = new JFrame("prova"); //Crea la finestra amb nom "frame"
		frame.setVisible(true); 
		frame.setSize(500, 500);
		frame.setResizable(false); // No deixa redimencionar la finestra
		JPanel panel = new JPanel(); // crea un panell (similar a la finestra) però aqui no l'he utilitzat
		GridBagConstraints posicio = new GridBagConstraints(); //Aquesta es la llibreria de posicions lo xungo.
		frame.setLayout(new GridBagLayout());
		
		final JTextField button = new JTextField(2); //crea un jtextfield amb el nom de "button" i te dimensió "2"
		button.addKeyListener(new KeyListener(){ //tot això és per fer que no deixi posar més de 2 lletres i posar la primera directament en majuscula
			public void keyTyped(KeyEvent e){
				if (button.getText().length()== 2){
			     e.consume();
				}}
			public void keyPressed(KeyEvent arg0) {}
			public void keyReleased(KeyEvent a) {
				String majuscules = button.getText().substring(0,1).toUpperCase() + button.getText().substring(1, button.getText().length()).toLowerCase();
				button.setText(majuscules);}});	
		
		button.setHorizontalAlignment(JTextField.CENTER); //Aliniacio del text
		button.setFont(fontsimbol); //la font del text
		button.setMargin(new Insets(25, 19, 25, 19)); //marges del jtextfield
		posicio.gridx = 0; //les posicions...ya to explicaré quan estiguem els dos millor perquè és més complicat o mirao per google xD
		posicio.gridy = 0;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button,posicio); //Afageix el jtextfield a la finestra
		
		//i els següents és lo mateix; els dos primers son els currats els altres no xD
		
		final JTextField button2 = new JTextField(2);
		button2.addKeyListener(new KeyListener(){
			public void keyTyped(KeyEvent e){
				if (button2.getText().length()== 2){
			     e.consume();
				}}
			public void keyPressed(KeyEvent arg0) {}
			public void keyReleased(KeyEvent a) {
				String majuscules = button2.getText().substring(0,1).toUpperCase() + button2.getText().substring(1, button2.getText().length()).toLowerCase();
				button2.setText(majuscules);}});
		
		button2.setHorizontalAlignment(JTextField.CENTER);
		button2.setFont(fontsimbol);
		button2.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 5;
		posicio.gridy = 0;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button2,posicio);
		
		JTextField button1_2 = new JTextField(6); // Els que tenen"_2" son els que tindran els noms dels elements.
		button1_2.setHorizontalAlignment(JTextField.CENTER);
		button1_2.setFont(fontelement);
		posicio.gridx = 0;
		posicio.gridy = 1;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button1_2,posicio);
		
		JTextField button2_2 = new JTextField(6);
		button2_2.setHorizontalAlignment(JTextField.CENTER);
		button2_2.setFont(fontelement);
		posicio.gridx = 5;
		posicio.gridy = 1;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button2_2,posicio);
		
		JTextField button3 = new JTextField(2);
		button3.setHorizontalAlignment(JTextField.CENTER);
		button3.setFont(fontsimbol);
		button3.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 0;
		posicio.gridy = 2;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button3,posicio);
		
		JTextField button4 = new JTextField(2);
		button4.setHorizontalAlignment(JTextField.CENTER);
		button4.setFont(fontsimbol);
		button4.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 1;
		posicio.gridy = 2;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button4,posicio);
		
		JTextField button5 = new JTextField(2);
		button5.setHorizontalAlignment(JTextField.CENTER);
		button5.setFont(fontsimbol);
		button5.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 4;
		posicio.gridy = 2;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button5,posicio);
		
		JTextField button6 = new JTextField(2);
		button6.setHorizontalAlignment(JTextField.CENTER);
		button6.setFont(fontsimbol);
		button6.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 5;
		posicio.gridy = 2;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button6,posicio);
		
		
		JTextField button7 = new JTextField(2);
		button7.setHorizontalAlignment(JTextField.CENTER);
		button7.setFont(fontsimbol);
		button7.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 0;
		posicio.gridy = 3;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button7,posicio);
		
		JTextField button8 = new JTextField(2);
		button8.setHorizontalAlignment(JTextField.CENTER);
		button8.setFont(fontsimbol);
		button8.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 1;
		posicio.gridy = 3;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button8,posicio);
		
		JTextField button9 = new JTextField(2);
		button9.setHorizontalAlignment(JTextField.CENTER);
		button9.setFont(fontsimbol);
		button9.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 2;
		posicio.gridy = 3;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button9,posicio);
		
		JTextField button10 = new JTextField(2);
		button10.setHorizontalAlignment(JTextField.CENTER);
		button10.setFont(fontsimbol);
		button10.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 3;
		posicio.gridy = 3;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button10,posicio);
		
		JTextField button11 = new JTextField(2);
		button11.setHorizontalAlignment(JTextField.CENTER);
		button11.setFont(fontsimbol);
		button11.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 4;
		posicio.gridy = 3;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button11,posicio);
		
		JTextField button12 = new JTextField(2);
		button12.setHorizontalAlignment(JTextField.CENTER);
		button12.setFont(fontsimbol);
		button12.setMargin(new Insets(25, 19, 25, 19));
		posicio.gridx = 5;
		posicio.gridy = 3;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button12,posicio);
		

	}
	
		 
		

}
