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
			    legend[i].setBackground(new Color(34,238,204)); //Hal�gens
			   }else if(i==8){
			    legend[i].setBackground(new Color(119, 221, 136)); //Metal�loide
			   }else if(i==6){
			    legend[i].setBackground(new Color(119, 204, 255)); //Gasos Nobles
			   }else if(i==1){
			    legend[i].setBackground(new Color(255, 204, 51)); //Alcalins
			   }else if(i==2){
			    legend[i].setBackground(new Color(255, 255, 68)); //Alcalinoterris
			   }else if(i==3){
			    legend[i].setBackground(new Color(221, 187,187)); //Transici�
			   }else if(i==4){
			    legend[i].setBackground(new Color(153, 221,204)); //Post-Transici�
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
			    sim[i].setBackground(new Color(34,238,204)); //Hal�gens
			    color= (new Color(34,238,204));
			   }else if(i==5||i==14||i>=32 && i<=33||i>=51 && i<=52||i==84){
			    sim[i].setBackground(new Color(119, 221, 136)); //Metal�loide
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
			    sim[i].setBackground(new Color(221, 187,187)); //Transici�
			    color= (new Color(221,187,187));
			   }else if(i==13||i==31||i==49||i==50||i>=81&& i<=83){
			    sim[i].setBackground(new Color(153, 221,204)); //Post-Transici�
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
			    nom[i].setBackground(new Color(34,238,204)); //Hal�gens
			    color= (new Color(34,238,104));
			   }else if(i==5||i==14||i>=32 && i<=33||i>=51 && i<=52||i==84){
			    nom[i].setBackground(new Color(119, 221, 136)); //Metal�loide
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
			    nom[i].setBackground(new Color(221, 187,187)); //Transici�
			    color= (new Color(221,187,187));
			   }else if(i==13||i==31||i==49||i==50||i>=81&& i<=83){
			    nom[i].setBackground(new Color(153, 221,204)); //Post-Transici�
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
		element2[46]="Pal�ladi";
		element2[47]="Plata";
		element2[48]="Cadmi";
		element2[49]="Indi";
		element2[50]="Estany";
		element2[51]="Antimoni";
		element2[52]="Tel�luri";
		element2[53]="Iode";
		element2[54]="Xen�";
		element2[55]="Cesi";
		element2[56]="Bari";
		element2[78]="Plat�";
		element2[79]="Or";
		element2[80]="Mercuri";
		element2[81]="Tal�li";
		element2[82]="Plom";
		element2[83]="Bismut";
		element2[84]="Poloni";
		element2[85]="�stat";
		element2[86]="Rad�";
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
		grup[17]= "Hal�gens";
		grup[18]= "Gasos Nobles";
		return grup;
	}
	
	String[] info_element(String[] info){
		info[1]="Grup I (1): Metalls alcalins\n1r Per�ode\nNo metall\nNombre at�mic = 1\nMassa at�mica = 1,008\nConfiguraci� electr�nica = 1";
	   	 info[2]="Grup VIII (18): Gasos nobles\n1r Per�ode\nNo metall\nNombre at�mic = 2\nMassa at�mica = 4,0026\nConfiguraci� electr�nica = 2";
	   	 info[3]="Grup I (1): Metalls alcalins\n2n Per�ode\nMetall\nNombre at�mic = 3\nMassa at�mica = 6,941\nConfiguraci� electr�nica = 2,1";
	   	 info[4]="Grup II (2): Metalls alcalinoterris\n2n Per�ode\nMetall\nNombre at�mic = 4\nMassa at�mica = 9,0122\nConfiguraci� electr�nica = 2,2";
	   	 info[5]="Grup III (13): Grup del Bor\n2n Per�ode\nNo metall\nNombre at�mic = 5\nMassa at�mica = 10,81\nConfiguraci� electr�nica = 2,3";
	   	 info[6]="Grup IV (14): Grup del Carboni\n2n Per�ode\nNo metall\nNombre at�mic = 6\nMassa at�mica = 12,011\nConfiguraci� electr�nica = 2,4";
	   	 info[7]="Grup V (15): Grup del Nitrogen\n2n Per�ode\nNo metall\nNombre at�mic = 7\nMassa at�mica = 14,007\nConfiguraci� electr�nica = 2,5";
	   	 info[8]="Grup VI (16): Grup de l�Oxigen\n2n Per�ode\nNo metall\nNombre at�mic = 8\nMassa at�mica = 15,999\nConfiguraci� electr�nica = 2,6";
	   	 info[9]="Grup VII (17): Hal�gens\n2n Per�ode\nNo metall\nNombre at�mic = 9\nMassa at�mica = 18,998\nConfiguraci� electr�nica = 2,7";
	   	 info[10]="Grup VIII (18): Gasos nobles\n2n Per�ode\nNo metall\nNombre at�mic = 10\nMassa at�mica = 20,179\nConfiguraci� electr�nica = 2,8";
	   	 info[11]="Grup I (1): Metalls alcalins\n3r Per�ode\nMetall\nNombre at�mic = 11\nMassa at�mica = 22,990\nConfiguraci� electr�nica = 2,8,1";
	   	 info[12]="Grup II (2): Metalls alcalinoterris\n3r Per�ode\nMetall\nNombre at�mic = 12\nMassa at�mica = 24,305\nConfiguraci� electr�nica = 2,8,2";
	   	 info[13]="Grup III (13): Grup del Bor\n3r Per�ode\nMetall\nNombre at�mic = 13\nMassa at�mica = 26,982\nConfiguraci� electr�nica = 2,8,3";
	   	 info[14]="Grup IV (14): Grup del Carboni\n3r Per�ode\nNo metall\nNombre at�mic = 14\nMassa at�mica = 28,086\nConfiguraci� electr�nica = 2,8,4";
	   	 info[15]="Grup V (15): Grup del Nitrogen\n3r Per�ode\nNo metall\nNombre at�mic = 15\nMassa at�mica = 30,974\nConfiguraci� electr�nica = 2,8,5";
	   	 info[16]="Grup VI (16): Grup de l�Oxigen\n3r Per�ode\nNo metall\nNombre at�mic = 16\nMassa at�mica = 32,06\nConfiguraci� electr�nica = 2,8,6";
	   	 info[17]="Grup VII (17): Hal�gens\n3r Per�ode\nNo metall\nNombre at�mic = 17\nMassa at�mica = 35,453\nConfiguraci� electr�nica = 2,8,7";
	   	 info[18]="Grup VIII (18): Gasos nobles\n3r Per�ode\nNo metall\nNombre at�mic = 18\nMassa at�mica = 39,948\nConfiguraci� electr�nica = 2,8,8";
	   	 info[19]="Grup I (1): Metalls alcalins\n4t Per�ode\nMetall\nNombre at�mic = 19\nMassa at�mica = 39,098\nConfiguraci� electr�nica = 2,8,8,1";
	   	 info[20]="Grup II (2): Metalls alcalinoterris\n4t Per�ode\nMetall\nNombre at�mic = 20\nMassa at�mica = 40,08\nConfiguraci� electr�nica = 2,8,8,2";
	   	 info[21]="Grup 3\n4t Per�ode\nMetall de transici�\nNombre at�mic = 21\nMassa at�mica = 44,955\nConfiguraci� electr�nica = 2,8,9,2";
	   	 info[22]="Grup 4\n4t Per�ode\nMetall de transici�\nNombre at�mic = 22\nMassa at�mica = 47,867\nConfiguraci� electr�nica = 2,8,10,2";
	   	 info[23]="Grup 5\n4t Per�ode\nMetall de transici�\nNombre at�mic = 23\nMassa at�mica = 50,9415\nConfiguraci� electr�nica = 2,8,11,2";
	   	 info[24]="Grup 6\n4t Per�ode\nMetall de transici�\nNombre at�mic = 24\nMassa at�mica = 51,9961\nConfiguraci� electr�nica = 2,8,13,1";
	   	 info[25]="Grup 7\n4t Per�ode\nMetall de transici�\nNombre at�mic = 25\nMassa at�mica = 54,94\nConfiguraci� electr�nica = 2,8,13,2";
	   	 info[26]="Grup 8\n4t Per�ode\nMetall de transici�\nNombre at�mic = 26\nMassa at�mica = 55,845\nConfiguraci� electr�nica = 2,8,14,2";
	   	 info[27]="Grup 9\n4t Per�ode\nMetall de transici�\nNombre at�mic = 27\nMassa at�mica = 58,933\nConfiguraci� electr�nica = 2,8,15,2";
	   	 info[28]="Grup 10\n4t Per�ode\nMetall de transici�\nNombre at�mic  = 28\nMassa at�mica = 58,6934\nConfiguraci� electr�nica = 2,8,16,2";
	   	 info[29]="Grup 11\n4t Per�ode\nMetall de transici�\nNombre at�mic = 29\nMassa at�mica = 63,546\nConfiguraci� electr�nica = 2,8,18,1";
	   	 info[30]="Grup 12\n4t Per�ode\nMetall de transici�\nNombre at�mic = 30\nMassa at�mica = 65,38\nConfiguraci� electr�nica = 2,8,18,2";
	   	 info[31]="Grup III (13): Grup del Bor\n4rt Per�ode\nMetall\nNombre at�mic = 31\nMassa at�mica = 69,72\nConfiguraci� electr�nica = 2,8,18,3";
	   	 info[32]="Grup IV (14): Grup del Carboni\n4rt Per�ode\nMetall\nNombre at�mic = 32\nMassa at�mica = 72,64\nConfiguraci� electr�nica = 2,8,18,4";
	   	 info[33]="Grup V (15): Grup del Nitrogen\n4rt Per�ode\nNo metall\nNombre at�mic = 33\nMassa at�mica = 74,922\nConfiguraci� electr�nica = 2,8,18,5";
	   	 info[34]="Grup VI (16): Grup de l�Oxigen\n4t Per�ode\nNo metall\nNombre at�mic = 34\nMassa at�mica = 78,971\nConfiguraci� electr�nica = 2,8,18,6";
	   	 info[35]="Grup VII (17): Hal�gens\n4rt Per�ode\nNo metall\nNombre at�mic = 35\nMassa at�mica = 79,904\nConfiguraci� electr�nica = 2,8,18,7";
	   	 info[36]="Grup VIII (18): Gasos nobles\n4rt Per�ode\nNo metall\nNombre at�mic = 36\nMassa at�mica = 83,80\nConfiguraci� electr�nica = 2,8,18,8";
	   	 info[37]="Grup I (1): Metalls alcalins\n5� Per�ode\nMetall\nNombre at�mic = 37\nMassa at�mica = 85,468\nConfiguraci� electr�nica = 2,8,18,8,1";
	   	 info[38]="Grup II (2): Metalls alcalinoterris\n5� Per�ode\nMetall\nNombre at�mic = 38\nMassa at�mica = 87,62\nConfiguraci� electr�nica = 2,8,18,8,2";
	   	 info[46]="Grup 10\n5� Per�ode\nMetall de transici�\nNombre at�mic  = 46\nMassa at�mica = 106,42\nConfiguraci� electr�nica = 2,8,18,18";
	   	 info[47]="Grup 11\n5� Per�ode\nMetall de transici�\nNombre at�mic = 47\nMassa at�mica = 107,8682\nConfiguraci� electr�nica = 2,8,18,18,1";
	   	 info[48]="Grup 12\n5� Per�ode\nMetall del transici�\nNombre at�mic = 48\nMassa at�mica = 112,414\n Configuraci� electr�nica = 2,8,18,18,2";
	   	 info[49]="Grup III (13): Grup del Bor\n5� Per�ode\nMetall\nNombre at�mic = 49\nMassa at�mica = 114,82\nConfiguraci� electr�nica = 2,8,18,18,3";
	   	 info[50]="Grup IV (14): Grup del Carboni\n5� Per�ode\nMetall\nNombre at�mic = 50\nMassa at�mica = 118,71\nConfiguraci� electr�nica = 2,8,18,18,4";
	   	 info[51]="Grup V (15): Grup del Nitrogen\n5� Per�ode\nMetall\nNombre at�mic = 51\nMassa at�mica = 121,75\nConfiguraci� electr�nica = 2,8,18,18,5";
	   	 info[52]="Grup VI (16): Grup de l�Oxigen\n5� Per�ode\nNo metall\nNombre at�mic = 52\nMassa at�mica = 127,60\nConfiguraci� electr�nica = 2,8,18,18,6";
	   	 info[53]="Grup VII (17): Hal�gens\n5� Per�ode\nNo metall\nNombre at�mic = 53\nMassa at�mica = 126,90\nConfiguraci� electr�nica = 2,8,18,18,7";
	   	 info[54]="Grup VIII (18): Gasos nobles\n5� Per�ode\nNo metall\nNombre at�mic = 54\nMassa at�mica = 131,30\nConfiguraci� electr�nica = 2,8,18,18,8";
	   	 info[55]="Grup I (1): Metalls alcalins\n6� Per�ode\nMetall\nNombre at�mic = 55\nMassa at�mica = 132,90\nConfiguraci� electr�nica = 2,8,18,18,8,1";
	   	 info[56]="Grup II (2): Metalls alcalinoterris\n6� Per�ode\nMetall\nNombre at�mic = 56\nMassa at�mica = 137,34\nConfiguraci� electr�nica = 2,8,18,18,8,2";
	   	 info[78]="Grup 10\n6� Per�ode\nMetall de transici�\nNombre at�mic  = 78\nMassa at�mica = 195,084\nConfiguraci� electr�nica = 2,8,18,32,17,1";
	   	 info[79]="Grup 11\n6� Per�ode\nMetall de transici�\nNombre at�mic = 79\nMassa at�mica = 196,96\nConfiguraci� electr�nica = 2,8,18,32,18,1";
	   	 info[80]="Grup 12\n6� Per�ode\nMetall del transici�\nNombre at�mic = 80\nMassa at�mica = 200,59\n Configuraci� electr�nica = 2,8,18,32,18,2";
	   	 info[81]="Grup III (13): Grup del Bor\n6� Per�ode\nMetall\nNombre at�mic = 81\nMassa at�mica = 204,37\nConfiguraci� electr�nica = 2,8,18,32,18,3";
	   	 info[82]="Grup IV (14): Grup del Carboni\n6� Per�ode\nMetall\nNombre at�mic = 82\nMassa at�mica = 207,2\nConfiguraci� electr�nica = 2,8,18,32,18,4";
	   	 info[83]="Grup V (15): Grup del Nitrogen\n6� Per�ode\nMetall\nNombre at�mic = 83\nMassa at�mica = 208,98\nConfiguraci� electr�nica = 2,8,18,32,18,5";
	   	 info[84]="Grup VI (16): Grup de l�Oxigen\n6� Per�ode\nMetall\nNombre at�mic = 84\nMassa at�mica = (209)\nConfiguraci� electr�nica = 2,8,18,32,18,6";
	   	 info[85]="Grup VII (17): Hal�gens\n6� Per�ode\nNo metall\nNombre at�mic = 85\nMassa at�mica = (210)\nConfiguraci� electr�nica = 2,8,18,32,18,7";
	   	 info[86]="Grup VIII (18): Gasos nobles\n6� Per�ode\nNo metall\nNombre at�mic = 86\nMassa at�mica = (222)\nConfiguraci� electr�nica = 2,8,18,32,18,8";
	   	 info[87]="Grup I (1): Metalls alcalins\n7� Per�ode\nMetall\nNombre at�mic = 87\nMassa at�mica = (223)\nConfiguraci� electr�nica = 2,8,18,32,18,8,1";
	   	 info[88]="Grup II (2): Metalls alcalinoterris\n7� Per�ode\nMetall\nNombre at�mic = 88\nMassa at�mica = (226)\nConfiguraci� electr�nica = 2,8,18,32,18,8,2";
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
		  clas[3]="Transici�";
		  clas[4]="Post-transici�";
		  clas[5]="Hal�gens";
		  clas[6]="Gasos nobles";
		  clas[7]="No metall";
		  clas[8]="Metal�loide";
		  return clas;
		 }
	
}
