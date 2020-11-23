package model.edu.cofc.cs656.models;

public class Renter extends User{
	
	private boolean monthlySubscription;

	public Renter(double userID, boolean isSignedUp, Profile userProfile, boolean monthly) {
		super(userID, isSignedUp, userProfile);
		this.monthlySubscription = monthly; 
		System.out.println("You've created a Renter");
	}
	

	@Override
	public String toString() {
		return "Renter " + super.toString() + "\nSubscription based = " + monthlySubscription;
	}


	public boolean ismonthlySubscription() {
		return monthlySubscription;
	}


	public void setmonthlySubscription(boolean monthlySubscription) {
		this.monthlySubscription = monthlySubscription;
	}


//	private void signIn(double RenterID) {
//		System.out.println("You're in signIn method");
//	}
//	
//	private void lookupRide() {
//		System.out.println("You're in lookupRide method");
//	}

}
