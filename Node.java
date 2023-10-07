
/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Node {
	
	/** Class field members */
	private int data;
	private Node lChild;
	private Node rChild;

	/** Preferred constructor */
	public Node(int data) {
		lChild = null;
		rChild = null;
		this.data = data;
	}// end preferred constructor

	/** Get the Node's data
	 * @return the data
	 */
	public int getData() {
		return data;
	}// end getData

	/** Set the Node's data
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}// end setData

	/** Get the left child node
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}// end getlChild

	/** Set the left child node
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}// end setlChild

	/** Get the right child node
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}// end getrChild

	/** Set the right child node
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}// end setrChild
	
	/** Get the number of nodes
	 * @return return the number of nodes */
	public int getNumberOfNodes() {
		int leftNumber = 0;
		int rightNumber = 0;
		
		if (lChild != null) {
			leftNumber = lChild.getNumberOfNodes();
		}
		
		if (rChild != null) {
			rightNumber = rChild.getNumberOfNodes();
		}
		
		return 1 + leftNumber + rightNumber;
	}// end getNumberOfNodes 
}// end Node