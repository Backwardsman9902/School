public class MySort {
	
	public static <E extends Comparable<E>> void quickSort(MyNode<E> list) {
		quickSort(list, getLastNode(list));
	}

	public static <E extends Comparable<E>> void quickSort(MyNode<E> first, MyNode<E> last) {
		if(first != last && first != null) {
			E pivot = first.element;
			MyNode<E> current = first.next;
			MyNode<E> previous = first;
			
			
			while(current != last.next) {
				if (current.element.compareTo(pivot) < 0) {
					previous.next = current.next;
					
				}
				else {
					first = new MyNode<E>(current.element);
					
				}
				
			
			}
			
		}
	}
	
	public static <E extends Comparable<E>> MyNode<E> getMiddleNode(MyNode<E> head) {
		MyNode<E> current = head;
		MyNode<E> middle = head;
		
		while(current.next.next != null) {
			current = current.next.next;
			middle = middle.next;
		}
		
		return middle;
	}
	
	public static <E extends Comparable<E>> MyNode<E> getLastNode(MyNode<E> head) {
		MyNode<E> currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		return currentNode;
	}
	
	/*public static <E extends Comparable<E>> void quickSort(MyNode<E> first, MyNode<E> last) {
		if(first == last) {
			return;
		}
		MyNode<E> pivot = last;
		MyNode<E> current = first;
		if(current.element.compareTo(pivot.element) > 0) {
			MyNode<E> temp = new MyNode<E>(current.element);
			current = current.next;
			first = first.next;
			last.next = temp;
		}
		while(current.next != pivot && current.next.next != null) {
			if(current.next.element.compareTo(pivot.element) < 0) {
				MyNode<E> temp = new MyNode<E>(current.next.element);
				current.next = current.next.next;
				temp.next = first;
				first = temp;
			}
			else {
				MyNode<E> temp = new MyNode<E>(current.next.element);
				current.next = current.next.next;
				last.next = temp;
				last = temp;
			}
			current = current.next;
			
		quickSort(first, pivot);
		quickSort(pivot, last);
		}
		
	}
	*/
}
