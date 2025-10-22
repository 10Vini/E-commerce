package com.e_commerce.E_commerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e_commerce.E_commerce.entity.Ecommerce;
import com.e_commerce.E_commerce.service.EcommerceService;


@RestController
@RequestMapping("/cart")
public class EcommerceController {

    @Autowired
    private EcommerceService ecommerceService;
    
    @PostMapping("/create")
    public Ecommerce createUser(@RequestBody Ecommerce ecommerce) {
    	return ecommerceService.create(ecommerce);
    }

    @DeleteMapping("/delete/{userid}")
    	public void delete(@PathVariable int userid) {
    		ecommerceService.deleteEcommerce(userid);
    		
    		
    	}
    }
    

