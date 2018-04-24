package bbs.designmode.creatermode.simplefactory;

import bbs.interfaces.Car;
import org.junit.jupiter.api.Test;

/**
 * @author 73598.
 * @Date 2018/4/24 0024.
 * @Time 9:18.
 */
public class SimpleFactoryTest {
    @Test
    public void testSimpleFactory() {
        Car suv = CarFactory.createCar(Car.CAR_TYPE_SUV);
        suv.run();
    }
}
