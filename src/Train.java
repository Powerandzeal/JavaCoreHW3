import java.time.LocalDateTime;

public class Train extends Transport {
    private int fare;
    private int travelTime;
    private String departureStation;
    private String terminalStation;
    private String quanityWagon;
//----------------------------------------------------------------------------------------
    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
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

    public String getQuanityWagon() {
        return quanityWagon;
    }

    public void setQuanityWagon(String quanityWagon) {
        this.quanityWagon = quanityWagon;
    }
    //------------------------------------------------------------------------------------------


    public Train(String mark,
                 String model,
                 int yearOfMade,
                 String country,
                 String color,
                 int maxSpeed,
                 int fare,
                 int travelTime,
                 String departureStation,
                 String terminalStation,
                 String quanityWagon)
    {
        super(mark, model, yearOfMade, country, color, maxSpeed);
        this.fare = fare;
        this.travelTime = travelTime;
        this.departureStation = departureStation;
        this.terminalStation = terminalStation;
        this.quanityWagon = quanityWagon;
    }
}
