import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Bus bus;
    Person person;
    BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Airport", 5);
        person = new Person();
        busStop = new BusStop("Airport Bus Stop");
    }

    @Test
    public void queueStartsEmpty(){
        assertEquals(0, busStop.queueLength());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.queueLength());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(0, busStop.queueLength());
    }





}
