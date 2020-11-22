package model.edu.cofc.cs656.models;

public class AutoInfo {
	
	private int insuranceCompanyId;
	private int driverlicense;
	private Car car;
	

	public AutoInfo(int insuranceCompanyId, int driverlicense, Car car) {
		super();
		this.insuranceCompanyId = insuranceCompanyId;
		this.driverlicense = driverlicense;
		this.car = car;
	}

	@Override
	public String toString() {
		return "AutoInfo [insuranceCompanyId=" + insuranceCompanyId + ", driverlicense=" + driverlicense + ", car="
				+ car + "]";
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


	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	private void validateInsurance() {
		
	}
	
	private void validateDriverLicense() {
		
	}
	
	private void addCar(Car c) {
		
	}

}
