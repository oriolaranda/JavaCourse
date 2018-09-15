package principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 

public class Principal extends JFrame implements ActionListener{

	
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel text2 = new JLabel("Bon dia");
		JLabel text = new JLabel("Hola");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setResizable(false);
		JPanel panellprin = new JPanel();
		JMenuBar menu = new JMenuBar();
		JMenu Inici = new JMenu("Inici");
		JMenu Visual = new JMenu("Visualització");
		JMenu Eines = new JMenu("Eines");
		JMenuItem Basica = new JMenuItem("Bàsica");
		JMenuItem Cientifica = new JMenuItem("Científica");
		Visual.add(Basica);
		Visual.add(Cientifica);
		menu.add(Inici);
		menu.add(Visual);
		menu.add(Eines);
		frame.setJMenuBar(menu);
		Basica.addActionListener(new ActionListener(){
			@Override
		    public void actionPerformed(ActionEvent arg0) {
			System.out.println("Funciona 1");
			panel1(panel, panel2, text);
			}
			});
			
		Cientifica.addActionListener(this);
		

	}
	public void actionPerformed(ActionEvent e){
		
		
		String name = e.getActionCommand();
		
		if(name.equals("Bàsica")){
			
		}else if(name.equals("Científica")){
			panel2(panel, panel2, text2);
		}
	}
	
	public void panel1(JPanel panel, JPanel panel2, JLabel text){
		panel.add(text);
		panel.setVisible(true);
		panel2.setVisible(false);
		
	}
	
	public void panel2(JPanel panel, JPanel panel2, JLabel text2){
		panel.add(text2);
		panel2.setVisible(true);
		panel.setVisible(false);
		
	}
}
