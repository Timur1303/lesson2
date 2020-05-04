public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 3);
        Square square = new Square("Square", 4);
        Dog dog = new Dog("Dog");



        /*System.out.println(circle.getClass().getSimpleName());
        circle.calculatePerimeter();
        System.out.println(square.getClass().getSimpleName());
        square.calculatePerimeter();*/

        Figure[] figures = {circle, square,
                new Triangle("Triangle", 2, 3, 4),
                new Rectangle("Rectangle", 5, 6),
                circle, square};

        for (int i = 0; i < figures.length; i++) {
            System.out.printf(figures[i].getName() + figures[i].draw() + " ");
            figures[i].calculatePerimeter();
        }
        System.out.println(dog.getName()+ " " + dog.draw()+ " " + dog.callSound());

    }

}