package orc.com.taotaole.main.Activity.sql_lite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBOpenHelper extends SQLiteOpenHelper {
    public MyDBOpenHelper(Context context){
        super(context, "my.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       //商品表
        db.execSQL("CREATE TABLE IF NOT EXISTS goods (id integer PRIMARY KEY AUTOINCREMENT,goods_id VARCHAR(30),goods_name VARCHAR(30),sorts VARCHAR(30),imgs VARCHAR(30) ,price VARCHAR(30),stock VARCHAR(30),sales_vol VARCHAR(30),goods_des VARCHAR(30))");
        //订单表
        db.execSQL("CREATE TABLE IF NOT EXISTS orders (id integer PRIMARY KEY AUTOINCREMENT,goods_id VARCHAR(30),order_id VARCHAR(30),unit_price VARCHAR(30),goods_number VARCHAR(30),sum_prices VARCHAR(30))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS goods");
        db.execSQL("DROP TABLE IF EXISTS orders");

        onCreate(db);

    }
}
