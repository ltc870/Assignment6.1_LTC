/**
 * 
 */

/**
 * @author Nathan Johnson, Bellarmine University
 *
 */
public class Application {

	/**
	 * @param args Tree Height
	 */
	public static void main(String[] args)
	{
		//System.out.println("Creating a tree of height "+ args[0]+".");
		Tree aTree=new Tree();//Creates a tree with root
		Node root=aTree.generatePracticeTree(5);
		DepthFirstSearch aSearch = new DepthFirstSearch(root);
		
		int treeHeight = aTree.getHeight();
		System.out.println("Number of Nodes traversed: " + root.getNumberOfNodes());
		System.out.println("Tree height of the tree is: " + treeHeight);
		aSearch.startDFS();
	}

}