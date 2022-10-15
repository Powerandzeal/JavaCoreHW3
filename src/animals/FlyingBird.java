package animals;

public class FlyingBird extends Bird {
    private String typeOfLocomotion;

    public String getTypeOfLocomotion() {
        return typeOfLocomotion;
    }

    public void setTypeOfLocomotion(String typeOfLocomotion) {
        this.typeOfLocomotion = typeOfLocomotion;
    }

    public FlyingBird(String nickName, int yearsOld, String habitats, String typeOfLocomotion) {
        super(nickName, yearsOld, habitats);
        this.typeOfLocomotion = typeOfLocomotion;
    }

    public void fly () {
        System.out.println("Bird Fly");
    }


}
