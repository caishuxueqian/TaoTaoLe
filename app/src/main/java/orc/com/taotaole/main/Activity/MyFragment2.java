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
    private List<Bean_grid> Data_grid = new ArrayList<Bean_grid>();
    private ListView mListView;
    private List<Bean_list> Data_list = new ArrayList<Bean_list>();
    private Adapter_list mGoodsAdapterList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2_layout,container,false);
        initDatas();
        initData_list();
        mGridView = view.findViewById(R.id.gv);
        mListView = view.findViewById(R.id.lv);
        mGoodsAdapterList = new Adapter_list(getActivity(), Data_list);
        mGridAdapterGrid = new Adapter_grid(getActivity(), Data_grid);
        mListView.setAdapter(mGoodsAdapterList);
        mGridView.setAdapter(mGridAdapterGrid);
        mListView.setOnItemClickListener((a, b, position, d) -> {
                    Collections.shuffle(Data_grid);
                    mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid));
//            switch (position) {
//                case 0:
//                    Collections.reverse(Data_grid);
//                    mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid));
//                    Toast.makeText(getActivity(), "你点你马呢0", Toast.LENGTH_SHORT).show();
//                    break;
//                case 1:
//                    mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid));
//                    Toast.makeText(getActivity(), "别点了，没用的1", Toast.LENGTH_SHORT).show();
//                    break;
//                case 2:
//                    Toast.makeText(getActivity(), "别点了，没用的2", Toast.LENGTH_SHORT).show();
//                    break;
//                case 3:
//                    mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid));
//                    Toast.makeText(getActivity(), "你点你马呢3", Toast.LENGTH_SHORT).show();
//                    break;
//                case 4:
//                    Toast.makeText(getActivity(), "别点了，没用的4", Toast.LENGTH_SHORT).show();
//                    break;
//                case 5:
//                    mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid));
//                    Toast.makeText(getActivity(), "你点你马呢5", Toast.LENGTH_SHORT).show();
//                    break;
//                case 6:
//                    Toast.makeText(getActivity(), "别点了，没用的6", Toast.LENGTH_SHORT).show();
//                    break;
//                case 7:
//                    mGridView.setAdapter(new Adapter_grid(getActivity(),Data_grid));
//                    Toast.makeText(getActivity(), "你点你马呢7", Toast.LENGTH_SHORT).show();
//                    break;
//                default:
//                    Toast.makeText(getActivity(), "别点了，没用的", Toast.LENGTH_SHORT).show();
//                    break;
//            }


     }
      );
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
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
        Data_grid.add(goodsGrid1);
        Data_grid.add(goodsGrid2);
        Data_grid.add(goodsGrid3);
        Data_grid.add(goodsGrid4);
        Data_grid.add(goodsGrid5);
    }
    private void initData_list() {
        Bean_list goodsList0 = new Bean_list(R.drawable.icon_xunlei,"时尚男装");
        Bean_list goodsList1 = new Bean_list(R.drawable.icon_qq,"珠宝饰品");
        Bean_list goodsList2 = new Bean_list(R.drawable.icon_android,"音像制品");
        Bean_list goodsList3 = new Bean_list(R.drawable.icon_huoyan,"家具建材");
        Bean_list goodsList4 = new Bean_list(R.drawable.icon_liulanqi,"手机数码");
        Bean_list goodsList5 = new Bean_list(R.drawable.icon_dianzan,"家用电器");
        Data_list.add(goodsList0);
        Data_list.add(goodsList1);
        Data_list.add(goodsList2);
        Data_list.add(goodsList3);
        Data_list.add(goodsList4);
        Data_list.add(goodsList5);
        Data_list.add(goodsList0);
        Data_list.add(goodsList1);
        Data_list.add(goodsList2);
        Data_list.add(goodsList3);
        Data_list.add(goodsList4);
        Data_list.add(goodsList5);
        Data_list.add(goodsList0);
        Data_list.add(goodsList1);
        Data_list.add(goodsList2);
        Data_list.add(goodsList3);
        Data_list.add(goodsList4);
        Data_list.add(goodsList5);
        Data_list.add(goodsList0);
        Data_list.add(goodsList1);
        Data_list.add(goodsList2);
        Data_list.add(goodsList3);
        Data_list.add(goodsList4);
        Data_list.add(goodsList5);
        Data_list.add(goodsList0);
        Data_list.add(goodsList1);
        Data_list.add(goodsList2);
        Data_list.add(goodsList3);
        Data_list.add(goodsList4);
        Data_list.add(goodsList5);
        Data_list.add(goodsList0);
        Data_list.add(goodsList1);
        Data_list.add(goodsList2);
        Data_list.add(goodsList3);
        Data_list.add(goodsList4);
        Data_list.add(goodsList5);
    }

}
