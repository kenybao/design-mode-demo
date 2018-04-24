package bbs.designmode.creatermode.simplefactory;

import bbs.designmode.creatermode.factorymethodpattern.AbstractCarFactory;
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
    public static Car createCar(String name) {
        //根据传入参数的区别 返回不同的实体类，调用方不关心具体生产逻辑
        if (name.equals(Car.CAR_TYPE_SUV)) {
            return new SuvCar("小型suv", AbstractCarFactory.FACTORY_NAME_BENZ);
        } else if (name.equals(Car.CAR_TYPE_BUS)) {
            return   new BusCar("大巴", AbstractCarFactory.FACTORY_NAME_BMW);
            //other cars
        }
        return null;
    }


}
