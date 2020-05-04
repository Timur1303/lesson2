public class Circle extends Figure {
    private int r;

    public Circle(String name, int r) {
        super.setName(name);
        this.r = r;
    }

    public int getR() {
        return r;
    }


    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter = "+(2*3.14*r));
    }

    @Override
    public String draw() {
        return "🔴";
    }
}
