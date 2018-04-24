package bbs.designmode.creatermode.single;

/**
 * @author 73598.
 * @Date 2018/4/20 0020.
 * @Time 16:26.
 */
public class Pet2 {
    /**
     * 名称
     */
    String  name ;
    /**
     * 性别
     */
    String gender;
    static Pet2 singlePet = null ;

    public static Pet2 getInstance(){
        if(singlePet == null){
            singlePet = new Pet2();
        }
        return singlePet;
    }
}
