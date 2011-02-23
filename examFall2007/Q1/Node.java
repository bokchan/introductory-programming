package examFall2007.Q1;

public class Node<E> {

	E hd;
	Node<E> tl;
	
	
	public Node(E e, Node<E> ls) {
		
		hd = e;
		tl = ls;
	}
}