package HW5.Q2;

public class ShapeMaker {

    Shape circle = new Circle();
    Shape rectangle = new Rectangle();
    Shape square = new Square();

    public ShapeMaker(){
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();

    }
    public void drawSquare(){
        square.draw();
    }

}
