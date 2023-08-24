package com.ewolff.microservice.invoicing;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String street;
	private String zip;
	private String city;
	private String customerName;
	private String remark;
	private String name;


	public Address() {
		super();
	}

	public Address(String street, String zip, String city) {
		super();
		this.street = street;
		this.zip = zip;
		this.city = city;
	}



	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
