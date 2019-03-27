package com.hui.internal.design.carp;

public class TestDemo {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao(new DBConnection());
		dao.addProduct();
	}
}
