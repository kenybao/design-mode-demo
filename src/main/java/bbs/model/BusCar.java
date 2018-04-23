package bbs.model;

import bbs.interfaces.Car;
import lombok.Data;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 11:05.
 */
@Data
public class BusCar extends Car {
    public BusCar(String name) {
        super.name = name;
    }

    @Override
    public void run() {
        System.out.println(name +": 20 people up then  run");
    }
}
