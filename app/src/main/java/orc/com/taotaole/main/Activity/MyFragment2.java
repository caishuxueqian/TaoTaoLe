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
import java.util.List;

import orc.com.taotaole.R;

public class MyFragment2 extends Fragment {
    private GridView mGridView;
    private Adapter_grid mGridAdapterGrid;
    private List<Bean_grid> mDatas = new ArrayList<Bean_grid>();
    private ListView mListView;
    private List<Bean_list> datas1 = new ArrayList<Bean_list>();
    private Adapter_list mGoodsAdapterList;
    private List<Bean_grid> mDatas2 = new ArrayList<Bean_grid>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
        initDatas();
        initDatas1();
        initDatas2();
        mGridView = view.findViewById(R.id.gv);
        mListView = view.findViewById(R.id.lv);
        mGoodsAdapterList = new Adapter_list(getActivity(), datas1);
        mGridAdapterGrid = new Adapter_grid(getActivity(), mDatas);
        mListView.setAdapter(mGoodsAdapterList);
        mGridView.setAdapter(mGridAdapterGrid);
        mListView.setOnItemClickListener((a, b, position, d) -> {
            switch (position) {
                case 0:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas2));
                    Toast.makeText(getActivity(), "你点你马呢0", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas));
                    Toast.makeText(getActivity(), "别点了，没用的1", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas2));
                    Toast.makeText(getActivity(), "别点了，没用的2", Toast.LENGTH_SHORT).show();
                    break;
                case 3:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas));
                    Toast.makeText(getActivity(), "你点你马呢3", Toast.LENGTH_SHORT).show();
                    break;
                case 4:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas2));
                    Toast.makeText(getActivity(), "别点了，没用的4", Toast.LENGTH_SHORT).show();
                    break;
                case 5:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas));
                    Toast.makeText(getActivity(), "你点你马呢5", Toast.LENGTH_SHORT).show();
                    break;
                case 6:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas2));
                    Toast.makeText(getActivity(), "别点了，没用的6", Toast.LENGTH_SHORT).show();
                    break;
                case 7:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas));
                    Toast.makeText(getActivity(), "你点你马呢7", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    mGridView.setAdapter(new Adapter_grid(getActivity(),mDatas2));
                    Toast.makeText(getActivity(), "别点了，没用的", Toast.LENGTH_SHORT).show();
                    break;
            }
        });
        mGridView.setOnItemClickListener((parent, v, position, id) -> {
//            switch (position) {
//                case 1:
//                    Toast.makeText(getActivity(), "1", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(getActivity(),GoodsActivity.class));
//                    break;
//                case 2:
//                    Toast.makeText(getActivity(), "5", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(getActivity(),GoodsActivity.class));
//                    break;
//                case 3:
//                    Toast.makeText(getActivity(), "3", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(getActivity(),GoodsActivity.class));
//                    break;
//                case 4:
//                    Toast.makeText(getActivity(), "4", Toast.LENGTH_SHORT).show();
//                    break;
//                case 5:
//                    Toast.makeText(getActivity(), "5", Toast.LENGTH_SHORT).show();
//                    break;
//                default:
//                    Toast.makeText(getActivity(), "啦啦啦", Toast.LENGTH_SHORT).show();
//                    break;
//            }
            startActivity(new Intent(getActivity(),GoodsActivity.class));
        });
        return view;
    }
    private void initDatas() {
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.animal_1,"篮球");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.animal_2,"足球");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.animal_3,"羽毛球");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.animal_4,"铅球");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.animal_5,"乒乓球");
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
        mDatas.add(goodsGrid1);
        mDatas.add(goodsGrid2);
        mDatas.add(goodsGrid3);
        mDatas.add(goodsGrid4);
        mDatas.add(goodsGrid5);
    }
    private void initDatas1() {
        Bean_list goodsList0 = new Bean_list(R.drawable.icon_xunlei,"时尚男装");
        Bean_list goodsList1 = new Bean_list(R.drawable.icon_qq,"珠宝饰品");
        Bean_list goodsList2 = new Bean_list(R.drawable.icon_android,"音像制品");
        Bean_list goodsList3 = new Bean_list(R.drawable.icon_huoyan,"家具建材");
        Bean_list goodsList4 = new Bean_list(R.drawable.icon_liulanqi,"手机数码");
        Bean_list goodsList5 = new Bean_list(R.drawable.icon_dianzan,"家用电器");
        datas1.add(goodsList0);
        datas1.add(goodsList1);
        datas1.add(goodsList2);
        datas1.add(goodsList3);
        datas1.add(goodsList4);
        datas1.add(goodsList5);
        datas1.add(goodsList0);
        datas1.add(goodsList1);
        datas1.add(goodsList2);
        datas1.add(goodsList3);
        datas1.add(goodsList4);
        datas1.add(goodsList5);
        datas1.add(goodsList0);
        datas1.add(goodsList1);
        datas1.add(goodsList2);
        datas1.add(goodsList3);
        datas1.add(goodsList4);
        datas1.add(goodsList5);
        datas1.add(goodsList0);
        datas1.add(goodsList1);
        datas1.add(goodsList2);
        datas1.add(goodsList3);
        datas1.add(goodsList4);
        datas1.add(goodsList5);
        datas1.add(goodsList0);
        datas1.add(goodsList1);
        datas1.add(goodsList2);
        datas1.add(goodsList3);
        datas1.add(goodsList4);
        datas1.add(goodsList5);
        datas1.add(goodsList0);
        datas1.add(goodsList1);
        datas1.add(goodsList2);
        datas1.add(goodsList3);
        datas1.add(goodsList4);
        datas1.add(goodsList5);
    }
    private void initDatas2() {
        Bean_grid goodsGrid1 = new Bean_grid( R.drawable.animal_10,"手机");
        Bean_grid goodsGrid2 = new Bean_grid( R.drawable.animal_9,"电脑");
        Bean_grid goodsGrid3 = new Bean_grid( R.drawable.animal_8,"帆布鞋");
        Bean_grid goodsGrid4 = new Bean_grid( R.drawable.animal_7,"手办");
        Bean_grid goodsGrid5 = new Bean_grid( R.drawable.animal_6,"圆珠笔");
        mDatas2.add(goodsGrid1);
        mDatas2.add(goodsGrid2);
        mDatas2.add(goodsGrid3);
        mDatas2.add(goodsGrid4);
        mDatas2.add(goodsGrid5);
        mDatas2.add(goodsGrid1);
        mDatas2.add(goodsGrid2);
        mDatas2.add(goodsGrid3);
        mDatas2.add(goodsGrid4);
        mDatas2.add(goodsGrid5);
        mDatas2.add(goodsGrid1);
        mDatas2.add(goodsGrid2);
        mDatas2.add(goodsGrid3);
        mDatas2.add(goodsGrid4);
        mDatas2.add(goodsGrid5);
        mDatas2.add(goodsGrid1);
        mDatas2.add(goodsGrid2);
        mDatas2.add(goodsGrid3);
        mDatas2.add(goodsGrid4);
        mDatas2.add(goodsGrid5);
        mDatas2.add(goodsGrid1);
        mDatas2.add(goodsGrid2);
        mDatas2.add(goodsGrid3);
        mDatas2.add(goodsGrid4);
        mDatas2.add(goodsGrid5);

    }
}
