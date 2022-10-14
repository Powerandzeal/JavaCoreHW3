public class Transport {
    protected String mark;
    protected String model;
    protected final int yearOfMade;
    protected final String country;
    protected String color;
    protected int maxSpeed;
//-----------------------------------------------------------------------------------
    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    //----------------------------------------------------------------------------------

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    //-------------------------------------------------------------------------------------

    public Transport(String mark,
                     String model,
                     int yearOfMade,
                     String country,
                     String color,
                     int maxSpeed)

    {
        this.mark = mark;
        this.model = model;
        this.yearOfMade = yearOfMade;
        this.country = country;
        if (color==null||color.isBlank()||color.isEmpty()) {
            System.out.println("Grey");
        } else this.color = color;
        if (maxSpeed>0) {
            this.maxSpeed = maxSpeed;
        }
    }

    public void printInfo() {
        System.out.println(
                "Brand "+ getMark()+'\n'+
                "Model "+ getModel()+'\n'+
                        "Year of made "+getYearOfMade()+'\n'+
                        "Made country "+getCountry()+'\n'+
                        "color "+getColor()+'\n'+
                        "Max speed "+getMaxSpeed()





        );
    }
}
