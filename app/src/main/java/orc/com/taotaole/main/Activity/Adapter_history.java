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

public class Adapter_history extends BaseAdapter {
    private Context context;
    private List<Bean_history> datas;

    public Adapter_history(Context context, List<Bean_history> datas) {
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
        Bean_history bean_history = (Bean_history) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate((R.layout.activity_history_list_item), null);
            viewHolder = new ViewHolder();
            viewHolder.History = view.findViewById(R.id.history_img);
            viewHolder.HistoryDescrbe = view.findViewById(R.id.history_describe);
            viewHolder.HistoryMoney = view.findViewById(R.id.history_money);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.History.setImageResource(bean_history.getImgId());
        viewHolder.HistoryDescrbe.setText(bean_history.getDescribe());
        viewHolder.HistoryMoney.setText(bean_history.getMoney());
        return view;

    }

    class ViewHolder {
        ImageView History;
        TextView HistoryDescrbe;
        TextView HistoryMoney;
    }

}
