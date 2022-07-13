package com.francaemp.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.francaemp.dsmeta.entities.Sale;
import com.francaemp.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<Sale>findSales(){
		return repository.findAll();			
	}
	
	
	
}
