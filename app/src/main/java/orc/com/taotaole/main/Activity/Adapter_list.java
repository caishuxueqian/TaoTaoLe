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

import static android.content.ContentValues.TAG;

public class Adapter_list extends BaseAdapter {
    private Context context;
    private List<Bean_list> datas;


    public Adapter_list(Context context, List<Bean_list> datas) {
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
        Bean_list goodsList = (Bean_list) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.fragment2_list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.goodImage =  view.findViewById(R.id.lv);
            viewHolder.goodDescribe =  view.findViewById(R.id.tv);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
       viewHolder.goodImage.setImageResource(goodsList.getImgId());
        viewHolder.goodDescribe.setText(goodsList.getDescribe());
        return view;
    }

    class ViewHolder {
        ImageView goodImage;
        TextView goodDescribe;
    }
}
