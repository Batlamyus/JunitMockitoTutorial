package service.impl;

import java.util.List;

import model.Product;
import service.Validation;

public class ValidationImpl implements Validation {
	
	ConfigurationService configurationService;
	Product product;
	
	
	@Override
	public List<String> validate(Product product) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isCode(String code) {
		return(code!=null && code.length() <=  configurationService.getConfigInt()) ? true : false;
	}

	public ConfigurationService getConfigurationService() {
		return configurationService;
	}

	public void setConfigurationService(ConfigurationService configurationService) {
		this.configurationService = configurationService;
	}
	
	@Override
	public void printProduct() {
		System.out.println(this.product.getCode());
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product=product;
	}
	
	

}
