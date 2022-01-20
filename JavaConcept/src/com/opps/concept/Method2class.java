package com.opps.concept;

public class Method2class extends Bank implements HomeLoan,CarLoan {

	public void login() {
		System.out.println(Variable.getImYogita());

	}

	public void signIn() {
		this.login();
		super.login();

	}

	@Override
	public void Homeloan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bank() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carloan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginToPage() {
		// TODO Auto-generated method stub
		CarLoan.super.loginToPage();
	}
	
	



}
