package transport;

import transport.Transport;

public class Bus extends Transport {
    private String statusRefill;
    private String purpose;

    public Bus(String mark,
               String model,
               int yearOfMade,
               String country,
               String color,
               int maxSpeed,
               String purpose) {
        super(mark, model, yearOfMade, country, color, maxSpeed);

        if (purpose!=null||!purpose.isBlank()) {
            this.purpose = purpose;
        } else this.purpose= "universal Type";

    }
    public void printInfo(){
        super.printInfo();
        System.out.println();
        System.out.println(
                "Purpose bus"+purpose+'\n'
        );
    }
    public void refiil(Boolean gasoline,Boolean diesel, Boolean electro){
        if (gasoline || diesel ) {
            statusRefill = "fill";
        } else statusRefill = "Not fill";

    }
}
