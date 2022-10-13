public class Car extends Transport  {
    private  int countOfSit;
    private String transmisson;
    private String typeEngine;
//--------------------------------------------------------------------------------

    public Car(String mark,
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
        System.out.println(
                "Count of sit "+countOfSit+'\n'+
                "Type of transmission"+transmisson+'\n'+
                        "Type of engine"+typeEngine
        );
    }
}
