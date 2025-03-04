package ro.ulbs.paradigme.lab2;
class Triangle extends Form {
    private float base;
    private float height;

    public Triangle(float v, float base, String red) {
        super();
        this.base = 1.0f;
        this.height = 1.0f;
    }

    public Triangle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " and is a triangle with base " + base + " and height " + height;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.base, base) == 0 &&
                Float.compare(triangle.height, height) == 0;
    }
}
