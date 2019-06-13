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

public class Adapter_2goods extends BaseAdapter {
    private Context context;
    private List<Bean_goods2> datas;
    public Adapter_2goods(Context context, List<Bean_goods2> datas) {
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
        Bean_goods2 bean_goods2 = (Bean_goods2) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate((R.layout.activity_goods_grid_item), null);
            viewHolder = new ViewHolder();
            viewHolder = new Adapter_2goods.ViewHolder();
            viewHolder.GoodsImg = view.findViewById(R.id.goods2_img);
            viewHolder.GoodsDescrbe = view.findViewById(R.id.goods2_describe);
            viewHolder.GoodsMoney = view.findViewById(R.id.goods2_money);
            viewHolder.GoodsPerson = view.findViewById(R.id.goods2_person);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (Adapter_2goods.ViewHolder) view.getTag();
        }
        viewHolder.GoodsImg.setImageResource(bean_goods2.getImgId());
        viewHolder.GoodsDescrbe.setText(bean_goods2.getDescribe());
        viewHolder.GoodsMoney.setText(bean_goods2.getMoney());
        viewHolder.GoodsPerson.setText(bean_goods2.getPerson());

        return view;

    }

    class ViewHolder {
        ImageView GoodsImg;
        TextView GoodsDescrbe;
        TextView GoodsMoney;
        TextView GoodsPerson;
    }

}
