public class Triangle extends  Figure {
    private int a;
    private int b;
    private int c;


    public Triangle(String name, int a, int b, int c) {
        super.setName(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter = "+(a+b+c));
    }

    @Override
    public String draw() {
        return "🔺";
    }
}
