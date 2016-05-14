package www.graphics;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5380630622087036149L;
	private JTextArea area;
	public TextPanel(){
		area = new JTextArea();
		
		setLayout(new BorderLayout());
		
		add(new JScrollPane(area), BorderLayout.CENTER); //text area wrapped around a JScrollPanel put into a JPanel
		
	}
	
	public void appendText(String text){
		area.append(text);
	}
}

