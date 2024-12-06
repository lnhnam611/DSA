package HeapPackage;

import java.util.Arrays;

public class MaxHeap<T extends Comparable<? super T>> implements HeapInterface<T> {

	private T[] heap;
	private int lastIndex;
	private boolean integrityOK = false;
	private static final int DEF_CAPA = 25;
	private static final int MAX_CAPA = 10000;

	public MaxHeap() {
		this(DEF_CAPA);
	}

	@SuppressWarnings("unchecked")
	public MaxHeap(int initialCapacity) {
		if (initialCapacity < DEF_CAPA)
			initialCapacity = DEF_CAPA;
		else
			checkCapacity(initialCapacity);		
		T[] tempHeap = (T[]) new Comparable[initialCapacity + 1];
		heap = tempHeap;
		lastIndex = 0;
		integrityOK = true;
	}

	public MaxHeap(T[] entries) {
		this(entries.length);
		lastIndex = entries.length;
		for (int i = 0; i < entries.length; i++)
			heap[i + 1] = entries[i];
		for (int rootIndex = lastIndex / 2; rootIndex > 0; rootIndex--) {
			reheap(rootIndex);
		}
	}

	@Override
	public void Add(T newEntry) {
		// TODO Auto-generated method stub
		checkIntegrity();
		int newIndex = lastIndex + 1;
		int parentIndex = newIndex / 2;
		while ((parentIndex > 0) && newEntry.compareTo(heap[parentIndex]) > 0) {
			heap[newIndex] = heap[parentIndex];
			newIndex = parentIndex;
			parentIndex = newIndex / 2;
		}
		heap[newIndex] = newEntry;
		lastIndex++;
		ensureCapacity();
	}

	@Override
	public T removeMax() {
		// TODO Auto-generated method stub
		checkIntegrity();
		T root = null;
		if (!isEmpty()) {
			root = heap[1];
			heap[1] = heap[lastIndex];
			lastIndex--;
			reheap(1);
		}
		return root;
	}

	@Override
	public T getMax() {
		// TODO Auto-generated method stub
		checkIntegrity();
		T root = null;
		if (!isEmpty())
			root = heap[1];
		return root;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return lastIndex == 0;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return lastIndex;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		checkIntegrity();
		while (lastIndex > -1) {
			heap[lastIndex] = null;
			lastIndex--;
		}
		lastIndex = 0;
	}

	// support functions
	private void checkCapacity(int initialCapacity) {
		if (initialCapacity > MAX_CAPA) {
			throw new SecurityException("Array is too large");
		}
	}

	private void checkIntegrity() {
		if (!integrityOK) {
			throw new SecurityException("The array is corrupted");
		}
	}

	private void ensureCapacity() {
		if (lastIndex >= heap.length) {
			int newLength = heap.length * 2;
			checkCapacity(newLength);
			heap = Arrays.copyOf(heap, newLength);
		}
	}

	private void reheap(int rootIndex) {
		boolean done = false;
		T orphan = heap[rootIndex];
		int leftChildIndex = 2 * rootIndex;
		while (!done && (leftChildIndex <= lastIndex)) {
			int largerChildIndex = leftChildIndex;
			int rightChildIndex = leftChildIndex + 1;
			if ((rightChildIndex <= lastIndex) && (heap[rightChildIndex].compareTo(heap[largerChildIndex]) > 0)) {
				largerChildIndex = rightChildIndex;
			}
			if (orphan.compareTo(heap[largerChildIndex]) < 0) {
				heap[rootIndex] = heap[largerChildIndex];
				rootIndex = largerChildIndex;
				leftChildIndex = 2 * rootIndex;
			} else
				done = true;
		}
		heap[rootIndex] = orphan;
	}

	private static <T extends Comparable<? super T>> void reheap(T[] heap, int rootIndex, int lastIndex) {
		boolean done = false;
		T orphan = heap[rootIndex];
		int leftChildIndex = 2 * rootIndex + 1;
		while (!done && (leftChildIndex <= lastIndex)) {
			int largerChildIndex = leftChildIndex;
			int rightChildIndex = leftChildIndex + 1;
			if ((rightChildIndex <= lastIndex) && (heap[rightChildIndex].compareTo(heap[largerChildIndex])) > 0) {
				largerChildIndex = rightChildIndex;
			}
			if (orphan.compareTo(heap[largerChildIndex]) < 0) {
				heap[rootIndex] = heap[largerChildIndex];
				rootIndex = largerChildIndex;
				leftChildIndex = 2 * rootIndex + 1;
			} else
				done = true;
		}
		heap[rootIndex] = orphan;
	}

	public static <T extends Comparable<? super T>> void heapSort(T[] arr, int n) {
		for (int rootIndex = n / 2 - 1; rootIndex >= 0; rootIndex--)
			reheap(arr, rootIndex, n - 1);
		swap(arr, 0, n - 1);
		for (int lastIndex = n - 2; lastIndex > 0; lastIndex--) {
			reheap(arr, 0, lastIndex);
			swap(arr, 0, lastIndex);
		}
	}

	public static <T extends Comparable<? super T>> void swap(T[] arr, int i, int j) {
		T temp = arr[i];

		arr[i] = arr[j];
		arr[j] = temp;
	}

}
