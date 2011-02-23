package examFall2007.Q1;

public class Person {
	protected String name;
	public Person (String myName) {this.name = myName;}
	public String toString() {return "My Name is " + name;} 
}

class Viking extends Person {
	public Viking(String myName) {super(myName);}
	public String toString() {return super.toString() + " and I like to pillage and plunder";}
}

class Foreigner extends Person {
	public Foreigner(String myName) {super(myName);}
	public String toString() {return super.toString() + " og jeg kan ikke tale dansk."; }
}

class Dane extends Viking {
	public Dane(String myName) {super(myName);}
	public String toString() {return super.toString() + " because I am Danish"; }
}

class PeopleTester  {
	public static void printPeople(Person[] peopleArray) {
		for (Person p : peopleArray) {
			System.out.println(p.toString());
		}
		System.out.println("\n\n");
	}

	public static void printVikings(Viking[] vikingArray) {
		for (Viking v : vikingArray) {
			System.out.println(v.toString());
		}
		System.out.println("\n\n");
	}

	public static void main(String[] args) {
		Foreigner Adam = new Foreigner("Adam");
		Foreigner Jeff = new Foreigner("Jeff");
		Foreigner Carsten = new Foreigner("Carsten");
		Dane Lars = new Dane("Lars");
		Viking Eric = new Viking("Eric"); 

		Person[] allPeople = {Adam, Jeff, Carsten, Lars, Eric};
		Viking[] allVikings = {Lars, Eric };

		printPeople(allPeople);
		printPeople(allVikings);
		printVikings(allVikings);
		// printVikings(allPeople);

		Node<Person> n1 = new Node(Adam, null);
		Node<Person> n2 = new Node(Jeff, null);
		n1.tl = n2;
		Node<Person> n3 = new Node(Carsten, null);
		n2.tl = n3;
		Node<Person> n4 = new Node(Lars, null);
		n3.tl = n4;
		Node<Person> n5 = new Node(Eric, null);
		n4.tl = n5;
		
		List.printList(n1);

	}

} 