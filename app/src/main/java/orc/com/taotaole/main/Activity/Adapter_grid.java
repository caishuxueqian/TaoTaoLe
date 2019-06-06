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

public class Adapter_grid extends BaseAdapter {
    private Context context;
    private List<Bean_grid> datas;

    public Adapter_grid(Context context, List<Bean_grid> datas) {
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
        Bean_grid goodsGrid = (Bean_grid) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate((R.layout.fragment2_grid_item), null);
            viewHolder = new ViewHolder();
            viewHolder.animalImage = view.findViewById(R.id.iv);
            viewHolder.animalName = view.findViewById(R.id.tv);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.animalName.setText(goodsGrid.getDescribe());
        viewHolder.animalImage.setImageResource(goodsGrid.getImgId());

        return view;

    }

    class ViewHolder {
        ImageView animalImage;
        TextView animalName;
    }

}
