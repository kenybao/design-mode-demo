package bbs.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author 73598.
 * @Date 2018/4/24 0024.
 * @Time 11:47.
 * 新能源电池
 */
@Data
public class Battery {
    /**
     * 锂蓄电池
     */
    public static final String BATTERY_TYPE_LITHIUM = "lithium";
    /**
     * 铅酸蓄电池
     */
    public static final String BATTERY_TYPE_LEADACID = "leadAcid";
    /**
     * 电池类型
     */
    private String type;
    /**
     * 电量
     */
    private BigDecimal electricQuantity;
    /**
     * 厂商
     */
    private String factoryName = "default factoryName";

    public Battery(String type, BigDecimal electricQuantity, String factoryName) {
        this.type = type;
        this.electricQuantity = electricQuantity;
        this.factoryName = factoryName;
    }

    public void  run(){
        System.out.println(toString());
    }

}
