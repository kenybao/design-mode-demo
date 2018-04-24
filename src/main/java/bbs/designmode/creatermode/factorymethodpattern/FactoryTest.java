package bbs.designmode.creatermode.factorymethodpattern;

import org.junit.jupiter.api.Test;

/**
 * @author 73598.
 * @Date 2018/4/24 0024.
 * @Time 9:16.
 */
public class FactoryTest {
    @Test
    public  void aa() {
        BmwSuvFactory bmwSuvFactory = BmwSuvFactory.getInstance();
        BenzBusFactory benzBusFactory = BenzBusFactory.getInstance();

        //客户要 suv 诶，bmv正好有个工厂生产这个
        bmwSuvFactory.createCar().run();
        //客户要 bus 诶，benz正好有个工厂生产这个
        benzBusFactory.createCar().run();
    }
}
