package LinkedList;

public class Node<T> {
	private T data; // Entry in bag
	private Node next; // Link to next node

	public Node(T dataPortion) {
		this(dataPortion, null);
	} // end constructor

	private Node(T dataPortion, Node nextNode) {
		data = dataPortion;
		next = nextNode;
	}

	public Node getNextNode() {
		// TODO Auto-generated method stub
		return next;
	}

	public void setNextNode(T newNode) {
		
		next = (Node) newNode;
		// TODO Auto-generated method stub
		
	}

}
