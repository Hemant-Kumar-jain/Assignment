package com.cognizant.tax;

class TaxCalculator{
	float basicSalary;
	boolean citizenship;
	int nettSalary;
	float tax;
	
	void calculateTax(float b) {
		this.basicSalary=b;
		 tax = 30*basicSalary/100;
		System.out.println("The Tax of the employee for the "+basicSalary+" is "+tax);
	}
	void deductTax() {
		nettSalary =  (int) (basicSalary-tax);
		System.out.println("The nett salary of the employee: "+nettSalary);
	}
	
	void validateSalary() {
		if(basicSalary>100000) {
			System.out.println("The salary and citizenship eligibility: "+true);
		}
		else {
			System.out.println("The salary and citizenship eligibility: "+false);
		}
	}
}

public class EmployeeTax {
	public static void main(String[] args) {
		TaxCalculator t=new TaxCalculator();
		TaxCalculator t1=new TaxCalculator();
		t.calculateTax(25000);
		t.deductTax();
		t.validateSalary();
		t1.calculateTax(125000);
		t1.deductTax();
		t1.validateSalary();
	}
}
