package orc.com.taotaole.main.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class OrderActivity extends AppCompatActivity {
    private ListView mListView;
    private Adapter_order mAdapterorder;
    private List<Bean_order> mDatas = new ArrayList<Bean_order>();
    private TextView tv_edit;
    private TextView tv_delete;
    private ImageView iv_back;
    private CheckBox checkBox;
    private TextView describe;
    private ImageView goodsImg;
    private CheckBox allSelect;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_layout);
        initDatas();
        initView();
        mAdapterorder = new Adapter_order(this, mDatas);
        mListView.setAdapter(mAdapterorder);
        tv_edit.setOnClickListener(e -> tv_edit());
        tv_delete.setOnClickListener(e -> tv_delete());
        iv_back.setOnClickListener(e -> finish());
        allSelect.setOnClickListener(e -> allseclet());
        mListView.setOnItemClickListener((a, b, c, d) -> {
            initView_item(b);
            checkBox(c);
            change_Allseclet();
//            点击描述跳转
            describe.setOnClickListener(e -> startActivity(new Intent(this, DetailActivity.class)));
//            点击图片跳转
            goodsImg.setOnClickListener(e -> startActivity(new Intent(this, DetailActivity.class)));
            mAdapterorder.notifyDataSetChanged();
        });

    }


    public void tv_edit() {
        if ("编辑".equals(tv_edit.getText().toString())) {
            tv_edit.setText("完成");
            tv_delete.setVisibility(View.VISIBLE);
        } else {
            tv_edit.setText("编辑");
            tv_delete.setVisibility(View.GONE);

        }
    }

    //初始化父控件
    public void initView() {
        mListView = findViewById(R.id.order_lv);
        tv_edit = findViewById(R.id.order_edit);
        tv_delete = findViewById(R.id.order_delete);
        iv_back = findViewById(R.id.order_back);
        allSelect = findViewById(R.id.order_allselect);
    }

    public void initView_item(View v) {
        checkBox = v.findViewById(R.id.order_item_checkbox);
        describe = v.findViewById(R.id.order_item_describe);
        goodsImg = v.findViewById(R.id.order_item_img);
    }

    //    复选框
    public void checkBox(int postion) {
        if (checkBox.isChecked()) {
            mDatas.get(postion).setCheckBox(false);
        } else {
            mDatas.get(postion).setCheckBox(true);
        }
        mAdapterorder.notifyDataSetChanged();

    }

    //全选键
    public void allseclet() {
        if (allSelect.isChecked())
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(true);
        else
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(false);
        mAdapterorder.notifyDataSetChanged();
    }

    //全选键改变
    public void change_Allseclet() {
        for (int i = 0; i < mDatas.size(); i++) {
            if (!mDatas.get(i).getCheckBox()) {
                allSelect.setChecked(false);
                break;
            } else {
                allSelect.setChecked(true);
            }

        }
        mAdapterorder.notifyDataSetChanged();

    }

    public void tv_delete() {
        if (!(mDatas.size() == 0)) {
            int checkedLength = 0;
            for (int i = 0; i < mDatas.size(); i++)
                if (mDatas.get(i).getCheckBox())
                    checkedLength++;
            if (checkedLength != 0) {
                Dialog dialog = new AlertDialog.Builder(this).setTitle(" ").setMessage("确定删除？").setPositiveButton("确定", (dialog12, which) -> {
                    List<Bean_order> noCheckBoxs = new ArrayList<>();
                    for (int i = 0; i < mDatas.size(); i++)
                        if (mDatas.get(i).getCheckBox())
                            noCheckBoxs.add(mDatas.get(i));
                    for (Bean_order cb : noCheckBoxs)
                        mDatas.remove(cb);
//            如果数据为空，全选框置为false
                    if (mDatas.size() == 0) {
                        allSelect.setChecked(false);
                    }
                    mAdapterorder.notifyDataSetChanged();
                    Toast.makeText(this, "删除成功！", Toast.LENGTH_SHORT).show();
                }).setNegativeButton("取消", (dialog1, which) -> {
                }).create();
                dialog.show();
            } else
                Toast.makeText(this, "请选择", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "尚无数据", Toast.LENGTH_SHORT).show();
    }


    private void initDatas() {
        Bean_order bean_order1 = new Bean_order(R.drawable.nai1, "12月豆本豆原味豆奶250ml*12瓶 早餐营养奶制品19年9月到期", "19.8", "1", false);
        Bean_order bean_order2 = new Bean_order(R.drawable.nai2, "蒙牛未来星儿童成长牛奶整箱营养佳智型12盒装早餐学生乳制品礼盒", "59", "2", false);
        Bean_order bean_order3 = new Bean_order(R.drawable.dianfanbao1, "电饭煲家用迷你小型2L3L学生宿舍老式电饭煲 蒸煮多功能1-2-3-4人", "89", "1", false);
        Bean_order bean_order4 = new Bean_order(R.drawable.dianfanbao2, "电饭煲家用迷你小型电饭煲 1-2-3-4人学生宿舍普通老式蒸煮多功能", "108", "1", false);
        Bean_order bean_order5 = new Bean_order(R.drawable.txu1, "南极人短袖T恤男潮流潮牌半袖加肥加大宽松大码男士夏季胖子衣服", "92", "2", false);
        Bean_order bean_order6 = new Bean_order(R.drawable.txu2, "短袖男夏装韩版潮流纯棉2019新款潮牌宽松青少年男孩初中生T恤", "98", "1", false);
        mDatas.add(bean_order1);
        mDatas.add(bean_order2);
        mDatas.add(bean_order3);
        mDatas.add(bean_order4);
        mDatas.add(bean_order5);
        mDatas.add(bean_order6);

    }
}
