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
        Bean_goods2 bean_goods1 = new Bean_goods2(R.drawable.nai1, "12月豆本豆原味豆奶250ml*12瓶 早餐营养奶制品19年9月到期", "19.8", "3");
        Bean_goods2 bean_goods2 = new Bean_goods2(R.drawable.nai2, "蒙牛未来星儿童成长牛奶整箱营养佳智型12盒装早餐学生乳制品礼盒", "59", "50");
        Bean_goods2 bean_goods3 = new Bean_goods2(R.drawable.nai3, "安慕希黄桃燕麦酸奶草莓口味风味乳酸菌牛奶 乳制品整箱希腊风味", "109", "12");
        Bean_goods2 bean_goods4 = new Bean_goods2(R.drawable.nai4, "蒙牛特仑苏低脂牛奶整箱营养成人儿童学生早餐调制乳制品食品", "74", "43");
        Bean_goods2 bean_goods5 = new Bean_goods2(R.drawable.nai5, "蒙牛早餐奶核桃奶味250ml*16盒 牛奶整箱装成人学生儿童营养乳制品", "52", "7");
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
        Bean_goods2 bean_goods1 = new Bean_goods2(R.drawable.dianfanbao1, "电饭煲家用迷你小型2L3L学生宿舍老式电饭煲 蒸煮多功能1-2-3-4人", "89", "30");
        Bean_goods2 bean_goods2 = new Bean_goods2(R.drawable.dianfanbao2, "电饭煲家用迷你小型电饭煲 1-2-3-4人学生宿舍普通老式蒸煮多功能", "108", "34");
        Bean_goods2 bean_goods3 = new Bean_goods2(R.drawable.dianfanbao3, "新飞宿舍多功能小型迷你电饭煲家用老式电饭锅2-3-4人全自动蒸米", "50", "12");
        Bean_goods2 bean_goods4 = new Bean_goods2(R.drawable.dianfanbao4, "半球型普通老式小型蒸米饭电饭锅3-4迷你电饭煲1-2人宿舍家用5L", "78", "6");
        Bean_goods2 bean_goods5 = new Bean_goods2(R.drawable.dianfanbao5, "华强迷你电饭煲1人-2人家用小型电饭锅小宿舍普通老式正品煮饭锅", "119", "36");
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
        Bean_goods2 bean_goods1 = new Bean_goods2(R.drawable.txu1, "南极人短袖T恤男潮流潮牌半袖加肥加大宽松大码男士夏季胖子衣服", "92", "36");
        Bean_goods2 bean_goods2 = new Bean_goods2(R.drawable.txu2, "短袖男夏装韩版潮流纯棉2019新款潮牌宽松青少年男孩初中生T恤", "98", "13");
        Bean_goods2 bean_goods3 = new Bean_goods2(R.drawable.txu3, "T恤男短袖宽松嘻哈加肥加大半袖夏季胖子男士潮流纯棉T恤衣服", "112", "45");
        Bean_goods2 bean_goods4 = new Bean_goods2(R.drawable.txu4, "（3件）男士短袖T恤潮流大码半袖T恤纯棉宽松运动夏季男装国潮T恤", "138", "5");
        Bean_goods2 bean_goods5 = new Bean_goods2(R.drawable.txu5, "骆驼男装 短袖T恤男夏季新款圆领打底衫半袖衣服潮流T恤印花上衣", "78", "4");
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
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.nai1, "12月豆本豆原味豆奶250ml*12瓶 早餐营养奶制品19年9月到期", "19.8", "3");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.nai2, "蒙牛未来星儿童成长牛奶整箱营养佳智型12盒装早餐学生乳制品礼盒", "59", "50");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.nai3, "安慕希黄桃燕麦酸奶草莓口味风味乳酸菌牛奶 乳制品整箱希腊风味", "109", "12");
        Bean_goods1 bean_goods4 = new Bean_goods1(R.drawable.nai4, "蒙牛特仑苏低脂牛奶整箱营养成人儿童学生早餐调制乳制品食品", "74", "43");
        Bean_goods1 bean_goods5 = new Bean_goods1(R.drawable.nai5, "蒙牛早餐奶核桃奶味250ml*16盒 牛奶整箱装成人学生儿童营养乳制品", "52", "7");
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
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.dianfanbao1, "电饭煲家用迷你小型2L3L学生宿舍老式电饭煲 蒸煮多功能1-2-3-4人", "89", "30");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.dianfanbao2, "电饭煲家用迷你小型电饭煲 1-2-3-4人学生宿舍普通老式蒸煮多功能", "108", "34");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.dianfanbao3, "新飞宿舍多功能小型迷你电饭煲家用老式电饭锅2-3-4人全自动蒸米", "50", "12");
        Bean_goods1 bean_goods4 = new Bean_goods1(R.drawable.dianfanbao4, "半球型普通老式小型蒸米饭电饭锅3-4迷你电饭煲1-2人宿舍家用5L", "78", "6");
        Bean_goods1 bean_goods5 = new Bean_goods1(R.drawable.dianfanbao5, "华强迷你电饭煲1人-2人家用小型电饭锅小宿舍普通老式正品煮饭锅", "119", "36");
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
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.txu1, "南极人短袖T恤男潮流潮牌半袖加肥加大宽松大码男士夏季胖子衣服", "92", "36");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.txu2, "短袖男夏装韩版潮流纯棉2019新款潮牌宽松青少年男孩初中生T恤", "98", "13");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.txu3, "T恤男短袖宽松嘻哈加肥加大半袖夏季胖子男士潮流纯棉T恤衣服", "112", "45");
        Bean_goods1 bean_goods4 = new Bean_goods1(R.drawable.txu4, "（3件）男士短袖T恤潮流大码半袖T恤纯棉宽松运动夏季男装国潮T恤", "138", "5");
        Bean_goods1 bean_goods5 = new Bean_goods1(R.drawable.txu5, "骆驼男装 短袖T恤男夏季新款圆领打底衫半袖衣服潮流T恤印花上衣", "78", "4");
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