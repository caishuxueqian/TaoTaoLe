package orc.com.taotaole.main.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import orc.com.taotaole.R;

public class DetailActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        findViewById(R.id.detail_bt_cart).setOnClickListener(e-> Toast.makeText(this, "点购物车干嘛", Toast.LENGTH_SHORT).show());
        findViewById(R.id.detail_bt_buy).setOnClickListener(e-> Toast.makeText(this, "点购买干嘛", Toast.LENGTH_SHORT).show());
    }
}
