package service;

import java.util.List;

import model.Product;

public interface Validation {
	
	List<String> validate(Product product);
	
	void printProduct();
	
	void setProduct(Product product);
	
	Product getProduct();
	boolean isCode(String code);

}
