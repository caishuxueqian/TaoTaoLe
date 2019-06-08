package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class MyFragment1 extends Fragment {
    private GridView mGridView;
    private Adapter_2goods mAdapterGoods;
    private List<Bean_home> mDatas = new ArrayList<Bean_home>();
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);
        mGridView = view.findViewById(R.id.gv);
        initDatas();
        mAdapterGoods = new Adapter_2goods(getActivity(), mDatas);
        mGridView.setAdapter(mAdapterGoods);

        mGridView.setOnItemClickListener((parent, v, position, id) -> {
//            switch (position) {
//                case 1:
//                    Toast.makeText(getActivity(), "点你马呢？", Toast.LENGTH_SHORT).show();
//                    break;
//                case 2:
//                    Toast.makeText(getActivity(), "别点了", Toast.LENGTH_SHORT).show();
//                    break;
//                case 3:
//                    Toast.makeText(getActivity(), "没用的", Toast.LENGTH_SHORT).show();
//                    break;
//                case 4:
//                    Toast.makeText(getActivity(), "说了没用", Toast.LENGTH_SHORT).show();
//                    break;
//                case 5:
//                    Toast.makeText(getActivity(), "继续点", Toast.LENGTH_SHORT).show();
//                    break;
//                default:
//                    Toast.makeText(getActivity(), "点你马呢？", Toast.LENGTH_SHORT).show();
//                    break;
//            }
                startActivity(new Intent(getActivity(),DetailActivity.class));
                }
        );
        return view;
    }

    private void initDatas() {
        Bean_home modelgoods1 = new Bean_home("10", R.drawable.animal_1);
        Bean_home modelgoods2 = new Bean_home("10", R.drawable.animal_2);
        Bean_home modelgoods3 = new Bean_home("10", R.drawable.animal_3);
        Bean_home modelgoods4 = new Bean_home("10", R.drawable.animal_4);
        Bean_home modelgoods5 = new Bean_home("10", R.drawable.animal_1);
        Bean_home modelgoods6 = new Bean_home("10", R.drawable.animal_1);
        Bean_home modelgoods7 = new Bean_home("10", R.drawable.animal_1);
        Bean_home modelgoods8 = new Bean_home("10", R.drawable.animal_1);

        mDatas.add(modelgoods1);
        mDatas.add(modelgoods2);
        mDatas.add(modelgoods3);
        mDatas.add(modelgoods4);
        mDatas.add(modelgoods5);
        mDatas.add(modelgoods6);
        mDatas.add(modelgoods7);
        mDatas.add(modelgoods8);
        mDatas.add(modelgoods1);
        mDatas.add(modelgoods2);
        mDatas.add(modelgoods3);
        mDatas.add(modelgoods4);
        mDatas.add(modelgoods5);
        mDatas.add(modelgoods6);
        mDatas.add(modelgoods7);
        mDatas.add(modelgoods8);
        mDatas.add(modelgoods1);
        mDatas.add(modelgoods2);
        mDatas.add(modelgoods3);
        mDatas.add(modelgoods4);
        mDatas.add(modelgoods5);
        mDatas.add(modelgoods6);
        mDatas.add(modelgoods7);
        mDatas.add(modelgoods8);
    }
}
