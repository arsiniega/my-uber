package business.edu.cofc.cs656.services;

public class ServiceFinderService {

	private double carClassMultiplier;
	
	public boolean isUberAvailable(float OriginGeocode) {
		System.out.println("Uber Service is available");
		return true;
	}
	
	public boolean isUberXLAvailable(float OriginGeocode) {
		return false;
	}
	
	private boolean isUberRideShare(float OriginGeocode) {
		return false;
	}
	
}
