import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class Elements extends JTextField {
	String [] romans = new String [9];
	JLabel [] gruplabel = new JLabel[9];
	JLabel [] periode = new JLabel[8];
	int encerts;
	int errors;
	int blanc;
	int columna=31;
	int fila= 60;

	public JPanel practicar(JPanel practic, JLabel label[], JTextField buto[], JTextField buton[], String element[], String element2[]){
		practic.setBackground(new Color(244,244,244));
		practic.setVisible(true);
		practic.setBorder(new EmptyBorder(5, 5, 5, 5));
		practic.setLayout(null);
		comprovar(practic, buto, buton, element, element2);
		nota(practic);
		reset(practic, buto, buton);
		labels(practic, label);
		gruplabel(practic, gruplabel);
		periodes(practic, periode);
		simbols(practic, buto);
		element(practic, buton);
		return practic;
	}
	
	JPanel labels(JPanel practic, JLabel label[]){
		int columna2 = columna;
		for (int y=1; y<19; y++){
			String b = Integer.toString(y);
			label[y]=new JLabel(b);
			label[y].setHorizontalAlignment(SwingConstants.CENTER);
			label[y].setBounds(columna2,0,50,35);
			practic.add(label[y]);
			columna2= columna2 +53;
		}
		return practic;
	}
	
	JPanel gruplabel(JPanel practic, JLabel gruplabel[]){
		int columna2 = columna;
		grup_romans(romans);
		for(int a=1; a<9;a++){
			gruplabel[a]=new JLabel();
			gruplabel[a].setFont(new Font("Tahoma", Font.BOLD, 12));
			gruplabel[a].setText(romans[a]);
			gruplabel[a].setHorizontalAlignment(SwingConstants.CENTER);
			
			if(a==1||a==8){
				gruplabel[a].setBounds(columna2,30,50,35);
			}else{
				gruplabel[a].setBounds(columna2,90,50,35);
			}
			if(a==2){
				columna2= columna2+ (53*11);
			}else{
				columna2= columna2 +53;
			}
			practic.add(gruplabel[a]);
		}
		return practic;
		}
	
	JPanel periodes(JPanel practic, JLabel periode[]){
		int fila2=fila+5;
		for(int a=1; a<8;a++){
			String b = Integer.toString(a);
			periode[a]=new JLabel(b);
			periode[a].setHorizontalAlignment(SwingConstants.CENTER);
			periode[a].setBounds(0,fila2,30,40);
			practic.add(periode[a]);
			fila2= fila2 +62;
		}
		return practic;
	}

	JPanel simbols(JPanel practic, JTextField buto[]){
		int columna2 = columna;
		int fila2 = fila;
		for (int i=1;i<=60;i++){
			buto[i]= new JTextField();
			buto[i].setBounds(columna2,fila2, 50, 40);
			buto[i].setColumns(10);
			buto[i].setHorizontalAlignment(SwingConstants.CENTER);
			buto[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buto[i].setFont(new Font("Tahoma", Font.BOLD, 16));
			buto[i].setDisabledTextColor(new Color(0, 153, 0));
			maximcaracters(buto[i]);
			practic.add(buto[i]);
			if(i==1){
				columna2= columna2+848;
			}
			if(i==2||i==10||i==18||i==36||i==38||i==47||i==49||i==58||i==4||i==12){
				if(i==2||i==10||i==18|| i==36|| i==47|| i==58){
				columna2=columna;
				fila2= fila2 + 40 +16 +6;
				
				}
				if(i==4||i==12){
				columna2= columna2+583;
				}
				if(i==38||i==49){
				columna2= columna2+424;
				}
			}else{
				columna2= columna2+53;
			}
		}
		return practic;
	}
	
	JPanel element(JPanel practic,JTextField buton[]){
		int columna2=columna;
		int fila2=fila+41;
		for (int i=1;i<=60;i++){
			buton[i]= new JTextField();
			buton[i].setBounds(columna2,fila2, 50, 16);
			buton[i].setColumns(10);
			buton[i].setHorizontalAlignment(SwingConstants.CENTER);
			buton[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buton[i].setFont(new Font("Tahoma", Font.PLAIN, 10));
			buton[i].setDisabledTextColor(new Color(0, 153, 0));
			maximcaracters2(buton[i]);
			practic.add(buton[i]);
			if(i==1){
				columna2= columna2+848;
			}
			if(i==2||i==10||i==18||i==36||i==38||i==47||i==49||i==58||i==4||i==12){
				if(i==2||i==10||i==18|| i==36|| i==47|| i==58){
				columna2= columna;
				fila2= fila2 + 40+16+6;
				}
				if(i==4||i==12){
				columna2= columna2+583;
				}
				if(i==38||i==49){
				columna2= columna2+424;
				}
			}else{
				columna2= columna2+53;
			}
		}
		return practic;
	}
	
	
	JPanel comprovar(final JPanel practic, final JTextField buto[], final JTextField buton[], final String element[], final String element2[]){ 
		JButton comprovar = new JButton("Comprovar");
		comprovar.setBounds(318, 455, 100, 29);
		practic.add(comprovar);
		comprovar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    elements(element);
		    elements2(element2);
		   for(int i =1; i<61;i++){ 
			if (buto[i].isEnabled()){
				if (buto[i].getText().equals(element[i])){
			    	buto[i].setEnabled(false);
			    	encerts ++;
			    	
			    }else{
			    	if (buto[i].getText().equals("")){
				    	blanc ++;
			    		
				    }else{
				    	buto[i].setText(null);
				    	errors ++;
				    }	
			    }	
			}else{
		    
			}
			if (buton[i].isEnabled()){
				if (buton[i].getText().equals(element2[i])){
			    	buton[i].setEnabled(false);
			    	encerts ++;
			    	
			    }else{
			    	if (buton[i].getText().equals("")){
			    		blanc ++;
			    	
				    }else{
			    	buton[i].setText(null);
			    	errors ++;
				    }
			    }
			   
			}else{
		    
			}
		   }
		   }});
		
		return practic;
		
	}
	
	

	JPanel reset(JPanel practic, final JTextField buto[], final JTextField buton[]){ 
		JButton reset = new JButton("Reset");
		reset.setBounds(565, 455, 100, 29);
		practic.add(reset);
		reset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		   for(int i =1; i<61;i++) {
		    	buto[i].setEnabled(true);
		    	buto[i].setText(null); 
		    	buton[i].setEnabled(true);
		    	buton[i].setText(null);
		    	encerts = 0;
		    	errors = 0;
		    	blanc = 0;
		   }
		   }});
		return practic;
	}
	
	JPanel nota(final JPanel practic){ 
		JButton nota = new JButton("Nota");
		nota.setBounds(419, 455, 100, 29);
		practic.add(nota);
		nota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(encerts + " " + errors + " " + blanc);
				int totalresposes = encerts + errors;
				double notas = Redondear(((double)encerts / (double)totalresposes)*10);
				String notafrase = "La teva nota �s: " + encerts + "/" + (totalresposes) + " = " + (notas);
				JOptionPane.showMessageDialog(null, notafrase);
				blanc =0;
			   }});
		return practic;
	}
	
	public static double Redondear(double numero){
	    return Math.rint(numero*100)/100;
	}
	
	JTextField maximcaracters (final JTextField textfield){ 
			textfield.addKeyListener(new KeyListener(){ 
				public void keyTyped(KeyEvent e){
					if (textfield.getText().length()== 2){
						e.consume();
					}
				}
				public void keyPressed(KeyEvent arg0) {}
				public void keyReleased(KeyEvent a) {
					String majuscules = textfield.getText().substring(0,1).toUpperCase() + textfield.getText().substring(1, textfield.getText().length()).toLowerCase();
					textfield.setText(majuscules);
				}});
		return textfield;
	}
	
	JTextField maximcaracters2 (final JTextField textfield2){ 
		textfield2.addKeyListener(new KeyListener(){ 
			public void keyTyped(KeyEvent e){
				if (textfield2.getText().length()== 8){
					e.consume();
				}
			}
			public void keyPressed(KeyEvent arg0) {}
			public void keyReleased(KeyEvent a) {
				String majuscules = textfield2.getText().substring(0,1).toUpperCase() + textfield2.getText().substring(1, textfield2.getText().length()).toLowerCase();
				textfield2.setText(majuscules);
			}});
		return textfield2;
	}
		 
	public void elements(String[] element){
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
	}
	
	public void elements2(String[] element2){
		element2[1]="Hidrogen"; 
		element2[2]="Heli";
		element2[3]="Liti";
		element2[4]="Beril�li";
		element2[5]="Bor";
		element2[6]="Carboni";
		element2[7]="Nitrogen";
		element2[8]="Oxigen";
		element2[9]="Fluor";
		element2[10]="Ne�";
		element2[11]="Sodi";
		element2[12]="Magnesi";
		element2[13]="Alumini";
		element2[14]="Silici";
		element2[15]="F�sfor";
		element2[16]="Sofre";
		element2[17]="Clor";
		element2[18]="Arg�";
		element2[19]="Potassi";
		element2[20]="Calci";
		element2[21]="Escandi";
		element2[22]="Titani";
		element2[23]="Vanadi";
		element2[24]="Crom";
		element2[25]="Mangan�s";
		element2[26]="Ferro";
		element2[27]="Cobalt";
		element2[28]="N�quel";
		element2[29]="Coure";
		element2[30]="Zinc";
		element2[31]="Gal�li";
		element2[32]="Germani";
		element2[33]="Ars�nic";
		element2[34]="Seleni";
		element2[35]="Brom";
		element2[36]="Cript�";
		element2[37]="Rubidi";
		element2[38]="Estronci";
		element2[39]="Pal�ladi";
		element2[40]="Plata";
		element2[41]="Cadmi";
		element2[42]="Indi";
		element2[43]="Estany";
		element2[44]="Antimoni";
		element2[45]="Tel�luri";
		element2[46]="Iode";
		element2[47]="Xen�";
		element2[48]="Cesi";
		element2[49]="Bari";
		element2[50]="Plat�";
		element2[51]="Or";
		element2[52]="Mercuri";
		element2[53]="Tal�li";
		element2[54]="Plom";
		element2[55]="Bismut";
		element2[56]="Poloni";
		element2[57]="�stat";
		element2[58]="Rad�";
		element2[59]="Franci";
		element2[60]="Radi";
	}
	
	String[] grup_romans(String[] romans){
		romans[1]= "I";
		romans[2]= "II";
		romans[3]= "III";
		romans[4]= "IV";
		romans[5]= "V";
		romans[6]= "VI";
		romans[7]= "VII";
		romans[8]= "VIII";
		return romans;
	}
}
	
	
