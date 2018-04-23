package bbs.designMode.createrMode.single;

/**
 * @author 73598.
 * @Date 2018/4/20 0020.
 * @Time 15:35.
 * 单例模式：某个类只能有一个实例，提供一个全局的访问点。
 */
public class Pet{
    /**
     * 名称
     */
    String  name ;
    /**
     * 性别
     */
    String gender;
    static Pet singlePet = new Pet();
//    static{ 基本等同于上方方式
//        singlePet = new Pet2();
//    }
    public static Pet getInstance(){
       return singlePet;
    }
}
