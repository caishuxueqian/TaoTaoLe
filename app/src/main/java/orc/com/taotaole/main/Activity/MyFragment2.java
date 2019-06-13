package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class MyFragment2 extends Fragment {
    private GridView mGridView;
    private List<Bean_list> Data_list = new ArrayList<Bean_list>();
    private List<Bean_grid> Data_grid0= new ArrayList<Bean_grid>();
    private List<Bean_grid> Data_grid1= new ArrayList<Bean_grid>();
    private List<Bean_grid> Data_grid2= new ArrayList<Bean_grid>();
    private List<Bean_grid> Data_grid3= new ArrayList<Bean_grid>();
    private List<Bean_grid> Data_grid4= new ArrayList<Bean_grid>();
    private List<Bean_grid> Data_grid5= new ArrayList<Bean_grid>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
        initData_list();
        initDatas0();
        initDatas1();
        initDatas2();
        initDatas3();
        initDatas4();
        initDatas5();
        mGridView = view.findViewById(R.id.gv);
        ListView mListView = view.findViewById(R.id.lv);
        Adapter_list mGoodsAdapterList = new Adapter_list(getActivity(), Data_list);
        Adapter_grid mGridAdapterGrid = new Adapter_grid(getActivity(), Data_grid0);
        mListView.setAdapter(mGoodsAdapterList);
        mGridView.setAdapter(mGridAdapterGrid);
        mListView.setOnItemClickListener((a, b, position, d) -> {
                    switch(position){
                        case 0:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid0));
                            break;
                        case 1:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid1));
                            break;
                        case 2:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid2));
                            break;
                        case 3:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid3));
                            break;
                        case 4:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid4));
                            break;
                        case 5:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid1));
                            break;
                        case 6:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid1));
                            break;
                        case 7:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid2));
                            break;
                        case 8:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid3));
                            break;
                        case 9:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid4));
                            break;
                        case 10:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid1));
                            break;
                        case 11:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid1));
                            break;
                        case 12:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid2));
                            break;
                        case 13:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid3));
                            break;
                        case 14:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid4));
                            break;
                        case 15:
                            mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid1));
                            break;
                        default: mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid0));
                            break;
                    }
     }
      );
        mGridView.setOnItemClickListener((parent, v, position, id) -> {
            startActivity(new Intent(getActivity(),GoodsActivity.class));
        });
        return view;
    }
    private void initDatas5() {}
    private void initDatas4() {
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.xiezi1,"女士凉鞋");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.xiezi2,"高跟鞋");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.xiezi3,"女士拖鞋");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.xiezi4,"女士靴子");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.xiezi5,"女士高帮鞋");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.xiezi6,"女士运动鞋");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.xiezi7,"女士雨鞋");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.xiezi8,"男士低帮鞋");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.xiezi9,"男士运动鞋");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.xiezi10,"男士拖鞋");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.xiezi11,"男士雨鞋");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.xiezi12,"男士高帮鞋");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.xiezi13,"男士凉鞋");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.xiezi14,"男士靴子");
        Data_grid4.add(goodsGrid1);
        Data_grid4.add(goodsGrid2);
        Data_grid4.add(goodsGrid3);
        Data_grid4.add(goodsGrid4);
        Data_grid4.add(goodsGrid5);
        Data_grid4.add(goodsGrid6);
        Data_grid4.add(goodsGrid7);
        Data_grid4.add(goodsGrid8);
        Data_grid4.add(goodsGrid9);
        Data_grid4.add(goodsGrid10);
        Data_grid4.add(goodsGrid11);
        Data_grid4.add(goodsGrid12);
        Data_grid4.add(goodsGrid13);
        Data_grid4.add(goodsGrid14);
    }
    private void initDatas3() {
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.shuma1,"笔记本电脑");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.shuma2,"鼠标键盘");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.shuma3,"平板电脑");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.shuma4,"显示器");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.shuma5,"整机一体机");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.shuma6,"电脑周边");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.shuma7,"USB周边");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.shuma8,"数码保护套");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.shuma9,"U盘");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.shuma10,"电池");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.shuma11,"硬盘");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.shuma12,"手写笔");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.shuma13,"键盘膜");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.shuma14,"数码收纳");
        Bean_grid goodsGrid15 = new Bean_grid( R.drawable.shuma15,"平板贴膜");
        Bean_grid goodsGrid16 = new Bean_grid( R.drawable.shuma16,"支架");
        Bean_grid goodsGrid17 = new Bean_grid( R.drawable.shuma17,"耳机耳麦");
        Bean_grid goodsGrid18 = new Bean_grid( R.drawable.shuma18,"MP3MP4");
        Bean_grid goodsGrid19 = new Bean_grid( R.drawable.shuma19,"CD播放器");
        Bean_grid goodsGrid20 = new Bean_grid( R.drawable.shuma20,"随身听");
        Bean_grid goodsGrid21 = new Bean_grid( R.drawable.shuma21,"游戏机");
        Bean_grid goodsGrid22 = new Bean_grid( R.drawable.shuma22,"影音电器");
        Bean_grid goodsGrid23 = new Bean_grid( R.drawable.shuma23,"音箱");
        Bean_grid goodsGrid24 = new Bean_grid( R.drawable.shuma24,"麦克风");
        Bean_grid goodsGrid25 = new Bean_grid( R.drawable.shuma25,"影棚设备");
        Bean_grid goodsGrid26 = new Bean_grid( R.drawable.shuma26,"家庭影院");
        Bean_grid goodsGrid27 = new Bean_grid( R.drawable.shuma27,"点钞机");
        Bean_grid goodsGrid28 = new Bean_grid( R.drawable.shuma28,"包装设备");
        Bean_grid goodsGrid29 = new Bean_grid( R.drawable.shuma29,"办公设备");
        Bean_grid goodsGrid30 = new Bean_grid( R.drawable.shuma30,"财会用品");
        Bean_grid goodsGrid31 = new Bean_grid( R.drawable.shuma31,"智能机器人");
        Bean_grid goodsGrid32 = new Bean_grid( R.drawable.shuma32,"智能设备");
        Bean_grid goodsGrid33 = new Bean_grid( R.drawable.shuma33,"智能手环");
        Bean_grid goodsGrid34 = new Bean_grid( R.drawable.shuma34,"单反镜头");
        Bean_grid goodsGrid35 = new Bean_grid( R.drawable.shuma35,"摄影脚架");
        Bean_grid goodsGrid36 = new Bean_grid( R.drawable.shuma36,"微单");
        Bean_grid goodsGrid37 = new Bean_grid( R.drawable.shuma37,"摄影周边");
        Bean_grid goodsGrid38 = new Bean_grid( R.drawable.shuma38,"数码相机");
        Bean_grid goodsGrid39 = new Bean_grid( R.drawable.shuma39,"胶卷相机");
        Bean_grid goodsGrid40 = new Bean_grid( R.drawable.shuma40,"胶卷胶片");
        Bean_grid goodsGrid41 = new Bean_grid( R.drawable.shuma41,"网络设备");
        Data_grid3.add(goodsGrid1);
        Data_grid3.add(goodsGrid2);
        Data_grid3.add(goodsGrid3);
        Data_grid3.add(goodsGrid4);
        Data_grid3.add(goodsGrid5);
        Data_grid3.add(goodsGrid6);
        Data_grid3.add(goodsGrid7);
        Data_grid3.add(goodsGrid8);
        Data_grid3.add(goodsGrid9);
        Data_grid3.add(goodsGrid10);
        Data_grid3.add(goodsGrid11);
        Data_grid3.add(goodsGrid12);
        Data_grid3.add(goodsGrid13);
        Data_grid3.add(goodsGrid14);
        Data_grid3.add(goodsGrid15);
        Data_grid3.add(goodsGrid16);
        Data_grid3.add(goodsGrid17);
        Data_grid3.add(goodsGrid18);
        Data_grid3.add(goodsGrid19);
        Data_grid3.add(goodsGrid20);
        Data_grid3.add(goodsGrid21);
        Data_grid3.add(goodsGrid22);
        Data_grid3.add(goodsGrid23);
        Data_grid3.add(goodsGrid24);
        Data_grid3.add(goodsGrid25);
        Data_grid3.add(goodsGrid26);
        Data_grid3.add(goodsGrid27);
        Data_grid3.add(goodsGrid28);
        Data_grid3.add(goodsGrid29);
        Data_grid3.add(goodsGrid30);
        Data_grid3.add(goodsGrid31);
        Data_grid3.add(goodsGrid32);
        Data_grid3.add(goodsGrid33);
        Data_grid3.add(goodsGrid34);
        Data_grid3.add(goodsGrid35);
        Data_grid3.add(goodsGrid36);
        Data_grid3.add(goodsGrid37);
        Data_grid3.add(goodsGrid38);
        Data_grid3.add(goodsGrid39);
        Data_grid3.add(goodsGrid40);
        Data_grid3.add(goodsGrid41);
    }
    private void initDatas2() {
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.yifu1,"T恤");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.yifu2,"衬衫");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.yifu3,"短外套");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.yifu4,"背心马甲");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.yifu5,"Polo");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.yifu6,"卫衣");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.yifu7,"风衣");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.yifu8,"毛衣");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.yifu9,"皮衣");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.yifu10,"羽绒服");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.yifu11,"棉衣");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.yifu12,"毛呢大衣");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.yifu13,"休闲裤");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.yifu14,"牛仔裤");
        Bean_grid goodsGrid15 = new Bean_grid( R.drawable.yifu15,"皮裤");
        Bean_grid goodsGrid16 = new Bean_grid( R.drawable.yifu16,"休闲套装");
        Bean_grid goodsGrid17 = new Bean_grid( R.drawable.yifu17,"工装制服");
        Bean_grid goodsGrid18 = new Bean_grid( R.drawable.yifu18,"西服");
        Bean_grid goodsGrid19 = new Bean_grid( R.drawable.yifu19,"西裤");
        Bean_grid goodsGrid20 = new Bean_grid( R.drawable.yifu20,"西服套装");
        Bean_grid goodsGrid21 = new Bean_grid( R.drawable.yifu21,"雪纺衫");
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
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.dianqi1,"烟灶配件");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.dianqi2,"吸尘器");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.dianqi3,"换气扇");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.dianqi4,"空气净化器");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.dianqi5,"对讲机");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.dianqi6,"取暖器");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.dianqi7,"净水器");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.dianqi8,"电饭煲");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.dianqi9,"料理机");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.dianqi10,"厨房小电器");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.dianqi11,"家用小电器");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.dianqi12,"电热水壶");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.dianqi13,"榨汁机");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.dianqi14,"电火锅");
        Bean_grid goodsGrid15 = new Bean_grid( R.drawable.dianqi15,"电炖锅");
        Bean_grid goodsGrid16 = new Bean_grid( R.drawable.dianqi16,"烤饼机");
        Bean_grid goodsGrid17 = new Bean_grid( R.drawable.dianqi17,"锅");
        Bean_grid goodsGrid18 = new Bean_grid( R.drawable.dianqi18,"油烟机");
        Bean_grid goodsGrid19 = new Bean_grid( R.drawable.dianqi19,"燃气灶");
        Bean_grid goodsGrid20 = new Bean_grid( R.drawable.dianqi20,"炉具");
        Bean_grid goodsGrid21 = new Bean_grid( R.drawable.dianqi21,"洗碗机");
        Bean_grid goodsGrid22 = new Bean_grid( R.drawable.dianqi22,"热水机");
        Bean_grid goodsGrid23 = new Bean_grid( R.drawable.dianqi23,"冰箱冷柜");
        Bean_grid goodsGrid24 = new Bean_grid( R.drawable.dianqi24,"电压力锅");
        Bean_grid goodsGrid25 = new Bean_grid( R.drawable.dianqi25,"烤箱");
        Bean_grid goodsGrid26 = new Bean_grid( R.drawable.dianqi26,"微波炉");
        Bean_grid goodsGrid27 = new Bean_grid( R.drawable.dianqi27,"搅拌机");
        Bean_grid goodsGrid28 = new Bean_grid( R.drawable.dianqi28,"面包机");
        Bean_grid goodsGrid29 = new Bean_grid( R.drawable.dianqi29,"垃圾处理器");
        Bean_grid goodsGrid30 = new Bean_grid( R.drawable.dianqi30,"蒸箱");
        Bean_grid goodsGrid31 = new Bean_grid( R.drawable.dianqi31,"咖啡机");
        Bean_grid goodsGrid32 = new Bean_grid( R.drawable.dianqi32,"保健按摩");
        Bean_grid goodsGrid33 = new Bean_grid( R.drawable.dianqi33,"美发器");
        Bean_grid goodsGrid34 = new Bean_grid( R.drawable.dianqi34,"足浴足疗");
        Bean_grid goodsGrid35 = new Bean_grid( R.drawable.dianqi35,"理发器");
        Bean_grid goodsGrid36 = new Bean_grid( R.drawable.dianqi36,"体重秤");
        Bean_grid goodsGrid37 = new Bean_grid( R.drawable.dianqi37,"电吹风");
        Bean_grid goodsGrid38 = new Bean_grid( R.drawable.dianqi38,"清洁电器");
        Bean_grid goodsGrid39 = new Bean_grid( R.drawable.dianqi39,"除螨仪");
        Bean_grid goodsGrid40 = new Bean_grid( R.drawable.dianqi40,"按摩椅");
        Bean_grid goodsGrid41 = new Bean_grid( R.drawable.dianqi41,"个护配件");
        Bean_grid goodsGrid42 = new Bean_grid( R.drawable.dianqi42,"鼻毛修剪器");
        Bean_grid goodsGrid43 = new Bean_grid( R.drawable.dianqi43,"电视机");
        Bean_grid goodsGrid44 = new Bean_grid( R.drawable.dianqi44,"洗衣机");
        Bean_grid goodsGrid45 = new Bean_grid( R.drawable.dianqi45,"空调");
        Bean_grid goodsGrid46 = new Bean_grid( R.drawable.dianqi46,"干衣机");
        Bean_grid goodsGrid47 = new Bean_grid( R.drawable.dianqi47,"消毒柜");
        Bean_grid goodsGrid48 = new Bean_grid( R.drawable.dianqi48,"烟灶消套装");
        Bean_grid goodsGrid49 = new Bean_grid( R.drawable.dianqi49,"电扇");
        Bean_grid goodsGrid50 = new Bean_grid( R.drawable.dianqi50,"烫衣熨斗");
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
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.shiping1,"乳制品");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.shiping2,"酒");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.shiping3,"冲饮饮料");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.shiping4,"茶");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.shiping5,"饮料");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.shiping6,"奶制品");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.shiping7,"饼干");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.shiping8,"糕点");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.shiping9,"糖果布丁");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.shiping10,"海味即食");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.shiping11,"巧克力");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.shiping12,"其他零食");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.shiping13,"熟食凉菜");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.shiping14,"泡菜酱菜");
        Bean_grid goodsGrid15 = new Bean_grid( R.drawable.shiping15,"方便速食");
        Bean_grid goodsGrid16 = new Bean_grid( R.drawable.shiping16,"干果蜜饯");
        Bean_grid goodsGrid17 = new Bean_grid( R.drawable.shiping17,"米面杂粮");
        Bean_grid goodsGrid18 = new Bean_grid( R.drawable.shiping18,"坚果炒货");
        Bean_grid goodsGrid19 = new Bean_grid( R.drawable.shiping19,"干货");
        Bean_grid goodsGrid20 = new Bean_grid( R.drawable.shiping20,"面条");
        Bean_grid goodsGrid21 = new Bean_grid( R.drawable.shiping21,"食用油");
        Bean_grid goodsGrid22 = new Bean_grid( R.drawable.shiping22,"调味品");
        Bean_grid goodsGrid23 = new Bean_grid( R.drawable.shiping23,"烘焙原料");
        Bean_grid goodsGrid24 = new Bean_grid( R.drawable.shiping24,"食品添加剂");
        Bean_grid goodsGrid25 = new Bean_grid( R.drawable.shiping25,"豆制品");
        Bean_grid goodsGrid26 = new Bean_grid( R.drawable.shiping26,"肉制品");
        Bean_grid goodsGrid27 = new Bean_grid( R.drawable.shiping27,"鱼类");
        Bean_grid goodsGrid28 = new Bean_grid( R.drawable.shiping28,"葡提浆果");
        Bean_grid goodsGrid29 = new Bean_grid( R.drawable.shiping29,"柑橘橙柚");
        Bean_grid goodsGrid30 = new Bean_grid( R.drawable.shiping30,"桃李瓜果");
        Bean_grid goodsGrid31 = new Bean_grid( R.drawable.shiping31,"苹梨蕉芒");
        Bean_grid goodsGrid32 = new Bean_grid( R.drawable.shiping32,"肉类");
        Bean_grid goodsGrid33 = new Bean_grid( R.drawable.shiping33,"蛋类");
        Bean_grid goodsGrid34 = new Bean_grid( R.drawable.shiping34,"蔬菜");
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



































































    private void initData_list() {
        Bean_list goodsList0 = new Bean_list("食品");
        Bean_list goodsList1 = new Bean_list("电器");
        Bean_list goodsList2 = new Bean_list("服装");
        Bean_list goodsList3 = new Bean_list("数码");
        Bean_list goodsList4 = new Bean_list("鞋靴");
        Bean_list goodsList5 = new Bean_list("宠物");
        Bean_list goodsList6 = new Bean_list("百货");
        Bean_list goodsList7 = new Bean_list("保健");
        Bean_list goodsList8= new Bean_list("美妆");
        Bean_list goodsList9 = new Bean_list("药品");
        Bean_list goodsList10 = new Bean_list("运动");
        Bean_list goodsList11= new Bean_list("箱包");
        Bean_list goodsList12= new Bean_list("珠宝");
        Bean_list goodsList13 = new Bean_list("鲜花");
        Bean_list goodsList14 = new Bean_list("宠物");
        Bean_list goodsList15= new Bean_list("家装");
        Data_list.add(goodsList0);
        Data_list.add(goodsList1);
        Data_list.add(goodsList2);
        Data_list.add(goodsList3);
        Data_list.add(goodsList4);
        Data_list.add(goodsList5);
        Data_list.add(goodsList6);
        Data_list.add(goodsList7);
        Data_list.add(goodsList8);
        Data_list.add(goodsList9);
        Data_list.add(goodsList10);
        Data_list.add(goodsList11);
        Data_list.add(goodsList12);
        Data_list.add(goodsList13);
        Data_list.add(goodsList14);
        Data_list.add(goodsList15);
    }
}
