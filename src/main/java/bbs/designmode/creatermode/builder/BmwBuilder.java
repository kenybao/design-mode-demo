package bbs.designmode.creatermode.builder;

import bbs.interfaces.Car;
import bbs.model.Battery;
import bbs.model.BusCar;
import bbs.model.SuvCar;
import bbs.model.Wheel;

import java.math.BigDecimal;

/**
 * @author 73598.
 * @Date 2018/4/28 0028.
 * @Time 14:12.
 */
public class BmwBuilder implements CarBuilder {
    private static final String BUILDNAME = "BMW:";
    private Car car;

    BmwBuilder (){
        car = new SuvCar();
    }

    @Override
    public CarBuilder buildCarBody() {
        System.out.println(BUILDNAME + "buildCarBody");
        return this;
    }

    @Override
    public CarBuilder buildCarWheel() {
        System.out.println(BUILDNAME + "buildCarWheel");
        Wheel wheel = new Wheel();
        wheel.setColor("black");
        wheel.setSize("18cm");
        car.setWheel(wheel);
        return this;
    }

    @Override
    public CarBuilder buildBattery() {
        System.out.println(BUILDNAME + "buildBattery");
        Battery battery = new Battery(Battery.BATTERY_TYPE_LEADACID, BigDecimal.ONE,"BMW");
        car.setBattery(battery);
        return this;
    }
    @Override
    public Car build() {
        return car;
    }
}
