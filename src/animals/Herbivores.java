package animals;

public class Herbivores extends Mammals{
    private final String typeOfFood = "Herb";

    public String getTypeOfFood() {
        return typeOfFood;
    }

    /*public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }*/

    public Herbivores(String nickName, int yearsOld, int speedMoving, String habitats) {
        super(nickName, yearsOld, speedMoving, habitats);

    }

    public void pasture() {
        System.out.println("Herbivores is pasturing");
    }

    @Override
    public String toString() {
        return super.toString()+"Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}'+'\n';
    }
}
