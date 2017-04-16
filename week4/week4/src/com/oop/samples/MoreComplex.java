package com.oop.samples;

public class MoreComplex extends VeryBasic {
	
	private int myOwn = 4;
	
	@Override
	public String hello(){
		
		//return super.hello();
		return "Hello from MoreComplex";
	}
	
	public String hello(int times){
		String hello = "";
		someProtected = 0;
		for (int i=0; i < times; i++){
			hello += "Hello, ";
		}
		return hello + " from MoreComplex";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MoreComplex mc = new MoreComplex();
		System.out.println(mc.someProtected);  //Is IS visible
		mc.someProtected = 4;
		System.out.println(mc.hello());
		System.out.println(mc.hello(3));
		VeryBasic vb = (VeryBasic)mc;
		//vb.myOwn = 5;
		
	}
}
