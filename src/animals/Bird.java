package animals;

public class Bird extends Animals {
    private String habitats;

    public String getHabitats() {
        return habitats;
    }

    public void setHabitats(String habitats) {
        this.habitats = habitats;
    }

    public Bird(String nickName, int yearsOld, String habitats) {
        super(nickName, yearsOld);
        this.habitats = habitats;
    }

    @Override
    public void eat() {
        System.out.println("Bird eat");
    }

    @Override
    public void go() {
        System.out.println("Bird go");
    }

    public void hunt() {
        System.out.println("Bird hunt");
    }

}
