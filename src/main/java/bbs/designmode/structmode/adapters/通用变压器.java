package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/9/21 0021.
 * @Time 16:21.
 */
public class 通用变压器 implements 变压器接口 {
    /**
     * @param srcVoltage 电器标准输入电压
     * @param desVoltage 标准输出电压
     * @return
     */
    @Override
    public Integer changeVoltage(int srcVoltage, int desVoltage) {
        System.out.println("通用变压器变压中  "+srcVoltage+" 变  "+desVoltage);
        return desVoltage;
    }
}
