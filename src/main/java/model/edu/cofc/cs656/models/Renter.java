package model.edu.cofc.cs656.models;

public class Renter extends User{
	
	public String RenterName;
	
	private double RenterID;
	
	private void signIn(double RenterID) {
		System.out.println("You're in signIn method");
	}
	
	private void lookupRide() {
		System.out.println("You're in lookupRide method");
	}
	
	public static void main(String[] args) {
		System.out.println("You're in Renter class");
	}
}
