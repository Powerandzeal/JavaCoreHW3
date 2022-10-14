public class Main {
    public static void main(String[] args) {
        Car car = new Car("Bmw","x5",2003,"Germany","Black",199,
                4,"Auto","Electrysity");
        car.printInfo();


        Train train1 = new Train("Lastocha","B-901",2011,"Russia",null,
                301,"3500 rub",null,"Belorussky Railway Station",
                "Minsk passangers",11);
        Train train2 = new Train("Leningrad","D-125",2019,"Russia",null,
                270,"1700",null,"Leningradsy Railway Station",
                "Leningrad passangers",8);

        train1.printInfo();




    }

}