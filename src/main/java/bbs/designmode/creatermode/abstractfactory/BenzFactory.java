package bbs.designmode.creatermode.abstractfactory;

import bbs.interfaces.Car;
import bbs.model.Battery;
import bbs.model.BusCar;
import bbs.model.SuvCar;

import java.math.BigDecimal;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 16:21.
 */
public class BenzFactory extends AbstractCarFactory {
    public static BenzFactory getInstance() {
        return new BenzFactory();
    }

    public BenzFactory() {
        this.factoryName = FACTORY_NAME_BENZ;
    }

    @Override
    Car createBus() {
        return new SuvCar(Car.CAR_TYPE_BUS, factoryName);
    }

    @Override
    Car createSuv() {
        return new BusCar(Car.CAR_TYPE_SUV ,factoryName);
    }

    /**
     * 抽象工厂方法  创建电池
     *
     * @return Car
     */
    @Override
    Battery createBattery() {
        return  new Battery(Battery.BATTERY_TYPE_LEADACID, BigDecimal.ONE,factoryName);
    }

}