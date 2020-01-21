package com.rk.sample;

public interface InterfaceDemp {
	void m1();

	void m2();

	void m3();

	default void m4() {
		System.out.println("m4");
	}

	static void m5() {
		System.out.println("m5");
	}

	public static void main(String[] args) {
		InterfaceDemp.m5();
	}
}
