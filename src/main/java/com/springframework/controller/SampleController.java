package com.springframework.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.dto.Product;
import com.springframework.manager.ProductCatalogService;

@RestController
@RequestMapping(value = "/sample")
@CrossOrigin(origins = { "*" }, maxAge = 6000)
public class SampleController {

	private static final Logger LOG = LogManager.getLogger(SampleController.class);

	@Autowired
	private ProductCatalogService productCatalog;

	@RequestMapping(value = "/search/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> searchById(@PathVariable("id") int id) {
		Product product = new Product();
		try {
			product = productCatalog.searchById(id);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.OK);
		}
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = new ArrayList<>();
		try {
			products = productCatalog.getAllProducts();
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.OK);
		}
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> saveProduct(@RequestBody Product product) {
		try {
			productCatalog.insertProduct(product);
		} catch (Exception e) {
			return new ResponseEntity<>("false", HttpStatus.OK);
		}
		return new ResponseEntity<>("true", HttpStatus.OK);
	}
}
