package animals;

public class Amphibians extends Animals {
    private String habitats ;
//------------------------------------------------------------------------------
    public String getHabitats() {
        return habitats;
    }

    public void setHabitats(String habitats) {
        if (habitats!=null&&!habitats.isEmpty()&&!habitats.isBlank()) {
            this.habitats = habitats;
        }
    }
    //------------------------------------------------------------------------------
    public Amphibians(String nickName, int yearsOld, String habitats) {
        super(nickName, yearsOld);
        this.setHabitats(habitats);
    }
    //------------------------------------------------------------------------------
    @Override
    public void eat() {
        System.out.println("Amhibians eat");
    }

    @Override
    public void go() {
        System.out.println("Amhibians go");
    }

    public void hunt() {
        System.out.println("Amphibians hunt");

    }

    @Override
    public String toString() {
        return super.toString()+"Amphibians{"+
                "habitats='" + habitats + '\'' +
                '}'+'\n';
    }

}
