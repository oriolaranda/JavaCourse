package principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

public class Descomposicio {
	
	JPanel label (JPanel panel, JLabel desc) {
		desc.setText("DESCOMPOSICIÓ FACTORIAL");
		desc.setFont(new Font("Tahoma", Font.BOLD, 13));
		desc.setBounds(90, 10, 180, 20);
		desc.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(desc);
		return panel;
	}
	
	JPanel numero (JPanel panel, JTextField numero){
		numero.setToolTipText("Introdueix un nombre");
		numero.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		numero.setBounds(11, 60, 125, 22);
		numero.setColumns(10);
		panel.add(numero);
		return panel;
	}
	
	JPanel grafic (JPanel panel, JTextArea grafic, JScrollPane barra){
		grafic.setFont(new Font("Lucida Console", Font.PLAIN, 12));
		grafic.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		grafic.setDisabledTextColor(Color.BLACK);
	    grafic.setEnabled(false);
	    grafic.setEditable(false);
	    barra.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		barra.setBounds(197, 48, 140, 195);
	    barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    panel.add(barra);
		return panel;
	}
	
	JPanel formula (JPanel panel, JTextArea formula, JScrollPane barra2){
		formula.setFont(new Font("Monospaced 13", Font.PLAIN, 12));
		formula.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		formula.setDisabledTextColor(Color.BLACK);
		formula.setEditable(false);
		formula.setEnabled(false);
		barra2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		barra2.setBounds(10, 192, 165, 50);
	    barra2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	    panel.add(barra2);
		return panel;
	}
	
	JPanel descomposar (JPanel panel, JButton Descomposar, final JTextField numero, final JTextArea grafic, final JTextArea formula){
		Descomposar.setBorder(UIManager.getBorder("CheckBox.border"));
		Descomposar.setToolTipText(null);
		Descomposar.setBounds(11, 95, 125, 22);
		panel.add(Descomposar);
		
		Descomposar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<Integer> array = new ArrayList<Integer>();
				int [] result = new int[100];
				int [] potencia = new int[100];
				String text= numero.getText();
				String espai = "";
				long num= Integer.parseInt(text);
				long ans= num;
				String inf= String.valueOf(ans);
				String mida= String.valueOf(num);
				int as = 0;
				int i=0;
				int n=0;
				int h=0;
				grafic.setFont(new Font("Lucida Console", Font.PLAIN, 12));
				if(num==1){
					grafic.setFont(new Font("Monospaced 13", Font.PLAIN, 12));
					grafic.setText(" L'1 no es considera \n ni nombre primer \n ni nombre compost!");
					formula.setText(" L'1 és la unitat!");
					
				}else{
					for( int a=2; a<=num; a++){
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
							array.add(a);
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
					grafic.setText(textfin +"\n"+ " "+espai + "1"+ " | ");
					String conput ="";
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
				h=0;
			}
		});
		return panel;
	}
	
	JPanel reset (JPanel panel, JButton Reset, final JTextField numero, final JTextArea grafic, final JTextArea formula ){
		Reset.setBorder(UIManager.getBorder("CheckBox.border"));
		Reset.setBounds(11, 125, 125, 22);
		panel.add(Reset);
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero.setText(null);
				grafic.setText(null);
				formula.setText(null);
			}
		});
		return panel;
	}
	
	
	
	
	
	
}
