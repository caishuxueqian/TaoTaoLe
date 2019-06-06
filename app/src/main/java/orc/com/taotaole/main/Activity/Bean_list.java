package orc.com.taotaole.main.Activity;

public class Bean_list {
    private int imgId;
    private String describe;

    public Bean_list(int imgId, String describe) {
        this.imgId = imgId;
        this.describe = describe;
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
}
