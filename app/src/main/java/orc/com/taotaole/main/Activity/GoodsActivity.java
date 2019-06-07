package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class GoodsActivity extends AppCompatActivity {
    private GridView mGridView;
    private Adapter_1goods mAdapterGoods;
    private List<Bean_goods1> mDatas = new ArrayList<Bean_goods1>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_layout);
        initDatas();
        mGridView = findViewById(R.id.goods1_gv);
        mAdapterGoods = new Adapter_1goods(this, mDatas);
        mGridView.setAdapter(mAdapterGoods);
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
            startActivity(new Intent(GoodsActivity.this,DetailActivity.class));
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
}
