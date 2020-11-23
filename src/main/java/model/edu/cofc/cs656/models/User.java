package model.edu.cofc.cs656.models;

public class User {
	
	private double userID;
	private boolean isSignedUp;
	private Profile UserProfile;
    
    
    public User(double userID, boolean isSignedUp, Profile userProfile) {
		super();
		this.userID = userID;
		this.isSignedUp = isSignedUp;
		UserProfile = userProfile;
	}

	@Override
	public String toString() {
		return UserProfile.toString();
	}



	public double getUserID() {
		return userID;
	}




	public void setUserID(double userID) {
		this.userID = userID;
	}




	public boolean isSignedUp() {
		return isSignedUp;
	}




	public void setSignedUp(boolean isSignedUp) {
		this.isSignedUp = isSignedUp;
	}




	public Profile getUserProfile() {
		return UserProfile;
	}




	public void setUserProfile(Profile userProfile) {
		UserProfile = userProfile;
	}


}
