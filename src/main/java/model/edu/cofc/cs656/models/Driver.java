package model.edu.cofc.cs656.models;

public class Driver extends User{
	
	public String DriverName;
	
	private double DriverId;
	
	public boolean isVerifiedDriver;
	
	private AutoInfo driverInformation;
	
	public Driver(double userID, boolean isSignedUp, Profile userProfile, String driverName, double driverId,
			boolean isVerifiedDriver, AutoInfo driverInformation) {
		super(userID, isSignedUp, userProfile);
		DriverName = driverName;
		DriverId = driverId;
		this.isVerifiedDriver = isVerifiedDriver;
		this.driverInformation = driverInformation;
	}
	

	@Override
	public String toString() {
		return "Driver [DriverName=" + DriverName + ", DriverId=" + DriverId + ", isVerifiedDriver=" + isVerifiedDriver
				+ ", driverInformation=" + driverInformation + "]";
	}



	public String getDriverName() {
		return DriverName;
	}



	public void setDriverName(String driverName) {
		DriverName = driverName;
	}



	public double getDriverId() {
		return DriverId;
	}



	public void setDriverId(double driverId) {
		DriverId = driverId;
	}



	public boolean isVerifiedDriver() {
		return isVerifiedDriver;
	}



	public void setVerifiedDriver(boolean isVerifiedDriver) {
		this.isVerifiedDriver = isVerifiedDriver;
	}



	public AutoInfo getDriverInformation() {
		return driverInformation;
	}



	public void setDriverInformation(AutoInfo driverInformation) {
		this.driverInformation = driverInformation;
	}



	private boolean authenticateDriver() {
		System.out.println("You're in authenticateDriver method");
		return true;
	}
	
	private void lookupRidePopup() {
		System.out.println("You're in lookupRidePopup method");
	}
	
	private void addAutoInfo() {
		System.out.println("You're in addAutoInfo method");
	}
	
}
