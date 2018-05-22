package com.springframework.controller;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springframework.dto.ProductDTO;
import com.springframework.manager.ShowRoomManager;

@RestController
@RequestMapping(value="/showRoom")
public class ShowRoomController {
	
	private static final Logger LOG = LogManager.getLogger(ShowRoomController.class);
	
	@Autowired
	private ShowRoomManager showRoomManagerImpl;
	
	@RequestMapping(value="/allProducts",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ProductDTO>> showAllProducts(){
		LOG.info("All the products");
		return new ResponseEntity<>(showRoomManagerImpl.getAllProductList(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/product",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductDTO> getProductDetails(@RequestParam(name = "productCode") String productCode){
		LOG.info("Get the products Details Id " + productCode);
		return new ResponseEntity<>(showRoomManagerImpl.getProductDetails(productCode), HttpStatus.OK);
	}
	
	@RequestMapping(value="/saveProduct",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> saveProduct(){
		
		return new ResponseEntity<>(true, HttpStatus.OK);
	}
}
