package bbs.designmode.structmode.proxy;

import bbs.interfaces.Car;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 15:13.
 * 不用中文对不起黄牛
 */
public class 黄牛 implements  Buyer{

    @Override
    public Car buyCar() {
        System.out.println("黄牛收手续费");
        System.out.println("黄牛去买车");
        Car car = new RealBuyer().buyCar();
        System.out.println("黄牛抽点");
        return car;
    }
}
