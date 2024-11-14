package practice;

import java.util.EmptyStackException;

public class LinkedStack<T> implements StackInterface<T> {

	private Node topNode; // References the first node in the chain

	public LinkedStack() {
		topNode = null;
	}
	@Override
	public void push(T newEntry) {
		// TODO Auto-generated method stub
		Node newNode = new Node(newEntry, topNode);
		topNode = newNode;
	}
	@Override
	public T pop() {
		T top = null;
		try {
			top = peek();
		} catch (EmptyQueueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(topNode.next != null) {
			topNode = topNode.next;
		} else {
			topNode = null;
		}		
		return top;
	}
	@Override
	public T peek() throws EmptyQueueException {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new EmptyQueueException();
		} else {
			return topNode.data;
		}		
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return topNode == null;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		topNode = null;
	}
	private class Node {
		private T data; // Entry in stack
		private Node next; // Link to next node		
		private Node (T dataPortion) {
			data = dataPortion;
			next = null;
		}
		private Node(T data, Node nextNode) {
			this.data = data;
			this.next = nextNode;
		}		
	} // end Node


}
