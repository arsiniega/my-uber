package edu.cofc.cs656.uber;

import model.edu.cofc.cs656.models.AutoInfo;
import model.edu.cofc.cs656.models.Car;
import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Payment;
import model.edu.cofc.cs656.models.PaymentType;
import model.edu.cofc.cs656.models.Profile;
import model.edu.cofc.cs656.models.Renter;
import business.edu.cofc.cs656.services.SignUpService;
import business.edu.cofc.cs656.services.ReportWriterService;

/**
 * Hello world!
 *
 */
public class App {

	static int userid = 0;
	
	// Payment logic drives 10% discount 
	static boolean monthlySubscription = true; 
	static boolean oneTimePayment = false;
	
	// Signup logic 
	static boolean notSignedUp = false;
	static boolean signedUp = true;
	
	// Additional driver logic for verification purposes
	static boolean notVerifiedDriver = false;
	static boolean verifiedDriver = true;
	
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Uber!");
        
        // dummy profiles
        Profile pro1 = new Profile("Alan", "Smith", "(843) 428-0091", 4.5);
        Profile pro2 = new Profile("Bert", "Johnson", "(994) 711-8516", 4.2);
        Profile pro3 = new Profile("Earl", "Brown", "(704) 224-3467", 4.0);
        Profile pro4 = new Profile("Cassie", "Garcia", "(575) 753-4424", 4.1);
        Profile pro5 = new Profile("Dalila", "Miller", "(599) 392-8749", 3.5);
        Profile pro6 = new Profile("Ernie", "Davis", "(626) 526-0791", 5.0);
        Profile pro7 = new Profile("Anna", "Gonzalez", "(259) 694-5981", 4.9);
        Profile pro8 = new Profile("Otto", "Mann", "(417) 848-2213", 2.1);
        Profile pro9 = new Profile("Admin", "Istrator", "(999) 999-9999", 5.0);
        Profile pro10 = new Profile("Test", "User", "(231) 767-0480", 1.0);
        
        // dummy cars
        Car car1 = new Car("NISSAN", "MAXIMA", "2020", "VIN8342");
        Car car2 = new Car("TESLA", "MODEL 3", "2019", "VIN1128");
        Car car3 = new Car("HONDA", "ACCORD", "1981", "VIN5566");
        Car car4 = new Car("FORD", "F-150", "2009", "VIN1021");
        Car car5 = new Car("MAZDA", "CX-9", "2008", "VIN0099");
        Car car6 = new Car("FORD", "EXPEDITION", "2020", "VIN3020");
        Car car7 = new Car("TOYOTA", "TUNDRA", "1998", "VIN1199");
        Car car8 = new Car("FORD", "ECONOLINE", "2001", "VIN1717");
        
        // we will use these two automobile registrations for expediency 
        AutoInfo reg1 = new AutoInfo("GEICO123", "DLSC100542819", car1);
        AutoInfo reg2 = new AutoInfo("STATEFARM123", "DLSC100552312", car2);
        AutoInfo reg3 = new AutoInfo("GENERAL4478", "DLSC111342789", car3);
        
        // valid payment types have 12 digit checking # and 8 digits routing #
        PaymentType pt1 = new PaymentType("000777999102", "00804231"); 
        // valid payment types have UBER in the giftcard code
        PaymentType pt2 = new PaymentType("GIFTCARD-UBER"); 
        // invalid checking/routing combo
        PaymentType pt3 = new PaymentType("777999102", "00804231");
        // invalid gift card
        PaymentType pt4 = new PaymentType("U-GIFTCARD-LYFT");
        // valid payment
        PaymentType pt5 = new PaymentType("000666123209", "00804231"); 
        
        Payment pay1 = new Payment(pt1,monthlySubscription); // valid
        Payment pay2 = new Payment(pt2,oneTimePayment); // valid
        Payment pay3 = new Payment(pt3,monthlySubscription); // invalid
        Payment pay4 = new Payment(pt4,oneTimePayment); // invalid
        Payment pay5 = new Payment(pt5,oneTimePayment); // valid but not monthly
        Payment pay6 = new Payment(pt5,monthlySubscription); // valid AND monthly
        
        Renter rent1 = new Renter(userid++, notSignedUp, pro1);
        Renter rent2 = new Renter(userid++, notSignedUp, pro2);
        Renter rent3 = new Renter(userid++, notSignedUp, pro3);
        Renter rent4 = new Renter(userid++, notSignedUp, pro4);
        Renter rent5 = new Renter(userid++, notSignedUp, pro5);
        Renter rent6 = new Renter(userid++, signedUp, pro9);
        Renter rent7 = new Renter(userid++, signedUp, pro10);

        Driver drive1 = new Driver(userid++, notSignedUp, pro6, verifiedDriver, reg1);
        Driver drive2 = new Driver(userid++, notSignedUp, pro7, verifiedDriver, reg2);
        Driver drive3 = new Driver(userid++, notSignedUp, pro8, notVerifiedDriver, reg3);
        
        SignUpService service = new SignUpService();
        service.signUpUser(rent1);
        service.signUpUser(rent2, pay1);
        service.signUpUser(rent3);
        service.signUpUser(rent4, pay2);
        service.signUpUser(rent5, pay3);
        service.signUpUser(rent6, pay5);
        service.signUpUser(rent7, pay6);
        
        service.signUpUser(drive1);
        service.signUpUser(drive2, pay4);
        service.signUpUser(drive3, pay1);
        //service.printUserArray();
        
        ReportWriterService report = new ReportWriterService(service.getSignUpArr());
        
//        service.signUpUser(r2,pay1);
//        service.signUpUser(r1,pay2);
//        service.signUpUser(d1,pay3);
//        service.signUpUser(d1,pay4);
//        
        report.reportAllUsers();
        //report.reportFullUserInfo();
        report.reportUsersDiscount();
        
//        // Second user, to be signedUp Driver requires isVerifiedDriver from AutoInfo
//        
//        Car nissan = new Car("NISSAN", "SENTRA", "2001", "VIN8342");
//        AutoInfo d1AutoInfo = new AutoInfo("GEICO123", "DLSC678", nissan);
//        Driver d1 = new Driver(2, false, pro2, false, d1AutoInfo);
//        System.out.println(d1.toString());
        
    }
}
