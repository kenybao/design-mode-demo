package bbs.designmode.structmode.adapters;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import lombok.Data;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 17:04.
 * 中国电器
 */
@Data
public class LETV extends ElectricalAppliance {
    @Override
    protected Boolean echarge(Integer voltage) {
        if (voltage != 220) {
            return false;
        }
        return true;
    }
}
