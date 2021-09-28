import java.util.Iterator;

public class FlightIterator implements Iterator<Flight> {
    private Flight[] flights;
    private int position;

    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    @Override
    public boolean hasNext() {
        if(position >= flights.length|| flights[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Flight next() {
        return flights[position++];
    }
}
