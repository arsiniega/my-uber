package business.edu.cofc.cs656.services;

import java.util.ArrayList;

import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.User;
import model.edu.cofc.cs656.models.UserPayment;

public class SignInService {
	
	private User userID;
	private double SignInSession;
	private ArrayList<UserPayment> signUpArr;
	private ArrayList<SignInService> signInArr;

//	public SignInService(ArrayList<UserPayment> signUpArr) {
//		super();
//	}

	public SignInService() {
		super();
	}
	
	public boolean validate(Renter r) {
		if (r.isrenterPaymentValidated()) {
			System.out.println("Renter is validated, sign in successful");
			return true;
		}
		else { 
			System.out.println("Renter is NOT validated, sign in FAILED");
			return false;
		}
	}
	
	public boolean validate(Driver d) {
		if (d.isVerifiedDriver) {
			System.out.println("Driver is validated, sign in successful");
			return true;
		}
		else { 
			System.out.println("Driver is NOT validated, sign in FAILED");
			return false;
		}
	}
	
	public static void main( String[] args ) {
        System.out.println( "You're in SignIn.");
    }

}
