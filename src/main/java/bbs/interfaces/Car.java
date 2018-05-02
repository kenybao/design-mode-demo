package bbs.interfaces;

import bbs.model.Battery;
import bbs.model.Wheel;
import lombok.Data;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 11:00.
 * 抽象对象 为产品的抽象类 描述实例 的公共特性
 */
@Data
public abstract class Car  {
    public  static final  String CAR_TYPE_SUV = "SUV";
    public  static final  String CAR_TYPE_BUS = "BUS";
    protected String name = null;
    protected String factoryName = "default factoryName";
    protected Wheel wheel = null;
    protected Boolean isBattery = false;
    protected Battery battery;
    protected void setCarpropeties(String name, String factoryName) {
         this.name = name;
         this.factoryName = factoryName;
    }
    public abstract void run();
}
