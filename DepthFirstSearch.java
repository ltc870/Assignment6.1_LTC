
public class DepthFirstSearch {

	/** Class field members */
	Node root;
	
	/** Preferred Constructor */
	public DepthFirstSearch(Node root) {
		System.out.println("Call DFS with root node to do a Depth First Search");
		this.root = root;
	}// end constructor
	
	/** Depth First Search method
	 * @param Node the node */
	public void DFS(Node node) {
		if (node != null) {
			System.out.println(node.getData());
			DFS(node.getlChild());
			DFS(node.getrChild());
		}// end if statement
	}// end DFS
	
	/** Start Depth First Search */
	public void startDFS() {
		System.out.println("Depth First Search starting with the root");
		DFS(root);
	}// end startDFS
}// end Depth First Search
