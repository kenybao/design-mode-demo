package bbs.designmode.creatermode.builder;

/**
 * @author 73598.
 * @Date 2018/4/28 0028.
 * @Time 14:23.
 */
public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void direct(){
        carBuilder.buildCarBody();
        carBuilder.buildCarWheel();
        carBuilder.buildBattery();
        carBuilder.build().run();
    }
}
