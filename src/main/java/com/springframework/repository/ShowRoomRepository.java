package com.springframework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springframework.entity.Product;

@Repository("showRoomRepository")
public interface ShowRoomRepository extends JpaRepository<Product, String> {

}
