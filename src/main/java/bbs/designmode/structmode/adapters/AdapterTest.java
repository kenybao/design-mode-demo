package bbs.designmode.structmode.adapters;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:31.
 *
 * 冲突：Target期待调用Request方法，而Adaptee并没有（这就是所谓的不兼容了）。
解决方案：为使Target能够使用Adaptee类里的SpecificRequest方法，故提供一个中间环节Adapter类（继承Adaptee & 实现Target接口），把Adaptee的API与Target的API衔接起来（适配）。

---------------------

本文来自 Carson_Ho 的CSDN 博客 ，全文地址请点击：https://blog.csdn.net/carson_ho/article/details/54910430?utm_source=copy
 *
 */
public class AdapterTest {
    @Test
    public void testAdapter1() throws Exception {
        //Target期待调用charge方法，而ChinaAdapter并没有（这就是所谓的不兼容了）
//        Target.requst??
        LETV letv = new LETV();
        ChinaTarget chinaTarget = new ChinaAdapter();
        Assert.isTrue( chinaTarget.chinaCharge(letv),"");

    }
    @Test
    public void testAdapter1_C() throws Exception {
        USATV usatv = new USATV();
        ChinaTarget chinaTarget = new ChinaAdapter();
        Assert.isTrue( chinaTarget.chinaCharge(usatv).equals(Boolean.FALSE),"");
    }

    @Test
    public void testAdapter2() throws Exception {
        LETV letv = new LETV();
        ChinaAdapter chinaAdapter = new ChinaAdapter();
        Assert.isTrue( chinaAdapter.chinaCharge(letv),"");
    }
    @Test
    public void testAdapter3() throws Exception {
        USATV tv = new USATV();
        ChinaAdapter chinaAdapter = new ChinaAdapter();
        Assert.isTrue( chinaAdapter.chinaCharge(tv).equals(false),"");
    }
    @Test
    public void testAdapter4() throws Exception {
        LETV tv = new LETV();
        Target usaTarget = new GeneralAdapter();
        Assert.isTrue( usaTarget.charge(tv,VolTageEnum.CHINA),"");
        Assert.isTrue( usaTarget.charge(tv,VolTageEnum.USA).equals(Boolean.FALSE),"");
    }
    @Test
    public void testAdapter5() throws Exception {
        USATV tv = new USATV();
        Assert.isTrue( tv.echarge(VolTageEnum.CHINA.getVoltage()).equals(Boolean.FALSE),"");
        ChinaTarget usaTarget = new ChinaAdapter();
    }
}
