package Q1;

public class Tree {
	public Node root;
	
	public Tree() {
		root = null;
	}
	
	public Node find(int emp) {
		Node current = root;
		
		while(current.EmpNo!=emp) {
			if(emp<current.EmpNo) {
				current=current.leftChild;
			}
			else {
				current=current.rightChild;
			}
			if(current == null) {
				System.out.println("Error not found");
				return null;
			}
		}
		System.out.println("Employee Name :" + current.name);
		return current;
	}
	
	void insert(int emp, String name) {
		Node newNode = new Node();
		newNode.EmpNo = emp;
		newNode.name = name;
		
		if(root == null) {
			root = newNode;
		}
		else {
			Node current = root;
			Node parent;
			
			while(true) {
				parent = current;
				if(emp < current.EmpNo) {
					current = current.leftChild;
					
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	private void inOrder(Node localRoot)
	{
		if (localRoot != null)
		 {
			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);
		}
	}
	public void TraverseinOrder() {
		inOrder(root);
	}
	
	private void preOrder(Node localRoot)
	{
		if (localRoot != null)
		{
			localRoot.displayNode();
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}
	public void TraversepreOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node localRoot)
	{
		if (localRoot != null)
		{
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			localRoot.displayNode();
		}
	}
	public void TraversepostOrder() {
		postOrder(root);
	}
	
	public Node findRecursive(Node localRoot,int emp) {
		if(localRoot==null) {
			return null;
		}
		else if(localRoot.EmpNo==emp) {
			System.out.println(localRoot.name);
			return localRoot;
		}
		else if(emp < localRoot.EmpNo) {
			return findRecursive(localRoot.rightChild,emp);
		}
		else {
			return findRecursive(localRoot.rightChild,emp);
		}
	}
	public Node callRecuursive(int emp) {
		return findRecursive(root,emp);
	}
	
	void deleteAll() {
		root = null;
	}

}
