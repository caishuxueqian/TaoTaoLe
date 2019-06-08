package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class MyFragment3 extends Fragment {
    private ListView mListView;
    private Adapter_cart mdapter_cart;
    private List<Bean_cart> mDatas = new ArrayList<Bean_cart>();
    private TextView tv_edit;
    private TextView tv_delete;
    private CheckBox cb_allseclet;
    private TextView tv_sum;
    private TextView tv_buy;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout, container, false);
        initDatas();
        mListView = view.findViewById(R.id.fragment3_lv);
        mdapter_cart = new Adapter_cart(getActivity(), mDatas);
        mListView.setAdapter(mdapter_cart);
        tv_edit = view.findViewById(R.id.fragment3_edit);
        tv_delete = view.findViewById(R.id.fragment3_delete);
        cb_allseclet = view.findViewById(R.id.fragment3_allselect);
        tv_sum = view.findViewById(R.id.fragment3_sum);
        tv_buy = view.findViewById(R.id.fragment3_buy);
        tv_edit.setOnClickListener(e -> tv_edit());
        return view;
    }

    //public void onclick(){
//        tv_edit.setOnClickListener(e->tv_edit());
//}
    public void tv_edit() {
        if ("编辑".equals(tv_edit.getText().toString())) {
            tv_edit.setText("完成");
            tv_buy.setVisibility(View.GONE);
            tv_delete.setVisibility(View.VISIBLE);
            tv_sum.setVisibility(View.INVISIBLE);
        } else {
            tv_edit.setText("编辑");
            tv_buy.setVisibility(View.VISIBLE);
            tv_delete.setVisibility(View.GONE);
            tv_sum.setVisibility(View.VISIBLE);

        }
    }


    private void initDatas() {
        Bean_cart bean_cart1 = new Bean_cart(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "10");
        Bean_cart bean_cart2 = new Bean_cart(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "10");
        Bean_cart bean_cart3 = new Bean_cart(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "10");
        mDatas.add(bean_cart1);
        mDatas.add(bean_cart2);
        mDatas.add(bean_cart3);
        mDatas.add(bean_cart1);
        mDatas.add(bean_cart2);
        mDatas.add(bean_cart3);
        mDatas.add(bean_cart1);
        mDatas.add(bean_cart2);
        mDatas.add(bean_cart3);
        mDatas.add(bean_cart1);
        mDatas.add(bean_cart2);
        mDatas.add(bean_cart3);
        mDatas.add(bean_cart1);
        mDatas.add(bean_cart2);
        mDatas.add(bean_cart3);

    }
}