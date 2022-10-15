import animals.*;
import transport.Bus;
import transport.Car;
import transport.Train;

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
        train2.printInfo();

        Bus bus1 = new Bus("Ford","T2",1999,"USA","yellow",
                110,"School ");
        Bus bus2 = new Bus("Ford","T5",2007,"USA","Blue",
                130,"Individual ");
        Bus bus3 = new Bus("Tesla","xxx4",2025,"USA","White",
                170,"City transport.Bus ");

        bus1.printInfo();
        bus2.printInfo();
        bus3.printInfo();

        bus2.refiil(true,true,false);

        //ex3---------------------------------------------------------------------------------------------

        Herbivores gazele = new Herbivores("gaz",1,45,
                "savanna","herb");
        Herbivores giraffe = new Herbivores("Stick",3,30,
                "savanna","herb");
        Herbivores horse = new Herbivores("Runner",4,65,
                "wildness","herb");

        Predator hyena = new Predator("scavenger",5,56,
                "savanna","Meat");
        Predator tiger = new Predator("Murzik",3,70,
                "savanna","Meat");
        Predator bear = new Predator("Mishka",7,70,
                "wildness","Meat");

        Amphibians frog = new Amphibians("Crazy frog",6,"Water and earth");
        Amphibians snake = new Amphibians("SnakeFreshWater",5,"Water and earth");

        NotFlyingBird peacock = new NotFlyingBird("ChikChirik",2,"wildness"
                ,"Walk");
        NotFlyingBird pinguin = new NotFlyingBird("Bred",1,"wildness"
                ,"Walk");
        NotFlyingBird birdDodo = new NotFlyingBird("Dodo",3,"wildness"
                ,"Walk");

        FlyingBird seagull = new FlyingBird("Chaika",2,"Arround water",
                "Fly");
        FlyingBird albatross = new FlyingBird("albatross",3,"Arround water",
                "Fly");
        FlyingBird eagl = new FlyingBird("eagl",8,"wildness",
                "Fly");












    }

}