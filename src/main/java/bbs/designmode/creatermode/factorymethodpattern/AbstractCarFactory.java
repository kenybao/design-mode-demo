package bbs.designmode.creatermode.factorymethodpattern;

import bbs.interfaces.Car;
import lombok.Data;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 16:18.
 */
@Data
public abstract class AbstractCarFactory {
    /**
     * 工厂名称 宝马
     */
    public  static final  String FACTORY_NAME_BMW = "宝马";
    /**
     * 工厂名称 奔驰
     */
    public  static final  String FACTORY_NAME_BENZ = "奔驰";
    /**
     * 工厂企业名称
     */
    protected String factoryName;

    /**
     * 工厂方法模式 每个方法返回一个具体对象
     * @return
     */
    abstract Car createCar();
}
