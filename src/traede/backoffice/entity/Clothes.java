package traede.backoffice.entity;


public class Clothes {
	private String brand ;
	private String collection;
	private String delivery;
	private String name ; 
	private String price ; 
	private Double quantity;
	private String imgPath ;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	public String getDelivery() {
		return delivery;
	}
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public Clothes(String brand, String collection, String delivery, String name, String price, Double quantity,
			String imgPath) {
		super();
		this.brand = brand;
		this.collection = collection;
		this.delivery = delivery;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.imgPath = imgPath;
	}
	public Clothes() {
		super();
		// TODO Auto-generated constructor stub
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
