public class Airline {

    private String title;
    private Flight[] flights;
    private int size;

    public Airline(String title) {
        this.title = title;
        flights=new Flight[2];
        size=0;


    }

    public String getTitle() {
        return title;
    }

    public void addFlight(String flightNum, String from,
                          String to, int duration,
                          int transfers){
        if(size<flights.length){
            flights[size++]=new Flight(flightNum, from,
                    to, duration, transfers);

        }
        else{
            this.flights=growArray(flights);
            addFlight(flightNum, from,
                    to, duration, transfers);
        }
    }

    private Flight[] growArray(Flight[] flights) {
        Flight[] flightCopy= new Flight[size*2];
        for(int i=0; i<flights.length;i++){
            flightCopy[i]=flights[i];
        }

//        for(int i=0; i<flights.length;i++){
//            System.out.println("From growArray : "+flightCopy[i]);
//        }
        return flightCopy;
    }
    public FlightIterator createIterator(){

        return new FlightIterator(flights);
    }
}
