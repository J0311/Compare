/**
 * COMPARABLE
 * @author joseph
 *
 */
public class House implements Comparable<House>{
	
	private String address;
	private int bedrooms;
	private double area;
	private double price;
	private int yearBuilt;
	
	public House(String address, int bedrooms, double area, double price, int yearBuilt) {
		super(); 
		this.address = address;
		this.bedrooms = bedrooms;
		this.area = area;
		this.price = price;
		this.yearBuilt = yearBuilt;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}

	@Override
	public String toString() {
		return "House [address=" + address + ", bedrooms=" + bedrooms + ", area=" + area + ", price=" + price
				+ ", yearBuilt=" + yearBuilt + "]";
	}

	@Override
	public int compareTo(House o) {
		if (getPrice() > o.getPrice()) {
			return 1;
		}
		else if (getPrice() < o.getPrice()) {
			return -1;
		}
		return 0;
	}

	
	
}
