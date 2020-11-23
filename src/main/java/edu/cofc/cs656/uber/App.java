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
        
        Profile pro1 = new Profile("Alan", "Smith", "(843) 428-0091", 4.5);
        Profile pro2 = new Profile("Bert", "Johnson", "(994) 711-8516", 4.2);
        Profile pro3 = new Profile("Earl", "Brown", "(704) 224-3467", 4.0);
        Profile pro4 = new Profile("Cassie", "Garcia", "(575) 753-4424", 4.1);
        Profile pro5 = new Profile("Dalila", "Miller", "(599) 392-8749", 3.5);
        Profile pro6 = new Profile("Ernie", "Davis", "(626) 526-0791", 5.0);
        Profile pro7 = new Profile("Anna", "Gonzalez", "(259) 694-5981", 4.9);
        Profile pro8 = new Profile("Otto", "Mann", "(417) 848-2213", 2.1);
        
        Car car1 = new Car("NISSAN", "MAXIMA", "2020", "VIN8342");
        Car car2 = new Car("TESLA", "MODEL 3", "2019", "VIN1128");
        Car car3 = new Car("HONDA", "ACCORD", "2011", "VIN5566");
        Car car4 = new Car("FORD", "F-150", "2009", "VIN1021");
        Car car5 = new Car("MAZDA", "CX-9", "2008", "VIN0099");
        Car car6 = new Car("FORD", "EXPEDITION", "2020", "VIN3020");
        Car car7 = new Car("TOYOTA", "TUNDRA", "1998", "VIN1199");
        Car car8 = new Car("FORD", "ECONOLINE", "2001", "VIN1717");
        
        AutoInfo reg1 = new AutoInfo("GEICO123", "DLSC100542819", car1);
        AutoInfo reg2 = new AutoInfo("STATEFARM123", "DLSC100552312", car2);

        // Second user, to be signedUp Driver requires isVerifiedDriver from AutoInfo
        
        Car nissan = new Car("NISSAN", "SENTRA", "2001", "VIN8342");
        AutoInfo d1AutoInfo = new AutoInfo("GEICO123", "DLSC678", nissan);
        Driver d1 = new Driver(2, false, pro2, false, d1AutoInfo);
        System.out.println(d1.toString());
    }
}
