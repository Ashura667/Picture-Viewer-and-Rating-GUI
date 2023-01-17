import java.awt.Dimension;
import java.awt.event.ItemListener;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class AWT_ListeImages extends JPanel {
	 String choix[] = {"bretagne", "cellules", " espace", "gaudi"
			 , "lucane", "paris", "personnes", "sport", "tigre"};
	 JList liste;
	 AWT_ListeImages() {
		// TODO Auto-generated constructor stub
		 this.liste = new JList(choix);
		 this.liste.setPreferredSize(new Dimension(500, 700));
		 this.liste.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                JList list = (JList) e.getSource();
	 
	                // execute twice
	                System.out.printf("=====%s=====%n", list.getSelectedValue());
	                
	            }
	        });

		 add(this.liste);

	}
	 
	 

	

}
