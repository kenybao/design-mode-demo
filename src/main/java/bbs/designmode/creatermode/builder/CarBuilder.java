package bbs.designmode.creatermode.builder;

import bbs.interfaces.Car;

/**
 * @author 73598.
 * @Date 2018/4/28 0028.
 * @Time 14:12.
 */
public interface CarBuilder {
    CarBuilder buildCarBody();
    CarBuilder buildCarWheel();
    CarBuilder buildBattery();
    Car build();
}
