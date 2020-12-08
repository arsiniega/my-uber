package business.edu.cofc.cs656.services;

import model.edu.cofc.cs656.models.*;

/**
 * Hello world!
 *
 */
public class RideService 
{
	public Driver driver;
	public Renter renter;
	private RideStatus status;
	
	RideService(Renter r, Driver d) {
		this.driver = d;
		this.renter = r;
	}
	   
    private void setOrigin(float geocode) {
    	System.out.println("Origin : " + geocode);
    }
    
    private void setDestination(float geocode) {
    	System.out.println("Destination : " + geocode);
    }
    
    private void chooseServiceType() {
    	
    }
    
    public void startRide(Renter renterID) {
    	
    }
    
    public boolean acceptRide(Driver driverID) {
    	return true;
    }
    
    public static void main( String[] args )
    {
        System.out.println( "You're in Ride.");
        System.out.println( "Are we riding?"); 
        if (RideStatus.InProgress.getActiveRideStatus() == true)
        	System.out.println( "Yes we are!");
        else
        	System.out.println( "No, we aren't!");
    }
}
