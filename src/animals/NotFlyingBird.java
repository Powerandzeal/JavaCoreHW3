package animals;

public class NotFlyingBird extends Bird {
    private String  typeOfLocomotion;

    public String getTypeOfLocomotion() {
        return typeOfLocomotion;
    }

    public void setTypeOfLocomotion(String typeOfLocomotion) {
        this.typeOfLocomotion = typeOfLocomotion;
    }

    public NotFlyingBird(String nickName, int yearsOld, String habitats, String typeOfLocomotion) {
        super(nickName, yearsOld, habitats);
        this.typeOfLocomotion = typeOfLocomotion;
    }

    public void walk() {
        System.out.println("Bird walk");
    }
}
