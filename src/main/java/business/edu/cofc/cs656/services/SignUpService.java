package business.edu.cofc.cs656.services;

import java.util.List;

import model.edu.cofc.cs656.models.AutoInfo;
import model.edu.cofc.cs656.models.Car;
import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.User;
import model.edu.cofc.cs656.models.Payment;
import model.edu.cofc.cs656.models.PaymentType;
import model.edu.cofc.cs656.models.Profile;

public class SignUpService {
	
	private Driver driver;
	private Renter renter;
	private Payment payment;
	private int userID;
	
	private List<User> users;

	public SignUpService(Driver d) {
		this.driver = d;
		users.add(d);
		
	}
	
	public SignUpService(Renter r, Payment p) {
		this.renter = r;
		this.payment = p;
		users.add(r);
	}
	
	
	private void updatePayment() {
		
	}
	
	private void updateAutoInfo() {
		
	}
	
	private void runBackgroundChecks() {
		
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in SignUpService.");
        
        // First user, requires
        
        Profile p1 = new Profile("Alan", "Smith", "843-428-0091", 1);
        
        
        Profile p2 = new Profile("Otto", "Mann", "417-848-2213", 1);
        Car nissan = new Car("NISSAN", "SENTRA", "2001", "VIN8342");
        AutoInfo p2AutoInfo = new AutoInfo("GEICO123", "DLSC678", nissan);
        Driver d2 = new Driver(1, false, p1, "Al", 1, false, p2AutoInfo);
        
        //SignUpService s1 = new SignUpService();
    }
	
}
