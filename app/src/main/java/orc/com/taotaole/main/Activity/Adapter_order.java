package orc.com.taotaole.main.Activity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import orc.com.taotaole.R;

public class Adapter_order extends BaseAdapter {
    private Context context;
    private List<Bean_order> datas;


    public Adapter_order(Context context, List<Bean_order> datas) {
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
        Bean_order bean_order = (Bean_order) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.activity_order_list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.orderImage =  view.findViewById(R.id.order_img);
            viewHolder.orderDescribe=  view.findViewById(R.id.order_describe);
            viewHolder.orderMoney =  view.findViewById(R.id.order_money);
            viewHolder.orderNumber =  view.findViewById(R.id.order_number);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.orderImage.setImageResource(bean_order.getImgId());
        viewHolder.orderDescribe.setText(bean_order.getDescribe());
        viewHolder.orderMoney.setText(bean_order.getMoney());
        viewHolder.orderNumber.setText(bean_order.getNumber());
        return view;
    }

    class ViewHolder {
        ImageView orderImage;
        TextView orderDescribe;
        TextView orderMoney;
        TextView orderNumber;
    }
}
