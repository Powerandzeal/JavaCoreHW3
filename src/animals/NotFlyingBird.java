package animals;

public class NotFlyingBird extends Bird {
    private String  typeOfLocomotion;

    public String getTypeOfLocomotion() {
        return typeOfLocomotion;
    }

    public void setTypeOfLocomotion(String typeOfLocomotion) {
        if (typeOfLocomotion!=null&&!typeOfLocomotion.isBlank()&&!typeOfLocomotion.isEmpty()) {
            this.typeOfLocomotion = typeOfLocomotion;
        }
    }

    public NotFlyingBird(String nickName, int yearsOld, String habitats, String typeOfLocomotion) {
        super(nickName, yearsOld, habitats);
        this.setTypeOfLocomotion(typeOfLocomotion);
    }

    public void walk() {
        System.out.println("Bird walk");
    }

    @Override
    public String toString() {
        return super.toString()+'\n'+"NotFlyingBird{" +
                "typeOfLocomotion='" + typeOfLocomotion + '\'' +
                '}'+'\n';
    }
}
