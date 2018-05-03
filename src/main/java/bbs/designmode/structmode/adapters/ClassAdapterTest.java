package bbs.designmode.structmode.adapters;

import org.junit.jupiter.api.Test;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:31.
 */
public class ClassAdapterTest {
    @Test
    public void testAdapter(){
        //Target期待调用Request方法，而Adaptee并没有（这就是所谓的不兼容了）
//        Target.requst??
        ClassAdapter adapter = new ClassAdapter();
        adapter.request();
    }
}
