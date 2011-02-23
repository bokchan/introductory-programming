package examFall2007.Q1;

public class List {
	
		
public static <T> int length(Node<T> ls) {
	
	if (ls == null) return 0;
	else return 1 + length(ls.tl);
	
} 

public <T> Node<T> Head(Node<T> ls) {
	
	return null;
}

public <T> Node<T> Tail(Node<T> ls) {
	return null;
} 

public static <T> void printList(Node<T> ls) {
	Node<T> tmp = ls; 
	while(tmp != null) {
		System.out.println(((Person) tmp.hd).toString());
		tmp = tmp.tl;
	}
}
}



class EmptyListException extends IllegalArgumentException {
	public EmptyListException() {}
	public EmptyListException(String message) {
		super(message);
	}
	
}


