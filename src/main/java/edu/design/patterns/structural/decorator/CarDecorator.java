package edu.design.patterns.structural.decorator;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class CarDecorator implements Car {

    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
