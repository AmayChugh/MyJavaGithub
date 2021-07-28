package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCases {
	
//	
//	@BeforeAll
//	static void beforeAll() {
//		System.out.println("beforeAll executed");
//	}
//	
//	@BeforeEach
//	 void beforeEach() {
//		System.out.println("beforeEach Executed");
//	}
//	
	
	@Test
	public void testProduct() {
		Product p=new Product(101,"Ajay",101.10);
		ProductService ps=new ProductService();
		Assertions.assertEquals("ProductAdded", ps.addProduct(p));
	}

	@Test
	void test() {
		//fail("Not yet implemented");
		Assertions.assertEquals("LTI","LTI");
	}
	@Test
	void testCalculatorSummethod(){
		Calculator c=new Calculator();
		int r=c.sum(100,200);
		Assertions.assertEquals(300,r);
	}
	@Test
	@Disabled
	public void testAry() {
		ArrayList<String>myList=new ArrayList<>();
		myList.add("hello");
		
		//Assertions.assertTrue(myList.isEmpty());        // ye test case false dega kyuki list empty nahi h
		Assertions.assertFalse(myList.isEmpty());		// ye test case true dega kyuki list empty nai h wahi sahi h
	}
//	
//	@AfterAll
//	static void tearall() {
//		System.out.println("AfterAll Tearall");
//	}
//	
//	@AfterEach
//	void tearEach() {
//		System.out.println("AfterEach TearEach");
//	}
//	
	
	
	
}