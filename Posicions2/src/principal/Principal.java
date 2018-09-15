package principal;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


public class Principal {
	
	public static void main(String[] args) {
		Font fontsimbol = new Font("Dialog", Font.BOLD, 16);
		JFrame frame = new JFrame("prova");	
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		GridBagConstraints posicio = new GridBagConstraints();
		frame.setLayout(new GridBagLayout());
		int i=0;
		JTextField button = new JTextField(4);
		i=0;
			
		}

		
		
		
		
		
		
		public void MajiMax(JFrame frame, final JTextField[] button, GridBagConstraints posicio, GridBagLayout p, final int i,Font fontsimbol ){
			
			button[i].addKeyListener(new KeyListener(){
			public void keyTyped(KeyEvent e){
				if (button[i].getText().length()== 2){
			     e.consume();
				}
			}
			public void keyPressed(KeyEvent arg0) {
			}
			public void keyReleased(KeyEvent arg0) {
			}
			});
		button[i].setHorizontalAlignment(JTextField.CENTER);
		button[i].setFont(fontsimbol);
		button[i].setMargin(new Insets(10, 0, 10, 0));
		posicio.gridx = 0;
		posicio.gridy = 0;
		posicio.gridwidth = 1;
		posicio.gridheight = 1;
		posicio.weightx = 0;
		posicio.weighty = 0;
		frame.add(button[i],posicio);
		

	}

}
