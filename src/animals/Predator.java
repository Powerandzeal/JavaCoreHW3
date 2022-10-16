package animals;

public class Predator extends Mammals{
    private final String typeOfFood = "Meat";

    public String getTypeOfFood() {
        return typeOfFood;
    }

    /*public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }*/

    public Predator(String nickName, int yearsOld, int speedMoving, String habitats) {
        super(nickName, yearsOld, speedMoving, habitats);
    }

    public void String() {
        System.out.println("Predator hunt");
    }

    @Override
    public String toString() {
        return super.toString()+'\n'+"Predator{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
