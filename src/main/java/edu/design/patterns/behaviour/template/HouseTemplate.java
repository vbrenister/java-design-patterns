package edu.design.patterns.behaviour.template;

/**
 * Created by vbrenister on 7/10/2017.
 */
abstract public class HouseTemplate {

    private void buildWindows() {
        System.out.println("Building glass windows");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods and sand");
    }

    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

}
