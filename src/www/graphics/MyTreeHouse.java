package www.graphics;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class MyTreeHouse extends JFrame{

	 private JTree tree;
	    public MyTreeHouse()
	    {
	        //create the root node
	        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
	        //create the child nodes
	        DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetables");
	        DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
	 
	        //add the child nodes to the root node
	        root.add(vegetableNode);
	        root.add(fruitNode);
	         
	        //create the tree by passing in the root node
	        tree = new JTree(root);
	        add(tree);
	         
	        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        this.setTitle("JTree Example");       
	        this.pack();
	        this.setVisible(true);
	    }
	     
	    public static void main(String[] args)
	    {
	        SwingUtilities.invokeLater(new Runnable() {
	            @Override
	            public void run() {
	              MyTreeHouse tree =  new MyTreeHouse();
	                tree.addTreeNodes();
	            }
	        });
	    }       
	    
	    public void addTreeNodes(){
	    	DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetables");
	    	vegetableNode.add(new DefaultMutableTreeNode("Capsicum"));
	    	vegetableNode.add(new DefaultMutableTreeNode("Carrot"));
	    	vegetableNode.add(new DefaultMutableTreeNode("Tomato"));
	    	vegetableNode.add(new DefaultMutableTreeNode("Potato"));
	    	
	    	
	    	 
	    	DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
	    	fruitNode.add(new DefaultMutableTreeNode("Banana"));
	    	fruitNode.add(new DefaultMutableTreeNode("Mango"));
	    	fruitNode.add(new DefaultMutableTreeNode("Apple"));
	    	fruitNode.add(new DefaultMutableTreeNode("Grapes"));
	    	fruitNode.add(new DefaultMutableTreeNode("Orange"));
	    }
}
