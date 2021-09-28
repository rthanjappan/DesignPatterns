public class Flight {

    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    public Flight(String flightNum, String from,
                  String to, int duration,
                  int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDuration() {
        return duration;
    }

    public int getNumTransfers() {
        return transfers;
    }

    @Override
    public String toString() {
        String str="Flight Number : " + flightNum + "\n" +
                    "From: " + from + "\n" +
                     "To: " + to + "\n" ;
        int hour = duration/60;
        int minutes= duration%60;
        str+="Duration: "+hour +" hours "+minutes +" minutes\n";

        if(transfers == 0){
            str+="Direct Flight\n";
        }
        else{
            str+=transfers+" Transfer\n";
        }
        return str;
    }
//    Flight Number: 477B
//    From: Charlotte
//    To: Seattle
//    Duration: 14 hours 20 minutes
//1 Transfer
}
