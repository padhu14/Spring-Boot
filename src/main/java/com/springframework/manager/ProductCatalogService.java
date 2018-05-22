package com.springframework.manager;

import java.util.List;

import com.springframework.dto.Product;

public interface ProductCatalogService {
	public Product searchById(int id) throws Exception;
	public List<Product> getAllProducts();
	public void insertProduct(Product product);

}
