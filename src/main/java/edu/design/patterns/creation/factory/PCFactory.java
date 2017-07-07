package edu.design.patterns.creation.factory;

import edu.design.patterns.creation.factory.model.Computer;
import edu.design.patterns.creation.factory.model.PC;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, cpu, hdd);
    }
}
