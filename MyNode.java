
public class MyNode<E extends Comparable<E>> {
	E element;
	MyNode<E> next;
	
	public MyNode(E item) {
		element = item;
		next = null;
	}

}

