package transport;

import transport.Transport;

public class Car extends Transport {
    private String statusRefill = "";
    private  int countOfSit;
    private String transmisson;
    private String typeEngine;
//--------------------------------------------------------------------------------

    public Car (String mark,
               String model,
               int yearOfMade,
               String country,
               String color,
               int maxSpeed,
               int countOfSit,
               String transmisson,
               String typeEngine)
    {
        super(mark, model, yearOfMade, country, color, maxSpeed);
        this.countOfSit = countOfSit;
        this.transmisson = transmisson;
        this.typeEngine = typeEngine;
    }
//--------------------------------------------------------------------------------
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(
                "Count of sit "+countOfSit+'\n'+
                "Type of transmission "+transmisson+'\n'+
                        "Type of engine "+typeEngine+'\n'
        );
        System.out.println();
    }
    //---------------------------------------------------------------------------------------------------------------
    public  void refiil(Boolean gasoline,Boolean diesel, Boolean electro){
        if (gasoline || diesel || electro) {
            statusRefill = "fill";
        } else statusRefill = "Not fill";

    }
}
