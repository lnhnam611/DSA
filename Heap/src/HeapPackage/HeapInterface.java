package HeapPackage;

public interface HeapInterface<T extends Comparable<? super T>> {
	public void Add(T newEntry);

	public T removeMax();

	public T getMax();

	public boolean isEmpty();

	public int getSize();

	public void clear();

}
