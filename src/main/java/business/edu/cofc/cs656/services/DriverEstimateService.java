package business.edu.cofc.cs656.services;

public class DriverEstimateService extends EstimateService{

	private double getDriverEarning() {
		return 1.0;
	}
	
	private void displayMap() {
		System.out.println( "Driver Earning:" + getDriverEarning());
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in DriverEstimate.");
    }
}
