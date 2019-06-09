package orc.com.taotaole.main.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import orc.com.taotaole.R;

public class ShowImageActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showimage);
        findViewById(R.id.showimage_back).setOnClickListener(e->finish());

    }
}