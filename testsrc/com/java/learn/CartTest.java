package com.java.learn;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CartTest {
     public Cart test;
	@Before
	public void setUp() throws Exception 
	{
		
	}

	@Test
	public void testOne()
	{

		test =new Cart();
		assertEquals(0,test.getProductCount());
		//fail("Not yet implemented");
	}

	@Test
	public void testTow()
	{
		test =new Cart();
		Book book1 =new Book (127,"Java Book");
		test.addBook(book1);
		assertTrue((test.getProductCount()==1) && (test.getValue()==127));
		//fail("Not yet implemented");
	}

	@Test
	public void testThree() 
	{
		test =new Cart();
		Book book1 =new Book (127,"Java Book");
		test.addBook(book1);
		
		Book book2 =new Book (100,"Web design Book");
		test.addBook(book2);
		
		assertTrue((test.getProductCount()==2) && (test.getValue()==227));
		
		//fail("Not yet implemented");
	}

}
