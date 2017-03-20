import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class MenuBar extends JMenuBar {
	
	JMenuItem menuitem1_1, menuitem2_1;
	
	//Einstellungen;
	private int beschlEinheit = 2; //2: m/s²; 3: Vielfache von g
	
	public MenuBar () {
		super();
		super.setPreferredSize(new Dimension(100,30));
		//Erstes Menü
		JMenu menu1 = new JMenu("Daten"); 
		JMenuItem menuitem1_1 = new JMenuItem("Exportieren als CSV-Datei (für Excel)");
		menuitem1_1.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) { 
		        //Exportcsv aufrufen
		    } 
		});
		
		//Zweites Menü
		JMenu menu2 = new JMenu("Einheiten"); 
		//2: m/s²
		//3; Vielfache von G
	
			
		
			menuitem2_1 = new JMenuItem("Beschleunigungswerte (m/s²)");
			menuitem2_1.addActionListener(new ActionListener() { 	
				public void actionPerformed(ActionEvent e) { 	
					if(beschlEinheit==2) {//wenn aktuell m/s²
						if(JOptionPane.showConfirmDialog(null, "Wollen sie die Werte statt in m/s² in Vielfachen von G anzeigen lassen?" , "Beschleunigungseinheit", 0, 3)==0){
							// letzte Zahl: 0(Error), 1(Achtung), 2(Information), 3(Frage)
							//Datenverarbeitung (Ja(ändern) gibt 0 zurück)
						
							beschlEinheit = 3;
							System.out.println("ms zu G"+ beschlEinheit);
							menuitem2_1.setText("Beschleunigungswerte (G)");
						
						} else {
							//Nein, nicht ändern (also m/s² lassen)
							beschlEinheit = 2;
							System.out.println("ms zu ms");
						}				
					} else { //sonst		    
			        
						if(JOptionPane.showConfirmDialog(null, "Wollen sie die Werte statt in m/s² in Vielfachen von G anzeigen lassen?" , "Beschleunigungseinheit", 0, 3)==0){
										
							beschlEinheit = 2;
							System.out.println("G zu ms"+ beschlEinheit);		
							menuitem2_1.setText("Beschleunigungswerte (m/s²)");
						
						} else {
							//Nein, nicht ändern (also g lassen)
							beschlEinheit = 3;
							System.out.println("G zu G");					
						}
					
					}
				}
			});
			
		//Drittes Menü
		JMenu menu3 = new JMenu("Kalibrierung"); 
		JMenuItem menuitem3_1 = new JMenuItem("Höhe");
		menuitem3_1.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) { 
		    	JOptionPane.showInputDialog(null, "Auf welcher Höhe befindet sich der Empfänger gerade?", "Höhenkalibrierung", 3);
		    }
		});
		
		    	
		//Viertes Menü
		JMenu menu4 = new JMenu("Layout"); 
		JMenuItem menuitem4_1 = new JMenuItem("1");
		menuitem4_1.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) {
		    	
		    }
		});
		JMenuItem menuitem4_2 = new JMenuItem("2");
		menuitem4_2.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) {
		    	
		    }
		});
		JMenuItem menuitem4_3 = new JMenuItem("3");
		menuitem4_3.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) {
		    	
		    }
		});
		//Menüitems an menu1 hinzufügen
		menu1.add(menuitem1_1);
		menu2.add(menuitem2_1);
		menu3.add(menuitem3_1);
		menu4.add(menuitem4_1);
		menu4.add(menuitem4_2);
		menu4.add(menuitem4_3);
		
		//Menüs hinzufügen
		super.add(menu1);
		super.add(menu4);
		super.add(menu2);
		super.add(menu3);

	}	
	
}
