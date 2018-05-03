package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:30.
 * 目标方法类
 */
public class 变压器 {
    Integer _220to110(Integer v){
        if(v == 220){
            System.out.println("变压器变压中");
            return 110;
        }
        throw new  IllegalArgumentException();
    }
}
