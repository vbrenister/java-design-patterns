package edu.design.patterns.creation.builder;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("100 GB", "2 GB")
                .withBluetoothEnabled(true).build();

        System.out.println(computer);
    }
}
