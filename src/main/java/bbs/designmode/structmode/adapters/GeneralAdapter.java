package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:40.
 * 通用适配器接口
 */
public class GeneralAdapter extends ChinaAdapter implements Target {

    /**
     * 充电
     *
     * @param electricalAppliance
     * @param volTageEnum
     * @throws Exception
     */
    @Override
    public Boolean charge(ElectricalAppliance electricalAppliance, VolTageEnum volTageEnum) throws Exception {
        if(volTageEnum.getVoltage() != VolTageEnum.CHINA.getVoltage()){
            return false;
        }
        return super.chinaCharge(electricalAppliance);
    }

}
