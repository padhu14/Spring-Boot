package com.springframework.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springframework.dao.ShowRoomDAO;
import com.springframework.dto.ProductDTO;
import com.springframework.entity.Product;
import com.springframework.repository.ShowRoomRepository;

@Service("showRoomManagerImpl")
public class ShowRoomManagerImpl implements ShowRoomManager {
	
	@Autowired
	private ShowRoomDAO showRoomDaoimpl;
	
	@Autowired
	private ShowRoomRepository showRoomRepository;

	@Override
	public List<ProductDTO> getAllProductList() {
		List<ProductDTO> productDTOs = new ArrayList<>();
		List<Product> products = showRoomDaoimpl.getAllProductList();
		products.forEach(product ->{
			ProductDTO productDTO = new ProductDTO();
			BeanUtils.copyProperties(product, productDTO);
			productDTOs.add(productDTO);
		});
		return productDTOs;
	}
	
	@Override
	public ProductDTO getProductDetails(String productCode) {
		ProductDTO productDTO = new ProductDTO();
		Optional<Product> product = showRoomRepository.findById(productCode);
		BeanUtils.copyProperties(product.orElse(new Product()), productDTO);
		return productDTO;
	}
	
	public Boolean saveProductDetails(ProductDTO product) {
		Product product2 = new Product();
		Product product3 = showRoomRepository.save(product2);
		return true;
	}
}
