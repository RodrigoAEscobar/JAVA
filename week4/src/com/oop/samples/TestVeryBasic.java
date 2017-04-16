package com.oop.samples;
/**
 * 
 */
/**
 * @author aescobar
 *
 */
public class TestVeryBasic {
	/**
	 * 
	 */
	public TestVeryBasic() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VeryBasic vB = new VeryBasic();
		//System.out.println(vB.someValue); //Is not visible
		System.out.println(VeryBasic.someStatic);
		System.out.println(vB.SOMECONSTANT);
		System.out.println(vB.someProtected);	
		MoreComplex mc = (MoreComplex)vB;
	}
}
