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

public class HistoryActivity extends AppCompatActivity {
    private ListView mListView;
    private Adapter_history mAdapterhistory;
    private List<Bean_history> mDatas = new ArrayList<Bean_history>();
    private TextView tv_edit;
    private TextView tv_delete;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_layout);
        initDatas();
        mListView = findViewById(R.id.history_lv);
        mAdapterhistory = new Adapter_history(this, mDatas);
        mListView.setAdapter(mAdapterhistory);
        tv_edit = findViewById(R.id.history_edit);
        tv_delete = findViewById(R.id.history_delete);
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
        Bean_history bean_history1 = new Bean_history(R.drawable.animal_1, "跳楼甩卖，桂林小栽种", "10");
        Bean_history bean_history2 = new Bean_history(R.drawable.animal_5, "跳楼甩卖，桂林小栽种", "10");
        Bean_history bean_history3 = new Bean_history(R.drawable.animal_4, "跳楼甩卖，桂林小栽种", "10");
        mDatas.add(bean_history1);
        mDatas.add(bean_history2);
        mDatas.add(bean_history3);
        mDatas.add(bean_history1);
        mDatas.add(bean_history2);
        mDatas.add(bean_history3);
        mDatas.add(bean_history1);
        mDatas.add(bean_history2);
        mDatas.add(bean_history3);
        mDatas.add(bean_history1);
        mDatas.add(bean_history2);
        mDatas.add(bean_history3);
        mDatas.add(bean_history1);
        mDatas.add(bean_history2);
        mDatas.add(bean_history3);
    }
}
