import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Main {
	
	static JFrame window;
	ChartsRegion chartsRegion;
	ControlsRegion controlsRegion;
	
	
	private static void setUIFont(javax.swing.plaf.FontUIResource f)
	{
	    java.util.Enumeration<Object> keys = UIManager.getDefaults().keys();
	    while (keys.hasMoreElements())
	    {
	        Object key = keys.nextElement();
	        Object value = UIManager.get(key);
	        if (value instanceof javax.swing.plaf.FontUIResource)
	        {
	            UIManager.put(key, f);
	        }
	    }
	}

	
	public Main() {
		
		window = new JFrame("SLA Multifunktionssensormodulsoftware");
		//chartsRegion = new ChartsRegion();
		//controlsRegion = new ControlsRegion();
	
		window.setLayout(new BorderLayout());

		setUIFont (new javax.swing.plaf.FontUIResource(new Font("Arial", Font.PLAIN, 15)));
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
