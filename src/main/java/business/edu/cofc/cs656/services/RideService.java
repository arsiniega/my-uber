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
	private ServiceFinderService servicefinder;
	private float origin;
	private float destination;
	
	public RideService() {
		ridestatus = new Ride();
		servicefinder = new ServiceFinderService();
		System.out.println("RideService has been initiated");
	}
	   
    public void setOrigin(float geocode) {
    	System.out.println("Origin : " + geocode);
    	origin = geocode;
    }
    
    public void setDestination(float geocode) {
    	System.out.println("Destination : " + geocode);
    }
    
    public void chooseServiceType() {
    	servicefinder.isUberAvailable(origin);
    }
    
    public void startRide(Renter renter) {
    	// From the Renter's perspective the drive has started 
    	// but we should wait for a Driver to acceptRide...
    	System.out.println("The Renter has initiated the request to start the ride...");
    	ridestatus.setStatus(Ride.RideStatus.NotStarted);
    }
    
    public void acceptRide(Driver driver) {
    	// Once a Driver has accepted we can start the ride
    	System.out.println("The Driver has accepted the request to start the ride...");
    	ridestatus.setStatus(Ride.RideStatus.Started);
    }
    
    public boolean isRideInProgress() {
    	if (ridestatus.isInProgress()) 
    		System.out.println("[[[[Ride is in progress!]]]]");
    	else
    		System.out.println("Ride is NOT in progress.");
    	
    	return ridestatus.isInProgress();
    }
    
    public void finishRide(Renter renter, Driver driver) {
    	System.out.println("The Ride has finished");
    	ridestatus.setStatus(Ride.RideStatus.Finished);
    }
    
    public static void main( String[] args )
    {
        System.out.println( "You're in Ride.");
        System.out.println( "Are we riding?"); 
        Ride testRide = new Ride();
        testRide.setStatus(Ride.RideStatus.NotStarted);
        
    }
}
