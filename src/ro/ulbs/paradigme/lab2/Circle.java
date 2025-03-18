package ro.ulbs.paradigme.lab2;
class Circle extends Form {
    private float radius;

    public Circle() {
        super();
        this.radius = 1.0f;
    }

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(float v, String yellow) {
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + " and is a circle with radius " + radius;
    }
}