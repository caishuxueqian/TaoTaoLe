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
    private List<Model_goods> datas;
    public Adapter_2goods(Context context, List<Model_goods> datas) {
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
        Model_goods modelgoods = (Model_goods) getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate((R.layout.fragment1_grid_item), null);
            viewHolder = new ViewHolder();
            viewHolder.animalImage = view.findViewById(R.id.iv1);
            viewHolder.animalName = view.findViewById(R.id.tv1);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.animalName.setText(modelgoods.getAnimal());
        viewHolder.animalImage.setImageResource(modelgoods.getImgId());
        return view;

    }

    class ViewHolder {
        ImageView animalImage;
        TextView animalName;
    }

}
