package orc.com.taotaole.main.Activity;

public class Bean_cart {
    private int imgId;
    private String describe;
    private String money;
    private boolean checkBox;
    private double item_sum;

    public Bean_cart(int imgId, String describe, String money, boolean checkBox, double item_sum) {
        this.imgId = imgId;
        this.describe = describe;
        this.money = money;
        this.checkBox = checkBox;
        this.item_sum = item_sum;
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

    public boolean isCheckBox() {
        return checkBox;
    }

    public void setCheckBox(boolean checkBox) {
        this.checkBox = checkBox;
    }

    public double getItem_sum() {
        return item_sum;
    }

    public void setItem_sum(double item_sum) {
        this.item_sum = item_sum;
    }

}
