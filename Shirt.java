public class Shirt extends Clothing {


    private String name;
    private String color;

    public Shirt (String name, String color) {
       super(name,color);
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

}
