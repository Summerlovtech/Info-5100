public class Rectangle extends Shape{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int side) {
        this.width =side;
        this.height =side;
    }


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Rectangle(name, color, width, height)

    public Rectangle(String name, String color, int width, int height) {
        //.name=name;
        //this.color=color;
        super(name, color);
        this.width = width;
        this.height = height;

    }

    @Override
    public int getArea() {
        return (int)width*height;
    }

    @Override
    public int getPerimeter() {

        return (int)(width+height)*2;
    }
}

