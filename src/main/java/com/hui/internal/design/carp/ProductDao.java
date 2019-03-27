package com.hui.internal.design.carp;

public class ProductDao {

	private DBConnection dbConnection;

	public ProductDao(DBConnection dbConnection) {
		super();
		this.dbConnection = dbConnection;
	}

	public void addProduct() {
		System.out.println("增加了" + dbConnection.getConnection() + "产品");
	}
}
