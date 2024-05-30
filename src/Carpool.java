import java.util.ArrayList;
import java.util.Scanner;

public class Carpool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        new CarpoolLogin();

        for(int i = 0; i < Objects.allRides.size(); i++){
            System.out.println(Objects.allRides.get(i).toString() + "n/");
        }
    }

}