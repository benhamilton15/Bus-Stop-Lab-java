import java.util.ArrayList;

public class BusStop {

    private String stopName;
    private ArrayList<Person> queue;

    public BusStop(String stopName){
        this.stopName = stopName;
        this.queue = new ArrayList<Person>();
    }

    public int queueLength() {
        return this.queue.size();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removePersonFromQueue() {
        return this.queue.remove(0);
    }
}
