package com.e_commerce.E_commerce.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.e_commerce.E_commerce.entity.Ecommerce;
import com.e_commerce.E_commerce.service.EcommerceService;


public interface EcommerceRepository extends JpaRepository<Ecommerce, Integer>{
 
}


