package bbs.model;

import bbs.interfaces.Car;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 11:05.
 */
public class SuvCar extends Car {
    /**
     * suv 特性 ：爬坡
     */
    private Boolean Climb;

    public SuvCar(){}

    public SuvCar(String name,String  factoryName) {
        super.setCarpropeties(name,factoryName);
    }

    @Override
    public void run() {
        System.out.println(toString());
    }
}
