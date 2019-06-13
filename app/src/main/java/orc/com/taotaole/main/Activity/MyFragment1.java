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
        Bean_goods1 bean_goods1 = new Bean_goods1(R.drawable.nai1, "12月豆本豆原味豆奶250ml*12瓶 早餐营养奶制品19年9月到期", "19.8", "3");
        Bean_goods1 bean_goods2 = new Bean_goods1(R.drawable.nai2, "蒙牛未来星儿童成长牛奶整箱营养佳智型12盒装早餐学生乳制品礼盒", "59", "50");
        Bean_goods1 bean_goods3 = new Bean_goods1(R.drawable.dianfanbao1, "电饭煲家用迷你小型2L3L学生宿舍老式电饭煲 蒸煮多功能1-2-3-4人", "89", "30");
        Bean_goods1 bean_goods4 = new Bean_goods1(R.drawable.dianfanbao2, "电饭煲家用迷你小型电饭煲 1-2-3-4人学生宿舍普通老式蒸煮多功能", "108", "34");
        Bean_goods1 bean_goods5 = new Bean_goods1(R.drawable.txu1, "南极人短袖T恤男潮流潮牌半袖加肥加大宽松大码男士夏季胖子衣服", "92", "36");
        Bean_goods1 bean_goods6 = new Bean_goods1(R.drawable.txu2, "短袖男夏装韩版潮流纯棉2019新款潮牌宽松青少年男孩初中生T恤", "98", "23");
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
        mDatas.add(bean_goods5);
        mDatas.add(bean_goods6);
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
        mDatas.add(bean_goods5);
        mDatas.add(bean_goods6);
        mDatas.add(bean_goods1);
        mDatas.add(bean_goods2);
        mDatas.add(bean_goods3);
        mDatas.add(bean_goods5);
        mDatas.add(bean_goods6);

    }

}
