package ro.ulbs.paradigme.lab2;

public class Form {

    private String color;


    public Form() {
        this.color = "white";
    }


    public Form(String color) {
        this.color = color;
    }


    public float getArea() {
        return 0;
    }


    @Override
    public String toString() {
        return "This form has the color " + color;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public static void main(String[] args) {
        Form f1 = new Form();
        Form f2 = new Form("red");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println("Aria formei: " + f1.getArea());
    }
}
