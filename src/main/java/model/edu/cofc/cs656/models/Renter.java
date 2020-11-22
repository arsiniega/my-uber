package model.edu.cofc.cs656.models;

public class Renter extends User{
	
	private boolean hasValidPayment;

	public Renter(double userID, boolean isSignedUp, Profile userProfile, boolean validPayment) {
		super(userID, isSignedUp, userProfile);
		this.hasValidPayment = validPayment; 
	}
	

	@Override
	public String toString() {
		return "Renter [User=" + super.toString() + ", hasValidPayment=" + hasValidPayment + "]";
	}


	private void signIn(double RenterID) {
		System.out.println("You're in signIn method");
	}
	
	private void lookupRide() {
		System.out.println("You're in lookupRide method");
	}

}
