
/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Node {
	private int data;
	private Node lChild;
	private Node rChild;

	public Node(int data) {
		lChild = null;
		rChild = null;
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the lChild
	 */
	public Node getlChild() {
		return lChild;
	}

	/**
	 * @param lChild the lChild to set
	 */
	public void setlChild(Node lChild) {
		this.lChild = lChild;
	}

	/**
	 * @return the rChild
	 */
	public Node getrChild() {
		return rChild;
	}

	/**
	 * @param rChild the rChild to set
	 */
	public void setrChild(Node rChild) {
		this.rChild = rChild;
	}
	
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
	}

}