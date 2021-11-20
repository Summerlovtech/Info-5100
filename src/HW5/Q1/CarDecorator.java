package HW5.Q1;

public abstract class CarDecorator implements Car{

    protected Car car;
    @Override
    public void assemble(){
        car.assemble();
    }

    public CarDecorator(Car car){
      this. car = car;
    }
}
