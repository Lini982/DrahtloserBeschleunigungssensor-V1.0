import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

public class Main {
	
	JFrame window;
	ChartsRegion chartsRegion;
	ControlsRegion controlsRegion;
	
	public Main() {
		
		window = new JFrame("Telemetry Viewer");
		//chartsRegion = new ChartsRegion();
		//controlsRegion = new ControlsRegion();
		

		
		window.setLayout(new BorderLayout());
		window.add(new MenuBar(), BorderLayout.NORTH);
		window.add(new ChartsRegion(), BorderLayout.CENTER);
		window.add(new ControlsRegion(), BorderLayout.SOUTH);
		
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.setSize( (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width * 0.6), (int) (GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height * 0.6) );
		window.setLocationRelativeTo(null);
		
		window.setMinimumSize(new Dimension(600,400));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

	public static void main(String[] args) {
		
		try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch(Exception e){}
		
		new Main();
		
	}

}
