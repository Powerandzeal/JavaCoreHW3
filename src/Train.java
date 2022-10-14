import java.time.LocalDateTime;

public class Train extends Transport {
    private String fare;
    private Integer travelTime;
    private String departureStation;
    private String terminalStation;
    private int quanityWagon;
//----------------------------------------------------------------------------------------
    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare;
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getTerminalStation() {
        return terminalStation;
    }

    public void setTerminalStation(String terminalStation) {
        this.terminalStation = terminalStation;
    }

    public int getQuanityWagon() {
        return quanityWagon;
    }

    public void setQuanityWagon(int quanityWagon) {this.quanityWagon = quanityWagon;
    }
    //------------------------------------------------------------------------------------------


    public Train(String mark,
                 String model,
                 int yearOfMade,
                 String country,
                 String color,
                 int maxSpeed,
                 String fare,
                 Integer travelTime,
                 String departureStation,
                 String terminalStation,
                 int quanityWagon)
    {
        super(mark, model, yearOfMade, country, color, maxSpeed);

        if (fare==null) {
            this.fare = "incorrect fare";
        } else this.fare = fare;

        if (travelTime==null) {
            this.travelTime = 1;
        } else this.travelTime = travelTime;

        if (departureStation!=null||departureStation.isBlank()) {
            this.departureStation = departureStation;
        } else System.out.println("Station not assigned");

        if (terminalStation!=null||!terminalStation.isEmpty()||!terminalStation.isBlank()) {
            this.terminalStation = terminalStation;
        } else System.out.println("Departure station not assigned");

        if (quanityWagon>0) {
            this.quanityWagon = quanityWagon;
        } else System.out.println("Quanity Wagon is negativ ");

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(
                "Fare "+fare+'\n'+
                        "Travel time "+travelTime+'\n'+
                        "departure Station "+departureStation+'\n'+
                        "terminal Station "+terminalStation+'\n'+
                        "quanity Wagon "+quanityWagon


        );
    }
}
