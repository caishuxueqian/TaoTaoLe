package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import orc.com.taotaole.R;

public class MyFragment2 extends Fragment {
    private GridView mGridView;
    private Adapter_grid mGridAdapterGrid;
    private ListView mListView;
    private List<Bean_list> Data_list = new ArrayList<Bean_list>();
    private Adapter_list mGoodsAdapterList;
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
        mListView = view.findViewById(R.id.lv);
        mGoodsAdapterList = new Adapter_list(getActivity(), Data_list);
        mGridAdapterGrid = new Adapter_grid(getActivity(), Data_grid0);
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
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.xiezi1,"酒");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.xiezi2,"茶");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.xiezi3,"饮料");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.xiezi4,"海苔");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.xiezi5,"牛奶");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.xiezi6,"酒");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.xiezi7,"茶");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.xiezi8,"饮料");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.xiezi9,"海苔");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.xiezi10,"牛奶");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.xiezi11,"酒");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.xiezi2,"茶");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.xiezi13,"饮料");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.xiezi14,"海苔");
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
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.shuma1,"酒");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.shuma2,"茶");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.shuma3,"饮料");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.shuma4,"海苔");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.shuma5,"牛奶");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.shuma6,"酒");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.shuma7,"茶");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.shuma8,"饮料");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.shuma9,"海苔");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.shuma10,"牛奶");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.shuma11,"酒");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.shuma12,"茶");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.shuma13,"饮料");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.shuma14,"海苔");
        Bean_grid goodsGrid15 = new Bean_grid( R.drawable.shuma15,"牛奶");
        Bean_grid goodsGrid16 = new Bean_grid( R.drawable.shuma16,"酒");
        Bean_grid goodsGrid17 = new Bean_grid( R.drawable.shuma17,"茶");
        Bean_grid goodsGrid18 = new Bean_grid( R.drawable.shuma18,"饮料");
        Bean_grid goodsGrid19 = new Bean_grid( R.drawable.shuma19,"海苔");
        Bean_grid goodsGrid20 = new Bean_grid( R.drawable.shuma20,"牛奶");
        Bean_grid goodsGrid21 = new Bean_grid( R.drawable.shuma21,"酒");
        Bean_grid goodsGrid22 = new Bean_grid( R.drawable.shuma22,"茶");
        Bean_grid goodsGrid23 = new Bean_grid( R.drawable.shuma23,"饮料");
        Bean_grid goodsGrid24 = new Bean_grid( R.drawable.shuma24,"海苔");
        Bean_grid goodsGrid25 = new Bean_grid( R.drawable.shuma25,"牛奶");
        Bean_grid goodsGrid26 = new Bean_grid( R.drawable.shuma26,"酒");
        Bean_grid goodsGrid27 = new Bean_grid( R.drawable.shuma27,"茶");
        Bean_grid goodsGrid28 = new Bean_grid( R.drawable.shuma28,"饮料");
        Bean_grid goodsGrid29 = new Bean_grid( R.drawable.shuma29,"海苔");
        Bean_grid goodsGrid30 = new Bean_grid( R.drawable.shuma30,"牛奶");
        Bean_grid goodsGrid31 = new Bean_grid( R.drawable.shuma31,"酒");
        Bean_grid goodsGrid32 = new Bean_grid( R.drawable.shuma32,"茶");
        Bean_grid goodsGrid33 = new Bean_grid( R.drawable.shuma33,"饮料");
        Bean_grid goodsGrid34 = new Bean_grid( R.drawable.shuma34,"海苔");
        Bean_grid goodsGrid35 = new Bean_grid( R.drawable.shuma35,"牛奶");
        Bean_grid goodsGrid36 = new Bean_grid( R.drawable.shuma36,"酒");
        Bean_grid goodsGrid37 = new Bean_grid( R.drawable.shuma37,"茶");
        Bean_grid goodsGrid38 = new Bean_grid( R.drawable.shuma38,"饮料");
        Bean_grid goodsGrid39 = new Bean_grid( R.drawable.shuma39,"海苔");
        Bean_grid goodsGrid40 = new Bean_grid( R.drawable.shuma40,"牛奶");
        Bean_grid goodsGrid41 = new Bean_grid( R.drawable.shuma41,"酒");
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
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.yifu1,"酒");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.yifu2,"茶");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.yifu3,"饮料");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.yifu4,"海苔");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.yifu5,"牛奶");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.yifu6,"酒");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.yifu7,"茶");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.yifu8,"饮料");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.yifu9,"海苔");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.yifu10,"牛奶");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.yifu11,"酒");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.yifu12,"茶");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.yifu13,"饮料");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.yifu14,"海苔");
        Bean_grid goodsGrid15 = new Bean_grid( R.drawable.yifu15,"牛奶");
        Bean_grid goodsGrid16 = new Bean_grid( R.drawable.yifu16,"酒");
        Bean_grid goodsGrid17 = new Bean_grid( R.drawable.yifu17,"茶");
        Bean_grid goodsGrid18 = new Bean_grid( R.drawable.yifu18,"饮料");
        Bean_grid goodsGrid19 = new Bean_grid( R.drawable.yifu19,"海苔");
        Bean_grid goodsGrid20 = new Bean_grid( R.drawable.yifu20,"牛奶");
        Bean_grid goodsGrid21 = new Bean_grid( R.drawable.yifu21,"酒");
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
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.dianqi1,"酒");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.dianqi2,"茶");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.dianqi3,"饮料");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.dianqi4,"海苔");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.dianqi5,"牛奶");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.dianqi6,"酒");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.dianqi7,"茶");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.dianqi8,"饮料");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.dianqi9,"海苔");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.dianqi10,"牛奶");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.dianqi11,"酒");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.dianqi12,"茶");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.dianqi13,"饮料");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.dianqi14,"海苔");
        Bean_grid goodsGrid15 = new Bean_grid( R.drawable.dianqi15,"牛奶");
        Bean_grid goodsGrid16 = new Bean_grid( R.drawable.dianqi16,"酒");
        Bean_grid goodsGrid17 = new Bean_grid( R.drawable.dianqi17,"茶");
        Bean_grid goodsGrid18 = new Bean_grid( R.drawable.dianqi18,"饮料");
        Bean_grid goodsGrid19 = new Bean_grid( R.drawable.dianqi19,"海苔");
        Bean_grid goodsGrid20 = new Bean_grid( R.drawable.dianqi20,"牛奶");
        Bean_grid goodsGrid21 = new Bean_grid( R.drawable.dianqi21,"酒");
        Bean_grid goodsGrid22 = new Bean_grid( R.drawable.dianqi22,"茶");
        Bean_grid goodsGrid23 = new Bean_grid( R.drawable.dianqi23,"饮料");
        Bean_grid goodsGrid24 = new Bean_grid( R.drawable.dianqi24,"海苔");
        Bean_grid goodsGrid25 = new Bean_grid( R.drawable.dianqi25,"牛奶");
        Bean_grid goodsGrid26 = new Bean_grid( R.drawable.dianqi26,"酒");
        Bean_grid goodsGrid27 = new Bean_grid( R.drawable.dianqi27,"茶");
        Bean_grid goodsGrid28 = new Bean_grid( R.drawable.dianqi28,"饮料");
        Bean_grid goodsGrid29 = new Bean_grid( R.drawable.dianqi29,"海苔");
        Bean_grid goodsGrid30 = new Bean_grid( R.drawable.dianqi30,"牛奶");
        Bean_grid goodsGrid31 = new Bean_grid( R.drawable.dianqi31,"酒");
        Bean_grid goodsGrid32 = new Bean_grid( R.drawable.dianqi32,"茶");
        Bean_grid goodsGrid33 = new Bean_grid( R.drawable.dianqi33,"饮料");
        Bean_grid goodsGrid34 = new Bean_grid( R.drawable.dianqi34,"海苔");
        Bean_grid goodsGrid35 = new Bean_grid( R.drawable.dianqi35,"牛奶");
        Bean_grid goodsGrid36 = new Bean_grid( R.drawable.dianqi36,"酒");
        Bean_grid goodsGrid37 = new Bean_grid( R.drawable.dianqi37,"茶");
        Bean_grid goodsGrid38 = new Bean_grid( R.drawable.dianqi38,"饮料");
        Bean_grid goodsGrid39 = new Bean_grid( R.drawable.dianqi39,"海苔");
        Bean_grid goodsGrid40 = new Bean_grid( R.drawable.dianqi40,"牛奶");
        Bean_grid goodsGrid41 = new Bean_grid( R.drawable.dianqi41,"酒");
        Bean_grid goodsGrid42 = new Bean_grid( R.drawable.dianqi42,"茶");
        Bean_grid goodsGrid43 = new Bean_grid( R.drawable.dianqi43,"饮料");
        Bean_grid goodsGrid44 = new Bean_grid( R.drawable.dianqi44,"海苔");
        Bean_grid goodsGrid45 = new Bean_grid( R.drawable.dianqi45,"牛奶");
        Bean_grid goodsGrid46 = new Bean_grid( R.drawable.dianqi46,"酒");
        Bean_grid goodsGrid47 = new Bean_grid( R.drawable.dianqi47,"茶");
        Bean_grid goodsGrid48 = new Bean_grid( R.drawable.dianqi48,"饮料");
        Bean_grid goodsGrid49 = new Bean_grid( R.drawable.dianqi49,"海苔");
        Bean_grid goodsGrid50 = new Bean_grid( R.drawable.dianqi50,"牛奶");
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
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.shiping1,"酒");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.shiping2,"茶");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.shiping3,"饮料");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.shiping4,"海苔");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.shiping5,"牛奶");
        Bean_grid goodsGrid6 = new Bean_grid( R.drawable.shiping6,"酒");
        Bean_grid goodsGrid7 = new Bean_grid( R.drawable.shiping7,"茶");
        Bean_grid goodsGrid8 = new Bean_grid( R.drawable.shiping8,"饮料");
        Bean_grid goodsGrid9 = new Bean_grid( R.drawable.shiping9,"海苔");
        Bean_grid goodsGrid10 = new Bean_grid( R.drawable.shiping10,"牛奶");
        Bean_grid goodsGrid11 = new Bean_grid( R.drawable.shiping11,"酒");
        Bean_grid goodsGrid12 = new Bean_grid( R.drawable.shiping12,"茶");
        Bean_grid goodsGrid13 = new Bean_grid( R.drawable.shiping13,"饮料");
        Bean_grid goodsGrid14 = new Bean_grid( R.drawable.shiping14,"海苔");
        Bean_grid goodsGrid15 = new Bean_grid( R.drawable.shiping15,"牛奶");
        Bean_grid goodsGrid16 = new Bean_grid( R.drawable.shiping16,"酒");
        Bean_grid goodsGrid17 = new Bean_grid( R.drawable.shiping17,"茶");
        Bean_grid goodsGrid18 = new Bean_grid( R.drawable.shiping18,"饮料");
        Bean_grid goodsGrid19 = new Bean_grid( R.drawable.shiping19,"海苔");
        Bean_grid goodsGrid20 = new Bean_grid( R.drawable.shiping20,"牛奶");
        Bean_grid goodsGrid21 = new Bean_grid( R.drawable.shiping21,"酒");
        Bean_grid goodsGrid22 = new Bean_grid( R.drawable.shiping22,"茶");
        Bean_grid goodsGrid23 = new Bean_grid( R.drawable.shiping23,"饮料");
        Bean_grid goodsGrid24 = new Bean_grid( R.drawable.shiping24,"海苔");
        Bean_grid goodsGrid25 = new Bean_grid( R.drawable.shiping25,"牛奶");
        Bean_grid goodsGrid26 = new Bean_grid( R.drawable.shiping26,"酒");
        Bean_grid goodsGrid27 = new Bean_grid( R.drawable.shiping27,"茶");
        Bean_grid goodsGrid28 = new Bean_grid( R.drawable.shiping28,"饮料");
        Bean_grid goodsGrid29 = new Bean_grid( R.drawable.shiping29,"海苔");
        Bean_grid goodsGrid30 = new Bean_grid( R.drawable.shiping30,"牛奶");
        Bean_grid goodsGrid31 = new Bean_grid( R.drawable.shiping31,"酒");
        Bean_grid goodsGrid32 = new Bean_grid( R.drawable.shiping32,"茶");
        Bean_grid goodsGrid33 = new Bean_grid( R.drawable.shiping33,"饮料");
        Bean_grid goodsGrid34 = new Bean_grid( R.drawable.shiping34,"海苔");
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
        Bean_list goodsList2 = new Bean_list("衣物");
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
