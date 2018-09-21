package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:40.
 * 通用适配器接口
 */
public class GeneralAdapter implements Target {
    private 变压器接口 变压器接口;

    public GeneralAdapter(变压器接口 变压器接口) {
        this.变压器接口 = 变压器接口;
    }
    /**
     * 充电
     *
     * @param electricalAppliance
     * @param volTageEnum
     * @throws Exception
     */
    @Override
    public Boolean charge(ElectricalAppliance electricalAppliance, VolTageEnum volTageEnum) throws Exception {
        if(变压器接口 == null)
            throw new Exception("未初始化目标方法类");
        return  electricalAppliance.echarge(变压器接口.changeVoltage(electricalAppliance.getVoltage(),volTageEnum.getVoltage()));
    }
}
