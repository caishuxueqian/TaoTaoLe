package orc.com.taotaole.main.Activity;

public class Bean_home {
    private String animal;
    private int imgId;

    public Bean_home(String animal, int imgId) {
        this.animal = animal;
        this.imgId = imgId;

    }

    public String getAnimal() {
        return animal;
    }

    public int getImgId() {
        return imgId;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
