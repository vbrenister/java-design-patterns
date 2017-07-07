package edu.design.patterns.creation.factory;

import edu.design.patterns.creation.factory.model.Computer;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class TestFactory {
    public static void main(String[] args) {
        testFactory();
        testAbstractFactory();
    }

    public static void testFactory() {
        System.out.println("===========Simple factory test===========");
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");

        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }

    public static void testAbstractFactory() {
        System.out.println("===========Abstract factory test===========");
        Computer pc = ComputerFactory.getComputerFromFactory(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputerFromFactory(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));

        System.out.println("AbstractFactory PC Config::" + pc);
        System.out.println("AbstractFactory Server Config::" + server);
    }
}
