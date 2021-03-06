package orc.com.taotaole.main.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
    private TextView text_sum;
    private int next_Sign;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3_layout, container, false);
        initDatas();
        initViews(view);
        mdapter_cart = new Adapter_cart(getActivity(), mDatas);
        mListView.setAdapter(mdapter_cart);
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
            initViews_item(v);
            tv_sum_double = 0.0;
//            点击描述跳转
            describe.setOnClickListener(e ->showDetail(postion));
//            点击图片跳转
            img.setOnClickListener(e ->showDetail(postion));

//        加号
            add.setOnClickListener(e -> {
                initViews_item(v);
                tv_sum_double = 0.0;
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
                initViews_item(v);
                tv_sum_double = 0.0;
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
            setCb_checkBox(postion);
//            改变全选框
            change_Allseclet();
//           修改总金额
            changeTextSum();
//          刷新显示
            mdapter_cart.notifyDataSetChanged();

        });
        return view;
    }

    //****************************************方法区**************************************************
//    ****************************************************************************************
    public void showDetail(int c){
        switch (c){
            case 0:
                next_Sign =0;
                Bundle data0 = new Bundle();
                data0.putSerializable("next_Sign", next_Sign);
                Intent intent0 = new Intent(getActivity(), DetailActivity.class);
                intent0.putExtras(data0);
                startActivity(intent0);
                break;
            case 1:
                next_Sign = 1;
                Bundle data1 = new Bundle();
                data1.putSerializable("next_Sign", next_Sign);
                Intent intent1 = new Intent(getActivity(), DetailActivity.class);
                intent1.putExtras(data1);
                startActivity(intent1);
                break;
            case 2:
                next_Sign =2;
                Bundle data2 = new Bundle();
                data2.putSerializable("next_Sign", next_Sign);
                Intent intent2 = new Intent(getActivity(), DetailActivity.class);
                intent2.putExtras(data2);
                startActivity(intent2);
                break;
            case 3:
                next_Sign = 3;
                Bundle data3 = new Bundle();
                data3.putSerializable("next_Sign", next_Sign);
                Intent intent3 = new Intent(getActivity(), DetailActivity.class);
                intent3.putExtras(data3);
                startActivity(intent3);
                break;
            case 4:
                next_Sign =4;
                Bundle data4 = new Bundle();
                data4.putSerializable("next_Sign", next_Sign);
                Intent intent4 = new Intent(getActivity(), DetailActivity.class);
                intent4.putExtras(data4);
                startActivity(intent4);
                break;
            case 5:
                next_Sign = 5;
                Bundle data5 = new Bundle();
                data5.putSerializable("next_Sign", next_Sign);
                Intent intent5 = new Intent(getActivity(), DetailActivity.class);
                intent5.putExtras(data5);
                startActivity(intent5);
                break;
            default:
                ;
                break;
        }}
    //修改显示的总价
    public void changeTextSum() {
        tv_sum_double = 0.0;
        for (int i = 0; i < mDatas.size(); i++) {
            if (mDatas.get(i).isCheckBox())
                tv_sum_double += mDatas.get(i).getItem_sum();
        }
        tv_sum.setText(String.valueOf(tv_sum_double));
        mdapter_cart.notifyDataSetChanged();
    }

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
        text_sum = view.findViewById(R.id.fragment3_text_sum);

    }

    //删除键
    public void tv_delete() {
        if (!(mDatas.size() == 0)) {
        int checkedLength = 0;
        for (int i = 0; i < mDatas.size(); i++)
            if (mDatas.get(i).isCheckBox())
                checkedLength++;
        if (checkedLength != 0) {
            Dialog dialog = new AlertDialog.Builder(getActivity()).setTitle(" ").setMessage("确定删除？").setPositiveButton("确定", (dialog12, which) -> {
                List<Bean_cart> noCheckBoxs = new ArrayList<>();
                for (int i = 0; i < mDatas.size(); i++)
                    if (mDatas.get(i).isCheckBox())
                        noCheckBoxs.add(mDatas.get(i));
                for (Bean_cart cb : noCheckBoxs)
                    mDatas.remove(cb);

//            如果数据为空，全选框置为false
                if (mDatas.size() == 0) {
                    cb_allseclet.setChecked(false);
                }
                changeTextSum();
                mdapter_cart.notifyDataSetChanged();
                Toast.makeText(getActivity(), "删除成功！", Toast.LENGTH_SHORT).show();
            }).setNegativeButton("取消", (dialog1, which) -> {
            }).create();
            dialog.show();

        } else
            Toast.makeText(getActivity(), "请选择", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(getActivity(), "尚无数据", Toast.LENGTH_SHORT).show();
    }

    //结算键
    public void tv_buy() {
        if (!(mDatas.size() == 0)) {
            int checkedLength = 0;
            for (int i = 0; i < mDatas.size(); i++)
                if (mDatas.get(i).isCheckBox())
                    checkedLength++;
            if (checkedLength != 0) {
                Dialog dialog = new AlertDialog.Builder(getActivity()).setTitle(" ").setMessage("确认支付？").setPositiveButton("确定", (dialog12, which) -> {
                    Toast.makeText(getActivity(), "购买成功！消费:" + tv_sum.getText().toString() + "元", Toast.LENGTH_SHORT).show();
                    List<Bean_cart> noCheckBoxs = new ArrayList<>();
                    for (int i = 0; i < mDatas.size(); i++)
                        if (mDatas.get(i).isCheckBox())
                            noCheckBoxs.add(mDatas.get(i));
                    for (Bean_cart cb : noCheckBoxs)
                        mDatas.remove(cb);

//            如果数据为空，全选框置为false
                    if (mDatas.size() == 0) {
                        cb_allseclet.setChecked(false);
                    }
                    changeTextSum();
                    mdapter_cart.notifyDataSetChanged();
                }).setNegativeButton("取消", (dialog1, which) -> {
                }).create();
                dialog.show();
            } else
                Toast.makeText(getActivity(), "请选择", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(getActivity(), "尚无数据", Toast.LENGTH_SHORT).show();

    }

    //编辑键
    public void tv_edit() {
        if ("编辑".equals(tv_edit.getText().toString())) {
            tv_edit.setText("完成");
            tv_buy.setVisibility(View.GONE);
            tv_delete.setVisibility(View.VISIBLE);
//            tv_sum.setVisibility(View.INVISIBLE);
//            text_sum.setVisibility(View.INVISIBLE);
        } else {
            tv_edit.setText("编辑");
            tv_buy.setVisibility(View.VISIBLE);
            tv_delete.setVisibility(View.GONE);
//            tv_sum.setVisibility(View.VISIBLE);
//            text_sum.setVisibility(View.VISIBLE);
        }
    }

    //    复选框
    public void setCb_checkBox(int postion) {
        if (cb_checkBox.isChecked()) {
            mDatas.get(postion).setCheckBox(false);
        } else {
            mDatas.get(postion).setCheckBox(true);
        }

    }

    //全选键
    public void cb_allseclet() {
        tv_sum_double = 0.0;
        if (cb_allseclet.isChecked())
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(true);
        else
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(false);
//                显示总金额
        changeTextSum();

    }

    //全选键改变
    public void change_Allseclet() {
        for (int i = 0; i < mDatas.size(); i++) {
            if (!mDatas.get(i).isCheckBox()) {
                cb_allseclet.setChecked(false);
                break;
            } else {
                cb_allseclet.setChecked(true);
            }

        }

    }


    //初始化数据
    private void initDatas() {
        Bean_cart bean_cart1 = new Bean_cart(R.drawable.nai1, "12月豆本豆原味豆奶250ml*12瓶 早餐营养奶制品19年9月到期", "19.8", false, 19.8);
        Bean_cart bean_cart2 = new Bean_cart(R.drawable.nai2, "蒙牛未来星儿童成长牛奶整箱营养佳智型12盒装早餐学生乳制品礼盒", "59", false, 59);
        Bean_cart bean_cart3 = new Bean_cart(R.drawable.dianfanbao1, "电饭煲家用迷你小型2L3L学生宿舍老式电饭煲 蒸煮多功能1-2-3-4人", "59", false, 59);
        Bean_cart bean_cart4 = new Bean_cart(R.drawable.dianfanbao1, "电饭煲家用迷你小型电饭煲 1-2-3-4人学生宿舍普通老式蒸煮多功能", "108", false, 108);
        Bean_cart bean_cart5 = new Bean_cart(R.drawable.txu1, "南极人短袖T恤男潮流潮牌半袖加肥加大宽松大码男士夏季胖子衣服", "92", false, 92);
        Bean_cart bean_cart6 = new Bean_cart(R.drawable.txu2, "短袖男夏装韩版潮流纯棉2019新款潮牌宽松青少年男孩初中生T恤", "98", false, 98);
        mDatas.add(bean_cart1);
        mDatas.add(bean_cart2);
        mDatas.add(bean_cart3);
        mDatas.add(bean_cart4);
        mDatas.add(bean_cart5);
        mDatas.add(bean_cart6);


    }
}