package assignment1;

import java.util.Arrays;

/** myList class implemented ListInterface to perform as a list using fixed size array*/

public class MyList<T> implements ListInterface<T> {
	
	//array of elements
	private T[]	myList;
	private int numOfEntries;
	private static final int MAX_CAPACITY = 10000;
	private static final int DEFAULT_CAPACITY = 25;
	private boolean integrity;
		
	/**Default constructor*/
	public MyList() {
		integrity = false;
		@SuppressWarnings("unchecked")
		T[] tempList = (T[])new Object[DEFAULT_CAPACITY + 1];
		myList = tempList;
		numOfEntries = 0;
		integrity = true;
	}
	/**Constructor
	 * @param capacity capacity of the list*/
	public MyList(int capacity) {
		integrity = false;
		if(capacity < DEFAULT_CAPACITY) {
			capacity = DEFAULT_CAPACITY;
		} else {
			checkCapacity(capacity);
			@SuppressWarnings("unchecked")
			T[] tempList = (T[])new Object[capacity + 1];
			myList = tempList;
			numOfEntries = 0;
			integrity = true;
		}
	}
	
	@Override
	public boolean add(T newEntry) {
		// TODO Auto-generated method stub
		checkIntegrity(integrity);
		myList[numOfEntries+1] = newEntry;
		numOfEntries++;
		ensureCapacity();
		return true;
	}

	@Override
	public boolean add(int newPosition, T newEntry) {
		// TODO Auto-generated method stub
		checkIntegrity(integrity);
		if(newPosition>=1 && newPosition<= numOfEntries+1) {
			if(newPosition<=numOfEntries) {
				makeRoom(newPosition);
				myList[newPosition] = newEntry;
				numOfEntries++;
				ensureCapacity();
			} else {
				throw new IndexOutOfBoundsException("Given position for new entry is out of bound");
				
			}
		}	
		return true;
	}

	@Override
	public boolean remove(int position) {
		// TODO Auto-generated method stub
		if(position >=1 && position<=numOfEntries) {
			for(int i = position; i<numOfEntries+1; i++) {
				myList[i] = myList[i+1];
			}
			numOfEntries--;
		} else {
			throw new IndexOutOfBoundsException("Given position for new entry is out of bound");
		}
		return true;
	}

	@Override
	public boolean clear() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		T[] newList = (T[]) new Object[myList.length];
		myList = newList;
		numOfEntries=0;
		return true;
	}

	@Override
	public boolean replace(int position, T newEntry) {
		// TODO Auto-generated method stub
		myList[position] = newEntry;
		return true;
	}

	@Override
	public T getEntry(int postion) {
		// TODO Auto-generated method stub
		return myList[postion];
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		T[] resultArray = (T[]) new Object[numOfEntries];
		for(int i = 0; i<numOfEntries;i++) {
			resultArray[i]=myList[i+1];
		}
		return resultArray;
	}

	@Override
	public int contains(T anEntry) {
		// TODO Auto-generated method stub
		int found = -1;
		for(int i = 1; i<=numOfEntries;i++) {
			if(myList[i] == anEntry) {
				found = i;
			}
		}
		return found;
	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return numOfEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(numOfEntries==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//support functions

	private void checkIntegrity(boolean integrity) {
		if(!integrity) {
			throw new SecurityException("Array object is corrupt");
		}
	}
	
	private void checkCapacity(int capacity) {
		if (capacity > MAX_CAPACITY){
			throw new IllegalStateException("Capacity exceed the maximum capacity is "+ MAX_CAPACITY);
		}		
	}
	private void ensureCapacity() {
		int capacity = myList.length - 1;
		if(numOfEntries > capacity) {
			int newCap = capacity *2;
			checkCapacity(newCap);
			myList = Arrays.copyOf(myList, newCap+1);
		}
	}
	
	private void makeRoom(int position) {
		int newIndex = position;
		int lastIndex = numOfEntries;
		for(int i = lastIndex;i>=newIndex;i--) {
			myList[i+1] = myList[i];
		}
	}
	
	public void printArray() {
		@SuppressWarnings("unchecked")
		T[] printArr = (T[])new Object[numOfEntries];
		printArr = toArray();
		for(int i =0; i< printArr.length; i++) {
			System.out.println(printArr[i]);
		}
	}

}
