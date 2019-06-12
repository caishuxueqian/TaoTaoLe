package orc.com.taotaole.main.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import orc.com.taotaole.R;

public class Adapter_2_1goods extends BaseAdapter {
    private Context context;
    private List<Bean_goods1> datas;
    public Adapter_2_1goods(Context context, List<Bean_goods1> datas) {
        this.context = context;
        this.datas = datas;
    }
    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Bean_goods1 bean_goods1 = (Bean_goods1) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate((R.layout.fragement1_grid_item), null);
            viewHolder = new ViewHolder();
            viewHolder.GoodsImg = view.findViewById(R.id.goods1_iv);
            viewHolder.GoodsDescrbe = view.findViewById(R.id.goods1_tv);
            viewHolder.GoodsMoney = view.findViewById(R.id.goods1_tv1);
            viewHolder.GoodsPerson = view.findViewById(R.id.goods1_tv2);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.GoodsImg.setImageResource(bean_goods1.getImgId());
        viewHolder.GoodsDescrbe.setText(bean_goods1.getDescribe());
        viewHolder.GoodsMoney.setText(bean_goods1.getMoney());
        viewHolder.GoodsPerson.setText(bean_goods1.getPerson());
            view.findViewById(R.id.fragment1_top).setVisibility(View.GONE);
        return view;

    }

    class ViewHolder {
        ImageView GoodsImg;
        TextView GoodsDescrbe;
        TextView GoodsMoney;
        TextView GoodsPerson;
    }

}
