package www.graphics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5176414254121087270L;
	private JButton button1; //hello
	private JButton button2; //goodbye
	
	private StringListener textListener;
	
	public Toolbar(){
		
		setBorder(BorderFactory.createEtchedBorder());
		
		button1 = new JButton("Hello");
		button1.setBorder(BorderFactory.createDashedBorder(getBackground()));
		button2 = new JButton("Goodbye");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(button1);
		add(button2);
		
	}//end constructor
	
	public void setTextListener(StringListener listener){
		this.textListener = listener;
	}//end setter

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		JButton clicked = (JButton) e.getSource();
		
		if(clicked == button1){
			
			if(textListener != null){
				textListener.textEmitted("hello\n");
			}
			
		}else if(clicked == button2){
			if(textListener != null){
				textListener.textEmitted("Goodbye\n");
			}
		}
		
		
	}

}
