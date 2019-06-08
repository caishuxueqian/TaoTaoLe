package orc.com.taotaole.main.Activity;

public class Bean_history {
    private int imgId;
    private String describe;
    private String money;

    public Bean_history(int imgId, String describe, String money) {
        this.imgId = imgId;
        this.describe = describe;
        this.money = money;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
