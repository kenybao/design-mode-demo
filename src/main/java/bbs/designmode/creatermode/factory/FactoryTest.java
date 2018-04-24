package bbs.designmode.creatermode.factory;

import bbs.interfaces.Car;
import org.junit.jupiter.api.Test;

/**
 * @author 73598.
 * @Date 2018/4/24 0024.
 * @Time 9:16.
 */
public class FactoryTest {
    @Test
    public  void aa() {
        BmwFactory bmwFactory = BmwFactory.getInstance();
        BenzFactory benzFactory = BenzFactory.getInstance();

        //客户要 宝马厂商生产的suv
        bmwFactory.createCar(Car.CAR_TYPE_SUV).run();
        bmwFactory.createCar(Car.CAR_TYPE_BUS).run();
        benzFactory.createCar(Car.CAR_TYPE_SUV).run();
        benzFactory.createCar(Car.CAR_TYPE_BUS).run();
    }
}
