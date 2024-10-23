package LinkedList;



public class LinkedList<T> implements ListInterface<T> {
	
	private Node firstNode;            // Reference to first node of chain
	private int  numberOfEntries;

	@Override
	public void add(T newEntry) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		Node newNode = new Node(newEntry);
		if(isEmpty()) {
			firstNode = newNode;
		} else {
			Node lastNode = (Node) getEntry(numberOfEntries);
			lastNode.setNextNode(newNode);
		}
		
	}	
	
	private Node getNodeAt(int numberOfEntries) {
		// TODO Auto-generated method stub
		
		return null;
	}


	public LinkedList() {
		initializeLList();
	}
	
	private void initializeLList() {
		firstNode = null;
		numberOfEntries = 0;
	}

	@Override
	public void add(int newPosition, T newEntry) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int givenPosition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		if((1<=givenPosition) 
				&& (givenPosition<= numberOfEntries) 
				&& (firstNode != null)) {
			Node currentNode = firstNode;
			for(int i =1; i<givenPosition; i++) {
				currentNode = currentNode.getNextNode();
			}
			return (T) currentNode;
		}
		else {
			return null;
		}
		
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return numberOfEntries == 0;
	}

}
