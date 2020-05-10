package com.spock.dao;

import java.util.List;

import com.spock.entity.MoonSales;


public interface MoonSalesDAO {

	public List<MoonSales> getMoonSales(String username);
}
