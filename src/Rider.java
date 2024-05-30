import java.util.ArrayList;

public class Rider {

    private String name;
    private int numSeatsNeeded;

    public Rider(String name, int numSeatsNeeded, ArrayList<Rider> allRiders){
        this.name = name;
        this.numSeatsNeeded = numSeatsNeeded;

        allRiders.add(this);
    }

    public String getName(){
        return name;
    }
    public void setName(String name1){
        name = name1;
    }

    public int getNumSeatsNeeded(){
        return numSeatsNeeded;
    }
    public void setNumSeatsNeeded(int numSeatsNeeded1){
        numSeatsNeeded = numSeatsNeeded1;
    }
}
