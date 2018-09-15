package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class MCM extends JPanel implements ActionListener, KeyListener{
	JLabel mcclabel = new JLabel();
	JTextField numeros = new JTextField();
	JButton seguent = new JButton("Afegir");
	JButton MCM = new JButton("MCM");
	JButton reset = new JButton("Reiniciar");
	JTextArea grafica = new JTextArea();
	
	public MCM () {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		setVisible(true);
		setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		setLayout(null);
		
		label();
		numeros();
		resultat();
		seguent();
		McM();
		reiniciar();
	}

	public void label () {
		mcclabel.setText("MÍNIM COMÚ MÚLTIPLE");
		mcclabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		mcclabel.setBounds(90, 15, 180, 20);
		mcclabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(mcclabel);
		
	}
	
	public void numeros(){
		numeros.setToolTipText("Introdueix un nombre");
		numeros.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		numeros.setBounds(20, 60, 100, 22);
		numeros.setColumns(10);
		numeros.addKeyListener(this);
		add(numeros);
		
	}
	
	public void resultat(){
		grafica.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		grafica.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		grafica.setDisabledTextColor(Color.BLACK);
	    grafica.setEnabled(false);
	    grafica.setEditable(false);
		grafica.setBounds(170, 60, 160, 118);
		add(grafica);
	}
	
	public void seguent(){
		seguent.setBorder(UIManager.getBorder("CheckBox.border"));
		seguent.setToolTipText("Afegir nombre");
		seguent.setBounds(21, 95, 99, 22);
		add(seguent);
		seguent.addActionListener(this);
	}
	
	public void McM(){
		MCM.setBorder(UIManager.getBorder("CheckBox.border"));
		MCM.setToolTipText(null);
		MCM.setBounds(21, 125, 99, 22);
		add(MCM);
		MCM.setEnabled(false);
		MCM.addActionListener(this);
	}
	
	public void reiniciar(){
		reset.setBorder(UIManager.getBorder("CheckBox.border"));
		reset.setBounds(21, 155, 99, 22);
		add(reset);
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numeros.setText(null);
				grafica.setText(null);
				seguent.setEnabled(true);
				numeros.setEnabled(true);
				q=0;
				i=0;
			}
		});
	}
	
	int [] nums = new int[10];
	int i =0;
	int q=0;
	int a=0;
	int b=0;
	int res=0;
	int res1=0;
	int f=0;
	
	public void accioseguent(){
		if(numeros.getText().trim().length()==0){
			
		}else{
			nums[i]=Integer.parseInt(numeros.getText());
			if(i==0){
				grafica.setText("MCM("+nums[i]+",");
				i++;
				numeros.setText(null);
			}else{
				grafica.setText(grafica.getText()+ nums[i]+",");
				i++;
				numeros.setText(null);
			}
		}
		if(i<2){
			MCM.setEnabled(false);
		}else{
			MCM.setEnabled(true);
		}
	}
	
	
	public void acciomcm(){
		MCM.setEnabled(false);
		seguent.setEnabled(false);
		numeros.setEnabled(false);
		a=0;
		b=0;
		res=0;
		res1=0;
		f=0;
			for(int h=0; h<i-1; h++){
				if(h==0){
					a= Math.max(nums[h], nums[h+1]);
					b= Math.min(nums[h], nums[h+1]);
				}else{
					a= Math.max(nums[h+1], res);
					b= Math.min(nums[h+1], res);
				}
				for(int k=1; k<=b;k++){ 
					if(a%k==0 && b%k==0){ 
						res1=k;
						f=1;
					}else{
						if(f==0){
							res1=1;
						}
					}
				}
				f=0;
				res= (a*b)/res1;
			}
			if(q==0){ 
				grafica.setText(grafica.getText().substring(0, grafica.getText().length()-1)+")="+res);
				q++;
			}else{
				
			}
	}
	
	

// LISTENERS.....................................................................................................
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==seguent){
			accioseguent();
		}
		if(e.getSource()==MCM){
			acciomcm();
		}
	}
	
	public void keyPressed(KeyEvent evt) {
		if(evt.getKeyCode()== KeyEvent.VK_ENTER){
			accioseguent();
		}
	}
	
	public void keyReleased(KeyEvent a) {
		if(numeros.getText().matches("[1-9]+([0-9]+)?")){
			
		}else{
			numeros.setText(null);
			a.consume();
		}
	}
	
	public void keyTyped(KeyEvent evt) {
		
	}


}
