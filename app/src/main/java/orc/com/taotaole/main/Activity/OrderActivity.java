package orc.com.taotaole.main.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_layout);
        initDatas();
        mListView = findViewById(R.id.order_lv);
        mAdapterorder = new Adapter_order(this, mDatas);
        mListView.setAdapter(mAdapterorder);
        tv_edit =findViewById(R.id.order_edit);
        tv_delete =findViewById(R.id.order_delete);
        tv_edit.setOnClickListener(e -> tv_edit());
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
        Bean_order bean_order1 = new Bean_order(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "10","1");
        Bean_order bean_order2 = new Bean_order(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "10","2");
        Bean_order bean_order3 = new Bean_order(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "10","1");
        mDatas.add(bean_order1);
        mDatas.add(bean_order2);
        mDatas.add(bean_order3);
        mDatas.add(bean_order1);
        mDatas.add(bean_order2);
        mDatas.add(bean_order3);
        mDatas.add(bean_order1);
        mDatas.add(bean_order2);
        mDatas.add(bean_order3);
        mDatas.add(bean_order1);
        mDatas.add(bean_order2);
        mDatas.add(bean_order3);
        mDatas.add(bean_order1);
        mDatas.add(bean_order2);
        mDatas.add(bean_order3);

    }
}
