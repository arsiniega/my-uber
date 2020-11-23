package business.edu.cofc.cs656.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import model.edu.cofc.cs656.models.AutoInfo;
import model.edu.cofc.cs656.models.Car;
import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.User;
import model.edu.cofc.cs656.models.UserPayment;
import model.edu.cofc.cs656.models.Payment;
import model.edu.cofc.cs656.models.PaymentType;
import model.edu.cofc.cs656.models.Profile;

public class SignUpService {
	
	private ArrayList<UserPayment> signUpArr;
	
	public SignUpService() {
		signUpArr = new ArrayList<UserPayment>();
	}

	public void signUpUser(User u) {
		Payment pay = new Payment();
		UserPayment userPay = new UserPayment(u, pay);
		signUpArr.add(userPay);
//		if (u instanceof Driver) {
	}

	public void signUpUser(User u, Payment p) {
		UserPayment userPay = new UserPayment(u, p);
		signUpArr.add(userPay);
	}
	
	public void printUserArray() {
		for (UserPayment userPay: signUpArr) {
			if (validPayment(userPay.getP()))
				System.out.println("Payment validated for " + userPay.getU().getUserProfile().getName());
			else
				System.out.println("Payment NOT validated for " + userPay.getU().getUserProfile().getName());
		}
		
	}
	
	private boolean validPayment(Payment p) {
		if ( (p.getPayment().getAccount() != null && p.getPayment().getRouting() != null &&
				p.getPayment().getAccount().length() == 12 && 
				p.getPayment().getRouting().length() == 8)
			 || (p.getPayment().getGiftCard() != null && p.getPayment().getGiftCard().contains("UBER")) )
			return true;
		else
			return false;
	}
	
	private void validatePayment(Payment p) {
		
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in SignUpService.");
        
        Profile p1 = new Profile("Alan", "Smith", "843-428-0091", 4.5);
        Renter r1 = new Renter(1, false, p1, false);
        System.out.println(r1.toString());
        
        // Second user, to be signedUp Driver requires isVerifiedDriver from AutoInfo
        
        Profile p2 = new Profile("Otto", "Mann", "417-848-2213", 3.5);
        Car nissan = new Car("NISSAN", "SENTRA", "2001", "VIN8342");
        AutoInfo d1AutoInfo = new AutoInfo("GEICO123", "DLSC678", nissan);
        Driver d1 = new Driver(2, false, p2, false, d1AutoInfo);
        System.out.println(d1.toString());
        
        SignUpService service = new SignUpService();
        service.signUpUser(r1);
        service.signUpUser(d1);
        service.printUserArray();
    }
	
}
