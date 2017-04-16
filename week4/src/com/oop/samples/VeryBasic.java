package com.oop.samples;
/**
 * 
 */
/**
 * @author aescobar
 *
 */
public class VeryBasic {
	
	private int someValue = 0;
	static int someStatic = 1;
	final int SOMECONSTANT = 2;
	protected int someProtected = 3;
	/**
	 * 
	 */
	public VeryBasic() {
		// TODO Auto-generated constructor stub
	}

	public String hello(){
		return "Hello from VeryBasic";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VeryBasic vB = new VeryBasic();
		System.out.println(vB.someValue);
		System.out.println(VeryBasic.someStatic);
		System.out.println(vB.SOMECONSTANT);
		System.out.println(vB.someProtected);
	}
}
