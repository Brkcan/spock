package com.spock.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spock.entity.MoonSales;
import com.spock.service.MoonSalesService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class MoonSalesRest {

	private MoonSalesService moonSalesService;
	
	public MoonSalesRest(MoonSalesService theMoonSalesService) {
		moonSalesService = theMoonSalesService;
	}
	
	@GetMapping(value = "/getbarcode/{username}")
	public List<MoonSales> getMoonSales(@PathVariable(value = "username") String username){
		return moonSalesService.getMoonSales(username);
	}
}
