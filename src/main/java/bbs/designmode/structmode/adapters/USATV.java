package bbs.designmode.structmode.adapters;

import lombok.Data;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 17:04.
 */
@Data
public class USATV extends ElectricalAppliance {
    public USATV() {
        voltage = 110;
    }

    @Override
    protected void echarge(Integer voltage) {
        if(voltage != this.voltage){
            System.out.println("USATV 输入电压非110v");
            return;
        }
        System.out.println("USATV 正在充电");
    }
}
