package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 16:54.
 * 国产电器的电源适配器
 */
public class ChineseAdapter implements Target {

    /**
     * 充电
     * @throws Exception
     */
    @Override
    public void charge(ElectricalAppliance electricalAppliance) throws Exception {

        if (electricalAppliance == null || electricalAppliance.getVoltage() == null || electricalAppliance.getVoltage()!= ElectricalAppliance.VOITAGE ) {
            System.out.println(" ChineseAdapter 该电器的额定电压非法");
        }
        electricalAppliance.echarge(electricalAppliance.getVoltage());
        return;

    }
}
