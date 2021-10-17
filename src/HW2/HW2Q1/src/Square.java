public class Square extends Shape{
        private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }

    public Square(String name, String color,int side) {
            this.name = name;
            this.color= color;
            this.side=side;
    }

    @Override
    public int getArea() {
        return (int)side*side;
    }

    @Override
    public int getPerimeter() {

        return (int)side*4;
    }


}

