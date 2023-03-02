public class Main {
    public static void main(String[] args) {

        Triangle t1 = new Triangle("red", 3, 4, 5);
        Shape t2 = new Triangle("pink", 4, 5, 6); //polymorphism

        Circle c1 = new Circle("pink", 4);
        Shape c2 = new Circle("yellow", 5);

        Rectangle r1 = new Rectangle("white", 5, 3);
        Shape r2 = new Rectangle("red", 10, 8);

        Square sq1 = new Square("black", 5);
        Shape sq2 = new Square("green", 8);

        Shape[] myShapes = new Shape[8];
        myShapes[0] = t1;
        myShapes[1] = t2;
        myShapes[2] = c1;
        myShapes[3] = c2;
        myShapes[4] = r1;
        myShapes[5] = r2;
        myShapes[6] = sq1;
        myShapes[7] = sq2;

        for (int i = 0; i < myShapes.length; i++) {
            myShapes[i].toString();
        }

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(sq1);
        System.out.println(sq2);

        System.out.println();
        System.out.println("The following is different kind of shapes derived from the class Shape:");
        System.out.println(Shape.type);
        System.out.println(Circle.type);
        System.out.println(Rectangle.type);
        System.out.println(Square.type);
        System.out.println(Triangle.type);

    }
}