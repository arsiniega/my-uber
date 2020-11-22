package model.edu.cofc.cs656.models;

public class Renter extends User{
	

	public String RenterName;
	
	private double RenterID;

	public Renter(double userID, boolean isSignedUp, Profile userProfile, String renterName, double renterID) {
		super(userID, isSignedUp, userProfile);
		RenterName = renterName;
		RenterID = renterID;
	}

	

	public String getRenterName() {
		return RenterName;
	}



	public void setRenterName(String renterName) {
		RenterName = renterName;
	}



	public double getRenterID() {
		return RenterID;
	}



	public void setRenterID(double renterID) {
		RenterID = renterID;
	}

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
