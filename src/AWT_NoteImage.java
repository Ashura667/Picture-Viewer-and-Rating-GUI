import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class AWT_NoteImage extends JPanel {
	Checkbox[] étoiles = new Checkbox[5];
	public static String[] libellés = {"1 étoile", "2 étoiles", "3 étoiles", "4 étoiles", "5 étoiles"};
	AWT_NoteImage(ItemListener l) {
		
		this.setLayout(new FlowLayout());
		
		CheckboxGroup cg=new CheckboxGroup();
		for (int i=0; i<5; i++) {
			this.étoiles[i] = new Checkbox(libellés[i], false, cg);
			this.étoiles[i].addItemListener(l);

			this.add(this.étoiles[i]);
		}
		

		
		
		
	}

}
