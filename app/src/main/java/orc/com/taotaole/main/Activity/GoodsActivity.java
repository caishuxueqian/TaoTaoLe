package orc.com.taotaole.main.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import orc.com.taotaole.R;

public class GoodsActivity extends AppCompatActivity {
    private GridView mGridView;
    private Adapter_2goods mAdapterGoods;
    private List<Model_goods> mDatas = new ArrayList<Model_goods>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goods_layout);}
}
