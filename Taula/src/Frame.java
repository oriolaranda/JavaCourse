import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JPasswordField;
import javax.swing.UIManager;


public class Frame extends JFrame {

	private JPanel Panel;
	private JTextField Hidrogen;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame() {
		super ("TAULA PERIÒDICA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(1000,600);
		setResizable(true);
		Panel = new JPanel();
		Panel.setForeground(Color.BLACK);
		Panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel);
		textField = new JTextField();
		Hidrogen = new JTextField();
		Hidrogen.setBorder(null);
		Hidrogen.setBackground(Color(244,244,244));
		
		
		Hidrogen.setCaretColor(new Color(0, 0, 0));
		
		Hidrogen.setFocusTraversalKeysEnabled(false);
		Hidrogen.setMinimumSize(new Dimension(1, 1));
		Hidrogen.setDisabledTextColor(new Color(0, 153, 0));
		Hidrogen.setPreferredSize(new Dimension(0, 0));
		Hidrogen.setSelectionColor(Color.BLACK);
		Hidrogen.setSize(new Dimension(5, 5));
		Hidrogen.setHorizontalAlignment(SwingConstants.CENTER);
		Hidrogen.setBounds(15, 40, 55, 50);
		Hidrogen.setFont(new Font("Tahoma", Font.BOLD, 16));
		Hidrogen.setColumns(10);
		
		
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(75, 40, 55, 50);
		textField.setColumns(10);
		
		JButton BComprobar = new JButton("Comprobar");
		BComprobar.setBounds(533, 524, 103, 29);
		BComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (Hidrogen.getText().equals("Li")){
					Hidrogen.setEnabled(false);
				}else{
					Hidrogen.setText(null);
				}
				if (textField.getText().equals("Be")){
					textField.setEnabled(false);
				}else{
					textField.setText(null);
				}
			}
		});
		
		
		Panel.setLayout(null);
		Panel.add(BComprobar);
		Panel.add(Hidrogen);
		Panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(15, 130, 71, 20);
		Panel.add(passwordField);
	}

	private Color Color(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}
}
