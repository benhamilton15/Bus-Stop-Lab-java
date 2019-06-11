import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers =  new ArrayList<Person>();
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void pickUpPassengerFromStop(BusStop busStop) {
        if (busStop.queueLength() > 0 && this.passengers.size() < capacity){
            Person person = busStop.removePersonFromQueue();
            this.passengers.add(person);
        }
    }

    public void removePassenger() {
        passengers.remove(0);
    }
}
