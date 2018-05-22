package com.springframework.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springframework.dto.Product;

@Service("productCatalog")
public class ProductCatalogServiceImpl implements ProductCatalogService{
	private List<Product> productCatalog;

	public ProductCatalogServiceImpl() {
		initializeProductCatalog();
	}

	@Override
	public Product searchById(int id) throws Exception {
		for (Product p : productCatalog)
			if (p.getId() == id)
				return p;
		throw new Exception("No product found with id " + id);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return productCatalog;
	}

	@Override
	public void insertProduct(Product product) {
		productCatalog.add(product);
	}

	private void initializeProductCatalog() {
		if (productCatalog == null) {
			productCatalog = new ArrayList();
			productCatalog.add(new Product(1, "Keyboard", "Electronics", 29.99D));
			productCatalog.add(new Product(2, "Mouse", "Electronics", 9.95D));
			productCatalog.add(new Product(3, "17\" Monitor", "Electronics", 159.49D));
			productCatalog.add(new Product(4, "Hammer", "Hardware", 9.95D));
			productCatalog.add(new Product(5, "Slot Screwdriver", "Hardware", 7.95D));
			productCatalog.add(new Product(6, "The British Invasion of Java", "Books", 11.39D));
			productCatalog.add(new Product(7, "A House in Bali", "Books", 15.99D));
			productCatalog.add(new Product(8, "An Alaskan Odyssey", "Books", 799.99D));
			productCatalog.add(new Product(9, "LCD Projector", "Electronics", 1199.19D));
		}
	}
}