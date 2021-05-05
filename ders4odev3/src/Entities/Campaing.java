package Entities;

public class Campaing {

	private int id;
	private String Name;
	private double discountRate;

	public Campaing() {
	}

	public Campaing(int id, String name, double discountRate) {
		super();
		this.id = id;
		Name = name;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
