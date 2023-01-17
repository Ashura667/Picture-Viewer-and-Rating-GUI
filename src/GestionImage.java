import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class GestionImage  extends JFrame implements WindowListener, ItemListener{
	public GestionImage() {
		JFrame f = new JFrame();
	    setLayout(new BorderLayout());
		f.add("East", new AWT_AfficheurImage());
		f.add("West",new AWT_ListeImages());
		f.add("South", new AWT_NoteImage(this));
		f.addWindowListener(this);
		f.setSize(1800,1000);
		f.setVisible(true);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		new GestionImage();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getItem());
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
