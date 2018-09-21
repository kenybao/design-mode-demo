package bbs.designmode.structmode.adapters;

/**
 * @author 73598.
 * @Date 2018/9/21 0021.
 * @Time 16:29.
 * 各国的电网的额定电压
 */
enum VolTageEnum {
    CHINA("china", 220),
    USA("USA", 110);

    private String country;
    private int voltage;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    private VolTageEnum(String country, int voltage) {
        this.country = country;
        this.voltage = voltage;
    }
}
