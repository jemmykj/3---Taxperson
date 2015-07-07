package com.TestExamples.prac;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class TaxPersonTest {

	
	@Ignore
	@Test
	public void testCalcLuxury()
	{
		TaxPerson myClass= new TaxPerson();
		double calcTotalCost = myClass.CalculateCost(20, "N");
		double expectedValue=2020.0;
		
		assertEquals(calcTotalCost, expectedValue);
	}
	
	@Ignore
	@Test
	public void testCalcBasic()
	{
		TaxPerson myClass= new TaxPerson();
		double calcTotalCost = myClass.CalculateCost(10, "L");
		double expectedValue=1090.0;
		
		
		assertEquals(calcTotalCost, expectedValue);
	}
}
