import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


public class Taulap{
	
	JTextField [] sim = new JTextField[89];
	JTextField [] nom = new JTextField[89];
	JLabel [] labe = new JLabel[19];
	JLabel [] gruplabel = new JLabel[9];
	JLabel [] numat = new JLabel[89];
	JLabel [] periode = new JLabel[8];
	JLabel [] legend = new JLabel[9];
	String [] element = new String[89];
	String [] element2 = new String[89];
	String [] grup = new String[19];
	String [] info = new String [89];
	String [] romans = new String [9];
	String [] clas = new String [9];
	
	Color color= new Color(100,100,100);
	int columna=31;
	int fila=60;
	
	
	public JPanel ajuda(final JPanel taula, String element[], String element2[]){
		taula.setBackground(new Color(244,244,244));
		taula.setVisible(true);
		taula.setBorder(new EmptyBorder(5, 5, 5, 5));
		taula.setLayout(null);
		taula.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mouseEntered(MouseEvent arg0){
				paint(taula.getGraphics());
			}
			public void mouseExited(MouseEvent arg0){}
			public void mousePressed(MouseEvent arg0){}
			public void mouseReleased(MouseEvent arg0){}});
		//linia(taula.getGraphics());
		labels(taula, labe);
		gruplabel(taula, gruplabel);
		periodes(taula, periode);
		simbol(taula, sim);
		element(taula, nom);
		numatomic(taula,numat);
		llegenda(taula,legend);
		return taula;
	}
	
	public void paint(Graphics g){
		Graphics2D line = (Graphics2D) g;
		int x=665;
		int y=123;
		int x1=665;
		int y1=181;
		line.setStroke(new BasicStroke(2.6f));
		line.setColor(Color.red);
		
		for(int i=0; i<9; i++){
			if(x==x1){
				line.drawLine(x, y, x1, y1);
				x=x1;
				x1=x1+53;
				y=y1;
			}else{
				line.drawLine(x, y, x1, y1);
				y=y1;
				x=x1;
				if(i==7){
					y1=y1+57;
				}else{
					y1=y1+62;
				}
			}
		}
	}
	
	JPanel labels(JPanel taula, JLabel labe[]){
		int columna2= columna;
		grups(grup);
		for (int y=1; y<19; y++){
			String b = Integer.toString(y);
			labe[y]=new JLabel(b);
			labe[y].setHorizontalAlignment(SwingConstants.CENTER);
			labe[y].setBounds(columna2,0,50,35);
			labe[y].setToolTipText(grup[y]);
			taula.add(labe[y]);
			columna2= columna2 +53;
		}
		return taula;
	}
	
	JPanel llegenda(JPanel taula, JLabel legend[]){
		int columna_2 = columna+(80*2);
		int fila_2 = 125;
		legends_nom(clas);
		for (int i=1;i<9;i++){
			legend[i] = new JLabel();
			legend[i].setVisible(true);
			legend[i].setOpaque(true);
			legend[i].setHorizontalAlignment(SwingConstants.CENTER);
			
			legend[i].setFont(new Font("Tahoma", Font.BOLD, 12));
			legend[i].setText(clas[i]);
			if(i == 5){
				fila_2 = fila_2+50;
				columna_2 = columna+(80*2);
			}
			if(i==7){
			    legend[i].setBackground(new Color(34,255,34)); //No metalls
			   }else if(i==5){ 
			    legend[i].setBackground(new Color(34,238,204)); //Halògens
			   }else if(i==8){
			    legend[i].setBackground(new Color(119, 221, 136)); //Metal•loide
			   }else if(i==6){
			    legend[i].setBackground(new Color(119, 204, 255)); //Gasos Nobles
			   }else if(i==1){
			    legend[i].setBackground(new Color(255, 204, 51)); //Alcalins
			   }else if(i==2){
			    legend[i].setBackground(new Color(255, 255, 68)); //Alcalinoterris
			   }else if(i==3){
			    legend[i].setBackground(new Color(221, 187,187)); //Transició
			   }else if(i==4){
			    legend[i].setBackground(new Color(153, 221,204)); //Post-Transició
			   }

			legend[i].setBounds(columna_2,fila_2,100,35);
			taula.add(legend[i]);
			columna_2= columna_2 +110;
		}
		return taula;
	}
	

	JPanel gruplabel(JPanel taula, JLabel gruplabel[]){
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
		taula.add(gruplabel[a]);
	}
	return taula;
	}
	
	JPanel periodes(JPanel taula, JLabel periode[]){
		int fila2=fila+5;
		for(int a=1; a<8;a++){
			String b = Integer.toString(a);
			periode[a]=new JLabel(b);
			periode[a].setHorizontalAlignment(SwingConstants.CENTER);
			periode[a].setBounds(0,fila2,30,40);
			taula.add(periode[a]);
			fila2= fila2 +62;
		}
		return taula;
	}
	
	JPanel numatomic(JPanel taula, JLabel numat[]){
		int columna2 = columna+16;
		int fila2=fila-8;
		for (int y=1; y<89; y++){
			String b = Integer.toString(y);
			if(y>=39 && y<=45||y>=57 && y<=77){
			}else{
			numat[y]=new JLabel(b);
			numat[y].setFont(new Font("Tahoma", Font.PLAIN, 10));
			numat[y].setHorizontalAlignment(SwingConstants.CENTER);
			numat[y].setBounds(columna2,fila2,50,35);
			taula.add(numat[y]);
		if(y==1){
			columna2 = columna2+849;
		}
		if(y==2||y==10||y==18||y==36||y==38||y==54||y==56||y==4||y==12||y==86||y==9){
			if(y==2||y==10||y==18|| y==36|| y==54||y==86){
			columna2=columna+16;
			fila2= fila2 + 40 +16 +6;
			}
			if(y==4){
			columna2 = columna2+ 580;
			}
			if(y>=4 && y<=8){
				columna2= columna2+4;
			}
			if(y==9){
				columna2=columna2-2+53;
			}
			if(y==12){
				columna2 = columna2+ 582;
			}
			if(y==38||y==56){
			columna2 = columna2+424;
			}
		}else{
			columna2= columna2 +53;
		}
		}
		}
		return taula;
	}


	JPanel simbol(final JPanel taula, JTextField sim[]){
		int columna2 = columna;
		int fila2 = fila;
		elements(element);
		elements2(element2);
		info_element(info);
		for (int i=1;i<=88;i++){
			if(i>=39 && i<=45||i>=57 && i<=77){
			}else{
			sim[i]= new JTextField();
			sim[i].setBounds(columna2,fila2, 50, 40);
			sim[i].setColumns(10);
			sim[i].setHorizontalAlignment(SwingConstants.CENTER);
			sim[i].setFont(new Font("Tahoma", Font.BOLD, 16));
			sim[i].setDisabledTextColor(Color.BLACK);
			sim[i].setText(element[i]);
			sim[i].setEnabled(false);
			sim[i].setOpaque(false);
			final String a = info[i]; 
			final String b = element2[i];
			sim[i].addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {
			    if(SwingUtilities.isLeftMouseButton(e)){
			     JOptionPane.showOptionDialog(taula, a, b, JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[]{}, null);
			    }}
			    public void mouseEntered(MouseEvent arg0){}
			    public void mouseExited(MouseEvent arg0){}
			    public void mousePressed(MouseEvent arg0){}
			    public void mouseReleased(MouseEvent arg0){}});
			if(i==1||i>=6 && i<=8||i>=15&& i<=16||i==34){
			    sim[i].setBackground(new Color(34,255,34)); //No metalls
			    color= (new Color(34,255,34));
			   }else if(i==9||i==17||i==35||i==53||i==85){ 
			    sim[i].setBackground(new Color(34,238,204)); //Halògens
			    color= (new Color(34,238,204));
			   }else if(i==5||i==14||i>=32 && i<=33||i>=51 && i<=52||i==84){
			    sim[i].setBackground(new Color(119, 221, 136)); //Metal·loide
			    color= (new Color(119,221,136));
			   }else if(i==2||i==10||i==18||i==36||i==54||i==86){
			    sim[i].setBackground(new Color(119, 204, 255)); //Gasos Nobles
			    color= (new Color(119,204,255));
			   }else if(i==3||i==11||i==19||i==37||i==55||i==87){
			    sim[i].setBackground(new Color(255, 204, 51)); //Alcalins
			    color= (new Color(255,204,51));
			   }else if(i==4||i==12||i==20||i==38||i==56||i==88){
			    sim[i].setBackground(new Color(255, 255, 68)); //Alcalinoterris
			    color= (new Color(255,255,68));
			   }else if(i>=21 && i<=30||i>=46 && i<=48||i>=78 && i<=80){
			    sim[i].setBackground(new Color(221, 187,187)); //Transició
			    color= (new Color(221,187,187));
			   }else if(i==13||i==31||i==49||i==50||i>=81&& i<=83){
			    sim[i].setBackground(new Color(153, 221,204)); //Post-Transició
			    color= (new Color(153,221,204));
			   }
			sim[i].setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, color.darker(), color.darker(), color.darker(),color.darker()),new LineBorder(color,2)));
			taula.add(sim[i]);
			if(i==1){
				columna2 = columna2+ 848;
			}
			if(i==2||i==10||i==18||i==36||i==38||i==54||i==56||i==86||i==4||i==12){
				if(i==2||i==10||i==18|| i==36|| i==54|| i==86){
				columna2= columna;
				fila2= fila2 + 40 +16 +6;
				}
				if(i==4||i==12){
				columna2 = columna2+583;
				}
				if(i==38||i==56){
				columna2 = columna2+424;
				}
			}else{
				columna2= columna2 +53;
			}
		}
		}
		return taula;
	}
	
	JPanel element(JPanel taula,JTextField nom[]){
		int columna2=columna;
		int fila2=fila+40;
		elements2(element2);
		for (int i=1;i<=88;i++){
			if(i>=39 && i<=45||i>=57 && i<=77){
			}else{
			nom[i]= new JTextField();
			nom[i].setBounds(columna2,fila2, 50, 16);
			nom[i].setColumns(10);
			nom[i].setHorizontalAlignment(SwingConstants.CENTER);
			nom[i].setFont(new Font("Tahoma", Font.PLAIN, 10));
			nom[i].setDisabledTextColor(Color.BLACK);
			nom[i].setText(element2[i]);
			nom[i].setEnabled(false);
			nom[i].setOpaque(true);
			if(i==1||i>=6 && i<=8||i>=15&& i<=16||i==34){
			    nom[i].setBackground(new Color(34,255,34)); //No metalls
			    color= (new Color(34,255,34));
			   }else if(i==9||i==17||i==35||i==53||i==85){ 
			    nom[i].setBackground(new Color(34,238,204)); //Halògens
			    color= (new Color(34,238,104));
			   }else if(i==5||i==14||i>=32 && i<=33||i>=51 && i<=52||i==84){
			    nom[i].setBackground(new Color(119, 221, 136)); //Metal·loide
			    color= (new Color(119,221,136));
			   }else if(i==2||i==10||i==18||i==36||i==54||i==86){
			    nom[i].setBackground(new Color(119, 204, 255)); //Gasos Nobles
			    color= (new Color(119,204,255));
			   }else if(i==3||i==11||i==19||i==37||i==55||i==87){
			    nom[i].setBackground(new Color(255, 204, 51)); //Alcalins
			    color= (new Color(255,204,51));
			   }else if(i==4||i==12||i==20||i==38||i==56||i==88){
			    nom[i].setBackground(new Color(255, 255, 68)); //Alcalinoterris
			    color= (new Color(255,255,68));
			   }else if(i>=21 && i<=30||i>=46 && i<=48||i>=78 && i<=80){
			    nom[i].setBackground(new Color(221, 187,187)); //Transició
			    color= (new Color(221,187,187));
			   }else if(i==13||i==31||i==49||i==50||i>=81&& i<=83){
			    nom[i].setBackground(new Color(153, 221,204)); //Post-Transició
			    color= (new Color(153,221,204));
			   }
			nom[i].setBorder(new BevelBorder(BevelBorder.LOWERED, color.darker(), color.darker(), color.darker(),color.darker()));
			taula.add(nom[i]);
			if(i==1){
				columna2 = columna2+848;
			}
			if(i==2||i==10||i==18||i==36||i==38||i==54||i==56||i==86||i==4||i==12){
				if(i==2||i==10||i==18|| i==36|| i==54|| i==86){
				columna2=columna;
				fila2= fila2 + 40+16+6;
				}
				if(i==4||i==12){
				columna2 = columna2+583;
				}
				if(i==38||i==56){
				columna2 = columna2+ 424;
				}
			}else{
				columna2= columna2+53;
			}
		}
		}
		return taula;
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
		element[46]="Pd";
		element[47]="Ag";
		element[48]="Cd";
		element[49]="In";
		element[50]="Sn";
		element[51]="Sb";
		element[52]="Te";
		element[53]="I";
		element[54]="Xe";
		element[55]="Cs";
		element[56]="Ba";
		element[78]="Pt";
		element[79]="Au";
		element[80]="Hg";
		element[81]="Tl";
		element[82]="Pb";
		element[83]="Bi";
		element[84]="Po";
		element[85]="At";
		element[86]="Rn";
		element[87]="Fr";
		element[88]="Ra";
		return element;
	}
	
	String[] elements2(String[] element2){
		element2[1]="Hidrogen"; 
		element2[2]="Heli";
		element2[3]="Liti";
		element2[4]="Beril·li";
		element2[5]="Bor";
		element2[6]="Carboni";
		element2[7]="Nitrogen";
		element2[8]="Oxigen";
		element2[9]="Fluor";
		element2[10]="Neó";
		element2[11]="Sodi";
		element2[12]="Magnesi";
		element2[13]="Alumini";
		element2[14]="Silici";
		element2[15]="Fòsfor";
		element2[16]="Sofre";
		element2[17]="Clor";
		element2[18]="Argó";
		element2[19]="Potassi";
		element2[20]="Calci";
		element2[21]="Escandi";
		element2[22]="Titani";
		element2[23]="Vanadi";
		element2[24]="Crom";
		element2[25]="Manganès";
		element2[26]="Ferro";
		element2[27]="Cobalt";
		element2[28]="Níquel";
		element2[29]="Coure";
		element2[30]="Zinc";
		element2[31]="Gal·li";
		element2[32]="Germani";
		element2[33]="Arsènic";
		element2[34]="Seleni";
		element2[35]="Brom";
		element2[36]="Criptó";
		element2[37]="Rubidi";
		element2[38]="Estronci";
		element2[46]="Pal·ladi";
		element2[47]="Plata";
		element2[48]="Cadmi";
		element2[49]="Indi";
		element2[50]="Estany";
		element2[51]="Antimoni";
		element2[52]="Tel·luri";
		element2[53]="Iode";
		element2[54]="Xenó";
		element2[55]="Cesi";
		element2[56]="Bari";
		element2[78]="Platí";
		element2[79]="Or";
		element2[80]="Mercuri";
		element2[81]="Tal·li";
		element2[82]="Plom";
		element2[83]="Bismut";
		element2[84]="Poloni";
		element2[85]="Àstat";
		element2[86]="Radó";
		element2[87]="Franci";
		element2[88]="Radi";
	return element2;
	}	
	
	String[] grups(String[] grup){
		grup[1]= "Metalls Alcalins";
		grup[2]= "Metalls Alcalinoterris";
		grup[3]= "Grup 3";
		grup[4]= "Grup 4";
		grup[5]= "Grup 5";
		grup[6]= "Grup 6";
		grup[7]= "Grup 7";
		grup[8]= "Grup 8";
		grup[9]= "Grup 9";
		grup[10]= "Grup 10";
		grup[11]= "Grup 11";
		grup[12]= "Grup 12";
		grup[13]= "Grup del Bor";
		grup[14]= "Grup del Carboni";
		grup[15]= "Grup del Nitrogen";
		grup[16]= "Grup de l'Oxigen";
		grup[17]= "Halògens";
		grup[18]= "Gasos Nobles";
		return grup;
	}
	
	String[] info_element(String[] info){
		info[1]="Grup I (1): Metalls alcalins\n1r Període\nNo metall\nNombre atòmic = 1\nMassa atòmica = 1,008\nConfiguració electrònica = 1";
	   	 info[2]="Grup VIII (18): Gasos nobles\n1r Període\nNo metall\nNombre atòmic = 2\nMassa atòmica = 4,0026\nConfiguració electrònica = 2";
	   	 info[3]="Grup I (1): Metalls alcalins\n2n Període\nMetall\nNombre atòmic = 3\nMassa atòmica = 6,941\nConfiguració electrònica = 2,1";
	   	 info[4]="Grup II (2): Metalls alcalinoterris\n2n Període\nMetall\nNombre atòmic = 4\nMassa atòmica = 9,0122\nConfiguració electrònica = 2,2";
	   	 info[5]="Grup III (13): Grup del Bor\n2n Període\nNo metall\nNombre atòmic = 5\nMassa atòmica = 10,81\nConfiguració electrònica = 2,3";
	   	 info[6]="Grup IV (14): Grup del Carboni\n2n Període\nNo metall\nNombre atòmic = 6\nMassa atòmica = 12,011\nConfiguració electrònica = 2,4";
	   	 info[7]="Grup V (15): Grup del Nitrogen\n2n Període\nNo metall\nNombre atòmic = 7\nMassa atòmica = 14,007\nConfiguració electrònica = 2,5";
	   	 info[8]="Grup VI (16): Grup de l’Oxigen\n2n Període\nNo metall\nNombre atòmic = 8\nMassa atòmica = 15,999\nConfiguració electrònica = 2,6";
	   	 info[9]="Grup VII (17): Halògens\n2n Període\nNo metall\nNombre atòmic = 9\nMassa atòmica = 18,998\nConfiguració electrònica = 2,7";
	   	 info[10]="Grup VIII (18): Gasos nobles\n2n Període\nNo metall\nNombre atòmic = 10\nMassa atòmica = 20,179\nConfiguració electrònica = 2,8";
	   	 info[11]="Grup I (1): Metalls alcalins\n3r Període\nMetall\nNombre atòmic = 11\nMassa atómica = 22,990\nConfiguració electrònica = 2,8,1";
	   	 info[12]="Grup II (2): Metalls alcalinoterris\n3r Període\nMetall\nNombre atòmic = 12\nMassa atómica = 24,305\nConfiguració electrònica = 2,8,2";
	   	 info[13]="Grup III (13): Grup del Bor\n3r Període\nMetall\nNombre atòmic = 13\nMassa atòmica = 26,982\nConfiguració electrònica = 2,8,3";
	   	 info[14]="Grup IV (14): Grup del Carboni\n3r Període\nNo metall\nNombre atòmic = 14\nMassa atòmica = 28,086\nConfiguració electrònica = 2,8,4";
	   	 info[15]="Grup V (15): Grup del Nitrogen\n3r Període\nNo metall\nNombre atòmic = 15\nMassa atòmica = 30,974\nConfiguració electrònica = 2,8,5";
	   	 info[16]="Grup VI (16): Grup de l’Oxigen\n3r Període\nNo metall\nNombre atòmic = 16\nMassa atòmica = 32,06\nConfiguració electrònica = 2,8,6";
	   	 info[17]="Grup VII (17): Halògens\n3r Període\nNo metall\nNombre atòmic = 17\nMassa atòmica = 35,453\nConfiguració electrònica = 2,8,7";
	   	 info[18]="Grup VIII (18): Gasos nobles\n3r Període\nNo metall\nNombre atòmic = 18\nMassa atòmica = 39,948\nConfiguració electrònica = 2,8,8";
	   	 info[19]="Grup I (1): Metalls alcalins\n4t Període\nMetall\nNombre atòmic = 19\nMassa atómica = 39,098\nConfiguració electrònica = 2,8,8,1";
	   	 info[20]="Grup II (2): Metalls alcalinoterris\n4t Període\nMetall\nNombre atòmic = 20\nMassa atómica = 40,08\nConfiguració electrònica = 2,8,8,2";
	   	 info[21]="Grup 3\n4t Període\nMetall de transició\nNombre atòmic = 21\nMassa atòmica = 44,955\nConfiguració electrònica = 2,8,9,2";
	   	 info[22]="Grup 4\n4t Període\nMetall de transició\nNombre atòmic = 22\nMassa atòmica = 47,867\nConfiguració electrònica = 2,8,10,2";
	   	 info[23]="Grup 5\n4t Període\nMetall de transició\nNombre atòmic = 23\nMassa atòmica = 50,9415\nConfiguració electrònica = 2,8,11,2";
	   	 info[24]="Grup 6\n4t Període\nMetall de transició\nNombre atòmic = 24\nMassa atòmica = 51,9961\nConfiguració electrònica = 2,8,13,1";
	   	 info[25]="Grup 7\n4t Període\nMetall de transició\nNombre atòmic = 25\nMassa atòmica = 54,94\nConfiguració electrònica = 2,8,13,2";
	   	 info[26]="Grup 8\n4t Període\nMetall de transició\nNombre atòmic = 26\nMassa atòmica = 55,845\nConfiguració electrònica = 2,8,14,2";
	   	 info[27]="Grup 9\n4t Període\nMetall de transició\nNombre atòmic = 27\nMassa atòmica = 58,933\nConfiguració electrònica = 2,8,15,2";
	   	 info[28]="Grup 10\n4t Període\nMetall de transició\nNombre atòmic  = 28\nMassa atòmica = 58,6934\nConfiguració electrònica = 2,8,16,2";
	   	 info[29]="Grup 11\n4t Període\nMetall de transició\nNombre atòmic = 29\nMassa atòmica = 63,546\nConfiguració electrònica = 2,8,18,1";
	   	 info[30]="Grup 12\n4t Període\nMetall de transició\nNombre atòmic = 30\nMassa atòmica = 65,38\nConfiguració electrònica = 2,8,18,2";
	   	 info[31]="Grup III (13): Grup del Bor\n4rt Període\nMetall\nNombre atòmic = 31\nMassa atòmica = 69,72\nConfiguració electrònica = 2,8,18,3";
	   	 info[32]="Grup IV (14): Grup del Carboni\n4rt Període\nMetall\nNombre atòmic = 32\nMassa atòmica = 72,64\nConfiguració electrònica = 2,8,18,4";
	   	 info[33]="Grup V (15): Grup del Nitrogen\n4rt Període\nNo metall\nNombre atòmic = 33\nMassa atòmica = 74,922\nConfiguració electrònica = 2,8,18,5";
	   	 info[34]="Grup VI (16): Grup de l’Oxigen\n4t Període\nNo metall\nNombre atòmic = 34\nMassa atòmica = 78,971\nConfiguració electrònica = 2,8,18,6";
	   	 info[35]="Grup VII (17): Halògens\n4rt Període\nNo metall\nNombre atòmic = 35\nMassa atòmica = 79,904\nConfiguració electrònica = 2,8,18,7";
	   	 info[36]="Grup VIII (18): Gasos nobles\n4rt Període\nNo metall\nNombre atòmic = 36\nMassa atòmica = 83,80\nConfiguració electrònica = 2,8,18,8";
	   	 info[37]="Grup I (1): Metalls alcalins\n5è Període\nMetall\nNombre atòmic = 37\nMassa atómica = 85,468\nConfiguració electrònica = 2,8,18,8,1";
	   	 info[38]="Grup II (2): Metalls alcalinoterris\n5è Període\nMetall\nNombre atòmic = 38\nMassa atómica = 87,62\nConfiguració electrònica = 2,8,18,8,2";
	   	 info[46]="Grup 10\n5è Període\nMetall de transició\nNombre atòmic  = 46\nMassa atòmica = 106,42\nConfiguració electrònica = 2,8,18,18";
	   	 info[47]="Grup 11\n5è Període\nMetall de transició\nNombre atòmic = 47\nMassa atòmica = 107,8682\nConfiguració electrònica = 2,8,18,18,1";
	   	 info[48]="Grup 12\n5è Període\nMetall del transició\nNombre atòmic = 48\nMassa atòmica = 112,414\n Configuració electrònica = 2,8,18,18,2";
	   	 info[49]="Grup III (13): Grup del Bor\n5è Període\nMetall\nNombre atòmic = 49\nMassa atòmica = 114,82\nConfiguració electrònica = 2,8,18,18,3";
	   	 info[50]="Grup IV (14): Grup del Carboni\n5è Període\nMetall\nNombre atòmic = 50\nMassa atòmica = 118,71\nConfiguració electrònica = 2,8,18,18,4";
	   	 info[51]="Grup V (15): Grup del Nitrogen\n5è Període\nMetall\nNombre atòmic = 51\nMassa atòmica = 121,75\nConfiguració electrònica = 2,8,18,18,5";
	   	 info[52]="Grup VI (16): Grup de l’Oxigen\n5è Període\nNo metall\nNombre atòmic = 52\nMassa atòmica = 127,60\nConfiguració electrònica = 2,8,18,18,6";
	   	 info[53]="Grup VII (17): Halògens\n5è Període\nNo metall\nNombre atòmic = 53\nMassa atòmica = 126,90\nConfiguració electrònica = 2,8,18,18,7";
	   	 info[54]="Grup VIII (18): Gasos nobles\n5è Període\nNo metall\nNombre atòmic = 54\nMassa atòmica = 131,30\nConfiguració electrònica = 2,8,18,18,8";
	   	 info[55]="Grup I (1): Metalls alcalins\n6è Període\nMetall\nNombre atòmic = 55\nMassa atómica = 132,90\nConfiguració electrònica = 2,8,18,18,8,1";
	   	 info[56]="Grup II (2): Metalls alcalinoterris\n6è Període\nMetall\nNombre atòmic = 56\nMassa atómica = 137,34\nConfiguració electrònica = 2,8,18,18,8,2";
	   	 info[78]="Grup 10\n6è Període\nMetall de transició\nNombre atòmic  = 78\nMassa atòmica = 195,084\nConfiguració electrònica = 2,8,18,32,17,1";
	   	 info[79]="Grup 11\n6è Període\nMetall de transició\nNombre atòmic = 79\nMassa atòmica = 196,96\nConfiguració electrònica = 2,8,18,32,18,1";
	   	 info[80]="Grup 12\n6è Període\nMetall del transició\nNombre atòmic = 80\nMassa atòmica = 200,59\n Configuració electrònica = 2,8,18,32,18,2";
	   	 info[81]="Grup III (13): Grup del Bor\n6è Període\nMetall\nNombre atòmic = 81\nMassa atòmica = 204,37\nConfiguració electrònica = 2,8,18,32,18,3";
	   	 info[82]="Grup IV (14): Grup del Carboni\n6è Període\nMetall\nNombre atòmic = 82\nMassa atòmica = 207,2\nConfiguració electrònica = 2,8,18,32,18,4";
	   	 info[83]="Grup V (15): Grup del Nitrogen\n6è Període\nMetall\nNombre atòmic = 83\nMassa atòmica = 208,98\nConfiguració electrònica = 2,8,18,32,18,5";
	   	 info[84]="Grup VI (16): Grup de l’Oxigen\n6è Període\nMetall\nNombre atòmic = 84\nMassa atòmica = (209)\nConfiguració electrònica = 2,8,18,32,18,6";
	   	 info[85]="Grup VII (17): Halògens\n6è Període\nNo metall\nNombre atòmic = 85\nMassa atòmica = (210)\nConfiguració electrònica = 2,8,18,32,18,7";
	   	 info[86]="Grup VIII (18): Gasos nobles\n6è Període\nNo metall\nNombre atòmic = 86\nMassa atòmica = (222)\nConfiguració electrònica = 2,8,18,32,18,8";
	   	 info[87]="Grup I (1): Metalls alcalins\n7è Període\nMetall\nNombre atòmic = 87\nMassa atómica = (223)\nConfiguració electrònica = 2,8,18,32,18,8,1";
	   	 info[88]="Grup II (2): Metalls alcalinoterris\n7è Període\nMetall\nNombre atòmic = 88\nMassa atómica = (226)\nConfiguració electrònica = 2,8,18,32,18,8,2";
		return info;
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

	String[] legends_nom(String[] clas){
		  clas[1]="Alcalins";
		  clas[2]="Alcalinoterris";
		  clas[3]="Transició";
		  clas[4]="Post-transició";
		  clas[5]="Halògens";
		  clas[6]="Gasos nobles";
		  clas[7]="No metall";
		  clas[8]="Metal·loide";
		  return clas;
		 }
	
}
