package bbs.designmode.structmode.adapters;

import org.junit.jupiter.api.Test;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:31.
 */
public class ClassAdapterTest {
    @Test
    public void testAdapter() throws Exception {
        //Target期待调用charge方法，而ChineseAdapter并没有（这就是所谓的不兼容了）
//        Target.requst??
        LETV letv = new LETV();
        USATV usatv = new USATV();
        Target chinaTarget = new ChineseAdapter();
        chinaTarget.charge(letv);
        System.out.println("--------------");
        //异常
        try {
            chinaTarget.charge(usatv);
        }catch(Exception e){
//            e.printStackTrace();
        }
        Target usaTarget  = new ClassAdapter();
        usaTarget.charge(usatv);
        System.out.println("--------------");

        usaTarget = new ObjectAdapter(new 变压器());
        usaTarget.charge(usatv);
        System.out.println("--------------");
        usaTarget.charge(letv);
    }
}
