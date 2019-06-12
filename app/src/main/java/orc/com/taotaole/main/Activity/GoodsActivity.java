package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class GoodsActivity extends AppCompatActivity {
    private GridView mGridView2;
    private GridView mGridView1;
    private Adapter_2goods mAdapterGoods2;
    private Adapter_2_1goods mAdapterGoods1;
    private List<Bean_goods2> mDatas2 = new ArrayList<Bean_goods2>();
    private Button button;
    private List<Bean_goods1> mDatas1 = new ArrayList<Bean_goods1>();
    private ImageView one;
    private ImageView two;
    private ImageView rise;
    private ImageView down;
    private ImageView sales;
    private ImageView back;
    private ImageView sales1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_layout);
        initView();
        initDatas2();
        initDatas1();
        mAdapterGoods2 = new Adapter_2goods(this, mDatas2);
        mAdapterGoods1 = new Adapter_2_1goods(this, mDatas1);
        mGridView2.setAdapter(mAdapterGoods2);
        mGridView1.setAdapter(mAdapterGoods1);
        back.setOnClickListener(e -> {
            finish();
        });
        rise.setOnClickListener(e->{
            rise.setVisibility(View.GONE);
            down.setVisibility(View.VISIBLE);
            sales.setVisibility(View.VISIBLE);
            sales1.setVisibility(View.GONE);
        });
        down.setOnClickListener(e->{
            rise.setVisibility(View.VISIBLE);
            down.setVisibility(View.GONE);
            sales.setVisibility(View.VISIBLE);
            sales1.setVisibility(View.GONE);
        });
        one.setOnClickListener(e -> {
            mGridView2.setVisibility(View.GONE);
            mGridView1.setVisibility(View.VISIBLE);
            one.setVisibility(View.GONE);
            two.setVisibility(View.VISIBLE);
        });
        two.setOnClickListener(e -> {
            mGridView2.setVisibility(View.VISIBLE);
            mGridView1.setVisibility(View.GONE);
            one.setVisibility(View.VISIBLE);
            two.setVisibility(View.GONE);
        });
        sales.setOnClickListener(e->{
            sales.setVisibility(View.GONE);
            sales1.setVisibility(View.VISIBLE);
        });

        mGridView2.setOnItemClickListener((parent, v, position, id) -> {
                    startActivity(new Intent(this, DetailActivity.class));
                }
        );
    }
public void initView(){
    mGridView2 = findViewById(R.id.goods2_gv);
    mGridView1 = findViewById(R.id.goods1_gv);
    one = findViewById(R.id.one);
    two = findViewById(R.id.two);
    rise=findViewById(R.id.rise);
    down=findViewById(R.id.down);
    sales=findViewById(R.id.sales);
    back=findViewById(R.id.goods_back);
    sales1=findViewById(R.id.sales1);
}
    private void initDatas2() {

        Bean_goods2 bean_goods1 = new Bean_goods2(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods2 = new Bean_goods2(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods3 = new Bean_goods2(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas2.add(bean_goods1);
        mDatas2.add(bean_goods2);
        mDatas2.add(bean_goods3);
        mDatas2.add(bean_goods1);
        mDatas2.add(bean_goods2);
        mDatas2.add(bean_goods3);
        mDatas2.add(bean_goods1);
        mDatas2.add(bean_goods2);
        mDatas2.add(bean_goods3);
        mDatas2.add(bean_goods1);
        mDatas2.add(bean_goods2);
        mDatas2.add(bean_goods3);
    }

    private void initDatas1() {
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas1.add(bean_goods1);
        mDatas1.add(bean_goods2);
        mDatas1.add(bean_goods3);
        mDatas1.add(bean_goods1);
        mDatas1.add(bean_goods2);
        mDatas1.add(bean_goods3);
        mDatas1.add(bean_goods1);
        mDatas1.add(bean_goods2);
        mDatas1.add(bean_goods3);
        mDatas1.add(bean_goods1);
        mDatas1.add(bean_goods2);
        mDatas1.add(bean_goods3);


    }
}