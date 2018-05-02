package bbs.designmode.creatermode.abstractfactory;

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

        //客户要 suv 欸 这里两个工厂都会生产suv
        bmwFactory.createSuv().run();
        benzFactory.createSuv().run();

        bmwFactory.createBus().run();
        benzFactory.createBus().run();
        //客户想要 电池 欸 在父工厂接口内添加一个 我想要电池的接口 下面两个子类厂商添加不同的电池接口的实现
        // 当然也可以添加一个新的子工厂实现类 实现三个接口
        bmwFactory.createBattery().run();
        benzFactory.createBattery().run();

    }
}
