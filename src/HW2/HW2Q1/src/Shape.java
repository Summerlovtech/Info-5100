public class Shape {
    protected String name;
    protected String color;
    private double area;
    private double perimeter;

    public static void main(String[] args) {

        Shape shape1 = new Shape("Shape1", "pink");
        System.out.println("shape1");
        System.out.println(shape1.printShape());

        Shape shape2 = new Shape("Shape2", "orange", 20, 30);
        System.out.println("shape2");
        System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter());
        System.out.println(shape2.printShape());

        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle("Rectangle", "Purple",4, 7);
        System.out.println("rectangle2");
        System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printShape());

        Square square1 = new Square(3);
        System.out.println("square1");
        System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());

        Square square2 = new Square("Square" , "black", 7);
        System.out.println("square2");
        System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter());
        System.out.println(square2.printShape());

        }

    public String printShape(){
        return "The "+this.name+" has a "+this.color+" color";

    }

        public Shape(){

        }

    public Shape(String name, String color,double perimeter,double area){
        this(name,color);
        this.area=area;
        this.perimeter=perimeter;
    }

    public Shape(String name, String color){
        this.name=name;
        this.color=color;
    }


    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
    // Getter
    public String getColor() {
        return this.color;
    }

    // Setter
    public void setColor(String color) {
        this.color = color;
    }

    // Getter
    public int getArea() {
        return (int) this.area;
    }

    // Setter
    public void setArea(double area) {
        this.area = area;
    }

    // Getter
    public int getPerimeter() {
        return (int) this.perimeter;
    }

    // Setter
    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

}

