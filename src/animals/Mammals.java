package animals;

public class Mammals extends Animals {
    private int speedMoving;
    private String habitats;

    public int getSpeedMoving() {
        return speedMoving;
    }

    public void setSpeedMoving(int speedMoving) {
        this.speedMoving = speedMoving;
    }

    public String getHabitats() {
        return habitats;
    }

    public void setHabitats(String habitats) {
        this.habitats = habitats;
    }

    public Mammals(String nickName, int yearsOld, int speedMoving, String habitats) {
        super(nickName, yearsOld);
        this.speedMoving = speedMoving;
        this.habitats = habitats;
    }

    @Override
    public void eat() {
        System.out.println("Mammals eat");
    }

    @Override
    public void go() {
        System.out.println("Mammals go");
    }

    public void walk() {
        System.out.println("Mammals walk ");
    }
}
