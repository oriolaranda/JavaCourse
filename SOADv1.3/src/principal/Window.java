package principal;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Classe Window (Visual)
 * @author Oriol Aranda & Sergi Del Rio
 * @version 1.3
 * 
 **/
public class Window extends JFrame implements ActionListener{
	Algorismes A = new Algorismes();
	
	CompoundBorder border = new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
	JPanel contentPane, encrypt, desencrypt, newkey;
	JTabbedPane tabs;
	JLabel text1, text2, text3, text4, text5, text6, text7;
	JTextField input1, input2;
	JPasswordField pass1, pass2;
	JTextArea output1, output2, output3, editor;
	JScrollPane scroll1, scroll2, scroll_editor;
	JButton button1, button2, button3, eina1, eina2, eina3, eina4, eina5, eina6, eina7;
	JSpinner n_char;
	JCheckBox check1, check2, check3, check4;
	JLayeredPane box;
	JFileChooser filechooser=new JFileChooser();
	JDialog editor_cont;
	
	public Window(){
		setIconImage (new ImageIcon(getClass().getResource("/resources/key.png")).getImage());
		tabs = new JTabbedPane(JTabbedPane.TOP);
		tabs.setFocusable(false);
		//tabs.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		
		//contentPane
		contentPane =new JPanel();
		contentPane.setBackground(null);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(tabs);
		setContentPane(contentPane);
		
		
		/* *************** *
		 *  ENCRYPT PANEL  *
		 * *************** */
		
		encrypt = new JPanel();
		encrypt.setLayout(null);
		tabs.addTab("Encrypt", encrypt);
		
		//lbl Missatge
		text1 =new JLabel("Missatge");
		text1.setBounds(20, 20, 60, 26);
		text1.setFont(new Font("Arial", Font.BOLD, 12));
		encrypt.add(text1);
		
		// lbl Clau
		text2 = new JLabel("Clau");
		text2.setBounds(20, 60, 40, 24);
		text2.setFont(new Font("Arial", Font.BOLD, 12));
		encrypt.add(text2);
		
		//Encriptar
		button1 = new JButton("Encriptar!");
		button1.setBounds(150, 100, 100, 30);
		button1.addActionListener(this);
		button1.setFocusable(false);
		button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		encrypt.add(button1);
		
		
		//Missatge real
		input1 = new JTextField();
		input1.setBounds(90, 20, 250, 26);
		input1.setBorder(border);
		encrypt.add(input1);
		
		
		//Clau
		pass1 = new JPasswordField();
		pass1.setBounds(90, 60, 100, 24);
		pass1.setBorder(border);
		encrypt.add(pass1);
		
		//Missatge encriptat
		output1 = new JTextArea();
		output1.setSize(getSize());
		output1.setEditable(false);
		scroll1 = new JScrollPane(output1);
		scroll1.setBounds(50, 150, 300, 80);
		encrypt.add(scroll1);
		
		//Eines (butons adicionals)
		eina1 = new JButton();
		eina1.setBounds(360, 20, 26, 26);
		eina1.addActionListener(this);
		eina1.setFocusable(false);
		eina1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eina1.setIcon( new ImageIcon(Window.class.getResource("/resources/plumafinal.png")));
		eina1.setToolTipText("Obrir l'editor");
		encrypt.add(eina1);
		
		eina2 = new JButton();
		eina2.setBounds(390, 20, 36, 26);
		eina2.addActionListener(this);
		eina2.setFocusable(false);
		eina2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eina2.setIcon( new ImageIcon(Window.class.getResource("/resources/upload.png")));
		eina2.setToolTipText("Importar arxiu de text");
		encrypt.add(eina2);
		
		eina3 = new JButton();
		eina3.setBounds(380, 150, 36, 26);
		eina3.addActionListener(this);
		eina3.setFocusable(false);
		eina3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eina3.setIcon( new ImageIcon(Window.class.getResource("/resources/download.png")));
		eina3.setToolTipText("Descarregar en .txt");
		encrypt.add(eina3);
		
		eina4 = new JButton();
		eina4.setBounds(380, 185, 36, 26);
		eina4.addActionListener(this);
		eina4.setFocusable(false);
		eina4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eina4.setIcon( new ImageIcon(Window.class.getResource("/resources/copyclipboard.png")));
		eina4.setToolTipText("Copiar al portapapers");
		encrypt.add(eina4);
		
		//editor
		editor = new JTextArea();
		editor.setEnabled(true);
		editor.setMargin(new Insets(5, 5, 5, 5));
		scroll_editor = new JScrollPane(editor);
		editor_cont = new JDialog();
		editor_cont.setSize(300,200);
		editor_cont.setLocationRelativeTo(this);
		editor_cont.setEnabled(true);
		editor_cont.add(scroll_editor);
		editor_cont.setVisible(false);
		editor_cont.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				input1.setEnabled(true);
				input1.setText(editor.getText());
				
		}});
		
		
		
		
		/* ****************** *
		 *  DESENCRYPT PANEL  *
		 * ****************** */

		desencrypt = new JPanel();
		desencrypt.setLayout(null);
		tabs.addTab("Desencrypt", desencrypt);
		
		//lbl Missatge
		text3 =new JLabel("Missatge");
		text3.setBounds(20, 20, 60, 26);
		text3.setFont(new Font("Arial", Font.BOLD, 12));
		desencrypt.add(text3);
		
		// lbl Clau
		text4 = new JLabel("Clau");
		text4.setBounds(20, 60, 40, 24);
		text4.setFont(new Font("Arial", Font.BOLD, 12));
		desencrypt.add(text4);
		
		//Desencriptar
		button2 = new JButton("Desencriptar!");
		button2.setBounds(125, 100, 150, 30);
		button2.addActionListener(this);
		button2.setFocusable(false);
		button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		desencrypt.add(button2);
		
		
		//Missatge encriptat
		input2 = new JTextField();
		input2.setBounds(90, 20, 250, 26);
		input2.setBorder(border);
		desencrypt.add(input2);
		
		
		//Clau
		pass2 = new JPasswordField();
		pass2.setBounds(90, 60, 100, 24);
		pass2.setBorder(border);
		desencrypt.add(pass2);
		
		//Missatge desencriptat
		output2 = new JTextArea();
		output2.setSize(getSize());
		output2.setEditable(false);
		scroll2 = new JScrollPane(output2);
		scroll2.setBounds(50, 150, 300, 80);
		desencrypt.add(scroll2);
		
		eina5 = new JButton();
		eina5.setBounds(360, 20, 36, 26);
		eina5.addActionListener(this);
		eina5.setFocusable(false);
		eina5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eina5.setIcon( new ImageIcon(Window.class.getResource("/resources/upload.png")));
		eina5.setToolTipText("Importar arxiu de text");
		desencrypt.add(eina5);
		
		eina6 = new JButton();
		eina6.setBounds(380, 150, 36, 26);
		eina6.addActionListener(this);
		eina6.setFocusable(false);
		eina6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eina6.setIcon( new ImageIcon(Window.class.getResource("/resources/download.png")));
		eina6.setToolTipText("Descarregar en .txt");
		desencrypt.add(eina6);
		
		eina7 = new JButton();
		eina7.setBounds(380, 185, 36, 26);
		eina7.addActionListener(this);
		eina7.setFocusable(false);
		eina7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		eina7.setIcon( new ImageIcon(Window.class.getResource("/resources/copyclipboard.png")));
		eina7.setToolTipText("Copiar al porta-retalls");
		desencrypt.add(eina7);
				
	
		/* ********* * 
		 *  NEW KEY  *
		 * ********* */
		
		newkey = new JPanel();
		newkey.setLayout(null);
		tabs.addTab("Crear clau", newkey);
		
		//lbl Clau
		text5 =new JLabel("Clau");
		text5.setBounds(20, 20, 40, 20);
		text5.setFont(new Font("Arial", Font.BOLD, 12));
		newkey.add(text5);
		
		// lbl nº caracters
		text6 = new JLabel("Nº caràcters");
		text6.setBounds(20, 60, 100, 20);
		text6.setFont(new Font("Arial", Font.BOLD, 12));
		newkey.add(text6);
		
		// Clau
		output3 = new JTextArea();
		output3.setBounds(80,20,150,24);
		output3.setEnabled(true);
		output3.setEditable(false);
		output3.setBorder(border);
		newkey.add(output3);
		
		// Crear
		button3 = new JButton("Crear!");
		button3.setBounds(240,20,80,24);
		button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button3.addActionListener(this);
		button3.setFocusable(false);
		newkey.add(button3);
		
		
		//Spinner
		n_char = new JSpinner();
		n_char.setBounds(190, 60, 40, 20);
		n_char.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		newkey.add(n_char);
		
		
		//Checkboxs
		box = new JLayeredPane();
		box.setBounds(20, 110, 120, 65);
		box.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		newkey.add(box);
		
		check1 = new JCheckBox("A-Z");
		check1.setBounds(25,115,45,24);
		check1.setFocusable(false);
		check1.setSelected(true);
		newkey.add(check1);
		check2 = new JCheckBox("a-z");
		check2.setBounds(90,115,45,24);
		check2.setFocusable(false);
		newkey.add(check2);
		check3 = new JCheckBox("0-9");
		check3.setBounds(25,145,45,24);
		check3.setFocusable(false);
		newkey.add(check3);
		text7 = new JLabel("Error: seleccioneu mínim una opció!");
		text7.setVisible(false);
		text7.setBounds(150,110,200,24);
		newkey.add(text7);
	}

	
	
	
	
	/*DESCARREGAR*/
	
	//Problema si es tanca surt el misatge de guardat (igual a importar també: 	REVISAR)
	public void Descarregar(JFileChooser filechooser, String text){
		try{
			int Checker=filechooser.showSaveDialog(this);
			File file =filechooser.getSelectedFile();
			if(Checker == JFileChooser.APPROVE_OPTION){
				if(file !=null){
					PrintWriter save = new PrintWriter(file+".txt","UTF-8");
					save.write(text);
					save.close();
					JOptionPane.showMessageDialog(null,"L'arxiu s'ha guardat correctament","Enllestit!",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}catch(IOException ex){
			JOptionPane.showMessageDialog(null,"Hi ha hagut un error!","Oops!",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	
	/* IMPORTAR */
	
	public String Importar(JFileChooser filechooser){
		String temp="";   
		String text="";
		filechooser.setFileFilter(new FileNameExtensionFilter("Archivos *.txt", "txt","TXT"));
		try{
			int Checker=filechooser.showOpenDialog(this);
			File file=filechooser.getSelectedFile();
			if(Checker== JFileChooser.APPROVE_OPTION){
				if(file!=null){     
					FileReader read=new FileReader(file);
					BufferedReader br=new BufferedReader(read);
					while((temp=br.readLine())!=null){
						text+= temp;
					}
					br.close();
				}
			}
		}catch(IOException ex){
			JOptionPane.showMessageDialog(null,"No s'ha trobat l'arxiu!","Ooops, Error!",JOptionPane.WARNING_MESSAGE);
		}
		return text;
	}
	
	
	/* PORTA-RETALLS */
	
	public void PortaRetalls(String text){
		StringSelection copiar = new StringSelection(text);
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(copiar, null);
	}
	
	
	

	/* **************** *
	 *  ActionListener  *
	 * **************** */
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1){
			output1.setText(A.encriptar(input1.getText(), pass1.getText()));
		}
		
		if(e.getSource()==button2){
			output2.setText(A.desencriptar(input2.getText(), pass2.getText()));
		}
		
		if(e.getSource()==button3){
			output3.setText(A.crear_clau(((int) n_char.getValue()), check1.isSelected(),check2.isSelected(), check3.isSelected(), text7));
		}
		if(e.getSource()==eina1){
			editor.setText(input1.getText());
			input1.setEnabled(false);
			editor_cont.setVisible(true);
		}
		if(e.getSource()==eina2){
			input1.setText(Importar(filechooser));
		}
		if(e.getSource()==eina3){
			Descarregar(filechooser,output1.getText());
		}
		
		if(e.getSource()==eina4){
			PortaRetalls(output1.getText());
		}
		if(e.getSource()==eina5){
			input2.setText(Importar(filechooser));
		}
		if(e.getSource()==eina6){
			Descarregar(filechooser, output2.getText());
		}
		
		if(e.getSource()==eina7){
			PortaRetalls(output2.getText());
		}
	}
	

}
