package com.spock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "moonsales")
public class MoonSales {

	@Id
	@Column(name = "ordernumber")
	private int ordernumber;
	
	@Column(name = "orderstatus")
	private String OrderStatus;
	
	@Column(name = "shipmentpackageid")
	private int shipmentpackageid;
	
	@Column(name = "barcode")
	private String barcode;
	
	@Column(name = "orderdate")
	private String orderdate;
	
	@Column(name = "merchantsku")
	private String merchantSku;
	
	@Column(name = "productcolor")
	private String productColor;
	
	@Column(name = "productsize")
	private String productSize;
	
	@Column(name = "fullname")
	private String fullName;
	
	@Column(name = "shipmentaddress")
	private String ShipmentAddress;
	
	@Column(name = "invoiceaddress")
	private String InvoiceAddress;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "district")
	private String district;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "divaordernumber")
	private String divaOrderNumber;
	
	@Column(name = "divainvoicenumber")
	private String divaInvoiceNumber;
	
	@Column(name = "waybillnumber")
	private String waybillNumber;
	
	@Column(name = "datnumber")
	private String datNumber;
	
	@Column(name = "cargonumber")
	private String cargoNumber;
	
	@Column(name = "cargonumsenddate")
	private String cargoNumSendDate;
	
	@Column(name = "cargonumsendstatus")
	private String cargoNumSendStatus;
	
	@Column(name = "platform")
	private String platform;
	
	@Column(name = "store")
	private String Store;
	
	@Column(name = "depotcode")
	private int depotcode;
	
	@Column(name = "departmentnumber")
	private int departmentnumber;
	
	@Column(name = "explanation")
	private String explanation;
	
	@Column(name = "transferdate")
	private String transferDate;
	
	@Column(name = "netsissendedordernumber")
	private String netsisSendedOrderNumber;

	
	public MoonSales() {
		super();
	}

	public MoonSales(String orderStatus, int shipmentpackageid, String barcode, String orderdate, String merchantSku,
			String productColor, String productSize, String fullName, String shipmentAddress, String invoiceAddress,
			String city, String district, String phone, String divaOrderNumber, String divaInvoiceNumber,
			String waybillNumber, String datNumber, String cargoNumber, String cargoNumSendDate,
			String cargoNumSendStatus, String platform, String store, int depotcode, int departmentnumber,
			String explanation, String transferDate, String netsisSendedOrderNumber) {
		super();
		OrderStatus = orderStatus;
		this.shipmentpackageid = shipmentpackageid;
		this.barcode = barcode;
		this.orderdate = orderdate;
		this.merchantSku = merchantSku;
		this.productColor = productColor;
		this.productSize = productSize;
		this.fullName = fullName;
		ShipmentAddress = shipmentAddress;
		InvoiceAddress = invoiceAddress;
		this.city = city;
		this.district = district;
		this.phone = phone;
		this.divaOrderNumber = divaOrderNumber;
		this.divaInvoiceNumber = divaInvoiceNumber;
		this.waybillNumber = waybillNumber;
		this.datNumber = datNumber;
		this.cargoNumber = cargoNumber;
		this.cargoNumSendDate = cargoNumSendDate;
		this.cargoNumSendStatus = cargoNumSendStatus;
		this.platform = platform;
		Store = store;
		this.depotcode = depotcode;
		this.departmentnumber = departmentnumber;
		this.explanation = explanation;
		this.transferDate = transferDate;
		this.netsisSendedOrderNumber = netsisSendedOrderNumber;
	}



	public int getOrdernumber() {
		return ordernumber;
	}

	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}

	public String getOrderStatus() {
		return OrderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}

	public int getShipmentpackageid() {
		return shipmentpackageid;
	}

	public void setShipmentpackageid(int shipmentpackageid) {
		this.shipmentpackageid = shipmentpackageid;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getMerchantSku() {
		return merchantSku;
	}

	public void setMerchantSku(String merchantSku) {
		this.merchantSku = merchantSku;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getShipmentAddress() {
		return ShipmentAddress;
	}

	public void setShipmentAddress(String shipmentAddress) {
		ShipmentAddress = shipmentAddress;
	}

	public String getInvoiceAddress() {
		return InvoiceAddress;
	}

	public void setInvoiceAddress(String invoiceAddress) {
		InvoiceAddress = invoiceAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDivaOrderNumber() {
		return divaOrderNumber;
	}

	public void setDivaOrderNumber(String divaOrderNumber) {
		this.divaOrderNumber = divaOrderNumber;
	}

	public String getDivaInvoiceNumber() {
		return divaInvoiceNumber;
	}

	public void setDivaInvoiceNumber(String divaInvoiceNumber) {
		this.divaInvoiceNumber = divaInvoiceNumber;
	}

	public String getWaybillNumber() {
		return waybillNumber;
	}

	public void setWaybillNumber(String waybillNumber) {
		this.waybillNumber = waybillNumber;
	}

	public String getDatNumber() {
		return datNumber;
	}

	public void setDatNumber(String datNumber) {
		this.datNumber = datNumber;
	}

	public String getCargoNumber() {
		return cargoNumber;
	}

	public void setCargoNumber(String cargoNumber) {
		this.cargoNumber = cargoNumber;
	}

	public String getCargoNumSendDate() {
		return cargoNumSendDate;
	}

	public void setCargoNumSendDate(String cargoNumSendDate) {
		this.cargoNumSendDate = cargoNumSendDate;
	}

	public String getCargoNumSendStatus() {
		return cargoNumSendStatus;
	}

	public void setCargoNumSendStatus(String cargoNumSendStatus) {
		this.cargoNumSendStatus = cargoNumSendStatus;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getStore() {
		return Store;
	}

	public void setStore(String store) {
		Store = store;
	}

	public int getDepotcode() {
		return depotcode;
	}

	public int setDepotcode(int depotcode) {
		return this.depotcode = depotcode;
	}
	

	public int getDepartmentnumber() {
		return departmentnumber;
	}

	public void setDepartmentnumber(int departmentnumber) {
		this.departmentnumber = departmentnumber;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getTransferDate() {
		return transferDate;
	}

	public void setTransferDate(String transferDate) {
		this.transferDate = transferDate;
	}

	public String getNetsisSendedOrderNumber() {
		return netsisSendedOrderNumber;
	}

	public void setNetsisSendedOrderNumber(String netsisSendedOrderNumber) {
		this.netsisSendedOrderNumber = netsisSendedOrderNumber;
	}
	
	
}
