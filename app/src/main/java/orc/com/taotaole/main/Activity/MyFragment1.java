package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class MyFragment1 extends Fragment {
    private SharedPreferences mSharedPrefrences;
    private SharedPreferences.Editor mEditor;
    private GridView mGridView;
    private GridView mGridView1;
    private Adapter_1goods mAdapterGoods;
    private Adapter_2goods mAdapterGoods1;
    private List<Bean_goods1> mDatas = new ArrayList<Bean_goods1>();
    private List<Bean_goods2> mDatas1 = new ArrayList<Bean_goods2>();
    private int next_Sign;

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
            view.findViewById(R.id.top_iv).setOnClickListener(e -> {
            });
            view.findViewById(R.id.t1).setOnClickListener(e -> {
                next_Sign = 0;
                Bundle data0 = new Bundle();
                data0.putSerializable("next_Sign", next_Sign);
                Intent intent0 = new Intent(getActivity(), TopIconActivity.class);
                intent0.putExtras(data0);
                startActivity(intent0);
            });
            view.findViewById(R.id.t2).setOnClickListener(e -> {
                next_Sign = 1;
                Bundle data1 = new Bundle();
                data1.putSerializable("next_Sign", next_Sign);
                Intent intent1 = new Intent(getActivity(), TopIconActivity.class);
                intent1.putExtras(data1);
                startActivity(intent1);
            });
            view.findViewById(R.id.t3).setOnClickListener(e -> {
                next_Sign = 2;
                Bundle data2 = new Bundle();
                data2.putSerializable("next_Sign", next_Sign);
                Intent intent2 = new Intent(getActivity(), TopIconActivity.class);
                intent2.putExtras(data2);
                startActivity(intent2);
            });
            view.findViewById(R.id.t4).setOnClickListener(e -> {
            });
            view.findViewById(R.id.t5).setOnClickListener(e -> {
            });
            view.findViewById(R.id.t6).setOnClickListener(e -> {
                next_Sign = 1;
                Bundle data1 = new Bundle();
                data1.putSerializable("next_Sign", next_Sign);
                Intent intent1 = new Intent(getActivity(), TopIconActivity.class);
                intent1.putExtras(data1);
                startActivity(intent1);
            });
            view.findViewById(R.id.t7).setOnClickListener(e -> {
                next_Sign = 1;
                Bundle data1 = new Bundle();
                data1.putSerializable("next_Sign", next_Sign);
                Intent intent1 = new Intent(getActivity(), TopIconActivity.class);
                intent1.putExtras(data1);
                startActivity(intent1);
            });
            view.findViewById(R.id.t8).setOnClickListener(e -> {
                next_Sign = 2;
                Bundle data2 = new Bundle();
                data2.putSerializable("next_Sign", next_Sign);
                Intent intent2 = new Intent(getActivity(), TopIconActivity.class);
                intent2.putExtras(data2);
                startActivity(intent2);
            });
            view.findViewById(R.id.t9).setOnClickListener(e -> {
            });
            view.findViewById(R.id.t10).setOnClickListener(e -> {
            });
            view.findViewById(R.id.top_tuijian).setOnClickListener(e -> {
            });
            switch (position) {
                case 0:
                    next_Sign = 0;
                    Bundle data0 = new Bundle();
                    data0.putSerializable("next_Sign", next_Sign);
                    Intent intent0 = new Intent(getActivity(), DetailActivity.class);
                    intent0.putExtras(data0);
                    startActivity(intent0);
                    break;
                case 1:
                    next_Sign = 1;
                    Bundle data1 = new Bundle();
                    data1.putSerializable("next_Sign", next_Sign);
                    Intent intent1 = new Intent(getActivity(), DetailActivity.class);
                    intent1.putExtras(data1);
                    startActivity(intent1);
                    break;
                case 2:
                    next_Sign = 2;
                    Bundle data2 = new Bundle();
                    data2.putSerializable("next_Sign", next_Sign);
                    Intent intent2 = new Intent(getActivity(), DetailActivity.class);
                    intent2.putExtras(data2);
                    startActivity(intent2);
                    break;
                case 3:
                    next_Sign = 3;
                    Bundle data3 = new Bundle();
                    data3.putSerializable("next_Sign", next_Sign);
                    Intent intent3 = new Intent(getActivity(), DetailActivity.class);
                    intent3.putExtras(data3);
                    startActivity(intent3);
                    break;
                case 4:
                    next_Sign = 4;
                    Bundle data4 = new Bundle();
                    data4.putSerializable("next_Sign", next_Sign);
                    Intent intent4 = new Intent(getActivity(), DetailActivity.class);
                    intent4.putExtras(data4);
                    startActivity(intent4);
                    break;
                case 5:
                    next_Sign = 5;
                    Bundle data5 = new Bundle();
                    data5.putSerializable("next_Sign", next_Sign);
                    Intent intent5 = new Intent(getActivity(), DetailActivity.class);
                    intent5.putExtras(data5);
                    startActivity(intent5);
                    break;
                default:
                    Toast.makeText(getActivity(), "1", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
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
        mDatas.add(bean_goods4);
        mDatas.add(bean_goods5);
        mDatas.add(bean_goods6);

    }

}
