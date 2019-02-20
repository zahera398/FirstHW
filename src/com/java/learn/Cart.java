package com.java.learn;
import java.util.ArrayList;
public class Cart 
{
	private int productCount;
	private ArrayList <Book> books =new ArrayList <Book> ();
	
	public Cart() 
	{
		productCount=0;
	}
	public int  getProductCount()
	{
		return productCount;
	}
	public void addBook (Book b)
	{
		books.add(b);
		productCount ++;
	}
	public double getValue ()
	{
		double sum=0.0;
		for (Book item :books)
		{
			sum+=item.getPrice();
		}
		return sum;
	}

}
