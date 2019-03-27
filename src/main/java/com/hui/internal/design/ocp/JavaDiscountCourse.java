package com.hui.internal.design.ocp;

public class JavaDiscountCourse extends JavaCourse {

	public JavaDiscountCourse(Integer id, String name, Double getPrise) {
		super(id, name, getPrise);
	}

	@Override
	public Integer getId() {
		return super.getId();
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public Double getPrise() {
		return super.getPrise() + 50.6;
	}

}
