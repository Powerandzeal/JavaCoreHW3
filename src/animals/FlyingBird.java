package animals;

public class FlyingBird extends Bird {
    private String typeOfLocomotion;

    public String getTypeOfLocomotion() {
        return typeOfLocomotion;
    }

    public void setTypeOfLocomotion(String typeOfLocomotion) {
        if (typeOfLocomotion!=null&&!typeOfLocomotion.isBlank()&&!typeOfLocomotion.isEmpty()) {
            this.typeOfLocomotion = typeOfLocomotion;
        }
    }

    public FlyingBird(String nickName, int yearsOld, String habitats, String typeOfLocomotion) {
        super(nickName, yearsOld, habitats);
        this.setTypeOfLocomotion(typeOfLocomotion);
    }

    public void fly () {
        System.out.println("Bird Fly");
    }

    @Override
    public String toString() {
        return super.toString()+'\n'+"FlyingBird{" +
                "typeOfLocomotion='" + typeOfLocomotion + '\'' +
                '}'+'\n';
    }
}
