package orc.com.taotaole.main.Activity.sql_lite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import orc.com.taotaole.main.Activity.goods_and_orders.Goods;
import orc.com.taotaole.main.Activity.goods_and_orders.Orders;


/**
 * 数据库方法封装，创建表，增删查改
 *
 */

public class DML {
    private  MyDBOpenHelper myDBOpenHelper;
    public DML(Context context){
        myDBOpenHelper = new MyDBOpenHelper(context);
    }

    public  void dropTable(String taleName){
        myDBOpenHelper.getWritableDatabase().execSQL(
                "DROP TABLE IF EXISTS" + taleName
        );
    }

    public void closeDatebase(String DatabaseName){
        myDBOpenHelper.getWritableDatabase().close();
    }

    public void createGoodsTable(){
        String sql = "Create TABLE IF NOT EXISTS goods (id integer PRIMARY KEY AUTOINCREMENT,goods_id VARCHAR(30),goods_name VARCHAR(30),sorts VARCHAR(30),imgs VARCHAR(30) ,price VARCHAR(30),stock VARCHAR(30),sales_vol VARCHAR(30),goods_des VARCHAR(30))";
        myDBOpenHelper.getWritableDatabase().execSQL(sql);
    }

    public void createOrdersTable(){

        String sql = "CREATE TABLE IF NOT EXISTS orders (id integer PRIMARY KEY AUTOINCREMENT,goods_id VARCHAR(30),order_id VARCHAR(30),unit_price VARCHAR(30),goods_number VARCHAR(30),sum_prices VARCHAR(30) )";
        myDBOpenHelper.getWritableDatabase().execSQL(sql);
    }
    //插入数据
    public void insertGoods(Goods goods){
        myDBOpenHelper.getWritableDatabase().execSQL(
                "insert into goods(goods_id,goods_name,sorts,imgs,price,stock,sales_vol,goods_des) values(?,?,?,?,?,?,?,?)",
                new Object[]{ goods.getGoods_id(),goods.getGoods_name(),
                        goods.getSorts(),goods.getImgs(),goods.getPrice(),
                        goods.getStock(),goods.getSales_vol(),goods.getGoods_des()
                }
        );
    }

    public void insertOrders(Orders orders){
        myDBOpenHelper.getWritableDatabase().execSQL(
                "insert into orders(goods_id,order_id,unit_price,goods_number,sum_prices) values(?,?,?,?,?)",
                new Object[]{ orders.getGoods_id(),orders.getOrder_id(),
                        orders.getUnit_price(),orders.getGoods_number(),orders.getSum_prices()

                }
        );
    }
//    删除数据
    public void deleteGoods(String tableName,String goods_id){
        myDBOpenHelper.getWritableDatabase().execSQL("delete from " + tableName + "where goods_id=?",
                new Object[]{ goods_id }
                );
    }
//    查询数据
    public Goods findGoods(String goods_id){
      Cursor cursor =  myDBOpenHelper.getWritableDatabase().rawQuery(
                "select goods_id,goods_name,sorts,imgs,price,stock,sales_vol,goods_des from goods where goods_id=?",
                new String[]{String.valueOf(goods_id)}
        );
        if(cursor.moveToNext()){
            Goods goods = new Goods();
            goods.setGoods_id((cursor.getString(0)));
            goods.setGoods_name((cursor.getString(1)));
            goods.setSorts((cursor.getString(2)));
            goods.setImgs((cursor.getString(3)));
            goods.setPrice((cursor.getString(4)));
            goods.setStock((cursor.getString(5)));
            goods.setSales_vol((cursor.getString(6)));
            goods.setGoods_des((cursor.getString(7)));
            return goods;
        }
        return null;
    }
//    查询所有商品
    public void findAllGoods() {
        SQLiteDatabase db =  myDBOpenHelper.getWritableDatabase();

        Cursor cursor = db.query("goods", null, null, null, null, null, null);
// 查询goods表中所有的数据
        if (cursor.moveToFirst()) {
            do {
// 遍历Cursor对象，取出数据并打印
                //goods_id,goods_name,sorts,imgs,price,stock,sales_vol,goods_des from goods
                String goods_id = cursor.getString(cursor. getColumnIndex("goods_id"));
                String goods_name = cursor.getString(cursor.getColumnIndex("goods_name"));
                String sorts = cursor.getString(cursor. getColumnIndex("sorts"));
                String imgs = cursor.getString(cursor.getColumnIndex("imgs"));
                String price = cursor.getString(cursor. getColumnIndex("price"));
                String stock = cursor.getString(cursor.getColumnIndex(" stock"));
                String sales_vol = cursor.getString(cursor. getColumnIndex("sales_vol"));
                String goods_des = cursor.getString(cursor.getColumnIndex("goods_des"));




                Log.d("MainActivity", "goods_id is " + goods_id);
                Log.d("MainActivity", "goods_name is " + goods_name);
                Log.d("MainActivity", "sorts is " + sorts);
                Log.d("MainActivity", "imgs is " + imgs);
                Log.d("MainActivity", "price is " + price);
                Log.d("MainActivity", "stock is " + stock);
                Log.d("MainActivity", "sales_vol is " + sales_vol);
                Log.d("MainActivity", "goods_des is " + goods_des);
            }
            while (cursor.moveToNext());
        }
    }



    public Orders findOrders(String orders_id){
        Cursor cursor =  myDBOpenHelper.getWritableDatabase().rawQuery(
                "select goods_id,order_id,unit_price,goods_number,sum_prices where orders_id=?",
                new String[]{String.valueOf(orders_id)}
        );
        if(cursor.moveToNext()){
            Orders orders = new Orders();
            orders.setGoods_id((cursor.getString(0)));
            orders.setOrder_id((cursor.getString(1)));
            orders.setUnit_price((cursor.getString(2)));
            orders.setGoods_number((cursor.getString(3)));
            orders.setSum_prices((cursor.getString(4)));

            return orders;
        }
        return null;
    }
//    修改数据
    public void updateGoods(Goods goods){
        myDBOpenHelper.getWritableDatabase().execSQL(
                "update goods set goods_name=?, sorts=?, imgs=?, price=?, stock=?, sales_vol=?, goods_des=? where goods_id=?",
                new Object[]{
                        goods.getGoods_name(),goods.getSorts(),
                        goods.getImgs(),goods.getPrice(),goods.getStock(),
                        goods.getSales_vol(),goods.getGoods_des(),goods.getGoods_id()

                }
        );
    }

    public void updateOrders(Orders orders){
        myDBOpenHelper.getWritableDatabase().execSQL(
                "update goods set goods_name=?, orders_id=?, unit_price=?, goods_number=?, sum_prices=? where orders_id=?",
                new Object[]{
                        orders.getGoods_id(),orders.getOrder_id(),
                        orders.getUnit_price(),orders.getGoods_number(),
                        orders.getSum_prices()

                }
        );
    }

    public void close() {
        myDBOpenHelper.close();
    }

}
