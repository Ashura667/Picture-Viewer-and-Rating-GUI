import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class GestionImage  extends JFrame{
	public GestionImage() {
		JFrame f = new JFrame();
	    setLayout(new BorderLayout());
		f.add("East", new AWT_AfficheurImage());
		f.add("West",new AWT_ListeImages());
		f.add("West",new AWT_ListeImages());
		f.add("South", new AWT_NoteImage());
		f.setSize(1800,1000);
		f.setVisible(true);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		GestionImage aGestionImage = new GestionImage();
	}
}
