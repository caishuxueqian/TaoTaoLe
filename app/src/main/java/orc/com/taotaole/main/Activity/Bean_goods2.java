package orc.com.taotaole.main.Activity;

public class Bean_goods2 {
    private int imgId;
    private String describe;
    private String money;
    private String person;

    public Bean_goods2(int imgId, String describe, String money, String person) {
        this.imgId = imgId;
        this.describe = describe;
        this.money = money;
        this.person = person;
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
    public String getPerson() {
        return person;
    }
    public void setPerson(String person) {
        this.person = person;
    }
}
