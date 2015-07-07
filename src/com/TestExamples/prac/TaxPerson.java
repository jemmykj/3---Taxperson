package com.TestExamples.prac;

import java.util.Scanner;

public class TaxPerson {

	String strLuxury = "L";
	String strBasic = "N";

	public static void main(String[] args) {

		Scanner inputs = new Scanner(System.in);
		double value;
		String strLuxury = "L";
		String strBasic = "N";

		System.out.println("Enter an item price");
		value = inputs.nextDouble();

		System.out
				.println("Enter if its luxury or necessity. Enter L for luxury and N for necessity");
		String item = inputs.next();

		TaxPerson calc = new TaxPerson();
		calc.CalculateCost(value, item);

	}

	public double CalculateCost(double price, String CategoryItem) {
		double totalCost = 0.0;

		if (CategoryItem.equals(strLuxury)) {
			totalCost = 100 * (price + (price * 0.09));
			System.out.println("Total cost of Luxury item is  " + totalCost);

		} else if (CategoryItem.equals(strBasic))

		{

			totalCost =100 * ( price + (price * 0.01));

			System.out.println("Total cost of Necessity item is  " + totalCost);
		}
		return totalCost;
	}

}
