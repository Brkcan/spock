package com.spock.service;

import java.util.List;

import com.spock.entity.MoonSales;

public interface MoonSalesService {

	public List<MoonSales> getMoonSales(String username);
}
