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

    //目标类 原来的适配器 只能适配 中国电器 但是要 被通用的话  又不改变当前类的话只能通过适配器模式 ,继承此类 实现target
    @Override
    public Boolean chinaCharge(ElectricalAppliance electricalAppliance) {
        return electricalAppliance.echarge(super._110to220(electricalAppliance.getVoltage()));
    }
}
