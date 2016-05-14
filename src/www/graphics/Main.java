package www.graphics;


import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable(){ //more robust

			@Override
			public void run() {
				
				MyFrame frame = new MyFrame("Hello world");
				
				
			}
			
		});
		
	}

}
 