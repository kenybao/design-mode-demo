package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:33.
 * 类适配器 使用继承 目标方法类
 * 与 对象适配器不同 对象适配器是委派目标方法类（定义成员变量并在构造器等方法中初始化）
 */
public class ClassAdapter extends Adaptee implements Target {
    //目标类 adaptee 没有request 方法 但是有specificrequst方法 相当于 adapter类做了一层包装
    @Override
    public void request() {
        super.specificRequest();
    }
}
