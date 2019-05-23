package lab2;

public class Link {
	
	public String fruitName;
	
	// Reference to next link made in the LinkList
	// Holds the reference to the Link that was created before it
	// Set to null until it is connected to other links
	
	public Link next; 
	
	public Link(String fruitName){
		
		this.fruitName = fruitName;
		
	}
	
	public void display(){
		
		System.out.println(fruitName);
		
	}
	
	public String toString(){
		
		return fruitName;
		
	}
	
	
	public static void main(String[] args) {
		
		LinkList theLinkedList = new LinkList();
		
		// Insert Link and add a reference to the fruit Link added just prior
		// to the field next
		
		theLinkedList.insertFirstLinks("Apple");
		theLinkedList.insertFirstLinks("Mango");
		theLinkedList.insertFirstLinks("Banana");
		theLinkedList.insertFirstLinks("Kiwi");
		
		theLinkedList.display();
		
		System.out.println("Value of first in LinkedList :" + theLinkedList.firstLink + "\n");
		
		// Removes the last Link entered
		
		theLinkedList.removeFirst();
		
		theLinkedList.display();
		
		System.out.println(theLinkedList.find("Apple").fruitName + " Was Found");
		
		theLinkedList.removeLink("Banana");
		
		System.out.println("\nBanana\n");
		
		theLinkedList.display();
		
	}
	
}