
public class Node<Item>  {
	Item element;
	Node next;
	Node prev;

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Item getElement() {
		return element;
	}

	public void setElement(Item element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		String returnValue = String.valueOf(element);
		return returnValue;

	}

}