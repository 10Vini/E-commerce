package com.e_commerce.E_commerce.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e_commerce.E_commerce.entity.Ecommerce;
import com.e_commerce.E_commerce.repository.EcommerceRepository;
@Service
public class EcommerceService {
	@Autowired
	private EcommerceRepository ecorep;
	
	public Ecommerce create(Ecommerce ecommerce) {
		return ecorep.save(ecommerce);
		
		
	}
	
	
 
    public void deleteEcommerce(int userid){
       ecorep.deleteById(userid);
       
    }

   
}
