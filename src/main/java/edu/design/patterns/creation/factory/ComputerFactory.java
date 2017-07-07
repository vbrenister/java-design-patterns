package edu.design.patterns.creation.factory;

import edu.design.patterns.creation.factory.model.Computer;
import edu.design.patterns.creation.factory.model.PC;
import edu.design.patterns.creation.factory.model.Server;

/**
 * Created by vbrenister on 7/7/2017.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        switch (type.toLowerCase()) {
            case "pc":
                return new PC(ram, cpu, hdd);
            case "server":
                return new Server(ram, cpu, hdd);
            default:
                return null;
        }
    }

    public static Computer getComputerFromFactory(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
