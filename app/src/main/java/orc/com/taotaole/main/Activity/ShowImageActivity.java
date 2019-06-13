package orc.com.taotaole.main.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import orc.com.taotaole.R;

public class ShowImageActivity extends AppCompatActivity {
    private int img;
    private ImageView showImg;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showimage);
        showImg=findViewById(R.id.showimage_img);
        showImg.setImageResource((int)getIntent().getSerializableExtra("next_Sign"));
        findViewById(R.id.showimage_back).setOnClickListener(e->finish());

    }
}