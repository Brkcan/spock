package com.spock.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;

import com.spock.entity.MoonSales;

@Repository
public class MoonSalesDAOImpl implements MoonSalesDAO{
	
	
	@Override
	public List<MoonSales> getMoonSales(String username) {
		Connection connection = null;
		MoonSales sales2 = new MoonSales();
		try {
			connection = DriverManager.getConnection("jdbc:sqlserver://192.168.1.46:1433;databaseName=TRENDYOL;user=sa;password=A234567b;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int code = 0;
		 
	
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String userName = auth.getName();
		
		System.out.println(auth.getName());
		 String sql2 = ("SELECT * FROM [GreyderNetsisDB].[dbo].[tblusers] WHERE username = '"+username+"' ");
		try {
			PreparedStatement statement2 = connection.prepareStatement(sql2);
			ResultSet rs2 = statement2.executeQuery();
			while(rs2.next()) {
			 code = sales2.setDepotcode(rs2.getInt("depotcode"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	List<MoonSales> moonSales = new ArrayList<MoonSales>();
		
		String sql = ("SELECT * FROM [TRENDYOL].[dbo].[MoonSales]  WHERE transferDate>'2020-04-08' and departmentnumber=2" + 
				"   and divaOrderNumber is null and divaInvoiceNumber is null " + 
				"   and depotcode=1102 " + 
				"   and waybillNumber is null and datNumber is null" + 
				"   and netsisSendedOrderNumber is null and Store='Trendyol Greyder'");
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				MoonSales sales = new MoonSales();
				int depocode = sales.setDepotcode(rs.getInt("depotcode"));
				sales.setOrdernumber(rs.getInt("ordernumber"));
				sales.setShipmentpackageid(rs.getInt("shipmentpackageid"));
				sales.setBarcode(rs.getString("barcode"));
				sales.setCargoNumber(rs.getString("cargoNumber"));
				sales.setStore(rs.getString("Store"));
				sales.setFullName(rs.getString("fullName"));
				moonSales.add(sales);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return moonSales;
	}

}
