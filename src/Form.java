public class Form {

    private String color;


    public Form() {
        this.color = "white";
    }

    // Constructor cu parametri
    public Form(String color) {
        this.color = color;
    }

    // Metodă care returnează aria (implicit 0)
    public float getArea() {
        return 0;
    }

    // Suprascrierea metodei toString()
    @Override
    public String toString() {
        return "This form has the color " + color;
    }

    // Getter pentru color (opțional)
    public String getColor() {
        return color;
    }

    // Setter pentru color (opțional)
    public void setColor(String color) {
        this.color = color;
    }

    // Testare în main
    public static void main(String[] args) {
        Form f1 = new Form();  // Obiect creat cu constructorul implicit
        Form f2 = new Form("red");  // Obiect creat cu constructorul cu parametru

        System.out.println(f1);  // Afișează: This form has the color white
        System.out.println(f2);  // Afișează: This form has the color red
        System.out.println("Aria formei: " + f1.getArea());
    }
}
