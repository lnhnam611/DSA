package practice;

public interface StackInterface<T> {	
	public void push(T newEntry);	
	public T pop() throws EmptyQueueException;	
	public T peek() throws EmptyQueueException;	
	public boolean isEmpty();
	public void clear();
}
