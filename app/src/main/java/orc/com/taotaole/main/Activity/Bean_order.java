package orc.com.taotaole.main.Activity;

public class Bean_order {
    private int imgId;
    private String describe;
    private String money;
    private String number;
    private Boolean checkBox;

    public Bean_order(int imgId, String describe, String money, String number,Boolean checkBox) {
        this.imgId = imgId;
        this.describe = describe;
        this.money = money;
        this.number=number;
        this.checkBox = checkBox;

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

    public  String getNumber(){
        return  number;
    }
    public void setNumber(String number){
        this.number=number;
    }
    public Boolean getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(Boolean checkBox) {
        this.checkBox = checkBox;
    }
}
