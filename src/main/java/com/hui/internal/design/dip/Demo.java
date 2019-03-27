package com.hui.internal.design.dip;

public class Demo {

	public static void main(String[] args) {
		ICourse javaCourse = new JavaCourse();
		ICourse phpCourse = new PhpCourse();
		Zth.study(phpCourse);
		Zth.study(javaCourse);
	}
}
