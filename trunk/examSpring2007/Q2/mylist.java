package examSpring2007.Q2;

/*
 * Exercises in lists:
 *   - given data type program and test:
 *        - length
 *        - iter_length
 *        - copy
 *        - reverse (functional, recursive)
 *        - in_place_reverse (iterative)
 *        - append (functional)
 *        - in_place_append (iterative)
 * 
 * Note that the functions are all static methods - since 
 * they are simply functions operating on the data type (don't depend
 * on any instance variables).
 * 
 */

class Node<E> {
	E hd;
	Node<E> tl;

	public Node(E e, Node<E> ls) {
		hd = e;
		tl = ls;
	}
} 

interface Pred<T> {
	boolean test(T t);
}


class List {

	static <T> Node<T> filter(Node<T> ls, Pred<T> p) {
		if (ls == null) return null;
		else {
			if (p.test(ls.hd))
				return new Node<T>(ls.hd, filter(ls.tl, p));
			else 
				return filter(ls.tl,p);
		} 
	}

	// 
	static <T> int length(Node<T> ls) {
		if (ls == null) return 0;
		else return 1 + length(ls.tl);
	}

	static <T> int iter_length(Node<T> ls) {
		int res = 0;
		while (ls != null) {
			res += 1;
			ls = ls.tl;
		}
		return res;
	}

	static <T> String print(Node<T> ls) {
		if (ls == null) return "";
		else return ls.hd.toString() + " " + print(ls.tl);
	}

	/* copy */
	static <T> Node<T> copy(Node<T> ls) {
		if (ls == null) return null;
		else return new Node<T>(ls.hd, copy(ls.tl));
	}

	/* functional reverse, recursive */
	static <T> Node<T> reverse_helper(Node<T> ls, Node<T> acc) {
		if (ls == null) return acc;

		else {
			System.out.println(ls.hd.toString()); 
			return reverse_helper(ls.tl, new Node<T>(ls.hd,acc));
		} 
	}
	static <T> Node<T> reverse(Node<T> ls) {
		return reverse_helper(ls,null);
	}

	/* functional reverse, iterative */
	static <T> Node<T> iter_reverse(Node<T> ls) {
		Node<T> x = null;
		while (ls != null) {
			x = new Node<T>(ls.hd, x);
			ls = ls.tl;
		}
		return x;
	}

	/* in-place reverse */
	static <T> Node<T> in_place_reverse(Node<T> ls) {
		if (ls == null) return ls;
		Node<T> x = ls;
		ls = ls.tl;
		x.tl = null;
		while (ls != null) {
			Node<T> y = ls.tl;
			ls.tl = x;
			x = ls;
			ls = y;
		}
		return x;
	}

	/* functional append */
	static <T> Node<T> append(Node<T> xs, Node<T> ys) {
		if (xs == null) return ys;
		else return new Node<T>(xs.hd, append(xs.tl,ys));
	}


	/* in-place append */
	static <T> Node<T> in_place_append(Node<T> xs, Node<T> ys) {
		Node<T> ls = xs;
		if (ls == null) return ys;
		while (ls.tl != null) {
			ls = ls.tl;
		}
		ls.tl = ys;
		return xs;
	}


}

class evenpred implements Pred<Integer> {
	public boolean test(Integer i) { return ((i % 2) == 0); }
}

public class mylist {


	public static void main(String[] args)
	{
		Node<Integer> ls0 = null;       // note use of Integer rather than int
		Node<Integer> ls1 = new Node<Integer>(1,ls0);
		Node<Integer> ls2 = new Node<Integer>(2,ls1);
		Node<Integer> ls3 = new Node<Integer>(3,ls2);
		Node<Integer> ls4 = new Node<Integer>(4,ls3);

		System.out.print("length(ls3) = " + List.length(ls3) + 
		" (expected: 3) \n");

		System.out.print("iter_length(ls3) = " + List.iter_length(ls3) + 
		" (expected: 3) \n");

		System.out.print("print(ls3) = " + List.print(ls3) +
		" (expected: 3 2 1) \n");

		System.out.print("print(filter(ls3,even)) = " +
				List.print(List.filter(ls4, new evenpred())) +
		" (exepected: 2) \n");

		System.out.print("print(reverse(ls3)) = " +
				List.print(List.reverse(ls3)) +
		" (expected: 1 2 3) \n");

		System.out.print("print(ls3) - after reverse(ls3) = " +
				List.print(ls3) +
		" (expected: 3 2 1) \n");

		System.out.print("print(iter_reverse(ls3)) = " +
				List.print(List.iter_reverse(ls3)) +
		" (expected: 1 2 3) \n");

		System.out.print("print(ls3) - after iter_reverse(ls3) = " +
				List.print(ls3) +
		" (expected: 3 2 1) \n");

		System.out.print("print(append(ls3,ls2)) = " +
				List.print(List.append(ls3,ls2)) +
		" (expected: 3 2 1 2 1) \n");



		/* note the use of copy - what happens if we don't use it ? */
		System.out.print("print(in_place_append(ls3,ls2)) = " +
				List.print(List.in_place_append(List.copy(ls3),
						List.copy(ls2))) +
						" (expected: 3 2 1 2 1) \n");

		System.out.print("print(copy(l3)) = " + List.print(List.copy(ls3)));
		/* 
		 * the same version as above without copy 
		 */
		/**
    System.out.print("print(in_place_append((ls3),(ls2))) = " +
		     List.print(List.in_place_append(ls3,
						     ls2)) +
		     " (expected: ??) \n");

    Node<Integer> xs = List.in_place_reverse(ls3);
    System.out.print("print(in_place_reverse(ls3)) = " +
		     List.print(xs) +
		     " (expected: 1 2 3) \n");

    System.out.print("print(ls3) - after in_place_reverse(ls3) = " +
		     List.print(ls3) +
		     " (expected: 3) \n");

		 **/
	}
}
