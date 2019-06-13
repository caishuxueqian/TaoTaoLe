package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class TopIconActivity extends AppCompatActivity {
    private int next_Sign;
    private int the_Sign;
    private GridView mGridView;
    private List<Bean_grid> Data_grid0 = new ArrayList<Bean_grid>();
    private List<Bean_grid> Data_grid1 = new ArrayList<Bean_grid>();
    private List<Bean_grid> Data_grid2 = new ArrayList<Bean_grid>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topicon);
        mGridView = findViewById(R.id.top_gv);
        initDatas0();
        initDatas1();
        initDatas2();
        the_Sign = (int) getIntent().getSerializableExtra("next_Sign");
        Adapter_grid mGridAdapterGrid0 = new Adapter_grid(this, Data_grid0);
        Adapter_grid mGridAdapterGrid1 = new Adapter_grid(this, Data_grid1);
        Adapter_grid mGridAdapterGrid2 = new Adapter_grid(this, Data_grid2);
        if (the_Sign == 0)
            mGridView.setAdapter(mGridAdapterGrid0);
        else if ((the_Sign == 1))
            mGridView.setAdapter(mGridAdapterGrid1);
        else if ((the_Sign == 2))
            mGridView.setAdapter(mGridAdapterGrid2);
        mGridView.setOnItemClickListener((a, b, c, d) -> {
            if (the_Sign == 0) {
                switch (c) {
                    case 0:
                        next_Sign = 0;
                        Bundle data0 = new Bundle();
                        data0.putSerializable("next_Sign", next_Sign);
                        Intent intent0 = new Intent(this, GoodsActivity.class);
                        intent0.putExtras(data0);
                        startActivity(intent0);
                        break;
                    default:
                        ;
                        break;
                }
            }
            if (the_Sign == 1) {
                switch (c) {
                    case 0:
                        next_Sign = 1;
                        Bundle data1 = new Bundle();
                        data1.putSerializable("next_Sign", next_Sign);
                        Intent intent1 = new Intent(this, GoodsActivity.class);
                        intent1.putExtras(data1);
                        startActivity(intent1);
                        break;
                    default:
                        ;
                        break;
                }

            }
            if (the_Sign == 2) {
                switch (c) {
                    case 0:
                        next_Sign = 2;
                        Bundle data2 = new Bundle();
                        data2.putSerializable("next_Sign", next_Sign);
                        Intent intent2 = new Intent(this, GoodsActivity.class);
                        intent2.putExtras(data2);
                        startActivity(intent2);
                        break;
                    default:
                        ;
                        break;
                }}}
        );
    }

    private void initDatas2() {
        Bean_grid goodsGrid1 = new Bean_grid(R.drawable.yifu1, "T恤");
        Bean_grid goodsGrid2 = new Bean_grid(R.drawable.yifu2, "衬衫");
        Bean_grid goodsGrid3 = new Bean_grid(R.drawable.yifu3, "短外套");
        Bean_grid goodsGrid4 = new Bean_grid(R.drawable.yifu4, "背心马甲");
        Bean_grid goodsGrid5 = new Bean_grid(R.drawable.yifu5, "Polo");
        Bean_grid goodsGrid6 = new Bean_grid(R.drawable.yifu6, "卫衣");
        Bean_grid goodsGrid7 = new Bean_grid(R.drawable.yifu7, "风衣");
        Bean_grid goodsGrid8 = new Bean_grid(R.drawable.yifu8, "毛衣");
        Bean_grid goodsGrid9 = new Bean_grid(R.drawable.yifu9, "皮衣");
        Bean_grid goodsGrid10 = new Bean_grid(R.drawable.yifu10, "羽绒服");
        Bean_grid goodsGrid11 = new Bean_grid(R.drawable.yifu11, "棉衣");
        Bean_grid goodsGrid12 = new Bean_grid(R.drawable.yifu12, "毛呢大衣");
        Bean_grid goodsGrid13 = new Bean_grid(R.drawable.yifu13, "休闲裤");
        Bean_grid goodsGrid14 = new Bean_grid(R.drawable.yifu14, "牛仔裤");
        Bean_grid goodsGrid15 = new Bean_grid(R.drawable.yifu15, "皮裤");
        Bean_grid goodsGrid16 = new Bean_grid(R.drawable.yifu16, "休闲套装");
        Bean_grid goodsGrid17 = new Bean_grid(R.drawable.yifu17, "工装制服");
        Bean_grid goodsGrid18 = new Bean_grid(R.drawable.yifu18, "西服");
        Bean_grid goodsGrid19 = new Bean_grid(R.drawable.yifu19, "西裤");
        Bean_grid goodsGrid20 = new Bean_grid(R.drawable.yifu20, "西服套装");
        Bean_grid goodsGrid21 = new Bean_grid(R.drawable.yifu21, "雪纺衫");
        Data_grid2.add(goodsGrid1);
        Data_grid2.add(goodsGrid2);
        Data_grid2.add(goodsGrid3);
        Data_grid2.add(goodsGrid4);
        Data_grid2.add(goodsGrid5);
        Data_grid2.add(goodsGrid6);
        Data_grid2.add(goodsGrid7);
        Data_grid2.add(goodsGrid8);
        Data_grid2.add(goodsGrid9);
        Data_grid2.add(goodsGrid10);
        Data_grid2.add(goodsGrid11);
        Data_grid2.add(goodsGrid12);
        Data_grid2.add(goodsGrid13);
        Data_grid2.add(goodsGrid14);
        Data_grid2.add(goodsGrid15);
        Data_grid2.add(goodsGrid16);
        Data_grid2.add(goodsGrid17);
        Data_grid2.add(goodsGrid18);
        Data_grid2.add(goodsGrid19);
        Data_grid2.add(goodsGrid20);
        Data_grid2.add(goodsGrid21);
    }

    private void initDatas1() {
        Bean_grid goodsGrid1 = new Bean_grid(R.drawable.dianqi8, "电饭煲");
        Bean_grid goodsGrid2 = new Bean_grid(R.drawable.dianqi2, "吸尘器");
        Bean_grid goodsGrid3 = new Bean_grid(R.drawable.dianqi3, "换气扇");
        Bean_grid goodsGrid4 = new Bean_grid(R.drawable.dianqi4, "空气净化器");
        Bean_grid goodsGrid5 = new Bean_grid(R.drawable.dianqi5, "对讲机");
        Bean_grid goodsGrid6 = new Bean_grid(R.drawable.dianqi6, "取暖器");
        Bean_grid goodsGrid7 = new Bean_grid(R.drawable.dianqi7, "净水器");
        Bean_grid goodsGrid8 = new Bean_grid(R.drawable.dianqi1, "烟灶配件");
        Bean_grid goodsGrid9 = new Bean_grid(R.drawable.dianqi9, "料理机");
        Bean_grid goodsGrid10 = new Bean_grid(R.drawable.dianqi10, "厨房小电器");
        Bean_grid goodsGrid11 = new Bean_grid(R.drawable.dianqi11, "家用小电器");
        Bean_grid goodsGrid12 = new Bean_grid(R.drawable.dianqi12, "电热水壶");
        Bean_grid goodsGrid13 = new Bean_grid(R.drawable.dianqi13, "榨汁机");
        Bean_grid goodsGrid14 = new Bean_grid(R.drawable.dianqi14, "电火锅");
        Bean_grid goodsGrid15 = new Bean_grid(R.drawable.dianqi15, "电炖锅");
        Bean_grid goodsGrid16 = new Bean_grid(R.drawable.dianqi16, "烤饼机");
        Bean_grid goodsGrid17 = new Bean_grid(R.drawable.dianqi17, "锅");
        Bean_grid goodsGrid18 = new Bean_grid(R.drawable.dianqi18, "油烟机");
        Bean_grid goodsGrid19 = new Bean_grid(R.drawable.dianqi19, "燃气灶");
        Bean_grid goodsGrid20 = new Bean_grid(R.drawable.dianqi20, "炉具");
        Bean_grid goodsGrid21 = new Bean_grid(R.drawable.dianqi21, "洗碗机");
        Bean_grid goodsGrid22 = new Bean_grid(R.drawable.dianqi22, "热水机");
        Bean_grid goodsGrid23 = new Bean_grid(R.drawable.dianqi23, "冰箱冷柜");
        Bean_grid goodsGrid24 = new Bean_grid(R.drawable.dianqi24, "电压力锅");
        Bean_grid goodsGrid25 = new Bean_grid(R.drawable.dianqi25, "烤箱");
        Bean_grid goodsGrid26 = new Bean_grid(R.drawable.dianqi26, "微波炉");
        Bean_grid goodsGrid27 = new Bean_grid(R.drawable.dianqi27, "搅拌机");
        Bean_grid goodsGrid28 = new Bean_grid(R.drawable.dianqi28, "面包机");
        Bean_grid goodsGrid29 = new Bean_grid(R.drawable.dianqi29, "垃圾处理器");
        Bean_grid goodsGrid30 = new Bean_grid(R.drawable.dianqi30, "蒸箱");
        Bean_grid goodsGrid31 = new Bean_grid(R.drawable.dianqi31, "咖啡机");
        Bean_grid goodsGrid32 = new Bean_grid(R.drawable.dianqi32, "保健按摩");
        Bean_grid goodsGrid33 = new Bean_grid(R.drawable.dianqi33, "美发器");
        Bean_grid goodsGrid34 = new Bean_grid(R.drawable.dianqi34, "足浴足疗");
        Bean_grid goodsGrid35 = new Bean_grid(R.drawable.dianqi35, "理发器");
        Bean_grid goodsGrid36 = new Bean_grid(R.drawable.dianqi36, "体重秤");
        Bean_grid goodsGrid37 = new Bean_grid(R.drawable.dianqi37, "电吹风");
        Bean_grid goodsGrid38 = new Bean_grid(R.drawable.dianqi38, "清洁电器");
        Bean_grid goodsGrid39 = new Bean_grid(R.drawable.dianqi39, "除螨仪");
        Bean_grid goodsGrid40 = new Bean_grid(R.drawable.dianqi40, "按摩椅");
        Bean_grid goodsGrid41 = new Bean_grid(R.drawable.dianqi41, "个护配件");
        Bean_grid goodsGrid42 = new Bean_grid(R.drawable.dianqi42, "鼻毛修剪器");
        Bean_grid goodsGrid43 = new Bean_grid(R.drawable.dianqi43, "电视机");
        Bean_grid goodsGrid44 = new Bean_grid(R.drawable.dianqi44, "洗衣机");
        Bean_grid goodsGrid45 = new Bean_grid(R.drawable.dianqi45, "空调");
        Bean_grid goodsGrid46 = new Bean_grid(R.drawable.dianqi46, "干衣机");
        Bean_grid goodsGrid47 = new Bean_grid(R.drawable.dianqi47, "消毒柜");
        Bean_grid goodsGrid48 = new Bean_grid(R.drawable.dianqi48, "烟灶消套装");
        Bean_grid goodsGrid49 = new Bean_grid(R.drawable.dianqi49, "电扇");
        Bean_grid goodsGrid50 = new Bean_grid(R.drawable.dianqi50, "烫衣熨斗");
        Data_grid1.add(goodsGrid1);
        Data_grid1.add(goodsGrid2);
        Data_grid1.add(goodsGrid3);
        Data_grid1.add(goodsGrid4);
        Data_grid1.add(goodsGrid5);
        Data_grid1.add(goodsGrid6);
        Data_grid1.add(goodsGrid7);
        Data_grid1.add(goodsGrid8);
        Data_grid1.add(goodsGrid9);
        Data_grid1.add(goodsGrid10);
        Data_grid1.add(goodsGrid11);
        Data_grid1.add(goodsGrid12);
        Data_grid1.add(goodsGrid13);
        Data_grid1.add(goodsGrid14);
        Data_grid1.add(goodsGrid15);
        Data_grid1.add(goodsGrid16);
        Data_grid1.add(goodsGrid17);
        Data_grid1.add(goodsGrid18);
        Data_grid1.add(goodsGrid19);
        Data_grid1.add(goodsGrid20);
        Data_grid1.add(goodsGrid21);
        Data_grid1.add(goodsGrid22);
        Data_grid1.add(goodsGrid23);
        Data_grid1.add(goodsGrid24);
        Data_grid1.add(goodsGrid25);
        Data_grid1.add(goodsGrid26);
        Data_grid1.add(goodsGrid27);
        Data_grid1.add(goodsGrid28);
        Data_grid1.add(goodsGrid29);
        Data_grid1.add(goodsGrid30);
        Data_grid1.add(goodsGrid31);
        Data_grid1.add(goodsGrid32);
        Data_grid1.add(goodsGrid33);
        Data_grid1.add(goodsGrid34);
        Data_grid1.add(goodsGrid35);
        Data_grid1.add(goodsGrid36);
        Data_grid1.add(goodsGrid37);
        Data_grid1.add(goodsGrid38);
        Data_grid1.add(goodsGrid39);
        Data_grid1.add(goodsGrid40);
        Data_grid1.add(goodsGrid41);
        Data_grid1.add(goodsGrid42);
        Data_grid1.add(goodsGrid43);
        Data_grid1.add(goodsGrid44);
        Data_grid1.add(goodsGrid45);
        Data_grid1.add(goodsGrid46);
        Data_grid1.add(goodsGrid47);
        Data_grid1.add(goodsGrid48);
        Data_grid1.add(goodsGrid49);
        Data_grid1.add(goodsGrid50);

    }

    private void initDatas0() {
        Bean_grid goodsGrid1 = new Bean_grid(R.drawable.shiping1, "乳制品");
        Bean_grid goodsGrid2 = new Bean_grid(R.drawable.shiping2, "酒");
        Bean_grid goodsGrid3 = new Bean_grid(R.drawable.shiping3, "冲饮饮料");
        Bean_grid goodsGrid4 = new Bean_grid(R.drawable.shiping4, "茶");
        Bean_grid goodsGrid5 = new Bean_grid(R.drawable.shiping5, "饮料");
        Bean_grid goodsGrid6 = new Bean_grid(R.drawable.shiping6, "奶制品");
        Bean_grid goodsGrid7 = new Bean_grid(R.drawable.shiping7, "饼干");
        Bean_grid goodsGrid8 = new Bean_grid(R.drawable.shiping8, "糕点");
        Bean_grid goodsGrid9 = new Bean_grid(R.drawable.shiping9, "糖果布丁");
        Bean_grid goodsGrid10 = new Bean_grid(R.drawable.shiping10, "海味即食");
        Bean_grid goodsGrid11 = new Bean_grid(R.drawable.shiping11, "巧克力");
        Bean_grid goodsGrid12 = new Bean_grid(R.drawable.shiping12, "其他零食");
        Bean_grid goodsGrid13 = new Bean_grid(R.drawable.shiping13, "熟食凉菜");
        Bean_grid goodsGrid14 = new Bean_grid(R.drawable.shiping14, "泡菜酱菜");
        Bean_grid goodsGrid15 = new Bean_grid(R.drawable.shiping15, "方便速食");
        Bean_grid goodsGrid16 = new Bean_grid(R.drawable.shiping16, "干果蜜饯");
        Bean_grid goodsGrid17 = new Bean_grid(R.drawable.shiping17, "米面杂粮");
        Bean_grid goodsGrid18 = new Bean_grid(R.drawable.shiping18, "坚果炒货");
        Bean_grid goodsGrid19 = new Bean_grid(R.drawable.shiping19, "干货");
        Bean_grid goodsGrid20 = new Bean_grid(R.drawable.shiping20, "面条");
        Bean_grid goodsGrid21 = new Bean_grid(R.drawable.shiping21, "食用油");
        Bean_grid goodsGrid22 = new Bean_grid(R.drawable.shiping22, "调味品");
        Bean_grid goodsGrid23 = new Bean_grid(R.drawable.shiping23, "烘焙原料");
        Bean_grid goodsGrid24 = new Bean_grid(R.drawable.shiping24, "食品添加剂");
        Bean_grid goodsGrid25 = new Bean_grid(R.drawable.shiping25, "豆制品");
        Bean_grid goodsGrid26 = new Bean_grid(R.drawable.shiping26, "肉制品");
        Bean_grid goodsGrid27 = new Bean_grid(R.drawable.shiping27, "鱼类");
        Bean_grid goodsGrid28 = new Bean_grid(R.drawable.shiping28, "葡提浆果");
        Bean_grid goodsGrid29 = new Bean_grid(R.drawable.shiping29, "柑橘橙柚");
        Bean_grid goodsGrid30 = new Bean_grid(R.drawable.shiping30, "桃李瓜果");
        Bean_grid goodsGrid31 = new Bean_grid(R.drawable.shiping31, "苹梨蕉芒");
        Bean_grid goodsGrid32 = new Bean_grid(R.drawable.shiping32, "肉类");
        Bean_grid goodsGrid33 = new Bean_grid(R.drawable.shiping33, "蛋类");
        Bean_grid goodsGrid34 = new Bean_grid(R.drawable.shiping34, "蔬菜");
        Data_grid0.add(goodsGrid1);
        Data_grid0.add(goodsGrid2);
        Data_grid0.add(goodsGrid3);
        Data_grid0.add(goodsGrid4);
        Data_grid0.add(goodsGrid5);
        Data_grid0.add(goodsGrid6);
        Data_grid0.add(goodsGrid7);
        Data_grid0.add(goodsGrid8);
        Data_grid0.add(goodsGrid9);
        Data_grid0.add(goodsGrid10);
        Data_grid0.add(goodsGrid11);
        Data_grid0.add(goodsGrid12);
        Data_grid0.add(goodsGrid13);
        Data_grid0.add(goodsGrid14);
        Data_grid0.add(goodsGrid15);
        Data_grid0.add(goodsGrid16);
        Data_grid0.add(goodsGrid17);
        Data_grid0.add(goodsGrid18);
        Data_grid0.add(goodsGrid19);
        Data_grid0.add(goodsGrid20);
        Data_grid0.add(goodsGrid21);
        Data_grid0.add(goodsGrid22);
        Data_grid0.add(goodsGrid23);
        Data_grid0.add(goodsGrid24);
        Data_grid0.add(goodsGrid25);
        Data_grid0.add(goodsGrid26);
        Data_grid0.add(goodsGrid27);
        Data_grid0.add(goodsGrid28);
        Data_grid0.add(goodsGrid29);
        Data_grid0.add(goodsGrid30);
        Data_grid0.add(goodsGrid31);
        Data_grid0.add(goodsGrid32);
        Data_grid0.add(goodsGrid33);
        Data_grid0.add(goodsGrid34);
    }
}