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
	private int beschlEinheit = 2; //2: m/s�; 3: Vielfache von g
	
	public MenuBar () {
		super();
		super.setPreferredSize(new Dimension(100,30));
		//Erstes Men�
		JMenu menu1 = new JMenu("Daten"); 
		JMenuItem menuitem1_1 = new JMenuItem("Exportieren als CSV-Datei (f�r Excel)");
		menuitem1_1.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) { 
		        //Exportcsv aufrufen
		    } 
		});
		
		//Zweites Men�
		JMenu menu2 = new JMenu("Einheiten"); 
		//2: m/s�
		//3; Vielfache von G
	
			
		
			menuitem2_1 = new JMenuItem("Beschleunigungswerte (m/s�)");
			menuitem2_1.addActionListener(new ActionListener() { 	
				public void actionPerformed(ActionEvent e) { 	
					if(beschlEinheit==2) {//wenn aktuell m/s�
						if(JOptionPane.showConfirmDialog(null, "Wollen sie die Werte statt in m/s� in Vielfachen von G anzeigen lassen?" , "Beschleunigungseinheit", 0, 3)==0){
							// letzte Zahl: 0(Error), 1(Achtung), 2(Information), 3(Frage)
							//Datenverarbeitung (Ja(�ndern) gibt 0 zur�ck)
						
							beschlEinheit = 3;
							System.out.println("ms zu G"+ beschlEinheit);
							menuitem2_1.setText("Beschleunigungswerte (G)");
						
						} else {
							//Nein, nicht �ndern (also m/s� lassen)
							beschlEinheit = 2;
							System.out.println("ms zu ms");
						}				
					} else { //sonst		    
			        
						if(JOptionPane.showConfirmDialog(null, "Wollen sie die Werte statt in m/s� in Vielfachen von G anzeigen lassen?" , "Beschleunigungseinheit", 0, 3)==0){
										
							beschlEinheit = 2;
							System.out.println("G zu ms"+ beschlEinheit);		
							menuitem2_1.setText("Beschleunigungswerte (m/s�)");
						
						} else {
							//Nein, nicht �ndern (also g lassen)
							beschlEinheit = 3;
							System.out.println("G zu G");					
						}
					
					}
				}
			});
			
		//Drittes Men�
		JMenu menu3 = new JMenu("Kalibrierung"); 
		JMenuItem menuitem3_1 = new JMenuItem("H�he");
		menuitem3_1.addActionListener(new ActionListener() { 	
		    public void actionPerformed(ActionEvent e) { 
		    	JOptionPane.showInputDialog(null, "Auf welcher H�he befindet sich der Empf�nger gerade?", "H�henkalibrierung", 3);
		    }
		});
		
		    	
		//Viertes Men�
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
		//Men�items an menu1 hinzuf�gen
		menu1.add(menuitem1_1);
		menu2.add(menuitem2_1);
		menu3.add(menuitem3_1);
		menu4.add(menuitem4_1);
		menu4.add(menuitem4_2);
		menu4.add(menuitem4_3);
		
		//Men�s hinzuf�gen
		super.add(menu1);
		super.add(menu4);
		super.add(menu2);
		super.add(menu3);

	}	
	
}
