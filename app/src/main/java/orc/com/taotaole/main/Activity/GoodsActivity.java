package orc.com.taotaole.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class GoodsActivity extends AppCompatActivity {
    private GridView mGridView;
    private Adapter_2goods mAdapterGoods;
    private List<Bean_home> mDatas = new ArrayList<Bean_home>();
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_layout);
        mGridView = findViewById(R.id.gv);
        initDatas();
        mAdapterGoods = new Adapter_2goods(this, mDatas);
        mGridView.setAdapter(mAdapterGoods);
        findViewById(R.id.good1_back).setOnClickListener(e -> {
          finish();
        });
        mGridView.setOnItemClickListener((parent, v, position, id) -> {

                    startActivity(new Intent(this,DetailActivity.class));
                }
        );
    }

    private void initDatas() {
        Bean_home modelgoods1 = new Bean_home("2", R.drawable.animal_1);
        Bean_home modelgoods2 = new Bean_home("1", R.drawable.animal_2);
        Bean_home modelgoods3 = new Bean_home("3", R.drawable.animal_3);
        Bean_home modelgoods4 = new Bean_home("4", R.drawable.animal_4);
        Bean_home modelgoods5 = new Bean_home("6", R.drawable.animal_1);
        Bean_home modelgoods6 = new Bean_home("100", R.drawable.animal_1);
        Bean_home modelgoods7 = new Bean_home("12", R.drawable.animal_1);
        Bean_home modelgoods8 = new Bean_home("5", R.drawable.animal_1);

        mDatas.add(modelgoods1);
        mDatas.add(modelgoods2);
        mDatas.add(modelgoods3);
        mDatas.add(modelgoods4);
        mDatas.add(modelgoods5);
        mDatas.add(modelgoods6);
        mDatas.add(modelgoods7);
        mDatas.add(modelgoods8);
        mDatas.add(modelgoods1);
        mDatas.add(modelgoods2);
        mDatas.add(modelgoods3);
        mDatas.add(modelgoods4);
        mDatas.add(modelgoods5);
        mDatas.add(modelgoods6);
        mDatas.add(modelgoods7);
        mDatas.add(modelgoods8);
        mDatas.add(modelgoods1);
        mDatas.add(modelgoods2);
        mDatas.add(modelgoods3);
        mDatas.add(modelgoods4);
        mDatas.add(modelgoods5);
        mDatas.add(modelgoods6);
        mDatas.add(modelgoods7);
        mDatas.add(modelgoods8);
    }
}