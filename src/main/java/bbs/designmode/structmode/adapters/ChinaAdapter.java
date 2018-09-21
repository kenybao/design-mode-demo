package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:33.
 * 类适配器 使用继承 目标方法类
 * 与 对象适配器不同 对象适配器是委派目标方法类（定义成员变量并在构造器等方法中初始化）
 * ChinaAdapter 和 ObjectAdapter的区别就是 一个是继承 一个是组合
 */
public class ChinaAdapter extends 中国变压器 implements ChinaTarget {

    //目标类 中国变压器 没有充电 方法 但是有specificrequst方法 相当于 adapter类做了一层包装
    @Override
    public Boolean chinaCharge(ElectricalAppliance electricalAppliance) {
        return electricalAppliance.echarge(super._110to220(electricalAppliance.getVoltage()));
    }
}
