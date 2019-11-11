package dailycoding.challenge9;

public class TreeWithLocks {
	Node root;
	
	public TreeWithLocks(int key) {
		root = new Node(key);
	}
		
	class Node{
		int key;
		boolean is_locked = false;
		Node right, left;
		
		public Node(int key) {
			this.key = key;
			left = right = null;
		}	
	}
	
	private void insertNode(int key, Node root ) {
		if(root.key <= key) {
			
			//null checking 
			if(root.left != null) {
				insertNode(key, root.left);
			}
			else {
				root.left = new Node(key);
			}
			
		}
		else {
			
			//null checking
			if(root.right != null) {
				insertNode(key, root.right);
			}
			
			else {
				root.right = new Node(key);
			}
			
		}
	}
	
	private void locksubTree(Node root) {
		//lock all left
		if(!(root.left == null)) {
			root.is_locked = true;
			locksubTree(root.left);
		}
		
		if(!(root.right == null)) {
			root.is_locked = true;
			locksubTree(root.right);
		}
		
		//lock all right
	}
	
	
	//exposed methods
	public void insert(int key) {
		insertNode(key, this.root);
	}
	
	public void lockNode(int key) {
		Node startNode = this.root;
		while(startNode.key != key) {
			if(startNode.key <= key) {
				startNode = startNode.left;
			}
			else {
				startNode = startNode.right;
			}
			    startNode.is_locked = true;
		}
		
		// lock all node below this node
		locksubTree(startNode);
		
	}

}
