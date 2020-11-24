package business.edu.cofc.cs656.services;

import java.util.ArrayList;

import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Renter;
import model.edu.cofc.cs656.models.User;
import model.edu.cofc.cs656.models.UserPayment;

public class ReportWriterService {
	
	private ArrayList<UserPayment> signUpArr;

	public ReportWriterService(ArrayList<UserPayment> signUpArr) {
		super();
		this.signUpArr = signUpArr;
	}
	
	public void reportAllUsers() {
		System.out.println("Report all users:");
		for (UserPayment user: signUpArr) {
			if (isRenter(user.getU()))
				System.out.println("Renter " + user.getU().getUserID() + " " + user.getU().getUserProfile().getName());
			else if (isDriver(user.getU())) {
				System.out.println("Driver " + user.getU().getUserID() + " " + user.getU().getUserProfile().getName());
			}
		}
	}
	
	public void reportFullUserInfo() {
		System.out.println("Report all users:");
		for (UserPayment user: signUpArr) {
			System.out.println("User " + user.toString());		
		}
	}
	
	public void reportUsersDiscount() {
		System.out.println("Report Discount User Information:");
		for (UserPayment user: signUpArr) {
				System.out.println("User " + user.getU().getUserID() + " " + user.getU().getUserProfile().getName() +
						" " + user.getP().getPaymentSubscription() + " " + user.getP().getDiscountRate() + " " + user.getP().getPayment());
			
		}
	}
	
	private boolean isDriver(User u) {
		if (u instanceof Driver) {
			return true;
		}
		return false;
	}
	
	private boolean isRenter(User u) {
		if (u instanceof Renter) {
			return true;
		}
		return false;		
	}
	
}
