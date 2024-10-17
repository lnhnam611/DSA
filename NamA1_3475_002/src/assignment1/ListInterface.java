package assignment1;
/**
 * An interface to perform the list operation**/

public interface ListInterface<T> {
	/**Adds a new entry to the end of the list.
	 * @param newEntry The object that will be added to list
	 * @return true if it successfully added, false if failed
	 */
	public boolean add(T newEntry);
	
	/**Adds a new entry to the list at a given position.
	 * @param newPosition position where a new entry will be added to
	 * @param newEntry The object that will be added to list
	 * @return true if it successfully added, false if failed
	 */
	public boolean add(int newPosition, T newEntry);
	
	/**Removes the entry at a given position from the list.
	 * @param position position where that item will be removed
	 * @return true if it successfully removed, false if failed
	 */
	public boolean remove(int position);
	
	/** Removes all entries from the list.
	 * @return true if it successfully clear, false if failed*/
	public boolean clear();
	
	/**Replaces the entry at a given position in the list with a given entry.
	 * @param position the position where that item will be replaced by new item
	 * @param newEntry the newEntry 
	 * @return true if it successfully replace, false if failed*/
	public boolean replace(int position, T newEntry);
	
	/** Retrieves the entry at a given position in the list.
	 * @param position the position where that item will be retrieved
	 * @return retrieved object*/
	public T getEntry(int postion);
	
	/** Retrieves all entries in the list in their current order.
	 * @return an array of Object */
	public T[] toArray();
	
	/** Sees whether the list contains a given entry.
	 * @return true if the list contain that item, false if does not contain */
	public int contains(T anEntry);
	
	/** Gets the number of entries in the list
	 * @return the number of entries in list */
	public int getLength();
	
	/** Sees whether the list is empty
	 * @return true if it is empty or false if its not*/
	public boolean isEmpty();

}
