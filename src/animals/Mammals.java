package animals;

public class Mammals extends Animals {
    private int speedMoving;
    private String habitats;

    public int getSpeedMoving() {
        return speedMoving;
    }

    public void setSpeedMoving(int speedMoving) {
        if (speedMoving>0) {
            this.speedMoving = speedMoving;
        }
    }

    public String getHabitats() {
        return habitats;
    }

    public void setHabitats(String habitats) {
        if (habitats!=null&&!habitats.isEmpty()&&!habitats.isBlank()) {
            this.habitats = habitats;
        }

    }

    public Mammals(String nickName, int yearsOld, int speedMoving, String habitats) {
        super(nickName, yearsOld);
        this.setSpeedMoving(speedMoving);
        this.setHabitats(habitats);
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

    @Override
    public String toString() {
        return super.toString()+'\n'+"Mammals{" +
                "speedMoving=" + speedMoving +
                ", habitats='" + habitats + '\'' +
                '}'+'\n';
    }
}
