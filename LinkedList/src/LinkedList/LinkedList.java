package LinkedList;


public class LinkedList<T> implements ListInterface<T> {

	private Node firstNode;
	private int numOfEntries;

	public LinkedList() {
		firstNode = null;
		numOfEntries = 0;
	}
	// implement all the method of interface
	@Override
	public void add(T newEntry) {
		// TODO Auto-generated method stub
		Node newNode = new Node(newEntry);
		newNode.nextNode = firstNode;
		firstNode = newNode;
		numOfEntries++;
	}
	@Override
	public void add(int newPosition, T newEntry) {
		// TODO Auto-generated method stub
		if (1 <= newPosition && newPosition <= numOfEntries + 1) {
			Node newNode = new Node(newEntry);
			if (newPosition == 1) {
				newNode.nextNode = firstNode;
				firstNode = newNode;
			} else {
				Node nodeBefore = getNodeAt(newPosition - 1);
				Node nodeAfter = nodeBefore.nextNode;
				nodeBefore.nextNode = newNode;
				newNode.nextNode = nodeAfter;
			}
			numOfEntries++;
		} else {
			throw new IndexOutOfBoundsException("Illegal position given to add operation.");
		}
	}

	@Override
	public T remove(int givenPosition) {
		// TODO Auto-generated method stub

		if (givenPosition >= 1 && givenPosition <= numOfEntries) {
			Node removeNode = getNodeAt(givenPosition);
			Node nodeBefore = getNodeAt(givenPosition - 1);
			Node nodeAfter = removeNode.nextNode;
			nodeBefore.nextNode = nodeAfter;
			return removeNode.data;
		} else {
			throw new IndexOutOfBoundsException("Illegal position given to add operation.");
		}

	}

	@Override
	public void clear() {
		firstNode = null;
		numOfEntries = 0;
		// TODO Auto-generated method stub
	}

	@Override
	public T replace(int givenPosition, T newEntry) {
		// TODO Auto-generated method stub
		getNodeAt(givenPosition).data = newEntry;
		return getNodeAt(givenPosition).data;
	}

	@Override
	public T getEntry(int givenPosition) {
		// TODO Auto-generated method stub
		if (givenPosition >= 1 && givenPosition <= numOfEntries) {
			return getNodeAt(givenPosition).data;
		} else {
			throw new IndexOutOfBoundsException("Illegal position given to add operation.");
		}
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		T[] outArr = (T[])new Object[numOfEntries];
		for(int i = 1; i<=numOfEntries; i++) {
			outArr[i-1] = getNodeAt(i).data;
		}
		return outArr;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return numOfEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean result;
		if (numOfEntries == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	// private class of Node

	private class Node {
		private T data;
		private Node nextNode;

		// constructor
		private Node(T dataPortion) {
			this(dataPortion, null);
		}

		private Node(T dataPortion, Node nextNode) {
			data = dataPortion;
			this.nextNode = nextNode;
		}
	}

	// support functions
	private Node getNodeAt(int position) {
		if ((firstNode != null) && (position <= numOfEntries) && (position >= 1)) {
			Node currentNode = firstNode;
			for (int i = 1; i < position; i++) {
				currentNode = currentNode.nextNode;
			}
			return currentNode;
		} else {
			return null;
		}
	}
	
	public void displayArr() {
		for(int i = 0; i< toArray().length; i++) {
			System.out.println(toArray()[i]);
		}
	}

}
