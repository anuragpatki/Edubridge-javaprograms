package com.abstractclasses.methods;

abstract class Bank{
	abstract float rateOfInterest();
}


class SBIBank extends Bank{

	@Override
	float rateOfInterest() {
		
		return 8.5f;
	}
	
}

class ICICIBank extends Bank{

	@Override
	float rateOfInterest() {
		// TODO Auto-generated method stub
		return 9f;
	}
	
}

class CityBank extends Bank{

	@Override
	float rateOfInterest() {
		return 7f;
	}
	
}
class PanjabBank extends Bank{

	@Override
	float rateOfInterest() {
		// TODO Auto-generated method stub
		return 6f;
	}
	
}

public class BankAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj;
		
		 obj = new SBIBank();
		System.out.println("Rate of interest of SBI bank="+obj.rateOfInterest());

		obj = new ICICIBank();
		System.out.println("Rate of interest of ICICI bank="+obj.rateOfInterest());

		 obj = new CityBank();
		System.out.println("Rate of interest of CityBank bank="+obj.rateOfInterest());


	}

}