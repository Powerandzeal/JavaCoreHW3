package transport;

import transport.Transport;

public class Train extends Transport {
    private String statusRefill;
    private double fare;
    private Integer travelTime;
    private String departureStation;
    private String terminalStation;
    private int quanityWagon;
//----------------------------------------------------------------------------------------
    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
       if (fare>0)
        this.fare = fare;
    }

    public Integer getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(Integer travelTime) {
        if (travelTime!=null) {
            this.travelTime = travelTime;
        } else this.travelTime = 12;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        if (departureStation!=null&&!departureStation.isBlank()&&!departureStation.isEmpty()) {
            this.departureStation = departureStation;
        } else departureStation = "information is missing";
    }

    public String getTerminalStation() {
        return terminalStation;
    }

    public void setTerminalStation(String terminalStation) {
        if (terminalStation!=null&&!terminalStation.isEmpty()&&!terminalStation.isBlank()) {
            this.terminalStation = terminalStation;
        } else System.out.println("Departure station not assigned");
    }

    public int getQuanityWagon() {
        return quanityWagon;
    }

    public void setQuanityWagon(int quanityWagon) {
        if (quanityWagon>0) {
            this.quanityWagon = quanityWagon;
        } else System.out.println("Quanity Wagon is negativ ");
    }
    //------------------------------------------------------------------------------------------


    public Train(String mark,
                 String model,
                 int yearOfMade,
                 String country,
                 String color,
                 int maxSpeed,
                 double fare,
                 Integer travelTime,
                 String departureStation,
                 String terminalStation,
                 int quanityWagon)
    {
        super(mark, model, yearOfMade, country, color, maxSpeed);

        this.setFare(fare);

        this.setTravelTime(travelTime);

        this.setDepartureStation(departureStation);

        this.setTerminalStation(terminalStation);

        this.setQuanityWagon(quanityWagon);
        //------------------------------------------------------------------------
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(
                "Fare "+fare+'\n'+
                        "Travel time "+travelTime+'\n'+
                        "departure Station "+departureStation+'\n'+
                        "terminal Station "+terminalStation+'\n'+
                        "quanity Wagon "+quanityWagon+'\n'


        );
    }

    @Override
    public void refiil(Boolean gasoline,Boolean diesel, Boolean electro) {
        if (diesel) {
            statusRefill = "fill";
        } else statusRefill = "Not fill";

    }
}
