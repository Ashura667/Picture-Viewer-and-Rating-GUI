import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AWT_AfficheurImage extends JPanel{
	String path_defaultString;
	ImageIcon icone;
	JLabel image;
	AWT_AfficheurImage() {
		this.path_defaultString = "images/paris.jpg";
		this.icone = new ImageIcon(this.path_defaultString);
		
	    this.image = new JLabel(icone);
	    this.image.setSize(640,360);
	    add(image);
		
	}

}
