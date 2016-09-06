package resources;

public class Product {
String prodID;
String prodName;
String prodCategory;
Double prodPrice;

	public String getProdID() {
	return prodID;
}

public void setProdID(String prodID) {
	this.prodID = prodID;
}

public String getProdName() {
	return prodName;
}

public void setProdName(String prodName) {
	this.prodName = prodName;
}

public String getProdCategory() {
	return prodCategory;
}

public void setProdCategory(String prodCategory) {
	this.prodCategory = prodCategory;
}

public Double getProdPrice() {
	return prodPrice;
}

public void setProdPrice(Double prodPrice) {
	this.prodPrice = prodPrice;
}

	public Product(String id, String category, String name, Double price) {
		this.setProdID(id);
		this.setProdCategory(category);
		this.setProdName(name);
		this.setProdPrice(price);
	}

}
