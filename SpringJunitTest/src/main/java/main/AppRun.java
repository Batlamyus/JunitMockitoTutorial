package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import model.Product;
import service.Validation;

public class AppRun {
	
	public static void main(String[] args) {
		
		Product product = new Product();
		product.setCode("13456789098765321");
		product.setCurrency("EUR");
		product.setShortText("This is short Text");
		
		@SuppressWarnings("deprecation")
		BeanFactory ctx = new XmlBeanFactory(new FileSystemResource("spring-config.xml"));
		
		Validation validService = (Validation) ctx.getBean("validationService");
		
		validService.setProduct(product);
		validService.printProduct();
		if(validService.isCode(product.getCode())) {
			System.out.println("config works");
		}else {
			System.out.println("config doesnt work");
		}
		
	}

}
