package lab2recursion;

class Node
{
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class ReverseList {
	public static void main(String[] args) {
		List myList = new List(6);
		myList.next = new List(4);
		myList.next.next = new List(2);
		myList.next.next.next = new List(0);
		System.out.println("Original List: "+myList.tostring());
		//now reverse it
		myList = Reverse(myList);
		System.out.println("Reversed List: "+myList.tostring());
		
		System.out.println("Count of nodes is " +
                myList.getCount());
		
		
	}


	static List Reverse(List L) {
		//checks if L is empty or only has one element then return
		if(L==null || L.next==null)
			return L;
		List remainingReverse = Reverse(L.next);
		L.next.next = L;
		L.next = null;
		return remainingReverse;
	}
}

class List {
	Node head;
	int value;
	List next;
	//constructor
	public List(int k) {
		value = k;
	}
	public String tostring() {
		List current = this;
		String output = "";
		while(current!=null) {
			output += current.value+"->";
			current = current.next;
		}
		return output+"NULL";
	}
	
	 public int getCount()
	    {
	        Node temp = head;
	        int count = 0;
	        while (temp != null)
	        {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }
}



