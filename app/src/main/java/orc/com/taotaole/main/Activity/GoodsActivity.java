package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class GoodsActivity extends AppCompatActivity {
    private GridView mGridView2;
    private GridView mGridView1;
    private Adapter_2goods mAdapterGoods2;
    private Adapter_2_1goods mAdapterGoods1;
    private List<Bean_goods2> mDatas2_0 = new ArrayList<Bean_goods2>();
    private List<Bean_goods1> mDatas1_0 = new ArrayList<Bean_goods1>();
    private List<Bean_goods2> mDatas2_1 = new ArrayList<Bean_goods2>();
    private List<Bean_goods1> mDatas1_1 = new ArrayList<Bean_goods1>();
    private List<Bean_goods2> mDatas2_2 = new ArrayList<Bean_goods2>();
    private List<Bean_goods1> mDatas1_2 = new ArrayList<Bean_goods1>();
    private ImageView one;
    private ImageView two;
    private ImageView rise;
    private ImageView down;
    private ImageView sales;
    private ImageView back;
    private ImageView sales1;
    private int the_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_layout);
        initView();
        initDatas2_0();
        initDatas1_0();
        initDatas2_1();
        initDatas1_1();
        initDatas2_2();
        initDatas1_2();
        the_Sign=(int)getIntent().getSerializableExtra("next_Sign");
        if(the_Sign==0){
            mAdapterGoods2 = new Adapter_2goods(this, mDatas2_0);
        mAdapterGoods1 = new Adapter_2_1goods(this, mDatas1_0);}
      else if(the_Sign==1){
            mAdapterGoods2 = new Adapter_2goods(this, mDatas2_1);
        mAdapterGoods1 = new Adapter_2_1goods(this, mDatas1_1);}
      else if(the_Sign==2){
            mAdapterGoods2 = new Adapter_2goods(this, mDatas2_2);
        mAdapterGoods1 = new Adapter_2_1goods(this, mDatas1_2);}
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
    private void initDatas2_0() {
        Bean_goods2 bean_goods1 = new Bean_goods2(R.drawable.nai1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods2 = new Bean_goods2(R.drawable.nai2, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods3 = new Bean_goods2(R.drawable.nai3, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods4 = new Bean_goods2(R.drawable.nai4, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods5 = new Bean_goods2(R.drawable.nai5, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas2_0.add(bean_goods1);
        mDatas2_0.add(bean_goods2);
        mDatas2_0.add(bean_goods3);
        mDatas2_0.add(bean_goods4);
        mDatas2_0.add(bean_goods5);
        mDatas2_0.add(bean_goods1);
        mDatas2_0.add(bean_goods2);
        mDatas2_0.add(bean_goods3);
        mDatas2_0.add(bean_goods4);
        mDatas2_0.add(bean_goods5);
        mDatas2_0.add(bean_goods1);
        mDatas2_0.add(bean_goods2);
        mDatas2_0.add(bean_goods3);
        mDatas2_0.add(bean_goods4);
        mDatas2_0.add(bean_goods5);

    }

    private void initDatas2_1() {
        Bean_goods2 bean_goods1 = new Bean_goods2(R.drawable.dianfanbao1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods2 = new Bean_goods2(R.drawable.dianfanbao2, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods3 = new Bean_goods2(R.drawable.dianfanbao3, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods4 = new Bean_goods2(R.drawable.dianfanbao4, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods5 = new Bean_goods2(R.drawable.dianfanbao5, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas2_1.add(bean_goods1);
        mDatas2_1.add(bean_goods2);
        mDatas2_1.add(bean_goods3);
        mDatas2_1.add(bean_goods4);
        mDatas2_1.add(bean_goods5);
        mDatas2_1.add(bean_goods1);
        mDatas2_1.add(bean_goods2);
        mDatas2_1.add(bean_goods3);
        mDatas2_1.add(bean_goods4);
        mDatas2_1.add(bean_goods5);
        mDatas2_1.add(bean_goods1);
        mDatas2_1.add(bean_goods2);
        mDatas2_1.add(bean_goods3);
        mDatas2_1.add(bean_goods4);
        mDatas2_1.add(bean_goods5);

    }
    private void initDatas2_2() {
        Bean_goods2 bean_goods1 = new Bean_goods2(R.drawable.txu1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods2 = new Bean_goods2(R.drawable.txu2, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods3 = new Bean_goods2(R.drawable.txu3, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods4 = new Bean_goods2(R.drawable.txu4, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods2 bean_goods5 = new Bean_goods2(R.drawable.txu5, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas2_2.add(bean_goods1);
        mDatas2_2.add(bean_goods2);
        mDatas2_2.add(bean_goods3);
        mDatas2_2.add(bean_goods4);
        mDatas2_2.add(bean_goods5);
        mDatas2_2.add(bean_goods1);
        mDatas2_2.add(bean_goods2);
        mDatas2_2.add(bean_goods3);
        mDatas2_2.add(bean_goods4);
        mDatas2_2.add(bean_goods5);
        mDatas2_2.add(bean_goods1);
        mDatas2_2.add(bean_goods2);
        mDatas2_2.add(bean_goods3);
        mDatas2_2.add(bean_goods4);
        mDatas2_2.add(bean_goods5);



    }

    private void initDatas1_0() {
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.nai1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.nai2, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.nai3, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods4 = new Bean_goods1(R.drawable.nai4, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods5 = new Bean_goods1(R.drawable.nai5, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas1_0.add(bean_goods1);
        mDatas1_0.add(bean_goods2);
        mDatas1_0.add(bean_goods3);
        mDatas1_0.add(bean_goods4);
        mDatas1_0.add(bean_goods5);
        mDatas1_0.add(bean_goods1);
        mDatas1_0.add(bean_goods2);
        mDatas1_0.add(bean_goods3);
        mDatas1_0.add(bean_goods4);
        mDatas1_0.add(bean_goods5);
        mDatas1_0.add(bean_goods1);
        mDatas1_0.add(bean_goods2);
        mDatas1_0.add(bean_goods3);
        mDatas1_0.add(bean_goods4);
        mDatas1_0.add(bean_goods5);

    }
    private void initDatas1_1() {
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.dianfanbao1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.dianfanbao2, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.dianfanbao3, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods4 = new Bean_goods1(R.drawable.dianfanbao4, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods5 = new Bean_goods1(R.drawable.dianfanbao5, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas1_1.add(bean_goods1);
        mDatas1_1.add(bean_goods2);
        mDatas1_1.add(bean_goods3);
        mDatas1_1.add(bean_goods4);
        mDatas1_1.add(bean_goods5);
        mDatas1_1.add(bean_goods1);
        mDatas1_1.add(bean_goods2);
        mDatas1_1.add(bean_goods3);
        mDatas1_1.add(bean_goods4);
        mDatas1_1.add(bean_goods5);
        mDatas1_1.add(bean_goods1);
        mDatas1_1.add(bean_goods2);
        mDatas1_1.add(bean_goods3);
        mDatas1_1.add(bean_goods4);
        mDatas1_1.add(bean_goods5);
    }
    private void initDatas1_2() {
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.txu1, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.txu2, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.txu3, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods4 = new Bean_goods1(R.drawable.txu4, "跳楼甩卖，桂林小栽种", "10", "2");
        Bean_goods1 bean_goods5 = new Bean_goods1(R.drawable.txu5, "跳楼甩卖，桂林小栽种", "10", "2");
        mDatas1_2.add(bean_goods1);
        mDatas1_2.add(bean_goods2);
        mDatas1_2.add(bean_goods3);
        mDatas1_2.add(bean_goods4);
        mDatas1_2.add(bean_goods5);
        mDatas1_2.add(bean_goods1);
        mDatas1_2.add(bean_goods2);
        mDatas1_2.add(bean_goods3);
        mDatas1_2.add(bean_goods4);
        mDatas1_2.add(bean_goods5);
        mDatas1_2.add(bean_goods1);
        mDatas1_2.add(bean_goods2);
        mDatas1_2.add(bean_goods3);
        mDatas1_2.add(bean_goods4);
        mDatas1_2.add(bean_goods5);





    }

}