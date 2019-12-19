package uri;

public class produto implements Comparable<produto>{
	String name;
	double price;
	
	public produto() {}
	
	public produto(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(produto o) {
		return Double.compare(this.price, o.price);
	}
	
	public double getPrice() {
		return this.price;
	}
	

}
