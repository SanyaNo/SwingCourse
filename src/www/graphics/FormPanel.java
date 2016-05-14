package www.graphics;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {
	
	private JLabel nameLabel;
	private JLabel occupationLabel;
	
	private JTextField nameField;
	private JTextField occupationField;
	
	private JButton submit;
	
	private FormListener listener;
	
	
	public FormPanel(){
		Dimension dim = getPreferredSize(); //some LayoutManagers ignore it completely
		dim.width = 250;
		setPreferredSize(dim); //borderlayout manager-s nqma da ignore-ne the width
		
		nameLabel = new JLabel("Name: ");
		occupationLabel = new JLabel("Occupation: ");
		
		nameField = new JTextField(10);
		nameField.setSize(WIDTH, HEIGHT);
		occupationField = new JTextField(10);
		occupationField.setSize(WIDTH, HEIGHT);
		submit = new JButton("Submit");
		
		submit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String name = nameField.getText();
				String occupation = occupationField.getText();
				
				EventForm event = new EventForm(this, name, occupation);
				
				if(listener != null){
					listener.formEventOccurred(event);
				}
				
			}
			
		});
		
		
		Border innerBorder = BorderFactory.createTitledBorder("Add Person");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		
		//First row////////////////////////////////////////////////
		gc.weightx = 1;
		gc.weighty = 0.1;
		gc.gridx = 0; //we are going from left to right, this is the first element
		gc.gridy = 0;
		
		gc.fill = GridBagConstraints.NONE; // do not fill all the space
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(nameLabel, gc);  
		
		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(nameField, gc);
		
		//Second row//////////////////////////////////////////////
		gc.weightx = 1;
		gc.weighty = 0.1;
		
		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		gc.insets = new Insets(0, 0, 0, 5);
		add(occupationLabel, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		gc.insets = new Insets(0, 0, 0, 0);
		add(occupationField, gc);
		
		//third row///////////////////////////////////////////////
		gc.weightx = 1;
		gc.weighty = 2;
		gc.gridx = 1;
		gc.gridy = 3;
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		add(submit, gc);
		
		
	}
	
	public void setFormListener(FormListener fl){
		this.listener = fl;
	}

}
