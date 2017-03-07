import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuBar extends JMenuBar {

	public MenuBar () {
		
		super();
		//Erstes Men�
		JMenu menu1 = new JMenu("Datei"); 
		
		JMenuItem menuitemcsv = new JMenuItem("Exportieren als CSV-Datei (f�r Excel)");
		menuitemcsv.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) { 
		        JOptionPane.showConfirmDialog(null, "Export csv ausf�hren" , "Titel", 0, 0);
		    } 
		});
		
		
		//Men�items an menu1 hinzuf�gen
		menu1.add(menuitemcsv);
		
		//Men�s hinzuf�gen
		super.add(menu1);


	}

}
