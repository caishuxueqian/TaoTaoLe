package orc.com.taotaole.main.Activity.goods_and_orders;

public class Goods {
    private String goods_id;        //商品id
    private String goods_name;      //商品名称
    private String sorts;           //商品品类
    private String imgs;            //图片id
    private String price;           //价格
    private String stock;           //库存
    private String sales_vol;       //售量
    private String goods_des;       //商品描述

    public Goods(){

    }
    public Goods(String goods_id, String goods_name, String sorts, String imgs, String price, String stock, String sales_vol, String goods_des) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.sorts = sorts;
        this.imgs = imgs;
        this.price = price;
        this.stock = stock;
        this.sales_vol = sales_vol;
        this.goods_des = goods_des;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getSorts() {
        return sorts;
    }

    public void setSorts(String sorts) {
        this.sorts = sorts;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getSales_vol() {
        return sales_vol;
    }

    public void setSales_vol(String sales_vol) {
        this.sales_vol = sales_vol;
    }

    public String getGoods_des() {
        return goods_des;
    }

    public void setGoods_des(String goods_des) {
        this.goods_des = goods_des;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id='" + goods_id + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", sorts='" + sorts + '\'' +
                ", imgs='" + imgs + '\'' +
                ", price='" + price + '\'' +
                ", stock='" + stock + '\'' +
                ", sales_vol='" + sales_vol + '\'' +
                ", goods_des='" + goods_des + '\'' +
                '}';
    }
}
