package com.hui.internal.design.ocp;

public class JavaCourse implements ICourse {

	private Integer id;
	private String name;
	private Double getPrise;

	public JavaCourse(Integer id, String name, Double getPrise) {
		super();
		this.id = id;
		this.name = name;
		this.getPrise = getPrise;
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public Double getPrise() {
		return this.getPrise;
	}

}
