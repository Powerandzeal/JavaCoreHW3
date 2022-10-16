package transport;

public abstract class Transport {
    private final String mark;
    private final String model;
    private final int yearOfMade;
    private final String country;
    private String color;
    private int maxSpeed;
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

    public void setColor(String color) {
        if (color==null||color.isBlank()||color.isEmpty()) {
            this.color = "Grey";
        } else this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed>0) {
            this.maxSpeed = maxSpeed;
        }
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
        this.setColor(color);
        this.setMaxSpeed(maxSpeed);

    }

    public void printInfo() {
        System.out.print(
                "Brand "+ getMark()+'\n'+
                "Model "+ getModel()+'\n'+
                        "Year of made "+getYearOfMade()+'\n'+
                        "Made country "+getCountry()+'\n'+
                        "color "+getColor()+'\n'+
                        "Max speed "+getMaxSpeed()+'\n'
        );

    }

    public abstract void refiil(Boolean gasoline,Boolean diesel, Boolean electro);

}
