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
public class BmwFactory extends AbstractCarFactory {
    public static BmwFactory getInstance() {
        return new BmwFactory();
    }
    public BmwFactory() {
        this.factoryName = FACTORY_NAME_BMW;
    }
    @Override
    Car createBus() {
        return new SuvCar(Car.CAR_TYPE_SUV, factoryName);
    }

    @Override
    Car createSuv() {
        return new BusCar(Car.CAR_TYPE_BUS ,factoryName);
    }

    /**
     * 抽象工厂方法  创建电池
     *
     * @return Car
     */
    @Override
    Battery createBattery() {
        return  new Battery(Battery.BATTERY_TYPE_LITHIUM, BigDecimal.TEN,factoryName);
    }


}
