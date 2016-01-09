package com.parvez;

import java.io.Serializable;

public class Car implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String brand;
	public Car(String brand)
	{
		this.brand=brand;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
}
