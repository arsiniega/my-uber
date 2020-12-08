package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.models.Driver;

public class DriverAuthenticateService {

	private Driver driverID;
	private double AuthenticationSession;
	
	private void checkForFraud(Driver d) {
		if (d.isVerifiedDriver)
			System.out.println( "No fraud, driver is current.");
		else
			System.out.println( "Driver is not current, fraud detected.");
	}
	
	private void takePicture() {
		System.out.println( "Validation done via image comparison of profile pic and current pic.");
	}
	
	private void takeCovidPicture() {
		System.out.println( "Validation done via image comparison of masked profile pic and covid pic.");
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in DriverAuthenticate.");
    }
}
