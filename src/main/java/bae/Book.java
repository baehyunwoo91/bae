package bae;

public class Book {
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public int getBae() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private String title;
	private int price;
	
	public Book() {}
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
		
	}
}
