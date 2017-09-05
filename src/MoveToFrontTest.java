
public class MoveToFrontTest {
	public static void main(String[] args){
		Node<Character> node = new Node<>();
		node.setElement('a');
		MoveToFrontQueue mv = new MoveToFrontQueue(node);
		mv.addItem('b');
		mv.addItem('c');
		mv.addItem('b');
		mv.addItem('z');
		mv.printAll();
	}
}
