package service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import model.Product;

@RunWith(MockitoJUnitRunner.class)
public class ValidationImplTest {
	
	private Product defektProduct;
	private Product correctProduct;
	
	@Mock
	ConfigurationService configurationService;
	
	@InjectMocks
	ValidationImpl validationImpl;

	@Before
	public void init() {
		initDefektProduct(new Product());
		initCorrectProduct(new Product());
	}
	
	@Test
	public void validateTest() {
		
	}
	
	@Test
	public void isCodeFail() {
		
		Mockito.when(configurationService.getConfigInt()).thenReturn(5);
		assertFalse(validationImpl.isCode(defektProduct.getCode()));
	}
	
	@Test
	public void isCodeSuccess() {
		Mockito.when(configurationService.getConfigInt()).thenReturn(5);
		assertTrue(validationImpl.isCode(correctProduct.getCode()));
	}
	
	private void initDefektProduct(Product product) {
		this.defektProduct = product;
		this.defektProduct.setCode("123456789");
	}
	
	private void initCorrectProduct(Product product) {
		this.correctProduct = product;
		this.correctProduct.setCode("12345");
	}

}
