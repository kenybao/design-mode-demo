package bbs.designmode.creatermode.builder;

import org.junit.jupiter.api.Test;

/**
 * @author 73598.
 * @Date 2018/5/2 0002.
 * @Time 10:59.
 */
public class BuilderTest {
    @Test
    public void testBuilder(){
        CarDirector carDirector = new CarDirector(new BmwBuilder());
        carDirector.direct();
    }

}
