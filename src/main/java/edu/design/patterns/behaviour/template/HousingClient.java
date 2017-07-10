package edu.design.patterns.behaviour.template;

/**
 * Created by vbrenister on 7/10/2017.
 */
public class HousingClient {
    public static void main(String[] args) {
        HouseTemplate houseType = new WoodHouse();


        houseType.buildHouse();

        System.out.println("*********");

        houseType = new GlassHouse();

        houseType.buildHouse();
    }
}
