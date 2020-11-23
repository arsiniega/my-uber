package edu.cofc.cs656.uber;

import model.edu.cofc.cs656.models.AutoInfo;
import model.edu.cofc.cs656.models.Car;
import model.edu.cofc.cs656.models.Driver;
import model.edu.cofc.cs656.models.Profile;
import model.edu.cofc.cs656.models.Renter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Uber!" );
        // First user, to be signedUp Renter requires validPayment
        
        Profile p1 = new Profile("Alan", "Smith", "843-428-0091", 4.5);
        Renter r1 = new Renter(1, false, p1, false);
        System.out.println(r1.toString());
        
        // Second user, to be signedUp Driver requires isVerifiedDriver from AutoInfo
        
        Profile p2 = new Profile("Otto", "Mann", "417-848-2213", 3.5);
        Car nissan = new Car("NISSAN", "SENTRA", "2001", "VIN8342");
        AutoInfo d1AutoInfo = new AutoInfo("GEICO123", "DLSC678", nissan);
        Driver d1 = new Driver(2, false, p2, false, d1AutoInfo);
        System.out.println(d1.toString());
    }
}
