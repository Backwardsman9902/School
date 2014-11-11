public class MyLinkedList <E extends Comparable<E>> {
	public MyNode<E> head;
	
	//Purpose: No-arg constructor for MyLinkedList
	//Gets: Nothing
	public MyLinkedList() {
	}
	
	//Purpose: Adds an element to the head of the list
	//Gets: E
	//Returns: void
	public void add(E element) {
		MyNode<E> newNode = new MyNode<E>(element);
		newNode.next = head;
		head = newNode;
		
	}
	
	//Puropse: Returns whether or not an element exists in the list
	//Gets: E
	//Returns: boolean
	public boolean find(E element) {
		MyNode<E> current = head;
		while(current != null) {
			E currentElement = current.element;
			if(currentElement.equals(element)) {
				return true;
			}
			else {
				current = current.next;
			}
		}
		return false;
	}
	
	//Purpose: Insert an element before the given target element in the list
	//Gets: E, E
	//Returns: void
	public void insertElementBefore(E targetElement, E insertElement) {
		MyNode<E> current = head;
		
		if(current.element.equals(targetElement)) {
			add(insertElement);
		}
		else {
			while(current.next != null) {
				if(current.next.element.equals(targetElement)) {
					MyNode<E> newNode = new MyNode<E>(insertElement);
					newNode.next = current.next;
					current.next = newNode;
					return;
				}
				current = current.next;
			}
		}
	}
	
	//Purpose: Remove an element from the list
	//Gets: E
	//Returns: void
	public void delete(E element) {
		MyNode<E> current = head;
		if(current.element.equals(element)) {
			head = current.next;
		}
		else {
			while(current.next != null) {
				if(current.next.element.equals(element)) {
					if(current.next.next == null) {
						current.next = null;
						return;
					}
					else {
						//Next node in the list is skipped
						current.next = current.next.next;
						return;
					}
				}
				current = current.next;
			}
		}
	}
	
	//Purpose: Return a String representation of the elements in the list
	//Gets: Nothing
	//Returns: String
	@Override
	public String toString() {
		String list = "[";
		MyNode<E> current = head;
		while(current != null) {
			//Close bracket if it is the end of the list
			list += current.element.toString() + (current.next != null ? ", " : "]");
			current = current.next;
		}
		return list;
	}
}
	
	

