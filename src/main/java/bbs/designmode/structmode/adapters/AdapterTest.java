package bbs.designmode.structmode.adapters;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:31.
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
        Target usaTarget = new GeneralAdapter(new 通用变压器());
        Assert.isTrue( usaTarget.charge(tv,VolTageEnum.CHINA),"");
        Assert.isTrue( usaTarget.charge(tv,VolTageEnum.USA).equals(Boolean.FALSE),"");
    }
    @Test
    public void testAdapter5() throws Exception {
        USATV tv = new USATV();
        Target usaTarget = new GeneralAdapter(new 通用变压器());
        Assert.isTrue( usaTarget.charge(tv,VolTageEnum.USA),"");
    }
}
