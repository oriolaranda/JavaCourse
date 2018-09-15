import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;


public class Elements {
	Toolkit t = Toolkit.getDefaultToolkit();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int amplada_pant = screenSize.width;
	int alçada_pant = screenSize.height;
	JPanel simbols(JPanel Panel, JTextField buto[], JLabel label[]){
		Panel.setVisible(true);
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		Panel.setLayout(null);
		int columna =  (amplada_pant* (11/800));
		int fila = (alçada_pant* (29/800));
		int fila2=0;
		int columna2=(amplada_pant* (11/800));
		for (int y=1; y<19; y++){
			String b = Integer.toString(y);
			label[y]=new JLabel(b);
			label[y].setHorizontalAlignment(SwingConstants.CENTER);
			label[y].setBounds(columna2,fila2,(amplada_pant *(35/800)),(alçada_pant *(35/800)));
			Panel.add(label[y]);
			columna2= columna2 +(amplada_pant *(43/800));
		}
		
		for (int i=1;i<=60;i++){
			buto[i]= new JTextField();
			buto[i].setBounds(columna,fila,amplada_pant *(39/800), alçada_pant *(35/800));
			buto[i].setColumns(10);
			buto[i].setHorizontalAlignment(SwingConstants.CENTER);
			buto[i].setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			buto[i].setDisabledTextColor(new Color(0, 153, 0));
			Panel.add(buto[i]);
			if(i==1){
				columna = amplada_pant *(699/800);
			}
			if(i==2||i==10||i==18||i==36||i==38||i==47||i==49||i==58||i==4||i==12){
				if(i==2||i==10||i==18|| i==36|| i==47|| i==58){
				columna=amplada_pant* (11/800);
				fila= fila + alçada_pant* (36/800);
				}
				if(i==4||i==12){
				columna = amplada_pant* (527/800);
				}
				if(i==38||i==49){
				columna = amplada_pant* (398/800);
				}
			}else{
				columna= columna + amplada_pant* (43/800);
			}
		}
		return Panel;
	}
	JPanel comprovar(JPanel Panel, final JTextField buto[]){ 
		
		JButton comprobar = new JButton("Comprobar");
		  comprobar.setBounds(1000, 600, 103, 29);
		  Panel.add(comprobar);
		  comprobar.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
		   for(int i =1; i<61;i++) {
		    if (buto[i].getText().equals("Li")){
		    	buto[i].setEnabled(false);
		    }else{
		     buto[i].setText(null);
		    }
		    
		   }
		   }


		  });
		return Panel;
	}
	
	}
