package ro.ulbs.paradigme.lab2;

public class Form {

    private String color;
    private static int counter = 0; // camp static care contorizeaza instantele

    public Form() {
        this.color = "white";
        counter++; // incrementam contorul in constructor
    }

    public Form(String color) {
        this.color = color;
        counter++; // incrementam si aici
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

    // Getter public pentru contor
    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Form f1 = new Form();
        Form f2 = new Form("red");
        Form f3 = new Form("blue");

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println("Aria formei: " + f1.getArea());

        // Afisam contorul
        System.out.println("Numarul de instante create: " + Form.getCounter());
    }
}

