package bbs.designmode.creatermode.factorymethodpattern;

import bbs.interfaces.Car;
import bbs.model.SuvCar;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 16:21.
 */
public class BenzBusFactory extends AbstractCarFactory {
    public static BenzBusFactory getInstance() {
        return new BenzBusFactory();
    }

    public BenzBusFactory() {
        this.factoryName = FACTORY_NAME_BENZ;
    }

    /**
     * 工厂方法模式 每个方法返回一个具体对象
     * 原简单工厂方法中有具体判断逻辑，现工厂逻辑分发到各个子工厂逻辑中
     *
     * @return
     */
    @Override
    public Car createCar() {
        return new SuvCar(Car.CAR_TYPE_BUS, factoryName);
    }
}