package com.springframework.manager;

import java.util.List;

import com.springframework.dto.ProductDTO;

public interface ShowRoomManager {
	public List<ProductDTO> getAllProductList();

	public ProductDTO getProductDetails(String productCode);
}
