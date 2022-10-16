package animals;

public abstract class Animals {
    private   String nickName;
    private int yearsOld;

    //---------------------------------------------------------------------------------------


    public String getNickName() {
        return nickName;
    }

    public final void setNickName(String nickName) {
        if (nickName!=null&&!nickName.isBlank()&&!nickName.isEmpty()) {
            this .nickName = nickName;
        }
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        if (yearsOld>=0) {
            this.yearsOld = yearsOld;
        }
    }

    //--------------------------------------------------------------------------------------------

    public Animals(String nickName, int yearsOld) {
        this.nickName = nickName;
        this.yearsOld = yearsOld;
    }

    public abstract void eat();

    public void sleep(){
    }

    public abstract void go();

    @Override
    public String toString() {
        return "Animals{" +
                "nickName='" + nickName + '\'' +
                ", yearsOld=" + yearsOld +
                '}';
    }

}
