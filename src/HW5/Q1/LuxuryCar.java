package HW5.Q1;

public class LuxuryCar extends CarDecorator{
    @Override
    public void assemble(){
        super.assemble();
        System.out.print("Adding features of Luxury Car.");
    }

    public LuxuryCar(Car car){
        super(car);

    }




}
