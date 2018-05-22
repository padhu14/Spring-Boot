package com.springframework.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.springframework.dto.ProductDTO;
import com.springframework.entity.Product;

@Repository("showRoomDaoimpl")
public class ShowRoomDAOImpl implements ShowRoomDAO {
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;

	public List<Product> getAllProductList() {
		Query query = entityManager.createNamedQuery("findAllProducts",Product.class);
		List<Product> products = query.getResultList();
		return products;
	}

}
