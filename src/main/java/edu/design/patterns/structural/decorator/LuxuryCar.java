package edu.design.patterns.structural.decorator;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury car.");
    }
}
