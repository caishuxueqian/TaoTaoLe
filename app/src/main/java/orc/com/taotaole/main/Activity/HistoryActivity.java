package orc.com.taotaole.main.Activity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class HistoryActivity extends AppCompatActivity {
    private ListView mListView;
    private Adapter_history mAdapterhistory;
    private List<Bean_history> mDatas = new ArrayList<Bean_history>();
    private TextView tv_edit;
    private TextView tv_delete;
    private ImageView iv_back;
    private CheckBox allSelect;
    private CheckBox checkBox;
    private TextView describe;
    private ImageView goodsImg;
    private LinearLayout bottom;
    private int next_Sign;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_layout);
        initDatas();
        initiView();
        mAdapterhistory = new Adapter_history(this, mDatas);
        mListView.setAdapter(mAdapterhistory);
        tv_edit.setOnClickListener(e -> tv_edit());
        tv_delete.setOnClickListener(e -> tv_delete());
        iv_back.setOnClickListener(e -> finish());
        allSelect.setOnClickListener(e -> allseclet());
        tv_delete.setOnClickListener(e -> tv_delete());
        mListView.setOnItemClickListener((a, b, c, d) -> {
            initiView_item(b);
            checkBox(c);
            change_Allseclet();
//            点击描述跳转
            describe.setOnClickListener(e ->showDetail(c));
//            点击图片跳转
            goodsImg.setOnClickListener(e ->showDetail(c));
            mAdapterhistory.notifyDataSetChanged();
        });

    }
    public void showDetail(int c){
        switch (c){
            case 0:
                next_Sign =0;
                Bundle data0 = new Bundle();
                data0.putSerializable("next_Sign", next_Sign);
                Intent intent0 = new Intent(this, DetailActivity.class);
                intent0.putExtras(data0);
                startActivity(intent0);
                break;
            case 1:
                next_Sign = 1;
                Bundle data1 = new Bundle();
                data1.putSerializable("next_Sign", next_Sign);
                Intent intent1 = new Intent(this, DetailActivity.class);
                intent1.putExtras(data1);
                startActivity(intent1);
                break;
            case 2:
                next_Sign =2;
                Bundle data2 = new Bundle();
                data2.putSerializable("next_Sign", next_Sign);
                Intent intent2 = new Intent(this, DetailActivity.class);
                intent2.putExtras(data2);
                startActivity(intent2);
                break;
            case 3:
                next_Sign = 3;
                Bundle data3 = new Bundle();
                data3.putSerializable("next_Sign", next_Sign);
                Intent intent3 = new Intent(this, DetailActivity.class);
                intent3.putExtras(data3);
                startActivity(intent3);
                break;
            case 4:
                next_Sign =4;
                Bundle data4 = new Bundle();
                data4.putSerializable("next_Sign", next_Sign);
                Intent intent4 = new Intent(this, DetailActivity.class);
                intent4.putExtras(data4);
                startActivity(intent4);
                break;
            case 5:
                next_Sign = 5;
                Bundle data5 = new Bundle();
                data5.putSerializable("next_Sign", next_Sign);
                Intent intent5 = new Intent(this, DetailActivity.class);
                intent5.putExtras(data5);
                startActivity(intent5);
                break;
            default:
                ;
                break;
        }}
    //    复选框
    public void checkBox(int postion) {
        if (checkBox.isChecked()) {
            mDatas.get(postion).setCheckBox(false);
        } else {
            mDatas.get(postion).setCheckBox(true);
        }
        mAdapterhistory.notifyDataSetChanged();

    }

    //全选键
    public void allseclet() {
        if (allSelect.isChecked())
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(true);
        else
            for (int i = 0; i < mDatas.size(); i++)
                mDatas.get(i).setCheckBox(false);
        mAdapterhistory.notifyDataSetChanged();
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
        mAdapterhistory.notifyDataSetChanged();

    }

    //初始化父控件
    public void initiView() {
        tv_edit = findViewById(R.id.history_edit);
        tv_delete = findViewById(R.id.history_delete);
        iv_back = findViewById(R.id.history_back);
        mListView = findViewById(R.id.history_lv);
        allSelect = findViewById(R.id.history_allselect);
        bottom = findViewById(R.id.history_bottom);
    }

    //    初始化子控件
    public void initiView_item(View v) {
        checkBox = v.findViewById(R.id.history_item_checkbox);
        describe = v.findViewById(R.id.history_item_describe);
        goodsImg = v.findViewById(R.id.history_item_img);
    }
    public void tv_delete() {
        if (!(mDatas.size() == 0)) {
            int checkedLength = 0;
            for (int i = 0; i < mDatas.size(); i++)
                if (mDatas.get(i).getCheckBox())
                    checkedLength++;
            if (checkedLength != 0) {
                Dialog dialog = new AlertDialog.Builder(this).setTitle(" ").setMessage("确定删除？").setPositiveButton("确定", (dialog12, which) -> {
                    List<Bean_history> noCheckBoxs = new ArrayList<>();
                    for (int i = 0; i < mDatas.size(); i++)
                        if (mDatas.get(i).getCheckBox())
                            noCheckBoxs.add(mDatas.get(i));
                    for (Bean_history cb : noCheckBoxs)
                        mDatas.remove(cb);

//            如果数据为空，全选框置为false
                    if (mDatas.size() == 0) {
                        allSelect.setChecked(false);
                    }

                    mAdapterhistory.notifyDataSetChanged();
                    Toast.makeText(this, "删除成功！", Toast.LENGTH_SHORT).show();
                }).setNegativeButton("取消", (dialog1, which) -> {
                }).create();
                dialog.show();
            } else
                Toast.makeText(this, "请选择", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "尚无数据", Toast.LENGTH_SHORT).show();
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

    private void initDatas() {
        Bean_history bean_history1 = new Bean_history(R.drawable.nai1, "12月豆本豆原味豆奶250ml*12瓶 早餐营养奶制品19年9月到期", "19.8", false);
        Bean_history bean_history2 = new Bean_history(R.drawable.nai2, "蒙牛未来星儿童成长牛奶整箱营养佳智型12盒装早餐学生乳制品礼盒", "59", false);
        Bean_history bean_history3 = new Bean_history(R.drawable.dianfanbao1, "电饭煲家用迷你小型2L3L学生宿舍老式电饭煲 蒸煮多功能1-2-3-4人", "89", false);
        Bean_history bean_history4 = new Bean_history(R.drawable.dianfanbao2, "电饭煲家用迷你小型电饭煲 1-2-3-4人学生宿舍普通老式蒸煮多功能", "108", false);
        Bean_history bean_history5 = new Bean_history(R.drawable.txu1, "南极人短袖T恤男潮流潮牌半袖加肥加大宽松大码男士夏季胖子衣服", "92", false);
        Bean_history bean_history6 = new Bean_history(R.drawable.txu2, "短袖男夏装韩版潮流纯棉2019新款潮牌宽松青少年男孩初中生T恤", "98", false);
        mDatas.add(bean_history1);
        mDatas.add(bean_history2);
        mDatas.add(bean_history3);
        mDatas.add(bean_history4);
        mDatas.add(bean_history5);
        mDatas.add(bean_history6);

    }

}
