package bbs.designmode.structmode.proxy;

import bbs.designmode.creatermode.factorymethodpattern.BenzBusFactory;
import bbs.interfaces.Car;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 15:12.
 */
public class RealBuyer implements Buyer {

    @Override
    public Car buyCar() {
        System.out.println("realBuyer pay money");
        return BenzBusFactory.getInstance().createCar();
    }
}
