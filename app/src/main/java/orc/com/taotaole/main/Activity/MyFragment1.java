package orc.com.taotaole.main.Activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class MyFragment1 extends Fragment {
    private GridView mGridView;
    private Adapter_goods mAdapterGoods;
    private List<Model_goods> mDatas = new ArrayList<Model_goods>();
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_layout, container, false);
        mGridView = (GridView)view.findViewById(R.id.gv);
        initDatas();
        mAdapterGoods = new Adapter_goods(getActivity(), mDatas);
        mGridView.setAdapter(mAdapterGoods);

        mGridView.setOnItemClickListener((parent, v, position, id) -> {
            switch (position) {
                case 1:
                    Toast.makeText(getActivity(), "点你马呢？", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    Toast.makeText(getActivity(), "别点了", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    Toast.makeText(getActivity(), "没用的", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    Toast.makeText(getActivity(), "说了没用", Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    Toast.makeText(getActivity(), "继续点", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Toast.makeText(getActivity(), "点你马呢？", Toast.LENGTH_SHORT).show();
                    break;
            }

        });
        return view;
    }
    private void initDatas() {
        Model_goods modelgoods1 = new Model_goods("10元", R.drawable.animal_1);
        Model_goods modelgoods2 = new Model_goods("10元", R.drawable.animal_2);
        Model_goods modelgoods3 = new Model_goods("10元", R.drawable.animal_3);
        Model_goods modelgoods4 = new Model_goods("10元", R.drawable.animal_4);
        Model_goods modelgoods5 = new Model_goods("10元", R.drawable.animal_1);
        Model_goods modelgoods6 = new Model_goods("10元", R.drawable.animal_1);
        Model_goods modelgoods7 = new Model_goods("10元", R.drawable.animal_1);
        Model_goods modelgoods8 = new Model_goods("10元", R.drawable.animal_1);

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
