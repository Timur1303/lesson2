public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(String name, int a, int b) {
        super.setName(name);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void calculatePerimeter() {
        System.out.println("Perimeter = " + 2*(a+b));
    }

    @Override
    public String draw() {
        return "◼️◼";
    }
}
