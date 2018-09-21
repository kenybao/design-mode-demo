package bbs.designmode.structmode.adapters;

import lombok.Data;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 17:04.、美式电器
 */
@Data
public class USATV extends ElectricalAppliance {
    public USATV() {
        voltage = 110;
    }

    @Override
    protected Boolean echarge(Integer voltage) {
        if(voltage != this.voltage){
            return false;
        }
        return true;
    }
}
