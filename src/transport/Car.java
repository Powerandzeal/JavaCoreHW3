package transport;

import transport.Transport;

public class Car extends Transport {
    private String statusRefill;
    private  int countOfSit;
    private String transmisson;
    private String typeEngine;
//--------------------------------------------------------------------------------

    public int getCountOfSit() {
        return countOfSit;
    }

    public void setCountOfSit(int countOfSit) {
        if (countOfSit>=1) {
            this.countOfSit = countOfSit;
        }
    }

    public String getTransmisson() {
        return transmisson;
    }

    public void setTransmisson(String transmisson) {
        if (transmisson!=null&&!transmisson.isEmpty()&&transmisson.isBlank()) {
            this.transmisson = transmisson;
        } else transmisson = "information is missing";
    }

    public String getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(String typeEngine) {
        if (typeEngine!=null&&!typeEngine.isEmpty()&&typeEngine.isBlank()) {
            this.typeEngine = typeEngine;
        } else typeEngine = "information is missing";
    }


    //----------------------------------------------------------------------------------

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
        this.setCountOfSit(countOfSit);
        this.setTransmisson(transmisson);
        this.setTypeEngine(typeEngine);
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
