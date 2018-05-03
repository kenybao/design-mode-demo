package bbs.designmode.structmode.adapters;

import lombok.Data;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 17:03.
 * 电器设备接口
 */
@Data
public abstract class ElectricalAppliance {
    /**
     * 国内标准电压
     */
    public static final Integer VOITAGE = 220;
    /**
     * 电器输入标准电压
     */
   protected Integer voltage = 220;

   protected abstract void echarge(Integer voltage);

}
