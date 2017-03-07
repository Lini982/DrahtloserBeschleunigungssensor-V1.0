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
		//Erstes Menü
		JMenu menu1 = new JMenu("Datei"); 
		
		JMenuItem menuitemcsv = new JMenuItem("Exportieren als CSV-Datei (für Excel)");
		menuitemcsv.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) { 
		        JOptionPane.showConfirmDialog(null, "Export csv ausführen" , "Titel", 0, 0);
		    } 
		});
		
		
		//Menüitems an menu1 hinzufügen
		menu1.add(menuitemcsv);
		
		//Menüs hinzufügen
		super.add(menu1);


	}

}
