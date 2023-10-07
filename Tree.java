
/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
import java.util.Queue; // import the Queue class
import java.util.LinkedList;

public class Tree {

	/** Class member fields */
	private int height;
	private Node root;

	/** Empty argument constructor */
	public Tree() {
		setRoot(new Node(1));
	}//end empty argument constructor

	/**
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}// end getNode

	/**
	 * @param root the root to set
	 */
	public void setRoot(Node root) {
		this.root = root;
	}// end setRoot

	// returns the root node
	public Node generatePracticeTree(int height) {
		this.height = height;
		int level = 1;
		// Creating tree breadth-first so
		// Put the child nodes in a queue
		Queue<Node> childQ = new LinkedList<Node>();
		Node pn = root;
		// Create the children of the root and put some data
		// Put them in the child queue
		// int value=pn.getData();

		childQ.add(pn);
		System.out.println("Root Node value: " + pn.getData());
		int value = pn.getData();

		// Remove the front of the queue
		// Create its children
		// Put them in the queue
		// Data is just parent data+1 or 2 depending on which child
		while (level < (height) && !childQ.isEmpty()) {
			System.out.println("Level is: " + level);
			for (int i = 1; i <= Math.pow(2, (level - 1)); i++) {
				pn = childQ.remove();
				System.out.println("Parent Node value: " + pn.getData());
				value++;
				System.out.println("Adding Left Child: " + (value));
				pn.setlChild(new Node(value));
				childQ.add(pn.getlChild());
				value++;
				System.out.println("Adding Right Child: " + (value));
				pn.setrChild(new Node(value));
				childQ.add(pn.getrChild());
			}// end for statement
			level++;
			System.out.println("Level: " + level);
		}// end while loop
		return root;
	}// end generatePracticeTree
	
	/** Get the height of the tree
	 * @return return the height of the tree */
	public int getHeight() {
		return height;
	}// end getHeight
	
	/** Get the number of nodes in the tree
	 * @return return the number of nodes in the tree */
	public int getNumberOfNodes() {
		int numberOfNodes = 0;
		
		if (root != null) {
			numberOfNodes = root.getNumberOfNodes();
		}
		
		return numberOfNodes;
	}// end getNumberOfNodes
}// end Tree
