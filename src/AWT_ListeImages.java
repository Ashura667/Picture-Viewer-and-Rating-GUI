import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JPanel;

public class AWT_ListeImages extends JPanel {
	 String choix[] = {"bretagne", "cellules", " espace", "gaudi"
			 , "lucane", "paris", "personnes", "sport", "tigre"};
	 JList liste;
	 AWT_ListeImages() {
		// TODO Auto-generated constructor stub
		 this.liste = new JList(choix);
		 this.liste.setPreferredSize(new Dimension(500, 700));

		 add(this.liste);
	}

	

}
