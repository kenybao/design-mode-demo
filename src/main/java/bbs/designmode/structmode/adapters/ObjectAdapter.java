package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:40.
 */
public class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() throws Exception {
        if(adaptee == null)
            throw new Exception("未初始化目标方法类");
        this.adaptee.specificRequest();
    }
}
