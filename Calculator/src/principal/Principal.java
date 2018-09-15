package principal;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.TextField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.border.EtchedBorder;
public class Principal extends JFrame {
	private JPanel contentPane;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

public Principal() {
		setTitle("CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 370, 300);
		Descomposicio d = new Descomposicio();
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.setLayout(null);
		contentPane.add(panel);
		
		JLabel desc = new JLabel();
		final JTextField numero = new JTextField();
		final JTextArea grafic = new JTextArea();
		final JTextArea formula = new JTextArea();
		JScrollPane barra = new JScrollPane(grafic);
		JScrollPane barra2 = new JScrollPane(formula);
		JButton Descomposar = new JButton("Descomposar");
		JButton Reset = new JButton("Reiniciar");
		
		d.label(panel, desc);
		d.numero(panel, numero);
		d.grafic(panel, grafic, barra);
		d.formula(panel, formula, barra2);
	    d.descomposar(panel, Descomposar, numero, grafic, formula);
	    d.reset(panel, Reset, numero, grafic, formula);

		
	}
}
