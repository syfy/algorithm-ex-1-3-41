
public class LinkedList <Item> {
	Node<Item> headNode;
	Node<Item>  firstNode;

	LinkedList(Item headContent) {
		Node newNode = new Node();
		newNode.setElement(headContent);
		newNode.setNext(null);
		newNode.setPrev(null);
		headNode = newNode;
		firstNode = newNode;
	}

	public void addItem(Item itemContent) {
		Node newNode = new Node<Item>();
		newNode.setElement(itemContent);
		newNode.next = headNode;
		headNode.prev = newNode;
		headNode = newNode;
	}

	public void addItemOnBegining(Item itemContent) {
		Node newNode = new Node<Item>();
		newNode.setElement(itemContent);
		newNode.prev = firstNode;
		firstNode.next = newNode;
		firstNode = newNode;
	}

	public int getLength() {
		int returnValue = 0;

		Node currentNode = headNode;

		while (currentNode != null) {
			returnValue++;
			currentNode = currentNode.next;
		}
		return returnValue;
	}

	public void removeHead() {
		System.out.println("Removing head");

		headNode = headNode.next;
		headNode.prev = null;
	}

	public void removeTail() {
		System.out.println("Removing tail");

		firstNode = firstNode.prev;
		firstNode.next = null;
	}

	public Node find(Item content) {
		Node currentNode = headNode;	
		Node returValue = null;

		while (currentNode != null) {
			if (currentNode.getElement() == content) {
				System.out.println("Found ");
				returValue = currentNode;
			}
			

			currentNode = currentNode.next;

		}
		return returValue;
	}

	public void insertBefore(Node node, Node newNode) {
		System.out.println("Insert Before");
		Node currentNode = headNode;
		while (currentNode != null) {
			if (currentNode == node) {
				System.out.println("Hit");
				// insert prev.
		
				Node tNewNode = newNode;
				tNewNode.next = currentNode;
				tNewNode.prev = currentNode.prev;
				if (headNode == currentNode) { // isHead node then set new head
					headNode = tNewNode;
			}
			
				currentNode.prev = tNewNode;

			}	

			currentNode = currentNode.next;
		}
	}

	public void insertAfter(Node node, Node newNode) {
		System.out.println("Insert After");
		Node currentNode = headNode;
		while (currentNode != null) {
			if (currentNode == node) {
				System.out.println("Hit");
				// insert prev.
		
				Node tNewNode = newNode;
				
				tNewNode.prev = currentNode;
				tNewNode.next = currentNode.next;
				//if (firstNode == currentNode) { // isHead node then set new head
				//	firstNode = tNewNode;
				//}
				currentNode.next.prev = tNewNode;
				currentNode.next = tNewNode;
				
					
			}

			currentNode = currentNode.next;
		}
	}
	
	public void remove(Item item){
		System.out.println("Remove");
		Node nodeToRemove = find(item);
		if(nodeToRemove!=null){
			//remove
			nodeToRemove.prev.next = nodeToRemove.next;
			nodeToRemove.next.prev = nodeToRemove.prev;
			
		}
	}

	public void printAll() {
		Node currentNode = headNode;
		System.out.println("Printing :");
		while (currentNode != null) {
			System.out.print(currentNode.toString() + " ");

			currentNode = currentNode.next;

		}
		System.out.println("");
		System.out.println("Head :" + headNode.getElement() + " Tail: " + firstNode.getElement());
	}

	public void printAllReverse() {
		Node currentNode = firstNode;
		System.out.println("Printing Reverse Order :");

		while (currentNode != null) {
			System.out.print(currentNode.toString() + " ");
			currentNode = currentNode.prev;

		}
		System.out.println();
		System.out.println("Head :" + headNode.getElement() + " Tail: " + firstNode.getElement());

	}
}