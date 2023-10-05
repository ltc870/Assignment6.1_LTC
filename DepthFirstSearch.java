
public class DepthFirstSearch {

	Node root;
	
	public DepthFirstSearch(Node root) {
		System.out.println("Call DFS with root node to do a Depth First Search");
		this.root = root;
	}
	
	public void DFS(Node node) {
		if (node != null) {
			System.out.println(node.getData());
			DFS(node.getlChild());
			DFS(node.getrChild());
		}
	}
	
	public void startDFS() {
		System.out.println("Depth First Search starting with the root");
		DFS(root);
	}
}
