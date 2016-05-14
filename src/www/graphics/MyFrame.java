package www.graphics;

import java.awt.BorderLayout;

import javax.swing.JFrame;

//Controller
public class MyFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextPanel textPanel;
	private Toolbar toolbar;
	private FormPanel form;
	
	
	MyFrame(String name){
		super(name);
		
		setLayout(new BorderLayout());
		//create elements
		toolbar = new Toolbar();
		textPanel = new TextPanel();
		form = new FormPanel();
		
		
		toolbar.setTextListener(new StringListener(){

			@Override
			public void textEmitted(String msg) {
				System.out.print(msg);
				textPanel.appendText(msg);
				
			}
			
		});
		
		form.setFormListener(new FormListener(){
			public void formEventOccurred(EventForm e){
				
				String name = e.getName();
				String occupation = e.getOccupation();
				
				textPanel.appendText(name);
				textPanel.appendText(" : ");
				textPanel.appendText(occupation);
				textPanel.appendText("\n");
			}
		});
		
		//add elements
		add(form, BorderLayout.WEST);
		add(textPanel, BorderLayout.CENTER);
		add(toolbar,BorderLayout.NORTH);
		
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
