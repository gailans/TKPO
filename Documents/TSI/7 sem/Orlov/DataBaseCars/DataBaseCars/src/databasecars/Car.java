/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package databasecars;

import java.io.Serializable;

/**
 *
 * @author Alex
 */
public class Car implements Serializable {

private String vinNum;
private String bodyType;
private String brandName;
private String model;

    public String getVinNum() {
        return vinNum;
    }

    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return " Car {" + "bodyType=" + bodyType + " " + "brandName=" + brandName +" "+ "model=" + model + " "+"vinNum="+vinNum;
    }

    public Car(String bodyType, String brandName, String model,String vinNum) {
        this.bodyType = bodyType;
        this.brandName = brandName;
        this.model = model;
        this.vinNum = vinNum;
    }

    

}
