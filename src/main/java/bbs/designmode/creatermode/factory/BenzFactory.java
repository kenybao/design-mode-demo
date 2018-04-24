package bbs.designmode.creatermode.factory;

import bbs.interfaces.Car;
import bbs.model.BusCar;
import bbs.model.SuvCar;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 16:21.
 */
public class BenzFactory extends AbstractCarFactory {
    public static BenzFactory getInstance() {
        return new BenzFactory();
    }

    @Override
    Car createCar(String name) {
        this.factoryName = FACTORY_NAME_BENZ;
        //根据传入参数的区别 返回不同的实体类，调用方不关心具体生产逻辑
        if (name.equals(Car.CAR_TYPE_SUV)) {
            return new SuvCar(name, factoryName);
        } else if (name.equals(Car.CAR_TYPE_BUS)) {
            return new BusCar(name, factoryName);
            //other cars
        }
        return null;
    }
}