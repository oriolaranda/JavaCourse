package principal;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * Classe Panel2
 * @author Oriol Aranda & David Pujol & Sergi Del Rio
 * @version 1.1
 * 
 **/

public class Panel2 extends JPanel implements MouseListener {

	Frame f;
	Panel1 p1;
	
	
	/* ************************* *
	 * Constructor JPanel Panel2 *
	 * ************************* */
	public Panel2(){
	}
	
	
	public void initComponents(){
		
	}
	
	
	/* Info principal*/
	public void setPrincipal (Frame f, Panel1 p1){
		this.f=f;
		this.p1=p1;
	}


	
	/* Listeners */
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	}


	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {}

	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
	
	
	
	
}
