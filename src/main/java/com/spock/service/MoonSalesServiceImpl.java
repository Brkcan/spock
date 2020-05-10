package com.spock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spock.dao.MoonSalesDAO;
import com.spock.entity.MoonSales;

@Service
public class MoonSalesServiceImpl implements MoonSalesService{

	private MoonSalesDAO moonSalesDAO;
	
	@Autowired
	public MoonSalesServiceImpl(MoonSalesDAO theMoonSalesDAO) {
		moonSalesDAO = theMoonSalesDAO;
	}
	
	@Override
	public List<MoonSales> getMoonSales(String username) {
		return moonSalesDAO.getMoonSales(username);
	}

}
