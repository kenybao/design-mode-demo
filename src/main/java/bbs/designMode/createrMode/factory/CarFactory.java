package bbs.designMode.createrMode.factory;

import bbs.interfaces.Car;
import bbs.model.BusCar;
import bbs.model.SuvCar;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 11:04.
 * @Description 简单工厂模式
 */
public class CarFactory {
    public static Car createCar(String name, Integer size) {
        //根据传入参数的区别 返回不同的实体类，调用方不关心具体生产逻辑
        if (name.equals("SUV")) {
            return new SuvCar(name);
        } else if (name.equals("BUS")) {
            return new BusCar(name);
            //other cars
        }
        return null;
    }

    public static void main(String[] args) {
        Car suv = createCar("SUV", 1);
        suv.run();
        createCar("BUS", 1).run();
    }
}
