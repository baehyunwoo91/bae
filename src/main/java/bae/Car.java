package bae;

public class Car {
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	private String company;
	private int price;
	private String model;
	public Car(){}
	public Car(String company, int price, String model) {
		super();
		this.company = company;
		this.price = price;
		this.model = model;
	}
	
	
}
