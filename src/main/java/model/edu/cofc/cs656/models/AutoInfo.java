package model.edu.cofc.cs656.models;

public class AutoInfo {
	
	private int insuranceCompanyId;
	private int driverlicense;
	private String vin;
	
	public AutoInfo(int insuranceCompanyId, int driverlicense, String vin) {
		super();
		this.insuranceCompanyId = insuranceCompanyId;
		this.driverlicense = driverlicense;
		this.vin = vin;
	}
	

	@Override
	public String toString() {
		return "AutoInfo [insuranceCompanyId=" + insuranceCompanyId + ", driverlicense=" + driverlicense + ", vin="
				+ vin + "]";
	}



	public int getInsuranceCompanyId() {
		return insuranceCompanyId;
	}



	public void setInsuranceCompanyId(int insuranceCompanyId) {
		this.insuranceCompanyId = insuranceCompanyId;
	}



	public int getDriverlicense() {
		return driverlicense;
	}



	public void setDriverlicense(int driverlicense) {
		this.driverlicense = driverlicense;
	}



	public String getVin() {
		return vin;
	}



	public void setVin(String vin) {
		this.vin = vin;
	}



	private void validateInsurance() {
		
	}
	
	private void validateDriverLicense() {
		
	}
	
	private void addCar(Car c) {
		
	}
	
    public static void main( String[] args )
    {
        System.out.println( "You're in AutoInfo.");
    }

}
