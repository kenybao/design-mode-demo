package bbs.designmode.structmode.adapters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:42.
 */
class ObjectAdapterTest {
    @Test
    public void testObjectAdapter() throws Exception {
        ObjectAdapter objectAdapter = new ObjectAdapter(new Adaptee());
        objectAdapter.request();
    }
}
