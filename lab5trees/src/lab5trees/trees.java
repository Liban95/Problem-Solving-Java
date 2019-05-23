package lab5trees;

public class trees {

	Node parent;
	
	public void addNode(int Money, String name)
	{
		Node newNode = new Node(Money, name);
		if (parent == null){
			parent = newNode;
		} else {
			Node data = parent;
			
			Node parent;
			
			while(true) {
				parent = data;
				
				if (Money < data.Money){
					data = data.leftChild;
							if(data == null){
								parent.leftChild = newNode;
										return;
							}
				} else {
					data = data.rightChild;
					if (data == null){
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	public void inOrderTraverseTree(Node data)
	{
		if (data != null)
		{
			
			inOrderTraverseTree(data.leftChild);
			
			System.out.println(data);
			
			inOrderTraverseTree(data.rightChild);
		}
	}
	
	public Node findNode (int Money)
	{
		Node data = parent;
		
		while (data.Money != Money)
		{
			if(Money < data.Money) {
				data = data.leftChild;
			}else {
				data = data.rightChild;
			}
			if (data == null)
				return null;
		}
		return data;
	}
	
	public static void main(String[] args) 
	{
		
		trees theTree = new trees();
		
		theTree.addNode(50, "Grandfather");
		theTree.addNode(80, "Grandmother");
		theTree.addNode(25, "Dad");
		theTree.addNode(15, "Mum");
		theTree.addNode(30, "Brother");
		theTree.addNode(75, "Sister");

		theTree.inOrderTraverseTree(theTree.parent);
	
		System.out.println("\nSearch for £50");
		System.out.println(theTree.findNode(50));
		
		System.out.println("\nSearch for £100");
		System.out.println(theTree.findNode(100));
		
	}
}
	
	
	class Node {
		int Money;
		String name;
		
		Node leftChild;
		Node rightChild;
		
		Node(int Money, String name){
			this.Money = Money;
			this.name = name;
		}
		
		public String toString(){
			return name + " has this much money: £" + Money;
		}
		
	}
	

