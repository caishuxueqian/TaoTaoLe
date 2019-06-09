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
    private double tv_sum_double;
    private TextView add;
    private TextView sub;
    private TextView number;
    private double sum;
    private TextView money;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout, container, false);
        initDatas();
        initViews(view);
        mdapter_cart = new Adapter_cart(getActivity(), mDatas);
        mListView.setAdapter(mdapter_cart);
//        总净额点击测试
        tv_sum.setOnClickListener(e -> Toast.makeText(getActivity(), "shabi", Toast.LENGTH_SHORT).show());
//      结算键
        tv_buy.setOnClickListener(e -> tv_buy());
//        编辑键
        tv_edit.setOnClickListener(e -> tv_edit());
//        全选键
        cb_allseclet.setOnClickListener(e -> cb_allseclet());
//        删除键
        tv_delete.setOnClickListener(e -> tv_delete());

//        ******************************************************************************
//        item点击事件
        mListView.setOnItemClickListener((parent, v, postion, id) -> {
//            初始化item控件
            initViews_item( v);
            tv_sum_double=0.0;
//            点击描述跳转
            describe.setOnClickListener(e -> startActivity(new Intent(getActivity(), DetailActivity.class)));
//            点击图片跳转
            img.setOnClickListener(e -> startActivity(new Intent(getActivity(), DetailActivity.class)));
//            点击数量
            number.setOnClickListener(e->{});
//        加号
            add.setOnClickListener(e -> {
                initViews_item( v);
                tv_sum_double=0.0;
                number.setText(String.valueOf(Integer.parseInt(number.getText().toString()) + 1));
//            计算item里面的总金额
                sum = Double.parseDouble(number.getText().toString()) * Double.parseDouble(money.getText().toString());
                mDatas.get(postion).setItem_sum(sum);
//                显示总金额
                for (int i = 0; i < mDatas.size(); i++) {
                    if (mDatas.get(i).isCheckBox())
                        tv_sum_double += mDatas.get(i).getItem_sum();
                }
                tv_sum.setText(String.valueOf(tv_sum_double));

                mdapter_cart.notifyDataSetChanged();
            });
            //        减号
            sub.setOnClickListener(e -> {
                initViews_item( v);
                tv_sum_double=0.0;
                if (!"1".equals(number.getText().toString())) {
                    number.setText(String.valueOf(Integer.parseInt(number.getText().toString()) - 1));
                }
//            计算item里面的总金额
                sum = Double.parseDouble(number.getText().toString()) * Double.parseDouble(money.getText().toString());
                mDatas.get(postion).setItem_sum(sum);
//                显示总金额
                for (int i = 0; i < mDatas.size(); i++) {
                    if (mDatas.get(i).isCheckBox())
                        tv_sum_double += mDatas.get(i).getItem_sum();
                }
                tv_sum.setText(String.valueOf(tv_sum_double));

                mdapter_cart.notifyDataSetChanged();
            });
//            复选框
            if (cb_checkBox.isChecked()) {
                mDatas.get(postion).setCheckBox(false);
            } else {
                mDatas.get(postion).setCheckBox(true);
            }
//            改变全选框
            for (int i = 0; i < mDatas.size(); i++) {
                if (!mDatas.get(i).isCheckBox()) {
                    cb_allseclet.setChecked(false);
                    break;
                } else {
                    cb_allseclet.setChecked(true);
                }

            }

//      修改总金额
            tv_sum_double=0.0;
            for (int i = 0;i < mDatas.size(); i++) {
                if (mDatas.get(i).isCheckBox())
                tv_sum_double += mDatas.get(i).getItem_sum();
            }
            tv_sum.setText(String.valueOf(tv_sum_double));

            mdapter_cart.notifyDataSetChanged();

        });
        return view;
    }

    //****************************************方法区**************************************************
//    ****************************************************************************************
//初始化view_item
    public void initViews_item(View v) {
        describe = v.findViewById(R.id.fragment3_describe);
        sub = v.findViewById(R.id.fragment3_sub);
        add = v.findViewById(R.id.fragment3_add);
        img = v.findViewById(R.id.fragment3_img);
        number = v.findViewById(R.id.fragment3_number);
        money = v.findViewById(R.id.fragment3_money);
        cb_checkBox = v.findViewById(R.id.fragment3_checkbox);

    }

    //    初始化view
    public void initViews(View view) {
        mListView = view.findViewById(R.id.fragment3_lv);
        tv_edit = view.findViewById(R.id.fragment3_edit);
        tv_delete = view.findViewById(R.id.fragment3_delete);
        cb_allseclet = view.findViewById(R.id.fragment3_allselect);
        tv_sum = view.findViewById(R.id.fragment3_sum);
        tv_buy = view.findViewById(R.id.fragment3_buy);

    }

    //删除键
    public void tv_delete() {
        Dialog dialog = new AlertDialog.Builder(getActivity()).setTitle("测试弹窗").setMessage("确定删除？").setPositiveButton("确定", (dialog12, which) -> Toast.makeText(getActivity(), "删不了", Toast.LENGTH_SHORT).show()).setNegativeButton("取消", (dialog1, which) -> {
        }).create();
        dialog.show();
    }

    //结算键
    public void tv_buy() {
        Dialog dialog = new AlertDialog.Builder(getActivity()).setTitle("测试弹窗").setMessage("确认支付？").setPositiveButton("确定", (dialog12, which) -> Toast.makeText(getActivity(), "买不了", Toast.LENGTH_SHORT).show()).setNegativeButton("取消", (dialog1, which) -> {
        }).create();
        dialog.show();

    }

    //编辑键
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

    //全选键
    public void cb_allseclet() {
        if (cb_allseclet.isChecked())
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(true);
        else
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(false);
        mdapter_cart.notifyDataSetChanged();
    }

    //全选键改变
    public void change_Allseclet() {
        for (int i = 0; i < mDatas.size(); i++)
            if (!mDatas.get(i).isCheckBox()) {
                cb_allseclet.setChecked(false);
                break;
            } else
                cb_allseclet.setChecked(true);
        mdapter_cart.notifyDataSetChanged();

    }


    //初始化数据
    private void initDatas() {
        Bean_cart bean_cart1 = new Bean_cart(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "1", false, 1);
        Bean_cart bean_cart2 = new Bean_cart(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "2", false, 2);
        Bean_cart bean_cart3 = new Bean_cart(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "3", false, 3);
        mDatas.add(bean_cart1);
        mDatas.add(bean_cart2);
        mDatas.add(bean_cart3);


    }
}