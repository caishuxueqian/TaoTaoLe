package orc.com.taotaole.main.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

import static android.support.constraint.Constraints.TAG;

public class MyFragment3 extends Fragment {
    private ListView mListView;
    private Adapter_cart mdapter_cart;
    private List<Bean_cart> mDatas = new ArrayList<Bean_cart>();
    private TextView tv_edit;
    private TextView tv_delete;
    private CheckBox cb_allseclet;
    private TextView tv_sum;
    private TextView tv_buy;
    private CheckBox cb_checkBox;
    private ImageView img;
    private TextView describe;
    private  Double tv_sum_double;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout, container, false);
        initDatas();
        mListView = view.findViewById(R.id.fragment3_lv);
        mdapter_cart = new Adapter_cart(getActivity(), mDatas);
        mListView.setAdapter(mdapter_cart);
        tv_edit = view.findViewById(R.id.fragment3_edit);
        tv_delete = view.findViewById(R.id.fragment3_delete);
        cb_allseclet = view.findViewById(R.id.fragment3_allselect);
        tv_sum = view.findViewById(R.id.fragment3_sum);
        tv_buy = view.findViewById(R.id.fragment3_buy);
        tv_buy.setOnClickListener(e -> tv_buy());
        tv_edit.setOnClickListener(e -> tv_edit());
        cb_allseclet.setOnClickListener(e -> cb_allseclet());
        tv_delete.setOnClickListener(e -> tv_delete());
        mListView.setOnItemClickListener((a, b, c, d) -> {
            describe = b.findViewById(R.id.fragment3_describe);
            describe.setOnClickListener(e -> startActivity(new Intent(getActivity(), DetailActivity.class)));
            img = b.findViewById(R.id.fragment3_img);
            img.setOnClickListener(e -> startActivity(new Intent(getActivity(), DetailActivity.class)));
            cb_checkBox = b.findViewById(R.id.fragment3_checkbox);
            if (cb_checkBox.isChecked()) {
                mDatas.get(c).setCheckBox(false);
            } else {
                mDatas.get(c).setCheckBox(true);
            }
            for (int i = 0; i < mDatas.size(); i++) {
                if (!mDatas.get(i).isCheckBox()) {
                    cb_allseclet.setChecked(false);
                    break;
                } else {
                    cb_allseclet.setChecked(true);
                }

            }
//            tv_sum=mListView.findViewById(R.id.fragment3_money);
//            for(int i=0;i<mDatas.size();i++){
//                if(mDatas.get(i).isCheckBox())
//                    Log.d(TAG, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"+mDatas.get(i)+"zzzzz"+mDatas.get(i).getItem_sum());
//                    tv_sum_double+=mDatas.get(i).getItem_sum();
//                Log.d(TAG, "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"+mDatas.get(i)+"zzzzz"+mDatas.get(i).getItem_sum());
//
//                tv_sum.setText(String.valueOf(tv_sum_double));
//            }
            mdapter_cart.notifyDataSetChanged();

        });
        return view;
    }

    public void tv_delete() {
        Dialog dialog = new AlertDialog.Builder(getActivity()).setTitle("测试弹窗").setMessage("确定删除？").setPositiveButton("确定", (dialog12, which) -> Toast.makeText(getActivity(), "删不了", Toast.LENGTH_SHORT).show()).setNegativeButton("取消", (dialog1, which) -> {
        }).create();
        dialog.show();
    }

    public void tv_buy() {
        Dialog dialog = new AlertDialog.Builder(getActivity()).setTitle("测试弹窗").setMessage("确认支付？").setPositiveButton("确定", (dialog12, which) -> Toast.makeText(getActivity(), "买不了", Toast.LENGTH_SHORT).show()).setNegativeButton("取消", (dialog1, which) -> {
        }).create();
        dialog.show();

    }

    public void tv_edit() {
        if ("编辑".equals(tv_edit.getText().toString())) {
            tv_edit.setText("完成");
            tv_buy.setVisibility(View.GONE);
            tv_delete.setVisibility(View.VISIBLE);
            tv_sum.setVisibility(View.INVISIBLE);
        } else {
            tv_edit.setText("编辑");
            tv_buy.setVisibility(View.VISIBLE);
            tv_delete.setVisibility(View.GONE);
            tv_sum.setVisibility(View.VISIBLE);
        }
    }

    public void cb_allseclet() {
        if (cb_allseclet.isChecked())
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(true);
        else
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(false);
        mdapter_cart.notifyDataSetChanged();
    }

    public void change_Allseclet() {
        for (int i = 0; i < mDatas.size(); i++)
            if (!mDatas.get(i).isCheckBox()) {
                cb_allseclet.setChecked(false);
                break;
            } else
                cb_allseclet.setChecked(true);
        mdapter_cart.notifyDataSetChanged();

    }



    private void initDatas() {
        Bean_cart bean_cart1 = new Bean_cart(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "1", false, 0);
        Bean_cart bean_cart2 = new Bean_cart(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "2", false, 0);
        Bean_cart bean_cart3 = new Bean_cart(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "3", false, 0);
        mDatas.add(bean_cart1);
        mDatas.add(bean_cart2);
        mDatas.add(bean_cart3);


    }
}