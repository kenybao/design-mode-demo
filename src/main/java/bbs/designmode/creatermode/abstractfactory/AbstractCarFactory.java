package bbs.designmode.creatermode.abstractfactory;

import bbs.interfaces.Car;
import bbs.model.Battery;
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
     * @return
     */
    abstract Car createBus();
    /**
     * @return Car
     */
    abstract Car createSuv();

    /**
     * 抽象工厂方法  创建电池
     * @return Car
     */
    abstract Battery createBattery();
}
