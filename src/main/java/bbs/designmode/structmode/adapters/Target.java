package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/5/3 0003.
 * @Time 10:28.
 */
public interface Target {
   /**
    * 充电
    * @throws Exception
    */
   Boolean charge(ElectricalAppliance electricalAppliance,VolTageEnum volTageEnum) throws Exception;
}
