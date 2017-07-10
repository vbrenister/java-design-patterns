package edu.design.patterns.behaviour.template;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
