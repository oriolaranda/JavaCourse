package principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class DF extends JPanel implements ActionListener, KeyListener{
	JLabel desc = new JLabel();
	final JTextField numero = new JTextField();
	final JTextArea grafic = new JTextArea();
	final JTextArea formula = new JTextArea();
	JScrollPane barra = new JScrollPane(grafic);
	JScrollPane barra2 = new JScrollPane(formula);
	JButton Descomposar = new JButton("Descomposar");
	JButton Reset = new JButton("Reiniciar");

	public DF(){
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new BorderLayout(0, 0));
		setVisible(true);
		setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		setLayout(null);
		label();
		numero();
		grafic();
		formula();
		descomposar();
		reset();
	}

	public void label () {
		desc.setText("DESCOMPOSICIÓ FACTORIAL");
		desc.setFont(new Font("Tahoma", Font.BOLD, 13));
		desc.setBounds(90, 15, 180, 20);
		desc.setHorizontalAlignment(SwingConstants.CENTER);
		add(desc);	
	}

	public void numero (){
		numero.setToolTipText("Introdueix un nombre");
		numero.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		numero.setBounds(20, 60, 125, 22);
		numero.setColumns(10);
		numero.addKeyListener(this);
		add(numero);
	}

	public void grafic (){
		grafic.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		grafic.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		grafic.setDisabledTextColor(Color.BLACK);
		grafic.setEnabled(false);
		grafic.setEditable(false);
		barra.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		barra.setBounds(210, 60, 140, 180);
		barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(barra);
	}

	public void formula (){
		formula.setFont(new Font("Monospaced 13", Font.PLAIN, 12));
		formula.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		formula.setDisabledTextColor(Color.BLACK);
		formula.setEditable(false);
		formula.setEnabled(false);
		barra2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		barra2.setBounds(18, 190, 165, 50);
		barra2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(barra2);
	}

	public void descomposar (){
		Descomposar.setBorder(UIManager.getBorder("CheckBox.border"));
		Descomposar.setToolTipText(null);
		Descomposar.setBounds(21, 95, 123, 22);
		add(Descomposar);
		Descomposar.addActionListener(this);
}

	public void reset (){
		Reset.setBorder(UIManager.getBorder("CheckBox.border"));
		Reset.setBounds(21, 125, 123, 22);
		add(Reset);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero.setText(null);
				grafic.setText(null);
				formula.setText(null);
			}
		});
	}


public void accioDF(){
	ArrayList<Integer> array = new ArrayList<Integer>();
	long [] result = new long[100];
	int [] potencia = new int[100];
	String text= numero.getText();
	String espai = "";
	long num= Long.parseLong(text);
	long ans= num;
	String inf= String.valueOf(ans);
	String mida= String.valueOf(num);
	long as = 0;
	int i=0;
	int n=0; 
	int h=0; 
	grafic.setFont(new Font("Lucida Console", Font.PLAIN, 12));
	if(num==1){
		grafic.setFont(new Font("Monospaced 13", Font.PLAIN, 12));
		grafic.setText(" L'1 no es considera \n ni nombre primer \n ni nombre compost!");
		formula.setText(" L'1 és la unitat!");
	}else{
		for( long a=2; a<=num; a++){
			if(num % a == 0){
				String text2=grafic.getText();
				if(h==0){
					grafic.setText("\n" +" " + num + " | " + a);
				}else{
					mida= String.valueOf(num);
					int voltes = (inf.length()-mida.length());
					for(int z=0; z<voltes; z++){
						espai= espai+" ";	
					}	
					grafic.setText(text2 + "\n" + " "+espai + num + " | " + a);
				}
				espai="";
				array.add((int) a);
				num= num/a;
				as=a;
				a=1;
				h++;
				
				if(array.size()==1){
					result[n]= array.get(0);
					potencia[n]=1;
					i++;
				}else{
					if(array.get(i).equals(array.get(i-1))){
						array.remove(i);
						potencia[n]++;
					}else{
						n++;
						result[n]= array.get(i);
						potencia[n]=1;
						i++;
					}
				}	
			}
		}
		
		int voltes = (inf.length()-1);
		for(int z=0; z<voltes; z++){
			espai= espai+" ";	
		}	
		
		String textfin=grafic.getText();
		String conput ="";
		grafic.setText(textfin +"\n"+ " "+espai + "1"+ " | ");
		for(int y=0;y<array.size();y++){
			if(y==0){
				if(potencia[y]==1){
					conput= conput + result[y];
				}else{
					conput= conput + result[y]+"^"+potencia[y];
				}	
			}else{
				if(potencia[y]==1){
					conput= conput+ " · " + result[y];
				}else{
					conput= conput + " · "+ result[y]+"^"+potencia[y];
				}
			}
		}
		if(as==ans){
			formula.setText(" "+ans+" és un nombre primer!");
		}else{
			formula.setText(" "+ans+" =  "+ conput);
		}
	}
}


public void actionPerformed(ActionEvent e) {	
	if(e.getSource()== Descomposar){
		accioDF();
	}
}

public void keyPressed(KeyEvent evt) {
	if(evt.getKeyCode()== KeyEvent.VK_ENTER){
		accioDF();
	}
}

public void keyReleased(KeyEvent a) {
	if(numero.getText().matches("[1-9]+([0-9]+)?")){
		
	}else{
		numero.setText(null);
		a.consume();
	}
}

public void keyTyped(KeyEvent arg0) {
}
}
