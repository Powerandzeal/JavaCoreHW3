package animals;

public class Herbivores extends Mammals{
    private String typeOfFood;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public Herbivores(String nickName, int yearsOld, int speedMoving, String habitats, String typeOfFood) {
        super(nickName, yearsOld, speedMoving, habitats);
        this.typeOfFood = typeOfFood;
    }

    public void pasture() {
        System.out.println("Herbivores is pasturing");
    }

}
