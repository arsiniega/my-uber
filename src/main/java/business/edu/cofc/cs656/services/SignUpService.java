package business.edu.cofc.cs656.services;

import java.util.Collection;
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

	public SignUpService(Driver d) {
		this.driver = d;		
	}
	
	public SignUpService(Renter r, Payment p) {
		this.renter = r;
		this.payment = p;
	}

	
	private void updatePayment() {
		
	}
	
	private void updateAutoInfo() {
		
	}
	
	private void runBackgroundChecks() {
		
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in SignUpService.");
        
        // First user, to be signedUp Renter requires validPayment
        
        Profile p1 = new Profile("Alan", "Smith", "843-428-0091", 1);
        Renter r1 = new Renter(1, false, p1, false);
        System.out.println(r1.toString());
        
        // Second user, to be signedUp Driver requires isVerifiedDriver from AutoInfo
        
        Profile p2 = new Profile("Otto", "Mann", "417-848-2213", 1);
        Car nissan = new Car("NISSAN", "SENTRA", "2001", "VIN8342");
        AutoInfo d1AutoInfo = new AutoInfo("GEICO123", "DLSC678", nissan);
        Driver d1 = new Driver(2, false, p2, false, d1AutoInfo);
        System.out.println(d1.toString());
       
    }
	
}
