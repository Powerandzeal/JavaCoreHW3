package animals;

public class Predator extends Mammals{
    private String typeOfFood;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public Predator(String nickName, int yearsOld, int speedMoving, String habitats, String typeOfFood) {
        super(nickName, yearsOld, speedMoving, habitats);
        this.typeOfFood = typeOfFood;
    }

    public void String() {
        System.out.println("Predator hunt");
    }
}
