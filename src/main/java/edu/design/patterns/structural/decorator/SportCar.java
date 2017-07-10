package edu.design.patterns.structural.decorator;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class SportCar extends CarDecorator {
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sport Car.");
    }
}
