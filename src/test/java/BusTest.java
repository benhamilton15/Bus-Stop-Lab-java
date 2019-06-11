import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;
    BusStop busStop;


    @Before
    public void before() {
        bus = new Bus("Glasgow", 47);
        busStop = new BusStop("Airport Bus Stop");
        busStop.addPersonToQueue(person);

    }

    @Test
    public void busStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengerToBusFromStop() {
        bus.pickUpPassengerFromStop(busStop);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void canRemovePassengerFromBus() {
        bus.pickUpPassengerFromStop(busStop);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void cantPickUpFromEmptyQueue() {
        BusStop busStop = new BusStop("Empty Stop");
        bus.pickUpPassengerFromStop(busStop);
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void cannotPickUpPassngersWhenBusFull(){
        Bus bus = new Bus("nowhere", 1);
        busStop.addPersonToQueue(person);
        bus.pickUpPassengerFromStop(busStop);
        bus.pickUpPassengerFromStop(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(1,busStop.queueLength());
    }

}
