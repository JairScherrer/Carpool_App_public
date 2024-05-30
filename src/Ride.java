import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Ride {

    Scanner input = new Scanner(System.in);

    public String driverName;
    public boolean isAvailable;
    public int numSeats;
    public int seatsAvailable;
    public boolean rating;
    public double totalRating;
    public int ratingCount;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName1) {
        driverName = driverName1;
    }

    public boolean getisAvailable() {
        return isAvailable;
    }

    public void setisAvailable(boolean isAvailable1) {
        isAvailable = isAvailable1;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats1) {
        numSeats = numSeats1;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable1) {
        seatsAvailable = seatsAvailable1;
    }

    public boolean getRating() {
        return rating;
    }

    public void setRating(boolean rating1) {
        rating = rating1;
    }

    public double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(double ratingValue1) {
        totalRating = ratingValue1;
    }

    public Ride(String driverName, boolean isAvailable, int numSeats, int seatsAvailable, boolean rating) {
        this.driverName = driverName;
        this.isAvailable = isAvailable;
        this.numSeats = numSeats;
        this.seatsAvailable = seatsAvailable;
        this.rating = rating;


        totalRating = 0;
        ratingCount = 0;

    }

    public static void displayAvailableRides(ArrayList<Ride> rides, int minSeats) {
        for (int i = 0; i < rides.toArray().length; i++) {
            Ride ride = rides.get(i);
            if (ride.getisAvailable() && ride.getNumSeats() >= minSeats) {
                System.out.println(ride.getDriverName() + ", Seats: " + ride.getSeatsAvailable());
            }

        }
    }

    public static String getAvailableRides(ArrayList<Ride> rides, int minSeats) {
        for (int i = 0; i < rides.toArray().length; i++) {
            Ride ride = rides.get(i);
            if (ride.getisAvailable() && ride.getNumSeats() >= minSeats) {
                return (ride.getDriverName() + ", Seats: " + ride.getSeatsAvailable());
            }

        }
        return "No available rides with the required number of seats.";

    }

    public static void hireRide(ArrayList<Ride> rides, int numSeats) {
        for (int i = 0; i < rides.toArray().length; i++) {
            if (rides.get(i).getSeatsAvailable() > numSeats) {
                rides.get(i).setSeatsAvailable(rides.get(i).getSeatsAvailable() - numSeats);
                System.out.println("You hired " + rides.get(i).getDriverName() + " as your driver!");
                break;
            }
        }
    }

    public void addRating(int rating) {
        totalRating += rating;
        ratingCount++;
    }

    public double getAverageRating() {
        if (ratingCount == 0) {
            return 0.0;
        }
        return totalRating / ratingCount;
    }

    public void endRide(ArrayList<Ride> rides, int numSeats) {
        for (int i = 0; i < rides.toArray().length; i++) {
            rides.get(i).setSeatsAvailable(rides.get(i).getSeatsAvailable() + numSeats);
            System.out.println("Your ride with " + rides.get(i).getDriverName() + " has concluded.");
            System.out.println("Give " + rides.get(i).getDriverName() + " a rating of 1-5 stars: ");
            int rideRating = input.nextInt();
            addRating(rideRating);
            break;
        }
    }

    public String toString() {
        return driverName + " is available: " + isAvailable + "     and has " + numSeats + "seats available";

    }
}
