package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:40.
 */
public class ObjectAdapter implements Target {
    private 变压器 变压器;

    public ObjectAdapter(变压器 变压器) {
        this.变压器 = 变压器;
    }

    @Override
    public void charge(ElectricalAppliance electricalAppliance) throws Exception {
        if(变压器 == null)
            throw new Exception("未初始化目标方法类");
        electricalAppliance.echarge(变压器._220to110(ElectricalAppliance.VOITAGE));
    }
}
