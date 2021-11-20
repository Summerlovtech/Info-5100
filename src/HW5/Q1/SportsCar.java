package HW5.Q1;

public class SportsCar extends CarDecorator{
    @Override
    public void assemble(){
        super.assemble();
        System.out.print("Adding features of Sports Car.");
    }

    public SportsCar(Car car){
        super(car);

    }


}
