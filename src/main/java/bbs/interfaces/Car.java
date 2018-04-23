package bbs.interfaces;

import bbs.model.Wheel;
import lombok.Data;

/**
 * @author 73598.
 * @Date 2018/4/23 0023.
 * @Time 11:00.
 * 抽象对象 为产品的抽象类 描述实例 的公共特性
 */
@Data
public abstract class Car {
    protected String name = null;
    protected Wheel wheel = null;
    public abstract void run();
}
