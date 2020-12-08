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
	private Ride ridestatus;
	
	RideService() {
		ridestatus.setStatus(Ride.RideStatus.NotStarted);
	}
	   
    private void setOrigin(float geocode) {
    	System.out.println("Origin : " + geocode);
    }
    
    private void setDestination(float geocode) {
    	System.out.println("Destination : " + geocode);
    }
    
    private void chooseServiceType() {
    	
    }
    
    public void startRide(Renter renter) {
    	
    }
    
    public boolean acceptRide(Driver driver) {
    	return true;
    }
    
    public static void main( String[] args )
    {
        System.out.println( "You're in Ride.");
        System.out.println( "Are we riding?"); 
        Ride testRide = new Ride();
        testRide.setStatus(Ride.RideStatus.NotStarted);
        
    }
}
