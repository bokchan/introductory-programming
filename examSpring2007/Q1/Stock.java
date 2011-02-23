package examSpring2007.Q1;

public class Stock {
	Item[] items;
	private int n;
	public Stock() {
		items = new Item[1000];
		n = 0;
	}
	
	public void add_item(Item i) {
		items[n] = i;
		n++;
	} 
	
	public void print() {
		int i = 0;
		Item tmp = items[i];
		while (tmp != null) {
			if (tmp.number_of_stock > 0) tmp.print();
			i++;
			tmp = items[i];
			
		} 
	}
	
	public int no_of_sofas() {
		int sofaCount = 0;
		int i = 0 ;
		Item tmp  = items[i]; 
		while (tmp != null) {
			if (tmp instanceof Sofa) {
				sofaCount = sofaCount + tmp.number_of_stock; 
			}
			i++;
			tmp = items[i];
		}
		
		return sofaCount;
	}
}