import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


public class Elements extends JTextField {
	JPanel simbols(JPanel Panel, JTextField buto[], JLabel label[]){
		Panel.setVisible(true);
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		Panel.setLayout(null);
		
		int columna = 11;
		int fila = 29;
		int fila2=0;
		int columna2=11;
		for (int y=1; y<19; y++){
			String b = Integer.toString(y);
			label[y]=new JLabel(b);
			label[y].setHorizontalAlignment(SwingConstants.CENTER);
			label[y].setBounds(columna2,fila2,35,35);
			Panel.add(label[y]);
			columna2= columna2 +43;
		}
		
		for (int i=1;i<=60;i++){
			buto[i]= new JTextField();
			buto[i].setBounds(columna,fila,39, 35);
			buto[i].setColumns(10);
			buto[i].setHorizontalAlignment(SwingConstants.CENTER);
			buto[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buto[i].setFont(new Font("Tahoma", Font.BOLD, 16));
			buto[i].setDisabledTextColor(new Color(0, 153, 0));
			Panel.add(buto[i]);
			if(i==1){
				columna = 699;
			}
			if(i==2||i==10||i==18||i==36||i==38||i==47||i==49||i==58||i==4||i==12){
				if(i==2||i==10||i==18|| i==36|| i==47|| i==58){
				columna=11;
				fila= fila + 36;
				}
				if(i==4||i==12){
				columna = 527;
				}
				if(i==38||i==49){
				columna = 398;
				}
			}else{
				columna= columna +43;
			}
		}
		return Panel;
	}
	
	JPanel comprovar(JPanel Panel, final JTextField buto[]){ 
		JButton comprobar = new JButton("Comprobar");
		comprobar.setBounds(300, 300, 103, 29);
		Panel.add(comprobar);
		comprobar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String [] element = new String[61];
		    elements(element);
		   for(int i =1; i<61;i++) {
		    if (buto[i].getText().equals(element[i])){
		    	buto[i].setEnabled(false);
		    }else{
		     buto[i].setText(null);
		    } 
		   }
		   }});
		return Panel;
	}
	
		
	JPanel maxim(JPanel Panel, final JTextField buto[]){
		for(final int i=1; i<60;i++){
		buto[i].addKeyListener(new KeyListener(){ 
			public void keyTyped(KeyEvent e){
				if (buto[i].getText().length()== 2){
			     e.consume();
				}}
			public void keyPressed(KeyEvent arg0) {}
			public void keyReleased(KeyEvent a) {
			}});	
		return Panel;
		}
	}
		
	
		
	
	
	String[] elements(String[] element){
	   element[1]="H"; 
	   element[2]="He";
	   element[3]="Li";
	   element[4]="Be";
	   element[5]="B";
	   element[6]="C";
	   element[7]="N";
	   element[8]="O";
	   element[9]="F";
	   element[10]="Ne";
	   element[11]="Na";
	   element[12]="Mg";
	   element[13]="Al";
	   element[14]="Si";
	   element[15]="P";
	   element[16]="S";
	   element[17]="Cl";
	   element[18]="Ar";
	   element[19]="K";
	   element[20]="Ca";
	   element[21]="Sc";
	   element[22]="Ti";
	   element[23]="V";
	   element[24]="Cr";
	   element[25]="Mn";
	   element[26]="Fe";
	   element[27]="Co";
	   element[28]="Ni";
	   element[29]="Cu";
	   element[30]="Zn";
	   element[31]="Ga";
	   element[32]="Ge";
	   element[33]="As";
	   element[34]="Se";
	   element[35]="Br";
	   element[36]="Kr";
	   element[37]="Rb";
	   element[38]="Sr";
	   element[39]="Pd";
	   element[40]="Ag";
	   element[41]="Cd";
	   element[42]="In";
	   element[43]="Sn";
	   element[44]="Sb";
	   element[45]="Te";
	   element[46]="I";
	   element[47]="Xe";
	   element[48]="Cs";
	   element[49]="Ba";
	   element[50]="Pt";
	   element[51]="Au";
	   element[52]="Hg";
	   element[53]="Tl";
	   element[54]="Pb";
	   element[55]="Bi";
	   element[56]="Po";
	   element[57]="At";
	   element[58]="Rn";
	   element[59]="Fr";
	   element[60]="Ra";
	   return element;
	}
	
	
		
	}
	
	
