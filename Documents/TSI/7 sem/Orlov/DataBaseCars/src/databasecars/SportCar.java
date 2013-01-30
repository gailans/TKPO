/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package databasecars;

/**
 *
 * @author Alex
 */
public class SportCar extends Car {

    private String color;

    public SportCar(String vinNum,String bodyType, String brandName, String model, String color) {
        super(bodyType, brandName, model,vinNum);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ "color=" + color + "}";
    }
}

