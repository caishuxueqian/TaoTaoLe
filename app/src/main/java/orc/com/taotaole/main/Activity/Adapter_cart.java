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

public class Adapter_cart extends BaseAdapter {
    private Context context;
    private List<Bean_cart> datas;
    public Adapter_cart(Context context, List<Bean_cart> datas) {
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
        Bean_cart bean_cart = (Bean_cart) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate((R.layout.fragment3_list_item), null);
            viewHolder = new ViewHolder();
            viewHolder.CartImg = view.findViewById(R.id.fragment3_img);
            viewHolder.CartDescrbe = view.findViewById(R.id.fragment3_describe);
            viewHolder.CartMoney = view.findViewById(R.id.fragment3_money);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.CartImg.setImageResource(bean_cart.getImgId());
        viewHolder.CartDescrbe.setText(bean_cart.getDescribe());
        viewHolder.CartMoney.setText(bean_cart.getMoney());
        return view;

    }

    class ViewHolder {
        ImageView CartImg;
        TextView CartDescrbe;
        TextView CartMoney;
    }

}
