package bbs.model;

import bbs.interfaces.Car;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 11:05.
 */
public class SuvCar extends Car {
    public SuvCar(String name) {
        super.name = name;
    }

    @Override
    public void run() {
        System.out.println(name +" run");
    }
}
