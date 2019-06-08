package orc.com.taotaole.main.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class HistoryActivity extends AppCompatActivity {
    private ListView mListView;
    private Adapter_history mAdapterhistory;
    private List<Bean_history> mDatas = new ArrayList<Bean_history>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_layout);
        initDatas();
        mListView = findViewById(R.id.history_lv);
        mAdapterhistory = new Adapter_history(this, mDatas);
        mListView.setAdapter(mAdapterhistory);

        mListView.setOnItemClickListener((parent, v, position, id) -> {
//            switch (position) {
//                case 1:
//
//                    Toast.makeText(this, "点你马呢？", Toast.LENGTH_SHORT).show();
//                    break;
//                case 2:
//                    Toast.makeText(this, "别点了", Toast.LENGTH_SHORT).show();
//                    break;
//                case 3:
//                    Toast.makeText(this, "没用的", Toast.LENGTH_SHORT).show();
//                    break;
//                case 4:
//                    Toast.makeText(this, "说了没用", Toast.LENGTH_SHORT).show();
//                    break;
//                case 5:
//                    Toast.makeText(this, "继续点", Toast.LENGTH_SHORT).show();
//                    break;
//                default:
//                    Toast.makeText(this, "点你马呢？", Toast.LENGTH_SHORT).show();
//                    break;
//            }
            Toast.makeText(this, "点我干嘛", Toast.LENGTH_SHORT).show();
        });

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
