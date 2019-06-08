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

public class MyFragment3 extends Fragment {
    private ListView mListView;
    private Adapter_cart mdapter_cart;
    private List<Bean_cart> mDatas = new ArrayList<Bean_cart>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout,container,false);
        initDatas();
        mListView = view.findViewById(R.id.fragment3_lv);
        mdapter_cart = new Adapter_cart(getActivity(),mDatas);
        mListView.setAdapter(mdapter_cart);

        mListView.setOnItemClickListener((parent, v, position, id) -> {
//            switch (position) {
//                case 1:
//
//                    Toast.makeText(this, "点你马呢？", Toast.LENGTH_SHORT).show();
//                    break;
//                case 2:
//                    Toast.makeText(this, "别点了", Toast.LENGTH_SHORT).show();
//                    break;
//                case 3:
//                    Toast.makeText(this, "没用的", Toast.LENGTH_SHORT).show();
//                    break;
//                case 4:
//                    Toast.makeText(this, "说了没用", Toast.LENGTH_SHORT).show();
//                    break;
//                case 5:
//                    Toast.makeText(this, "继续点", Toast.LENGTH_SHORT).show();
//                    break;
//                default:
//                    Toast.makeText(this, "点你马呢？", Toast.LENGTH_SHORT).show();
//                    break;
//            }
            startActivity(new Intent(getActivity(),DetailActivity.class));
        });
        return  view;
    }

    private void initDatas() {
        Bean_cart bean_cart1 = new Bean_cart(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "10");
        Bean_cart bean_cart2 = new Bean_cart(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "10");
        Bean_cart bean_cart3  = new Bean_cart(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "10");
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