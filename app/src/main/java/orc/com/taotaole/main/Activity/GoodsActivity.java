package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class GoodsActivity extends AppCompatActivity {
    private GridView mGridView;
    private GridView mGridView1;
    private Adapter_1goods mAdapterGoods;
    private Adapter_2goods mAdapterGoods1;
    private List<Bean_goods1> mDatas = new ArrayList<Bean_goods1>();
    private List<Bean_home> mDatas1 = new ArrayList<Bean_home>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_layout);
        initDatas();
        mGridView = findViewById(R.id.goods1_gv);
        mGridView1 = findViewById(R.id.goods2_gv);
        mAdapterGoods = new Adapter_1goods(this, mDatas);
        mAdapterGoods1 = new Adapter_2goods(this, mDatas1);
        mGridView.setAdapter(mAdapterGoods);
        mGridView1.setAdapter(mAdapterGoods1);
        findViewById(R.id.good1_back).setOnClickListener(e -> {
            finish();
        });
        mGridView.setOnItemClickListener((parent, v, position, id) -> {
//            switch (position) {
//                case 1:
//
//                    Toast.makeText(this, "点你马呢？", Toast.LENGTH_SHORT).show();
//                    break;
//                case 2:
//                    Toast.makeText(this, "别点了", Toast.LENGTH_SHORT).show();
//                    break;
//                case 3:
//                    Toast.makeText(this, "没用的", Toast.LENGTH_SHORT).show();
//                    break;
//                case 4:
//                    Toast.makeText(this, "说了没用", Toast.LENGTH_SHORT).show();
//                    break;
//                case 5:
//                    Toast.makeText(this, "继续点", Toast.LENGTH_SHORT).show();
//                    break;
//                default:
//                    Toast.makeText(this, "点你马呢？", Toast.LENGTH_SHORT).show();
//                    break;
//            }
            startActivity(new Intent(GoodsActivity.this, DetailActivity.class));
        });

    }

    private void initDatas() {
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
    }

    private void initDatas1() {
        Bean_home modelgoods1 = new Bean_home("10", R.drawable.animal_1);
        Bean_home modelgoods2 = new Bean_home("10", R.drawable.animal_2);
        Bean_home modelgoods3 = new Bean_home("10", R.drawable.animal_3);
        Bean_home modelgoods4 = new Bean_home("10", R.drawable.animal_4);
        Bean_home modelgoods5 = new Bean_home("10", R.drawable.animal_1);
        Bean_home modelgoods6 = new Bean_home("10", R.drawable.animal_1);
        Bean_home modelgoods7 = new Bean_home("10", R.drawable.animal_1);
        Bean_home modelgoods8 = new Bean_home("10", R.drawable.animal_1);

        mDatas1.add(modelgoods1);
        mDatas1.add(modelgoods2);
        mDatas1.add(modelgoods3);
        mDatas1.add(modelgoods4);
        mDatas1.add(modelgoods5);
        mDatas1.add(modelgoods6);
        mDatas1.add(modelgoods7);
        mDatas1.add(modelgoods8);
        mDatas1.add(modelgoods1);
        mDatas1.add(modelgoods2);
        mDatas1.add(modelgoods3);
        mDatas1.add(modelgoods4);
        mDatas1.add(modelgoods5);
        mDatas1.add(modelgoods6);
        mDatas1.add(modelgoods7);
        mDatas1.add(modelgoods8);
        mDatas1.add(modelgoods1);
        mDatas1.add(modelgoods2);
        mDatas1.add(modelgoods3);
        mDatas1.add(modelgoods4);
        mDatas1.add(modelgoods5);
        mDatas1.add(modelgoods6);
        mDatas1.add(modelgoods7);
        mDatas1.add(modelgoods8);
    }
}
