import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class MenuBar extends JMenuBar {
	
	private JMenuItem menuitem2_1;
	
	public MenuBar () {
		
		super();
		//Erstes Menü
		JMenu menu1 = new JMenu("Daten"); 
		
		JMenuItem menuitem1_1 = new JMenuItem("Exportieren als CSV-Datei (für Excel)");
		menuitem1_1.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) { 
		        JOptionPane.showConfirmDialog(null, "Export csv ausführen" , "Titel", 0, 0); // letzte Zahl: 0(Error), 1(Achtung), 2(Information), 3(Frage)
		    } 
		});
		
		JMenu menu2 = new JMenu("Einheiten"); 
		
		if(1>0) {//wenn aktuell m/s²
			menuitem2_1 = new JMenuItem("Beschleunigungswerte (m/s²)");
			menuitem2_1.addActionListener(new ActionListener() { 	
				public void actionPerformed(ActionEvent e) { 		    
					JOptionPane.showConfirmDialog(null, "Wollen sie die Werte statt in m/s² in Vielfachen von G anzeigen lassen?" , "Beschleunigungseinheit", 0, 3); // letzte Zahl: 0(Error), 1(Achtung), 2(Information), 3(Frage)
					//Datenverarbeitung (Ja, heißt  ändern)
		    		}
				}); 
		} else { //sonst
		    menuitem2_1 = new JMenuItem("Beschleunigungswerte (G)");
			menuitem2_1.addActionListener(new ActionListener() { 	
			    public void actionPerformed(ActionEvent e) { 		    
			        JOptionPane.showConfirmDialog(null, "Wollen sie die Werte statt in Vielfachen von G in m/s² anzeigen lassen?" , "Beschleunigungseinheit", 0, 3); // letzte Zahl: 0(Error), 1(Achtung), 2(Information), 3(Frage)
			        //Datenverarbeitung (Ja, heißt  ändern)
			    } 
		});
		}
		
		//Menüitems an menu1 hinzufügen
		menu1.add(menuitem1_1);
		menu2.add(menuitem2_1);
		
		//Menüs hinzufügen
		super.add(menu1);
		super.add(menu2);


	}

}
