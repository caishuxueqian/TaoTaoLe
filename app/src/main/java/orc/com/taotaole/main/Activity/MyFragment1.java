package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class MyFragment1 extends Fragment  {
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;
    private GridView mGridView;
    private GridView mGridView1;
    private Adapter_1goods mAdapterGoods;
    private Adapter_2goods mAdapterGoods1;
    private List<Bean_goods1> mDatas = new ArrayList<Bean_goods1>();
    private List<Bean_goods2> mDatas1 = new ArrayList<Bean_goods2>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);
        initDatas();
        mGridView = view.findViewById(R.id.goods1_gv);
        mGridView1 = view.findViewById(R.id.goods2_gv);
        mAdapterGoods = new Adapter_1goods(getActivity(), mDatas);
        mAdapterGoods1 = new Adapter_2goods(getActivity(), mDatas1);
        mGridView.setAdapter(mAdapterGoods);
        mGridView1.setAdapter(mAdapterGoods1);

        mGridView.setOnItemClickListener((parent, v, position, id) -> {
//           // todo
            view.findViewById(R.id.top_iv).setOnClickListener(e->{});
            view.findViewById(R.id.t1).setOnClickListener(e->{});
            view.findViewById(R.id.t2).setOnClickListener(e->{});
            view.findViewById(R.id.t3).setOnClickListener(e->{});
            view.findViewById(R.id.t4).setOnClickListener(e->{});
            view.findViewById(R.id.t5).setOnClickListener(e->{});
            view.findViewById(R.id.t6).setOnClickListener(e->{});
            view.findViewById(R.id.t7).setOnClickListener(e->{});
            view.findViewById(R.id.t8).setOnClickListener(e->{});
            view.findViewById(R.id.t9).setOnClickListener(e->{});
            view.findViewById(R.id.t10).setOnClickListener(e->{});
            view.findViewById(R.id.goods1_iv).setOnClickListener(e->{});
            view.findViewById(R.id.goods1_tv).setOnClickListener(e->{});
            view.findViewById(R.id.goods1_tv1).setOnClickListener(e->{});
            view.findViewById(R.id.goods1_tv2).setOnClickListener(e->{});
            view.findViewById(R.id.goods1_tv3).setOnClickListener(e->{});
            view.findViewById(R.id.top_tuijian).setOnClickListener(e->{});
        });
return  view;
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
