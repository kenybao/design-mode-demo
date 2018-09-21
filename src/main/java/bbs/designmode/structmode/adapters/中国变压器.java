package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:30.
 * 目标方法类
 */
public class 中国变压器 implements 中国变压器接口{

    @Override
    public Integer _110to220(Integer v){
        if(v.intValue() == 110){
            System.out.println("变压器变压中  110 变 220 ");
            return 220;
        }else if(v.intValue() == 220){
             System.out.println("220  无需变压");
              return 220;
        }
        throw new  IllegalArgumentException();
    }
}
